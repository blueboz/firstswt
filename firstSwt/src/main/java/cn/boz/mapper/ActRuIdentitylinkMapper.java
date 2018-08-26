package cn.boz.mapper;

import cn.boz.domain.pojo.ActRuIdentitylink;
import cn.boz.domain.pojo.ActRuIdentitylinkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActRuIdentitylinkMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_ru_identitylink
     *
     * @mbg.generated Sun Aug 26 11:58:27 CST 2018
     */
    long countByExample(ActRuIdentitylinkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_ru_identitylink
     *
     * @mbg.generated Sun Aug 26 11:58:27 CST 2018
     */
    int deleteByExample(ActRuIdentitylinkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_ru_identitylink
     *
     * @mbg.generated Sun Aug 26 11:58:27 CST 2018
     */
    int insert(ActRuIdentitylink record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_ru_identitylink
     *
     * @mbg.generated Sun Aug 26 11:58:27 CST 2018
     */
    int insertSelective(ActRuIdentitylink record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_ru_identitylink
     *
     * @mbg.generated Sun Aug 26 11:58:27 CST 2018
     */
    List<ActRuIdentitylink> selectByExample(ActRuIdentitylinkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_ru_identitylink
     *
     * @mbg.generated Sun Aug 26 11:58:27 CST 2018
     */
    int updateByExampleSelective(@Param("record") ActRuIdentitylink record, @Param("example") ActRuIdentitylinkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_ru_identitylink
     *
     * @mbg.generated Sun Aug 26 11:58:27 CST 2018
     */
    int updateByExample(@Param("record") ActRuIdentitylink record, @Param("example") ActRuIdentitylinkExample example);
}