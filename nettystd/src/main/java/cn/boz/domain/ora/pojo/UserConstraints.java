package cn.boz.domain.ora.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class UserConstraints {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.USER_CONSTRAINTS.OWNER
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    private String owner;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.USER_CONSTRAINTS.CONSTRAINT_NAME
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    private String constraintName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.USER_CONSTRAINTS.CONSTRAINT_TYPE
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    private String constraintType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.USER_CONSTRAINTS.TABLE_NAME
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    private String tableName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.USER_CONSTRAINTS.SEARCH_CONDITION_VC
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    private String searchConditionVc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.USER_CONSTRAINTS.R_OWNER
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    private String rOwner;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.USER_CONSTRAINTS.R_CONSTRAINT_NAME
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    private String rConstraintName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.USER_CONSTRAINTS.DELETE_RULE
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    private String deleteRule;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.USER_CONSTRAINTS.STATUS
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.USER_CONSTRAINTS.DEFERRABLE
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    private String deferrable;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.USER_CONSTRAINTS.DEFERRED
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    private String deferred;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.USER_CONSTRAINTS.VALIDATED
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    private String validated;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.USER_CONSTRAINTS.GENERATED
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    private String generated;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.USER_CONSTRAINTS.BAD
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    private String bad;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.USER_CONSTRAINTS.RELY
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    private String rely;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.USER_CONSTRAINTS.LAST_CHANGE
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    private Date lastChange;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.USER_CONSTRAINTS.INDEX_OWNER
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    private String indexOwner;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.USER_CONSTRAINTS.INDEX_NAME
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    private String indexName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.USER_CONSTRAINTS.INVALID
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    private String invalid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.USER_CONSTRAINTS.VIEW_RELATED
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    private String viewRelated;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.USER_CONSTRAINTS.ORIGIN_CON_ID
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    private BigDecimal originConId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.USER_CONSTRAINTS.SEARCH_CONDITION
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    private String searchCondition;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.USER_CONSTRAINTS.OWNER
     *
     * @return the value of SYS.USER_CONSTRAINTS.OWNER
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    public String getOwner() {
        return owner;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.USER_CONSTRAINTS.OWNER
     *
     * @param owner the value for SYS.USER_CONSTRAINTS.OWNER
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    public void setOwner(String owner) {
        this.owner = owner == null ? null : owner.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.USER_CONSTRAINTS.CONSTRAINT_NAME
     *
     * @return the value of SYS.USER_CONSTRAINTS.CONSTRAINT_NAME
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    public String getConstraintName() {
        return constraintName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.USER_CONSTRAINTS.CONSTRAINT_NAME
     *
     * @param constraintName the value for SYS.USER_CONSTRAINTS.CONSTRAINT_NAME
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    public void setConstraintName(String constraintName) {
        this.constraintName = constraintName == null ? null : constraintName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.USER_CONSTRAINTS.CONSTRAINT_TYPE
     *
     * @return the value of SYS.USER_CONSTRAINTS.CONSTRAINT_TYPE
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    public String getConstraintType() {
        return constraintType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.USER_CONSTRAINTS.CONSTRAINT_TYPE
     *
     * @param constraintType the value for SYS.USER_CONSTRAINTS.CONSTRAINT_TYPE
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    public void setConstraintType(String constraintType) {
        this.constraintType = constraintType == null ? null : constraintType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.USER_CONSTRAINTS.TABLE_NAME
     *
     * @return the value of SYS.USER_CONSTRAINTS.TABLE_NAME
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.USER_CONSTRAINTS.TABLE_NAME
     *
     * @param tableName the value for SYS.USER_CONSTRAINTS.TABLE_NAME
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.USER_CONSTRAINTS.SEARCH_CONDITION_VC
     *
     * @return the value of SYS.USER_CONSTRAINTS.SEARCH_CONDITION_VC
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    public String getSearchConditionVc() {
        return searchConditionVc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.USER_CONSTRAINTS.SEARCH_CONDITION_VC
     *
     * @param searchConditionVc the value for SYS.USER_CONSTRAINTS.SEARCH_CONDITION_VC
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    public void setSearchConditionVc(String searchConditionVc) {
        this.searchConditionVc = searchConditionVc == null ? null : searchConditionVc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.USER_CONSTRAINTS.R_OWNER
     *
     * @return the value of SYS.USER_CONSTRAINTS.R_OWNER
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    public String getrOwner() {
        return rOwner;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.USER_CONSTRAINTS.R_OWNER
     *
     * @param rOwner the value for SYS.USER_CONSTRAINTS.R_OWNER
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    public void setrOwner(String rOwner) {
        this.rOwner = rOwner == null ? null : rOwner.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.USER_CONSTRAINTS.R_CONSTRAINT_NAME
     *
     * @return the value of SYS.USER_CONSTRAINTS.R_CONSTRAINT_NAME
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    public String getrConstraintName() {
        return rConstraintName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.USER_CONSTRAINTS.R_CONSTRAINT_NAME
     *
     * @param rConstraintName the value for SYS.USER_CONSTRAINTS.R_CONSTRAINT_NAME
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    public void setrConstraintName(String rConstraintName) {
        this.rConstraintName = rConstraintName == null ? null : rConstraintName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.USER_CONSTRAINTS.DELETE_RULE
     *
     * @return the value of SYS.USER_CONSTRAINTS.DELETE_RULE
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    public String getDeleteRule() {
        return deleteRule;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.USER_CONSTRAINTS.DELETE_RULE
     *
     * @param deleteRule the value for SYS.USER_CONSTRAINTS.DELETE_RULE
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    public void setDeleteRule(String deleteRule) {
        this.deleteRule = deleteRule == null ? null : deleteRule.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.USER_CONSTRAINTS.STATUS
     *
     * @return the value of SYS.USER_CONSTRAINTS.STATUS
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.USER_CONSTRAINTS.STATUS
     *
     * @param status the value for SYS.USER_CONSTRAINTS.STATUS
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.USER_CONSTRAINTS.DEFERRABLE
     *
     * @return the value of SYS.USER_CONSTRAINTS.DEFERRABLE
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    public String getDeferrable() {
        return deferrable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.USER_CONSTRAINTS.DEFERRABLE
     *
     * @param deferrable the value for SYS.USER_CONSTRAINTS.DEFERRABLE
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    public void setDeferrable(String deferrable) {
        this.deferrable = deferrable == null ? null : deferrable.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.USER_CONSTRAINTS.DEFERRED
     *
     * @return the value of SYS.USER_CONSTRAINTS.DEFERRED
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    public String getDeferred() {
        return deferred;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.USER_CONSTRAINTS.DEFERRED
     *
     * @param deferred the value for SYS.USER_CONSTRAINTS.DEFERRED
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    public void setDeferred(String deferred) {
        this.deferred = deferred == null ? null : deferred.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.USER_CONSTRAINTS.VALIDATED
     *
     * @return the value of SYS.USER_CONSTRAINTS.VALIDATED
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    public String getValidated() {
        return validated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.USER_CONSTRAINTS.VALIDATED
     *
     * @param validated the value for SYS.USER_CONSTRAINTS.VALIDATED
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    public void setValidated(String validated) {
        this.validated = validated == null ? null : validated.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.USER_CONSTRAINTS.GENERATED
     *
     * @return the value of SYS.USER_CONSTRAINTS.GENERATED
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    public String getGenerated() {
        return generated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.USER_CONSTRAINTS.GENERATED
     *
     * @param generated the value for SYS.USER_CONSTRAINTS.GENERATED
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    public void setGenerated(String generated) {
        this.generated = generated == null ? null : generated.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.USER_CONSTRAINTS.BAD
     *
     * @return the value of SYS.USER_CONSTRAINTS.BAD
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    public String getBad() {
        return bad;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.USER_CONSTRAINTS.BAD
     *
     * @param bad the value for SYS.USER_CONSTRAINTS.BAD
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    public void setBad(String bad) {
        this.bad = bad == null ? null : bad.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.USER_CONSTRAINTS.RELY
     *
     * @return the value of SYS.USER_CONSTRAINTS.RELY
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    public String getRely() {
        return rely;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.USER_CONSTRAINTS.RELY
     *
     * @param rely the value for SYS.USER_CONSTRAINTS.RELY
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    public void setRely(String rely) {
        this.rely = rely == null ? null : rely.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.USER_CONSTRAINTS.LAST_CHANGE
     *
     * @return the value of SYS.USER_CONSTRAINTS.LAST_CHANGE
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    public Date getLastChange() {
        return lastChange;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.USER_CONSTRAINTS.LAST_CHANGE
     *
     * @param lastChange the value for SYS.USER_CONSTRAINTS.LAST_CHANGE
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    public void setLastChange(Date lastChange) {
        this.lastChange = lastChange;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.USER_CONSTRAINTS.INDEX_OWNER
     *
     * @return the value of SYS.USER_CONSTRAINTS.INDEX_OWNER
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    public String getIndexOwner() {
        return indexOwner;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.USER_CONSTRAINTS.INDEX_OWNER
     *
     * @param indexOwner the value for SYS.USER_CONSTRAINTS.INDEX_OWNER
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    public void setIndexOwner(String indexOwner) {
        this.indexOwner = indexOwner == null ? null : indexOwner.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.USER_CONSTRAINTS.INDEX_NAME
     *
     * @return the value of SYS.USER_CONSTRAINTS.INDEX_NAME
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    public String getIndexName() {
        return indexName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.USER_CONSTRAINTS.INDEX_NAME
     *
     * @param indexName the value for SYS.USER_CONSTRAINTS.INDEX_NAME
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    public void setIndexName(String indexName) {
        this.indexName = indexName == null ? null : indexName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.USER_CONSTRAINTS.INVALID
     *
     * @return the value of SYS.USER_CONSTRAINTS.INVALID
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    public String getInvalid() {
        return invalid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.USER_CONSTRAINTS.INVALID
     *
     * @param invalid the value for SYS.USER_CONSTRAINTS.INVALID
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    public void setInvalid(String invalid) {
        this.invalid = invalid == null ? null : invalid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.USER_CONSTRAINTS.VIEW_RELATED
     *
     * @return the value of SYS.USER_CONSTRAINTS.VIEW_RELATED
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    public String getViewRelated() {
        return viewRelated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.USER_CONSTRAINTS.VIEW_RELATED
     *
     * @param viewRelated the value for SYS.USER_CONSTRAINTS.VIEW_RELATED
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    public void setViewRelated(String viewRelated) {
        this.viewRelated = viewRelated == null ? null : viewRelated.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.USER_CONSTRAINTS.ORIGIN_CON_ID
     *
     * @return the value of SYS.USER_CONSTRAINTS.ORIGIN_CON_ID
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    public BigDecimal getOriginConId() {
        return originConId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.USER_CONSTRAINTS.ORIGIN_CON_ID
     *
     * @param originConId the value for SYS.USER_CONSTRAINTS.ORIGIN_CON_ID
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    public void setOriginConId(BigDecimal originConId) {
        this.originConId = originConId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.USER_CONSTRAINTS.SEARCH_CONDITION
     *
     * @return the value of SYS.USER_CONSTRAINTS.SEARCH_CONDITION
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    public String getSearchCondition() {
        return searchCondition;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.USER_CONSTRAINTS.SEARCH_CONDITION
     *
     * @param searchCondition the value for SYS.USER_CONSTRAINTS.SEARCH_CONDITION
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    public void setSearchCondition(String searchCondition) {
        this.searchCondition = searchCondition == null ? null : searchCondition.trim();
    }
}