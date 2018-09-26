package cn.boz.ora.mapper;

import cn.boz.domain.ora.pojo.DbaConsColumns;
import cn.boz.domain.ora.pojo.DbaConsColumnsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DbaConsColumnsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.DBA_CONS_COLUMNS
     *
     * @mbg.generated Wed Sep 26 12:05:09 CST 2018
     */
    long countByExample(DbaConsColumnsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.DBA_CONS_COLUMNS
     *
     * @mbg.generated Wed Sep 26 12:05:09 CST 2018
     */
    int deleteByExample(DbaConsColumnsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.DBA_CONS_COLUMNS
     *
     * @mbg.generated Wed Sep 26 12:05:09 CST 2018
     */
    int insert(DbaConsColumns record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.DBA_CONS_COLUMNS
     *
     * @mbg.generated Wed Sep 26 12:05:09 CST 2018
     */
    int insertSelective(DbaConsColumns record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.DBA_CONS_COLUMNS
     *
     * @mbg.generated Wed Sep 26 12:05:09 CST 2018
     */
    List<DbaConsColumns> selectByExample(DbaConsColumnsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.DBA_CONS_COLUMNS
     *
     * @mbg.generated Wed Sep 26 12:05:09 CST 2018
     */
    int updateByExampleSelective(@Param("record") DbaConsColumns record, @Param("example") DbaConsColumnsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.DBA_CONS_COLUMNS
     *
     * @mbg.generated Wed Sep 26 12:05:09 CST 2018
     */
    int updateByExample(@Param("record") DbaConsColumns record, @Param("example") DbaConsColumnsExample example);
}