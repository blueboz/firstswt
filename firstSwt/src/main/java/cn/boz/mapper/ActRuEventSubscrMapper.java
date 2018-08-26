package cn.boz.mapper;

import cn.boz.domain.pojo.ActRuEventSubscr;
import cn.boz.domain.pojo.ActRuEventSubscrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActRuEventSubscrMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_ru_event_subscr
     *
     * @mbg.generated Sun Aug 26 11:58:27 CST 2018
     */
    long countByExample(ActRuEventSubscrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_ru_event_subscr
     *
     * @mbg.generated Sun Aug 26 11:58:27 CST 2018
     */
    int deleteByExample(ActRuEventSubscrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_ru_event_subscr
     *
     * @mbg.generated Sun Aug 26 11:58:27 CST 2018
     */
    int insert(ActRuEventSubscr record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_ru_event_subscr
     *
     * @mbg.generated Sun Aug 26 11:58:27 CST 2018
     */
    int insertSelective(ActRuEventSubscr record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_ru_event_subscr
     *
     * @mbg.generated Sun Aug 26 11:58:27 CST 2018
     */
    List<ActRuEventSubscr> selectByExample(ActRuEventSubscrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_ru_event_subscr
     *
     * @mbg.generated Sun Aug 26 11:58:27 CST 2018
     */
    int updateByExampleSelective(@Param("record") ActRuEventSubscr record, @Param("example") ActRuEventSubscrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_ru_event_subscr
     *
     * @mbg.generated Sun Aug 26 11:58:27 CST 2018
     */
    int updateByExample(@Param("record") ActRuEventSubscr record, @Param("example") ActRuEventSubscrExample example);
}