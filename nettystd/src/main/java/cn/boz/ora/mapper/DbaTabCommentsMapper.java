package cn.boz.ora.mapper;

import cn.boz.domain.ora.pojo.DbaTabComments;
import cn.boz.domain.ora.pojo.DbaTabCommentsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DbaTabCommentsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.DBA_TAB_COMMENTS
     *
     * @mbg.generated Fri Sep 21 19:40:06 CST 2018
     */
    long countByExample(DbaTabCommentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.DBA_TAB_COMMENTS
     *
     * @mbg.generated Fri Sep 21 19:40:06 CST 2018
     */
    int deleteByExample(DbaTabCommentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.DBA_TAB_COMMENTS
     *
     * @mbg.generated Fri Sep 21 19:40:06 CST 2018
     */
    int insert(DbaTabComments record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.DBA_TAB_COMMENTS
     *
     * @mbg.generated Fri Sep 21 19:40:06 CST 2018
     */
    int insertSelective(DbaTabComments record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.DBA_TAB_COMMENTS
     *
     * @mbg.generated Fri Sep 21 19:40:06 CST 2018
     */
    List<DbaTabComments> selectByExample(DbaTabCommentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.DBA_TAB_COMMENTS
     *
     * @mbg.generated Fri Sep 21 19:40:06 CST 2018
     */
    int updateByExampleSelective(@Param("record") DbaTabComments record, @Param("example") DbaTabCommentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.DBA_TAB_COMMENTS
     *
     * @mbg.generated Fri Sep 21 19:40:06 CST 2018
     */
    int updateByExample(@Param("record") DbaTabComments record, @Param("example") DbaTabCommentsExample example);
}