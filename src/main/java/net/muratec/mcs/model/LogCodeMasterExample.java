﻿package net.muratec.mcs.model;

import java.util.ArrayList;
import java.util.List;

public class LogCodeMasterExample {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table LOG_CODE_MASTER
     * @mbg.generated
     */
    protected String orderByClause;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table LOG_CODE_MASTER
     * @mbg.generated
     */
    protected boolean distinct;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table LOG_CODE_MASTER
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table LOG_CODE_MASTER
     * @mbg.generated
     */
    public LogCodeMasterExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table LOG_CODE_MASTER
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {

        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table LOG_CODE_MASTER
     * @mbg.generated
     */
    public String getOrderByClause() {

        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table LOG_CODE_MASTER
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {

        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table LOG_CODE_MASTER
     * @mbg.generated
     */
    public boolean isDistinct() {

        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table LOG_CODE_MASTER
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {

        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table LOG_CODE_MASTER
     * @mbg.generated
     */
    public void or(Criteria criteria) {

        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table LOG_CODE_MASTER
     * @mbg.generated
     */
    public Criteria or() {

        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table LOG_CODE_MASTER
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
     * This method was generated by MyBatis Generator. This method corresponds to the database table LOG_CODE_MASTER
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {

        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table LOG_CODE_MASTER
     * @mbg.generated
     */
    public void clear() {

        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table LOG_CODE_MASTER
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

        public Criteria andLogCodeIsNull() {

            addCriterion("LOG_CODE is null");
            return (Criteria) this;
        }

        public Criteria andLogCodeIsNotNull() {

            addCriterion("LOG_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andLogCodeEqualTo(Long value) {

            addCriterion("LOG_CODE =", value, "logCode");
            return (Criteria) this;
        }

        public Criteria andLogCodeNotEqualTo(Long value) {

            addCriterion("LOG_CODE <>", value, "logCode");
            return (Criteria) this;
        }

        public Criteria andLogCodeGreaterThan(Long value) {

            addCriterion("LOG_CODE >", value, "logCode");
            return (Criteria) this;
        }

        public Criteria andLogCodeGreaterThanOrEqualTo(Long value) {

            addCriterion("LOG_CODE >=", value, "logCode");
            return (Criteria) this;
        }

        public Criteria andLogCodeLessThan(Long value) {

            addCriterion("LOG_CODE <", value, "logCode");
            return (Criteria) this;
        }

        public Criteria andLogCodeLessThanOrEqualTo(Long value) {

            addCriterion("LOG_CODE <=", value, "logCode");
            return (Criteria) this;
        }

        public Criteria andLogCodeIn(List<Long> values) {

            addCriterion("LOG_CODE in", values, "logCode");
            return (Criteria) this;
        }

        public Criteria andLogCodeNotIn(List<Long> values) {

            addCriterion("LOG_CODE not in", values, "logCode");
            return (Criteria) this;
        }

        public Criteria andLogCodeBetween(Long value1, Long value2) {

            addCriterion("LOG_CODE between", value1, value2, "logCode");
            return (Criteria) this;
        }

        public Criteria andLogCodeNotBetween(Long value1, Long value2) {

            addCriterion("LOG_CODE not between", value1, value2, "logCode");
            return (Criteria) this;
        }

        public Criteria andLogNameIsNull() {

            addCriterion("LOG_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLogNameIsNotNull() {

            addCriterion("LOG_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLogNameEqualTo(String value) {

            addCriterion("LOG_NAME =", value, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameNotEqualTo(String value) {

            addCriterion("LOG_NAME <>", value, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameGreaterThan(String value) {

            addCriterion("LOG_NAME >", value, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameGreaterThanOrEqualTo(String value) {

            addCriterion("LOG_NAME >=", value, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameLessThan(String value) {

            addCriterion("LOG_NAME <", value, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameLessThanOrEqualTo(String value) {

            addCriterion("LOG_NAME <=", value, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameLike(String value) {

            addCriterion("LOG_NAME like", value, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameNotLike(String value) {

            addCriterion("LOG_NAME not like", value, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameIn(List<String> values) {

            addCriterion("LOG_NAME in", values, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameNotIn(List<String> values) {

            addCriterion("LOG_NAME not in", values, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameBetween(String value1, String value2) {

            addCriterion("LOG_NAME between", value1, value2, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameNotBetween(String value1, String value2) {

            addCriterion("LOG_NAME not between", value1, value2, "logName");
            return (Criteria) this;
        }

        public Criteria andLogTextFormatIsNull() {

            addCriterion("LOG_TEXT_FORMAT is null");
            return (Criteria) this;
        }

        public Criteria andLogTextFormatIsNotNull() {

            addCriterion("LOG_TEXT_FORMAT is not null");
            return (Criteria) this;
        }

        public Criteria andLogTextFormatEqualTo(String value) {

            addCriterion("LOG_TEXT_FORMAT =", value, "logTextFormat");
            return (Criteria) this;
        }

        public Criteria andLogTextFormatNotEqualTo(String value) {

            addCriterion("LOG_TEXT_FORMAT <>", value, "logTextFormat");
            return (Criteria) this;
        }

        public Criteria andLogTextFormatGreaterThan(String value) {

            addCriterion("LOG_TEXT_FORMAT >", value, "logTextFormat");
            return (Criteria) this;
        }

        public Criteria andLogTextFormatGreaterThanOrEqualTo(String value) {

            addCriterion("LOG_TEXT_FORMAT >=", value, "logTextFormat");
            return (Criteria) this;
        }

        public Criteria andLogTextFormatLessThan(String value) {

            addCriterion("LOG_TEXT_FORMAT <", value, "logTextFormat");
            return (Criteria) this;
        }

        public Criteria andLogTextFormatLessThanOrEqualTo(String value) {

            addCriterion("LOG_TEXT_FORMAT <=", value, "logTextFormat");
            return (Criteria) this;
        }

        public Criteria andLogTextFormatLike(String value) {

            addCriterion("LOG_TEXT_FORMAT like", value, "logTextFormat");
            return (Criteria) this;
        }

        public Criteria andLogTextFormatNotLike(String value) {

            addCriterion("LOG_TEXT_FORMAT not like", value, "logTextFormat");
            return (Criteria) this;
        }

        public Criteria andLogTextFormatIn(List<String> values) {

            addCriterion("LOG_TEXT_FORMAT in", values, "logTextFormat");
            return (Criteria) this;
        }

        public Criteria andLogTextFormatNotIn(List<String> values) {

            addCriterion("LOG_TEXT_FORMAT not in", values, "logTextFormat");
            return (Criteria) this;
        }

        public Criteria andLogTextFormatBetween(String value1, String value2) {

            addCriterion("LOG_TEXT_FORMAT between", value1, value2, "logTextFormat");
            return (Criteria) this;
        }

        public Criteria andLogTextFormatNotBetween(String value1, String value2) {

            addCriterion("LOG_TEXT_FORMAT not between", value1, value2, "logTextFormat");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table LOG_CODE_MASTER
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
     * LOG_CODE_MASTER
     *
     * @mbggenerated do_not_delete_during_merge Wed Sep 07 15:13:24 JST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}
