package cn.boz.mapper;

import cn.boz.domain.pojo.ActHiDetail;
import cn.boz.domain.pojo.ActHiDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActHiDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_hi_detail
     *
     * @mbg.generated Sun Aug 26 11:58:27 CST 2018
     */
    long countByExample(ActHiDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_hi_detail
     *
     * @mbg.generated Sun Aug 26 11:58:27 CST 2018
     */
    int deleteByExample(ActHiDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_hi_detail
     *
     * @mbg.generated Sun Aug 26 11:58:27 CST 2018
     */
    int insert(ActHiDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_hi_detail
     *
     * @mbg.generated Sun Aug 26 11:58:27 CST 2018
     */
    int insertSelective(ActHiDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_hi_detail
     *
     * @mbg.generated Sun Aug 26 11:58:27 CST 2018
     */
    List<ActHiDetail> selectByExample(ActHiDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_hi_detail
     *
     * @mbg.generated Sun Aug 26 11:58:27 CST 2018
     */
    int updateByExampleSelective(@Param("record") ActHiDetail record, @Param("example") ActHiDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_hi_detail
     *
     * @mbg.generated Sun Aug 26 11:58:27 CST 2018
     */
    int updateByExample(@Param("record") ActHiDetail record, @Param("example") ActHiDetailExample example);
}