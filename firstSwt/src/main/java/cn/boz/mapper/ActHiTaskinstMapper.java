package cn.boz.mapper;

import cn.boz.domain.pojo.ActHiTaskinst;
import cn.boz.domain.pojo.ActHiTaskinstExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActHiTaskinstMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_hi_taskinst
     *
     * @mbg.generated Sun Aug 26 11:58:27 CST 2018
     */
    long countByExample(ActHiTaskinstExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_hi_taskinst
     *
     * @mbg.generated Sun Aug 26 11:58:27 CST 2018
     */
    int deleteByExample(ActHiTaskinstExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_hi_taskinst
     *
     * @mbg.generated Sun Aug 26 11:58:27 CST 2018
     */
    int insert(ActHiTaskinst record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_hi_taskinst
     *
     * @mbg.generated Sun Aug 26 11:58:27 CST 2018
     */
    int insertSelective(ActHiTaskinst record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_hi_taskinst
     *
     * @mbg.generated Sun Aug 26 11:58:27 CST 2018
     */
    List<ActHiTaskinst> selectByExample(ActHiTaskinstExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_hi_taskinst
     *
     * @mbg.generated Sun Aug 26 11:58:27 CST 2018
     */
    int updateByExampleSelective(@Param("record") ActHiTaskinst record, @Param("example") ActHiTaskinstExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_hi_taskinst
     *
     * @mbg.generated Sun Aug 26 11:58:27 CST 2018
     */
    int updateByExample(@Param("record") ActHiTaskinst record, @Param("example") ActHiTaskinstExample example);
}