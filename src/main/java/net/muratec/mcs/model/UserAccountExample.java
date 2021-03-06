﻿package net.muratec.mcs.model;

import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;

public class UserAccountExample {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table USER_ACCOUNT
     * @mbg.generated
     */
    protected String orderByClause;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table USER_ACCOUNT
     * @mbg.generated
     */
    protected boolean distinct;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table USER_ACCOUNT
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table USER_ACCOUNT
     * @mbg.generated
     */
    public UserAccountExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table USER_ACCOUNT
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {

        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table USER_ACCOUNT
     * @mbg.generated
     */
    public String getOrderByClause() {

        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table USER_ACCOUNT
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {

        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table USER_ACCOUNT
     * @mbg.generated
     */
    public boolean isDistinct() {

        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table USER_ACCOUNT
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {

        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table USER_ACCOUNT
     * @mbg.generated
     */
    public void or(Criteria criteria) {

        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table USER_ACCOUNT
     * @mbg.generated
     */
    public Criteria or() {

        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table USER_ACCOUNT
     * @mbg.generated
     */
    public Criteria createCriteria() {

        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table USER_ACCOUNT
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {

        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table USER_ACCOUNT
     * @mbg.generated
     */
    public void clear() {

        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table USER_ACCOUNT
     * @mbg.generated
     */
    protected abstract static class GeneratedCriteria {

        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {

            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {

            return criteria;
        }

        public List<Criterion> getCriteria() {

            return criteria;
        }

        protected void addCriterion(String condition) {

            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {

            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {

            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andUserIdIsNull() {

            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {

            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Short value) {

            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Short value) {

            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Short value) {

            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Short value) {

            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Short value) {

            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Short value) {

            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Short> values) {

            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Short> values) {

            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Short value1, Short value2) {

            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Short value1, Short value2) {

            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {

            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {

            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {

            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {

            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {

            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {

            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {

            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {

            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {

            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {

            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {

            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {

            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {

            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {

            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {

            addCriterion("DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {

            addCriterion("DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {

            addCriterion("DESCRIPTION =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {

            addCriterion("DESCRIPTION <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {

            addCriterion("DESCRIPTION >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {

            addCriterion("DESCRIPTION >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {

            addCriterion("DESCRIPTION <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {

            addCriterion("DESCRIPTION <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {

            addCriterion("DESCRIPTION like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {

            addCriterion("DESCRIPTION not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {

            addCriterion("DESCRIPTION in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {

            addCriterion("DESCRIPTION not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {

            addCriterion("DESCRIPTION between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {

            addCriterion("DESCRIPTION not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andGuiGroupIdIsNull() {

            addCriterion("GUI_GROUP_ID is null");
            return (Criteria) this;
        }

        public Criteria andGuiGroupIdIsNotNull() {

            addCriterion("GUI_GROUP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGuiGroupIdEqualTo(String value) {

            addCriterion("GUI_GROUP_ID =", value, "guiGroupId");
            return (Criteria) this;
        }

        public Criteria andGuiGroupIdNotEqualTo(String value) {

            addCriterion("GUI_GROUP_ID <>", value, "guiGroupId");
            return (Criteria) this;
        }

        public Criteria andGuiGroupIdGreaterThan(String value) {

            addCriterion("GUI_GROUP_ID >", value, "guiGroupId");
            return (Criteria) this;
        }

        public Criteria andGuiGroupIdGreaterThanOrEqualTo(String value) {

            addCriterion("GUI_GROUP_ID >=", value, "guiGroupId");
            return (Criteria) this;
        }

        public Criteria andGuiGroupIdLessThan(String value) {

            addCriterion("GUI_GROUP_ID <", value, "guiGroupId");
            return (Criteria) this;
        }

        public Criteria andGuiGroupIdLessThanOrEqualTo(String value) {

            addCriterion("GUI_GROUP_ID <=", value, "guiGroupId");
            return (Criteria) this;
        }

        public Criteria andGuiGroupIdLike(String value) {

            addCriterion("GUI_GROUP_ID like", value, "guiGroupId");
            return (Criteria) this;
        }

        public Criteria andGuiGroupIdNotLike(String value) {

            addCriterion("GUI_GROUP_ID not like", value, "guiGroupId");
            return (Criteria) this;
        }

        public Criteria andGuiGroupIdIn(List<String> values) {

            addCriterion("GUI_GROUP_ID in", values, "guiGroupId");
            return (Criteria) this;
        }

        public Criteria andGuiGroupIdNotIn(List<String> values) {

            addCriterion("GUI_GROUP_ID not in", values, "guiGroupId");
            return (Criteria) this;
        }

        public Criteria andGuiGroupIdBetween(String value1, String value2) {

            addCriterion("GUI_GROUP_ID between", value1, value2, "guiGroupId");
            return (Criteria) this;
        }

        public Criteria andGuiGroupIdNotBetween(String value1, String value2) {

            addCriterion("GUI_GROUP_ID not between", value1, value2, "guiGroupId");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {

            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {

            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {

            addCriterion("PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {

            addCriterion("PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {

            addCriterion("PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {

            addCriterion("PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {

            addCriterion("PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {

            addCriterion("PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {

            addCriterion("PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {

            addCriterion("PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {

            addCriterion("PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {

            addCriterion("PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {

            addCriterion("PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {

            addCriterion("PASSWORD not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPassErrorCountIsNull() {

            addCriterion("PASS_ERROR_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andPassErrorCountIsNotNull() {

            addCriterion("PASS_ERROR_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPassErrorCountEqualTo(Short value) {

            addCriterion("PASS_ERROR_COUNT =", value, "passErrorCount");
            return (Criteria) this;
        }

        public Criteria andPassErrorCountNotEqualTo(Short value) {

            addCriterion("PASS_ERROR_COUNT <>", value, "passErrorCount");
            return (Criteria) this;
        }

        public Criteria andPassErrorCountGreaterThan(Short value) {

            addCriterion("PASS_ERROR_COUNT >", value, "passErrorCount");
            return (Criteria) this;
        }

        public Criteria andPassErrorCountGreaterThanOrEqualTo(Short value) {

            addCriterion("PASS_ERROR_COUNT >=", value, "passErrorCount");
            return (Criteria) this;
        }

        public Criteria andPassErrorCountLessThan(Short value) {

            addCriterion("PASS_ERROR_COUNT <", value, "passErrorCount");
            return (Criteria) this;
        }

        public Criteria andPassErrorCountLessThanOrEqualTo(Short value) {

            addCriterion("PASS_ERROR_COUNT <=", value, "passErrorCount");
            return (Criteria) this;
        }

        public Criteria andPassErrorCountIn(List<Short> values) {

            addCriterion("PASS_ERROR_COUNT in", values, "passErrorCount");
            return (Criteria) this;
        }

        public Criteria andPassErrorCountNotIn(List<Short> values) {

            addCriterion("PASS_ERROR_COUNT not in", values, "passErrorCount");
            return (Criteria) this;
        }

        public Criteria andPassErrorCountBetween(Short value1, Short value2) {

            addCriterion("PASS_ERROR_COUNT between", value1, value2, "passErrorCount");
            return (Criteria) this;
        }

        public Criteria andPassErrorCountNotBetween(Short value1, Short value2) {

            addCriterion("PASS_ERROR_COUNT not between", value1, value2, "passErrorCount");
            return (Criteria) this;
        }

        public Criteria andAccountStateIsNull() {

            addCriterion("ACCOUNT_STATE is null");
            return (Criteria) this;
        }

        public Criteria andAccountStateIsNotNull() {

            addCriterion("ACCOUNT_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andAccountStateEqualTo(Short value) {

            addCriterion("ACCOUNT_STATE =", value, "accountState");
            return (Criteria) this;
        }

        public Criteria andAccountStateNotEqualTo(Short value) {

            addCriterion("ACCOUNT_STATE <>", value, "accountState");
            return (Criteria) this;
        }

        public Criteria andAccountStateGreaterThan(Short value) {

            addCriterion("ACCOUNT_STATE >", value, "accountState");
            return (Criteria) this;
        }

        public Criteria andAccountStateGreaterThanOrEqualTo(Short value) {

            addCriterion("ACCOUNT_STATE >=", value, "accountState");
            return (Criteria) this;
        }

        public Criteria andAccountStateLessThan(Short value) {

            addCriterion("ACCOUNT_STATE <", value, "accountState");
            return (Criteria) this;
        }

        public Criteria andAccountStateLessThanOrEqualTo(Short value) {

            addCriterion("ACCOUNT_STATE <=", value, "accountState");
            return (Criteria) this;
        }

        public Criteria andAccountStateIn(List<Short> values) {

            addCriterion("ACCOUNT_STATE in", values, "accountState");
            return (Criteria) this;
        }

        public Criteria andAccountStateNotIn(List<Short> values) {

            addCriterion("ACCOUNT_STATE not in", values, "accountState");
            return (Criteria) this;
        }

        public Criteria andAccountStateBetween(Short value1, Short value2) {

            addCriterion("ACCOUNT_STATE between", value1, value2, "accountState");
            return (Criteria) this;
        }

        public Criteria andAccountStateNotBetween(Short value1, Short value2) {

            addCriterion("ACCOUNT_STATE not between", value1, value2, "accountState");
            return (Criteria) this;
        }

        public Criteria andLastLoginIsNull() {

            addCriterion("LAST_LOGIN is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginIsNotNull() {

            addCriterion("LAST_LOGIN is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginEqualTo(Timestamp value) {

            addCriterion("LAST_LOGIN =", value, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginNotEqualTo(Timestamp value) {

            addCriterion("LAST_LOGIN <>", value, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginGreaterThan(Timestamp value) {

            addCriterion("LAST_LOGIN >", value, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginGreaterThanOrEqualTo(Timestamp value) {

            addCriterion("LAST_LOGIN >=", value, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginLessThan(Timestamp value) {

            addCriterion("LAST_LOGIN <", value, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginLessThanOrEqualTo(Timestamp value) {

            addCriterion("LAST_LOGIN <=", value, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginIn(List<Timestamp> values) {

            addCriterion("LAST_LOGIN in", values, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginNotIn(List<Timestamp> values) {

            addCriterion("LAST_LOGIN not in", values, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginBetween(Timestamp value1, Timestamp value2) {

            addCriterion("LAST_LOGIN between", value1, value2, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginNotBetween(Timestamp value1, Timestamp value2) {

            addCriterion("LAST_LOGIN not between", value1, value2, "lastLogin");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table USER_ACCOUNT
     * @mbg.generated
     */
    public static class Criterion {

        private String condition;
        private Object value;
        private Object secondValue;
        private boolean noValue;
        private boolean singleValue;
        private boolean betweenValue;
        private boolean listValue;
        private String typeHandler;

        public String getCondition() {

            return condition;
        }

        public Object getValue() {

            return value;
        }

        public Object getSecondValue() {

            return secondValue;
        }

        public boolean isNoValue() {

            return noValue;
        }

        public boolean isSingleValue() {

            return singleValue;
        }

        public boolean isBetweenValue() {

            return betweenValue;
        }

        public boolean isListValue() {

            return listValue;
        }

        public String getTypeHandler() {

            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table
     * USER_ACCOUNT
     *
     * @mbggenerated do_not_delete_during_merge Wed Sep 07 15:13:24 JST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}
