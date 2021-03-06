﻿package net.muratec.mcs.model;

import java.util.ArrayList;
import java.util.List;

public class ToolBufferPortExample {
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table TOOL_BUFFER_PORT
     * @mbg.generated
     */
    protected String orderByClause;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table TOOL_BUFFER_PORT
     * @mbg.generated
     */
    protected boolean distinct;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table TOOL_BUFFER_PORT
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table TOOL_BUFFER_PORT
     * @mbg.generated
     */
    public ToolBufferPortExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table TOOL_BUFFER_PORT
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {

        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table TOOL_BUFFER_PORT
     * @mbg.generated
     */
    public String getOrderByClause() {

        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table TOOL_BUFFER_PORT
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {

        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table TOOL_BUFFER_PORT
     * @mbg.generated
     */
    public boolean isDistinct() {

        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table TOOL_BUFFER_PORT
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {

        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table TOOL_BUFFER_PORT
     * @mbg.generated
     */
    public void or(Criteria criteria) {

        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table TOOL_BUFFER_PORT
     * @mbg.generated
     */
    public Criteria or() {

        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table TOOL_BUFFER_PORT
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
     * This method was generated by MyBatis Generator. This method corresponds to the database table TOOL_BUFFER_PORT
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {

        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table TOOL_BUFFER_PORT
     * @mbg.generated
     */
    public void clear() {

        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table TOOL_BUFFER_PORT
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

        public Criteria andPortIdIsNull() {

            addCriterion("PORT_ID is null");
            return (Criteria) this;
        }

        public Criteria andPortIdIsNotNull() {

            addCriterion("PORT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPortIdEqualTo(String value) {

            addCriterion("PORT_ID =", value, "portId");
            return (Criteria) this;
        }

        public Criteria andPortIdNotEqualTo(String value) {

            addCriterion("PORT_ID <>", value, "portId");
            return (Criteria) this;
        }

        public Criteria andPortIdGreaterThan(String value) {

            addCriterion("PORT_ID >", value, "portId");
            return (Criteria) this;
        }

        public Criteria andPortIdGreaterThanOrEqualTo(String value) {

            addCriterion("PORT_ID >=", value, "portId");
            return (Criteria) this;
        }

        public Criteria andPortIdLessThan(String value) {

            addCriterion("PORT_ID <", value, "portId");
            return (Criteria) this;
        }

        public Criteria andPortIdLessThanOrEqualTo(String value) {

            addCriterion("PORT_ID <=", value, "portId");
            return (Criteria) this;
        }

        public Criteria andPortIdLike(String value) {

            addCriterion("PORT_ID like", value, "portId");
            return (Criteria) this;
        }

        public Criteria andPortIdNotLike(String value) {

            addCriterion("PORT_ID not like", value, "portId");
            return (Criteria) this;
        }

        public Criteria andPortIdIn(List<String> values) {

            addCriterion("PORT_ID in", values, "portId");
            return (Criteria) this;
        }

        public Criteria andPortIdNotIn(List<String> values) {

            addCriterion("PORT_ID not in", values, "portId");
            return (Criteria) this;
        }

        public Criteria andPortIdBetween(String value1, String value2) {

            addCriterion("PORT_ID between", value1, value2, "portId");
            return (Criteria) this;
        }

        public Criteria andPortIdNotBetween(String value1, String value2) {

            addCriterion("PORT_ID not between", value1, value2, "portId");
            return (Criteria) this;
        }

        public Criteria andBufferModeIsNull() {

            addCriterion("BUFFER_MODE is null");
            return (Criteria) this;
        }

        public Criteria andBufferModeIsNotNull() {

            addCriterion("BUFFER_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andBufferModeEqualTo(Short value) {

            addCriterion("BUFFER_MODE =", value, "bufferMode");
            return (Criteria) this;
        }

        public Criteria andBufferModeNotEqualTo(Short value) {

            addCriterion("BUFFER_MODE <>", value, "bufferMode");
            return (Criteria) this;
        }

        public Criteria andBufferModeGreaterThan(Short value) {

            addCriterion("BUFFER_MODE >", value, "bufferMode");
            return (Criteria) this;
        }

        public Criteria andBufferModeGreaterThanOrEqualTo(Short value) {

            addCriterion("BUFFER_MODE >=", value, "bufferMode");
            return (Criteria) this;
        }

        public Criteria andBufferModeLessThan(Short value) {

            addCriterion("BUFFER_MODE <", value, "bufferMode");
            return (Criteria) this;
        }

        public Criteria andBufferModeLessThanOrEqualTo(Short value) {

            addCriterion("BUFFER_MODE <=", value, "bufferMode");
            return (Criteria) this;
        }

        public Criteria andBufferModeIn(List<Short> values) {

            addCriterion("BUFFER_MODE in", values, "bufferMode");
            return (Criteria) this;
        }

        public Criteria andBufferModeNotIn(List<Short> values) {

            addCriterion("BUFFER_MODE not in", values, "bufferMode");
            return (Criteria) this;
        }

        public Criteria andBufferModeBetween(Short value1, Short value2) {

            addCriterion("BUFFER_MODE between", value1, value2, "bufferMode");
            return (Criteria) this;
        }

        public Criteria andBufferModeNotBetween(Short value1, Short value2) {

            addCriterion("BUFFER_MODE not between", value1, value2, "bufferMode");
            return (Criteria) this;
        }

        public Criteria andOhtPassOrderIsNull() {

            addCriterion("OHT_PASS_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andOhtPassOrderIsNotNull() {

            addCriterion("OHT_PASS_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andOhtPassOrderEqualTo(Short value) {

            addCriterion("OHT_PASS_ORDER =", value, "ohtPassOrder");
            return (Criteria) this;
        }

        public Criteria andOhtPassOrderNotEqualTo(Short value) {

            addCriterion("OHT_PASS_ORDER <>", value, "ohtPassOrder");
            return (Criteria) this;
        }

        public Criteria andOhtPassOrderGreaterThan(Short value) {

            addCriterion("OHT_PASS_ORDER >", value, "ohtPassOrder");
            return (Criteria) this;
        }

        public Criteria andOhtPassOrderGreaterThanOrEqualTo(Short value) {

            addCriterion("OHT_PASS_ORDER >=", value, "ohtPassOrder");
            return (Criteria) this;
        }

        public Criteria andOhtPassOrderLessThan(Short value) {

            addCriterion("OHT_PASS_ORDER <", value, "ohtPassOrder");
            return (Criteria) this;
        }

        public Criteria andOhtPassOrderLessThanOrEqualTo(Short value) {

            addCriterion("OHT_PASS_ORDER <=", value, "ohtPassOrder");
            return (Criteria) this;
        }

        public Criteria andOhtPassOrderIn(List<Short> values) {

            addCriterion("OHT_PASS_ORDER in", values, "ohtPassOrder");
            return (Criteria) this;
        }

        public Criteria andOhtPassOrderNotIn(List<Short> values) {

            addCriterion("OHT_PASS_ORDER not in", values, "ohtPassOrder");
            return (Criteria) this;
        }

        public Criteria andOhtPassOrderBetween(Short value1, Short value2) {

            addCriterion("OHT_PASS_ORDER between", value1, value2, "ohtPassOrder");
            return (Criteria) this;
        }

        public Criteria andOhtPassOrderNotBetween(Short value1, Short value2) {

            addCriterion("OHT_PASS_ORDER not between", value1, value2, "ohtPassOrder");
            return (Criteria) this;
        }

        public Criteria andReserveStateTimeIsNull() {

            addCriterion("RESERVE_STATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andReserveStateTimeIsNotNull() {

            addCriterion("RESERVE_STATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andReserveStateTimeEqualTo(Short value) {

            addCriterion("RESERVE_STATE_TIME =", value, "reserveStateTime");
            return (Criteria) this;
        }

        public Criteria andReserveStateTimeNotEqualTo(Short value) {

            addCriterion("RESERVE_STATE_TIME <>", value, "reserveStateTime");
            return (Criteria) this;
        }

        public Criteria andReserveStateTimeGreaterThan(Short value) {

            addCriterion("RESERVE_STATE_TIME >", value, "reserveStateTime");
            return (Criteria) this;
        }

        public Criteria andReserveStateTimeGreaterThanOrEqualTo(Short value) {

            addCriterion("RESERVE_STATE_TIME >=", value, "reserveStateTime");
            return (Criteria) this;
        }

        public Criteria andReserveStateTimeLessThan(Short value) {

            addCriterion("RESERVE_STATE_TIME <", value, "reserveStateTime");
            return (Criteria) this;
        }

        public Criteria andReserveStateTimeLessThanOrEqualTo(Short value) {

            addCriterion("RESERVE_STATE_TIME <=", value, "reserveStateTime");
            return (Criteria) this;
        }

        public Criteria andReserveStateTimeIn(List<Short> values) {

            addCriterion("RESERVE_STATE_TIME in", values, "reserveStateTime");
            return (Criteria) this;
        }

        public Criteria andReserveStateTimeNotIn(List<Short> values) {

            addCriterion("RESERVE_STATE_TIME not in", values, "reserveStateTime");
            return (Criteria) this;
        }

        public Criteria andReserveStateTimeBetween(Short value1, Short value2) {

            addCriterion("RESERVE_STATE_TIME between", value1, value2, "reserveStateTime");
            return (Criteria) this;
        }

        public Criteria andReserveStateTimeNotBetween(Short value1, Short value2) {

            addCriterion("RESERVE_STATE_TIME not between", value1, value2, "reserveStateTime");
            return (Criteria) this;
        }

        public Criteria andFromRunTimeIsNull() {

            addCriterion("FROM_RUN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andFromRunTimeIsNotNull() {

            addCriterion("FROM_RUN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andFromRunTimeEqualTo(Short value) {

            addCriterion("FROM_RUN_TIME =", value, "fromRunTime");
            return (Criteria) this;
        }

        public Criteria andFromRunTimeNotEqualTo(Short value) {

            addCriterion("FROM_RUN_TIME <>", value, "fromRunTime");
            return (Criteria) this;
        }

        public Criteria andFromRunTimeGreaterThan(Short value) {

            addCriterion("FROM_RUN_TIME >", value, "fromRunTime");
            return (Criteria) this;
        }

        public Criteria andFromRunTimeGreaterThanOrEqualTo(Short value) {

            addCriterion("FROM_RUN_TIME >=", value, "fromRunTime");
            return (Criteria) this;
        }

        public Criteria andFromRunTimeLessThan(Short value) {

            addCriterion("FROM_RUN_TIME <", value, "fromRunTime");
            return (Criteria) this;
        }

        public Criteria andFromRunTimeLessThanOrEqualTo(Short value) {

            addCriterion("FROM_RUN_TIME <=", value, "fromRunTime");
            return (Criteria) this;
        }

        public Criteria andFromRunTimeIn(List<Short> values) {

            addCriterion("FROM_RUN_TIME in", values, "fromRunTime");
            return (Criteria) this;
        }

        public Criteria andFromRunTimeNotIn(List<Short> values) {

            addCriterion("FROM_RUN_TIME not in", values, "fromRunTime");
            return (Criteria) this;
        }

        public Criteria andFromRunTimeBetween(Short value1, Short value2) {

            addCriterion("FROM_RUN_TIME between", value1, value2, "fromRunTime");
            return (Criteria) this;
        }

        public Criteria andFromRunTimeNotBetween(Short value1, Short value2) {

            addCriterion("FROM_RUN_TIME not between", value1, value2, "fromRunTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table TOOL_BUFFER_PORT
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
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TOOL_BUFFER_PORT
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}
