﻿package net.muratec.mcs.model;

import java.util.ArrayList;
import java.util.List;

public class HostReportInfoExample {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table HOST_REPORT_INFO
     * @mbg.generated
     */
    protected String orderByClause;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table HOST_REPORT_INFO
     * @mbg.generated
     */
    protected boolean distinct;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table HOST_REPORT_INFO
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table HOST_REPORT_INFO
     * @mbg.generated
     */
    public HostReportInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table HOST_REPORT_INFO
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {

        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table HOST_REPORT_INFO
     * @mbg.generated
     */
    public String getOrderByClause() {

        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table HOST_REPORT_INFO
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {

        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table HOST_REPORT_INFO
     * @mbg.generated
     */
    public boolean isDistinct() {

        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table HOST_REPORT_INFO
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {

        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table HOST_REPORT_INFO
     * @mbg.generated
     */
    public void or(Criteria criteria) {

        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table HOST_REPORT_INFO
     * @mbg.generated
     */
    public Criteria or() {

        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table HOST_REPORT_INFO
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
     * This method was generated by MyBatis Generator. This method corresponds to the database table HOST_REPORT_INFO
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {

        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table HOST_REPORT_INFO
     * @mbg.generated
     */
    public void clear() {

        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table HOST_REPORT_INFO
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

        public Criteria andHostNameIsNull() {

            addCriterion("HOST_NAME is null");
            return (Criteria) this;
        }

        public Criteria andHostNameIsNotNull() {

            addCriterion("HOST_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andHostNameEqualTo(String value) {

            addCriterion("HOST_NAME =", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameNotEqualTo(String value) {

            addCriterion("HOST_NAME <>", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameGreaterThan(String value) {

            addCriterion("HOST_NAME >", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameGreaterThanOrEqualTo(String value) {

            addCriterion("HOST_NAME >=", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameLessThan(String value) {

            addCriterion("HOST_NAME <", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameLessThanOrEqualTo(String value) {

            addCriterion("HOST_NAME <=", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameLike(String value) {

            addCriterion("HOST_NAME like", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameNotLike(String value) {

            addCriterion("HOST_NAME not like", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameIn(List<String> values) {

            addCriterion("HOST_NAME in", values, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameNotIn(List<String> values) {

            addCriterion("HOST_NAME not in", values, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameBetween(String value1, String value2) {

            addCriterion("HOST_NAME between", value1, value2, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameNotBetween(String value1, String value2) {

            addCriterion("HOST_NAME not between", value1, value2, "hostName");
            return (Criteria) this;
        }

        public Criteria andTransactionIsNull() {

            addCriterion("TRANSACTION is null");
            return (Criteria) this;
        }

        public Criteria andTransactionIsNotNull() {

            addCriterion("TRANSACTION is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionEqualTo(Short value) {

            addCriterion("TRANSACTION =", value, "transaction");
            return (Criteria) this;
        }

        public Criteria andTransactionNotEqualTo(Short value) {

            addCriterion("TRANSACTION <>", value, "transaction");
            return (Criteria) this;
        }

        public Criteria andTransactionGreaterThan(Short value) {

            addCriterion("TRANSACTION >", value, "transaction");
            return (Criteria) this;
        }

        public Criteria andTransactionGreaterThanOrEqualTo(Short value) {

            addCriterion("TRANSACTION >=", value, "transaction");
            return (Criteria) this;
        }

        public Criteria andTransactionLessThan(Short value) {

            addCriterion("TRANSACTION <", value, "transaction");
            return (Criteria) this;
        }

        public Criteria andTransactionLessThanOrEqualTo(Short value) {

            addCriterion("TRANSACTION <=", value, "transaction");
            return (Criteria) this;
        }

        public Criteria andTransactionIn(List<Short> values) {

            addCriterion("TRANSACTION in", values, "transaction");
            return (Criteria) this;
        }

        public Criteria andTransactionNotIn(List<Short> values) {

            addCriterion("TRANSACTION not in", values, "transaction");
            return (Criteria) this;
        }

        public Criteria andTransactionBetween(Short value1, Short value2) {

            addCriterion("TRANSACTION between", value1, value2, "transaction");
            return (Criteria) this;
        }

        public Criteria andTransactionNotBetween(Short value1, Short value2) {

            addCriterion("TRANSACTION not between", value1, value2, "transaction");
            return (Criteria) this;
        }

        public Criteria andReportFlagIsNull() {

            addCriterion("REPORT_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andReportFlagIsNotNull() {

            addCriterion("REPORT_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andReportFlagEqualTo(Short value) {

            addCriterion("REPORT_FLAG =", value, "reportFlag");
            return (Criteria) this;
        }

        public Criteria andReportFlagNotEqualTo(Short value) {

            addCriterion("REPORT_FLAG <>", value, "reportFlag");
            return (Criteria) this;
        }

        public Criteria andReportFlagGreaterThan(Short value) {

            addCriterion("REPORT_FLAG >", value, "reportFlag");
            return (Criteria) this;
        }

        public Criteria andReportFlagGreaterThanOrEqualTo(Short value) {

            addCriterion("REPORT_FLAG >=", value, "reportFlag");
            return (Criteria) this;
        }

        public Criteria andReportFlagLessThan(Short value) {

            addCriterion("REPORT_FLAG <", value, "reportFlag");
            return (Criteria) this;
        }

        public Criteria andReportFlagLessThanOrEqualTo(Short value) {

            addCriterion("REPORT_FLAG <=", value, "reportFlag");
            return (Criteria) this;
        }

        public Criteria andReportFlagIn(List<Short> values) {

            addCriterion("REPORT_FLAG in", values, "reportFlag");
            return (Criteria) this;
        }

        public Criteria andReportFlagNotIn(List<Short> values) {

            addCriterion("REPORT_FLAG not in", values, "reportFlag");
            return (Criteria) this;
        }

        public Criteria andReportFlagBetween(Short value1, Short value2) {

            addCriterion("REPORT_FLAG between", value1, value2, "reportFlag");
            return (Criteria) this;
        }

        public Criteria andReportFlagNotBetween(Short value1, Short value2) {

            addCriterion("REPORT_FLAG not between", value1, value2, "reportFlag");
            return (Criteria) this;
        }

        public Criteria andQueueModeIsNull() {

            addCriterion("QUEUE_MODE is null");
            return (Criteria) this;
        }

        public Criteria andQueueModeIsNotNull() {

            addCriterion("QUEUE_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andQueueModeEqualTo(Short value) {

            addCriterion("QUEUE_MODE =", value, "queueMode");
            return (Criteria) this;
        }

        public Criteria andQueueModeNotEqualTo(Short value) {

            addCriterion("QUEUE_MODE <>", value, "queueMode");
            return (Criteria) this;
        }

        public Criteria andQueueModeGreaterThan(Short value) {

            addCriterion("QUEUE_MODE >", value, "queueMode");
            return (Criteria) this;
        }

        public Criteria andQueueModeGreaterThanOrEqualTo(Short value) {

            addCriterion("QUEUE_MODE >=", value, "queueMode");
            return (Criteria) this;
        }

        public Criteria andQueueModeLessThan(Short value) {

            addCriterion("QUEUE_MODE <", value, "queueMode");
            return (Criteria) this;
        }

        public Criteria andQueueModeLessThanOrEqualTo(Short value) {

            addCriterion("QUEUE_MODE <=", value, "queueMode");
            return (Criteria) this;
        }

        public Criteria andQueueModeIn(List<Short> values) {

            addCriterion("QUEUE_MODE in", values, "queueMode");
            return (Criteria) this;
        }

        public Criteria andQueueModeNotIn(List<Short> values) {

            addCriterion("QUEUE_MODE not in", values, "queueMode");
            return (Criteria) this;
        }

        public Criteria andQueueModeBetween(Short value1, Short value2) {

            addCriterion("QUEUE_MODE between", value1, value2, "queueMode");
            return (Criteria) this;
        }

        public Criteria andQueueModeNotBetween(Short value1, Short value2) {

            addCriterion("QUEUE_MODE not between", value1, value2, "queueMode");
            return (Criteria) this;
        }

        public Criteria andRetryLimitIsNull() {

            addCriterion("RETRY_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andRetryLimitIsNotNull() {

            addCriterion("RETRY_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andRetryLimitEqualTo(Short value) {

            addCriterion("RETRY_LIMIT =", value, "retryLimit");
            return (Criteria) this;
        }

        public Criteria andRetryLimitNotEqualTo(Short value) {

            addCriterion("RETRY_LIMIT <>", value, "retryLimit");
            return (Criteria) this;
        }

        public Criteria andRetryLimitGreaterThan(Short value) {

            addCriterion("RETRY_LIMIT >", value, "retryLimit");
            return (Criteria) this;
        }

        public Criteria andRetryLimitGreaterThanOrEqualTo(Short value) {

            addCriterion("RETRY_LIMIT >=", value, "retryLimit");
            return (Criteria) this;
        }

        public Criteria andRetryLimitLessThan(Short value) {

            addCriterion("RETRY_LIMIT <", value, "retryLimit");
            return (Criteria) this;
        }

        public Criteria andRetryLimitLessThanOrEqualTo(Short value) {

            addCriterion("RETRY_LIMIT <=", value, "retryLimit");
            return (Criteria) this;
        }

        public Criteria andRetryLimitIn(List<Short> values) {

            addCriterion("RETRY_LIMIT in", values, "retryLimit");
            return (Criteria) this;
        }

        public Criteria andRetryLimitNotIn(List<Short> values) {

            addCriterion("RETRY_LIMIT not in", values, "retryLimit");
            return (Criteria) this;
        }

        public Criteria andRetryLimitBetween(Short value1, Short value2) {

            addCriterion("RETRY_LIMIT between", value1, value2, "retryLimit");
            return (Criteria) this;
        }

        public Criteria andRetryLimitNotBetween(Short value1, Short value2) {

            addCriterion("RETRY_LIMIT not between", value1, value2, "retryLimit");
            return (Criteria) this;
        }

        public Criteria andRetryRetCodeListIsNull() {

            addCriterion("RETRY_RET_CODE_LIST is null");
            return (Criteria) this;
        }

        public Criteria andRetryRetCodeListIsNotNull() {

            addCriterion("RETRY_RET_CODE_LIST is not null");
            return (Criteria) this;
        }

        public Criteria andRetryRetCodeListEqualTo(String value) {

            addCriterion("RETRY_RET_CODE_LIST =", value, "retryRetCodeList");
            return (Criteria) this;
        }

        public Criteria andRetryRetCodeListNotEqualTo(String value) {

            addCriterion("RETRY_RET_CODE_LIST <>", value, "retryRetCodeList");
            return (Criteria) this;
        }

        public Criteria andRetryRetCodeListGreaterThan(String value) {

            addCriterion("RETRY_RET_CODE_LIST >", value, "retryRetCodeList");
            return (Criteria) this;
        }

        public Criteria andRetryRetCodeListGreaterThanOrEqualTo(String value) {

            addCriterion("RETRY_RET_CODE_LIST >=", value, "retryRetCodeList");
            return (Criteria) this;
        }

        public Criteria andRetryRetCodeListLessThan(String value) {

            addCriterion("RETRY_RET_CODE_LIST <", value, "retryRetCodeList");
            return (Criteria) this;
        }

        public Criteria andRetryRetCodeListLessThanOrEqualTo(String value) {

            addCriterion("RETRY_RET_CODE_LIST <=", value, "retryRetCodeList");
            return (Criteria) this;
        }

        public Criteria andRetryRetCodeListLike(String value) {

            addCriterion("RETRY_RET_CODE_LIST like", value, "retryRetCodeList");
            return (Criteria) this;
        }

        public Criteria andRetryRetCodeListNotLike(String value) {

            addCriterion("RETRY_RET_CODE_LIST not like", value, "retryRetCodeList");
            return (Criteria) this;
        }

        public Criteria andRetryRetCodeListIn(List<String> values) {

            addCriterion("RETRY_RET_CODE_LIST in", values, "retryRetCodeList");
            return (Criteria) this;
        }

        public Criteria andRetryRetCodeListNotIn(List<String> values) {

            addCriterion("RETRY_RET_CODE_LIST not in", values, "retryRetCodeList");
            return (Criteria) this;
        }

        public Criteria andRetryRetCodeListBetween(String value1, String value2) {

            addCriterion("RETRY_RET_CODE_LIST between", value1, value2, "retryRetCodeList");
            return (Criteria) this;
        }

        public Criteria andRetryRetCodeListNotBetween(String value1, String value2) {

            addCriterion("RETRY_RET_CODE_LIST not between", value1, value2, "retryRetCodeList");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table HOST_REPORT_INFO
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
     * HOST_REPORT_INFO
     *
     * @mbggenerated do_not_delete_during_merge Mon Nov 14 10:45:44 JST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}
