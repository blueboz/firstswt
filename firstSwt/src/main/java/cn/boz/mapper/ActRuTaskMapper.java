package cn.boz.mapper;

import cn.boz.domain.pojo.ActRuTask;
import cn.boz.domain.pojo.ActRuTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActRuTaskMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_ru_task
     *
     * @mbg.generated Sun Aug 26 11:58:27 CST 2018
     */
    long countByExample(ActRuTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_ru_task
     *
     * @mbg.generated Sun Aug 26 11:58:27 CST 2018
     */
    int deleteByExample(ActRuTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_ru_task
     *
     * @mbg.generated Sun Aug 26 11:58:27 CST 2018
     */
    int insert(ActRuTask record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_ru_task
     *
     * @mbg.generated Sun Aug 26 11:58:27 CST 2018
     */
    int insertSelective(ActRuTask record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_ru_task
     *
     * @mbg.generated Sun Aug 26 11:58:27 CST 2018
     */
    List<ActRuTask> selectByExample(ActRuTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_ru_task
     *
     * @mbg.generated Sun Aug 26 11:58:27 CST 2018
     */
    int updateByExampleSelective(@Param("record") ActRuTask record, @Param("example") ActRuTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_ru_task
     *
     * @mbg.generated Sun Aug 26 11:58:27 CST 2018
     */
    int updateByExample(@Param("record") ActRuTask record, @Param("example") ActRuTaskExample example);
}