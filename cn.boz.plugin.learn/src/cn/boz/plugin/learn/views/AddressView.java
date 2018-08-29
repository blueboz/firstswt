package cn.boz.plugin.learn.views;

import java.util.Comparator;
import java.util.Iterator;

import javax.inject.Inject;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

import cn.boz.plugin.learn.actions.AddressDeleteAction;
import cn.boz.plugin.learn.actions.AddressViewFilterAction;
import cn.boz.plugin.learn.model.AddressItem;
import cn.boz.plugin.learn.model.AddressManager;
import cn.boz.plugin.learn.model.AddressViewContentProvider;
import cn.boz.plugin.learn.model.AddressViewLabelProvider;
import cn.boz.plugin.learn.model.AddressViewSorter;

/**
 * This sample class demonstrates how to plug-in a new workbench view. The view
 * shows data obtained from the model. The sample creates a dummy model on the
 * fly, but a real implementation would connect to the model available either in
 * this or another plug-in (e.g. the workspace). The view is connected to the
 * model using a content provider.
 * <p>
 * The view uses a label provider to define how model objects should be
 * presented in the view. Each view can present the same model objects using
 * different labels and icons, if needed. Alternatively, a single label provider
 * can be shared between views in order to ensure that objects of the same type
 * are presented in the same way everywhere.
 * <p>
 */

public class AddressView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "cn.boz.plugin.learn.views.AddressView";

	@Inject
	IWorkbench workbench;

	private TableViewer viewer;
	private Action action1;
	private Action action2;
	private Action doubleClickAction;

	class ViewLabelProvider extends LabelProvider implements ITableLabelProvider {
		@Override
		public String getColumnText(Object obj, int index) {
			Object[] arr = (Object[]) obj;
			if (arr.length > index) {
				return (String) arr[index];
			}
			return "";
		}

		@Override
		public Image getColumnImage(Object obj, int index) {
			return getImage(obj);
		}

		@Override
		public Image getImage(Object obj) {
			return workbench.getSharedImages().getImage(ISharedImages.IMG_OBJ_ELEMENT);
		}
	}

	TableColumn tc;
	TableColumn tc2;
	TableColumn tc3;

	@Override
	public void createPartControl(Composite parent) {
		viewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION);

		Table table = viewer.getTable();
		tc = new TableColumn(table, SWT.None);
		table.setHeaderVisible(true);
		tc.setText("姓名");
		tc.setWidth(120);
		tc2 = new TableColumn(table, SWT.None);
		tc2.setText("年龄");
		tc2.setWidth(120);
		tc3 = new TableColumn(table, SWT.None);
		tc3.setText("住址");
		tc3.setWidth(120);
		table.setLinesVisible(true);

		var avcp = new AddressViewContentProvider();
		viewer.setContentProvider(avcp);
		viewer.setInput(AddressManager.getManager());
		viewer.setLabelProvider(new AddressViewLabelProvider());

		// Create the help context id for the viewer's control
		workbench.getHelpSystem().setHelp(viewer.getControl(), "cn.boz.plugin.learn.viewer");

		getSite().setSelectionProvider(viewer);
		createTableSorter();
		makeActions();
		hookContextMenu();
		hookDoubleClickAction();
		contributeToActionBars();
	}

	private void createTableSorter() {
		Comparator<AddressItem> nc = (AddressItem ai1, AddressItem ai2) -> {
			return ai1.getName().compareTo(ai2.getName());
		};
		Comparator<AddressItem> cc = (AddressItem ai1, AddressItem ai2) -> {
			return ai1.getCategory().compareTo(ai2.getCategory());
		};
		Comparator<AddressItem> mc = (AddressItem ai1, AddressItem ai2) -> {
			return ai1.getMessageInfo().compareTo(ai2.getMessageInfo());
		};
		var cs = new Comparator[] { nc, cc, mc };
		var ts = new TableColumn[] { tc, tc2, tc3 };
		var sorter = new AddressViewSorter(viewer, ts, cs);
		viewer.setComparator(sorter);
	}

	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				AddressView.this.fillContextMenu(manager);
			}
		});
		Menu menu = menuMgr.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		menuMgr.add(addressDeleteAction);
		getSite().registerContextMenu(menuMgr, viewer);
	}

	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	/**
	 * 右上角便便的哪个小箭头收起的按钮里面
	 * 
	 * @param manager
	 */
	private void fillLocalPullDown(IMenuManager manager) {
		manager.add(action1);
		manager.add(new Separator());
		manager.add(action2);
		manager.add(addressDeleteAction);
	}

	/**
	 * 将视图填充到上下文菜单，也就是右键
	 * 
	 * @param manager
	 */
	private void fillContextMenu(IMenuManager manager) {
		manager.add(action1);
		manager.add(action2);
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
		manager.add(addressDeleteAction);
		manager.add(filterAction);
	}

	/**
	 * 将Action填充到视图的工具栏中
	 * 
	 * @param manager
	 */
	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(action1);
		manager.add(action2);
		manager.add(addressDeleteAction);
	}

	private AddressDeleteAction addressDeleteAction;

	private AddressViewFilterAction filterAction;

	private void makeActions() {
		addressDeleteAction = new AddressDeleteAction(this, "删除",
				PlatformUI.getWorkbench().getSharedImages().getImageDescriptor(ISharedImages.IMG_TOOL_DELETE));
		addressDeleteAction.setToolTipText("点击进行删除");
		// 只有在选择了某几行才有用
		addressDeleteAction.setEnabled(false);

		viewer.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				boolean flag = event.getSelection().isEmpty();
				addressDeleteAction.setEnabled(!flag);

			}
		});

		filterAction = new AddressViewFilterAction(viewer, "过滤",
				PlatformUI.getWorkbench().getSharedImages().getImageDescriptor(ISharedImages.IMG_DEF_VIEW));
		filterAction.setToolTipText("点击进行过滤");

		action1 = new Action() {
			public void run() {
				showMessage("Action 1 executed");
			}
		};
		action1.setText("Action 1");
		action1.setToolTipText("Action 1 tooltip");
		action1.setImageDescriptor(
				PlatformUI.getWorkbench().getSharedImages().getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));

		action2 = new Action() {
			public void run() {
				showMessage("Action 2 executed");
			}
		};

		action2.setText("Action 2");
		action2.setToolTipText("Action 2 tooltip");
		action2.setImageDescriptor(workbench.getSharedImages().getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
		doubleClickAction = new Action() {
			public void run() {
				IStructuredSelection selection = viewer.getStructuredSelection();
				Object obj = selection.getFirstElement();
				showMessage("Double-click detected on " + obj.toString());
			}
		};
	}

	private void hookDoubleClickAction() {
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				doubleClickAction.run();
			}
		});
	}

	private void showMessage(String message) {
		MessageDialog.openInformation(viewer.getControl().getShell(), "地址本视图", message);
	}

	/**
	 * 将焦点设置到视图上合适的控件上
	 */
	@Override
	public void setFocus() {
		viewer.getControl().setFocus();
	}

	public AddressItem[] getSelectedAddress() {
		IStructuredSelection selection = (IStructuredSelection) viewer.getSelection();
		var ais = new AddressItem[selection.size()];

		Iterator<AddressItem> iterator = selection.iterator();
		int index = 0;
		while (iterator.hasNext()) {
			ais[index++] = iterator.next();
		}
		return ais;
	}
}
