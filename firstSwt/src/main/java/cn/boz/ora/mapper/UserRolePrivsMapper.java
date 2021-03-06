package cn.boz.ora.mapper;

import cn.boz.domain.ora.pojo.UserRolePrivs;
import cn.boz.domain.ora.pojo.UserRolePrivsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRolePrivsMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SYS.USER_ROLE_PRIVS
	 * @mbg.generated  Tue Aug 28 11:39:07 CST 2018
	 */
	long countByExample(UserRolePrivsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SYS.USER_ROLE_PRIVS
	 * @mbg.generated  Tue Aug 28 11:39:07 CST 2018
	 */
	int deleteByExample(UserRolePrivsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SYS.USER_ROLE_PRIVS
	 * @mbg.generated  Tue Aug 28 11:39:07 CST 2018
	 */
	int insert(UserRolePrivs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SYS.USER_ROLE_PRIVS
	 * @mbg.generated  Tue Aug 28 11:39:07 CST 2018
	 */
	int insertSelective(UserRolePrivs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SYS.USER_ROLE_PRIVS
	 * @mbg.generated  Tue Aug 28 11:39:07 CST 2018
	 */
	List<UserRolePrivs> selectByExample(UserRolePrivsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SYS.USER_ROLE_PRIVS
	 * @mbg.generated  Tue Aug 28 11:39:07 CST 2018
	 */
	int updateByExampleSelective(@Param("record") UserRolePrivs record, @Param("example") UserRolePrivsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SYS.USER_ROLE_PRIVS
	 * @mbg.generated  Tue Aug 28 11:39:07 CST 2018
	 */
	int updateByExample(@Param("record") UserRolePrivs record, @Param("example") UserRolePrivsExample example);
}