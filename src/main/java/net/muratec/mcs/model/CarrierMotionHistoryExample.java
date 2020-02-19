﻿package net.muratec.mcs.model;

import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;

public class CarrierMotionHistoryExample {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table CARRIER_MOTION_HISTORY
     * @mbg.generated
     */
    protected String orderByClause;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table CARRIER_MOTION_HISTORY
     * @mbg.generated
     */
    protected boolean distinct;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table CARRIER_MOTION_HISTORY
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table CARRIER_MOTION_HISTORY
     * @mbg.generated
     */
    public CarrierMotionHistoryExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table CARRIER_MOTION_HISTORY
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {

        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table CARRIER_MOTION_HISTORY
     * @mbg.generated
     */
    public String getOrderByClause() {

        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table CARRIER_MOTION_HISTORY
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {

        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table CARRIER_MOTION_HISTORY
     * @mbg.generated
     */
    public boolean isDistinct() {

        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table CARRIER_MOTION_HISTORY
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {

        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table CARRIER_MOTION_HISTORY
     * @mbg.generated
     */
    public void or(Criteria criteria) {

        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table CARRIER_MOTION_HISTORY
     * @mbg.generated
     */
    public Criteria or() {

        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table CARRIER_MOTION_HISTORY
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
     * This method was generated by MyBatis Generator. This method corresponds to the database table CARRIER_MOTION_HISTORY
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {

        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table CARRIER_MOTION_HISTORY
     * @mbg.generated
     */
    public void clear() {

        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table CARRIER_MOTION_HISTORY
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

        public Criteria andCarrierIdIsNull() {

            addCriterion("CARRIER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCarrierIdIsNotNull() {

            addCriterion("CARRIER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCarrierIdEqualTo(String value) {

            addCriterion("CARRIER_ID =", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdNotEqualTo(String value) {

            addCriterion("CARRIER_ID <>", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdGreaterThan(String value) {

            addCriterion("CARRIER_ID >", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdGreaterThanOrEqualTo(String value) {

            addCriterion("CARRIER_ID >=", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdLessThan(String value) {

            addCriterion("CARRIER_ID <", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdLessThanOrEqualTo(String value) {

            addCriterion("CARRIER_ID <=", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdLike(String value) {

            addCriterion("CARRIER_ID like", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdNotLike(String value) {

            addCriterion("CARRIER_ID not like", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdIn(List<String> values) {

            addCriterion("CARRIER_ID in", values, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdNotIn(List<String> values) {

            addCriterion("CARRIER_ID not in", values, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdBetween(String value1, String value2) {

            addCriterion("CARRIER_ID between", value1, value2, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdNotBetween(String value1, String value2) {

            addCriterion("CARRIER_ID not between", value1, value2, "carrierId");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {

            addCriterion("TIME is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {

            addCriterion("TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Timestamp value) {

            addCriterion("TIME =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Timestamp value) {

            addCriterion("TIME <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Timestamp value) {

            addCriterion("TIME >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Timestamp value) {

            addCriterion("TIME >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Timestamp value) {

            addCriterion("TIME <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Timestamp value) {

            addCriterion("TIME <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Timestamp> values) {

            addCriterion("TIME in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Timestamp> values) {

            addCriterion("TIME not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Timestamp value1, Timestamp value2) {

            addCriterion("TIME between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Timestamp value1, Timestamp value2) {

            addCriterion("TIME not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andEntityIdIsNull() {

            addCriterion("ENTITY_ID is null");
            return (Criteria) this;
        }

        public Criteria andEntityIdIsNotNull() {

            addCriterion("ENTITY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEntityIdEqualTo(String value) {

            addCriterion("ENTITY_ID =", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdNotEqualTo(String value) {

            addCriterion("ENTITY_ID <>", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdGreaterThan(String value) {

            addCriterion("ENTITY_ID >", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdGreaterThanOrEqualTo(String value) {

            addCriterion("ENTITY_ID >=", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdLessThan(String value) {

            addCriterion("ENTITY_ID <", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdLessThanOrEqualTo(String value) {

            addCriterion("ENTITY_ID <=", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdLike(String value) {

            addCriterion("ENTITY_ID like", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdNotLike(String value) {

            addCriterion("ENTITY_ID not like", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdIn(List<String> values) {

            addCriterion("ENTITY_ID in", values, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdNotIn(List<String> values) {

            addCriterion("ENTITY_ID not in", values, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdBetween(String value1, String value2) {

            addCriterion("ENTITY_ID between", value1, value2, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdNotBetween(String value1, String value2) {

            addCriterion("ENTITY_ID not between", value1, value2, "entityId");
            return (Criteria) this;
        }

        public Criteria andNewLocIsNull() {

            addCriterion("NEW_LOC is null");
            return (Criteria) this;
        }

        public Criteria andNewLocIsNotNull() {

            addCriterion("NEW_LOC is not null");
            return (Criteria) this;
        }

        public Criteria andNewLocEqualTo(String value) {

            addCriterion("NEW_LOC =", value, "newLoc");
            return (Criteria) this;
        }

        public Criteria andNewLocNotEqualTo(String value) {

            addCriterion("NEW_LOC <>", value, "newLoc");
            return (Criteria) this;
        }

        public Criteria andNewLocGreaterThan(String value) {

            addCriterion("NEW_LOC >", value, "newLoc");
            return (Criteria) this;
        }

        public Criteria andNewLocGreaterThanOrEqualTo(String value) {

            addCriterion("NEW_LOC >=", value, "newLoc");
            return (Criteria) this;
        }

        public Criteria andNewLocLessThan(String value) {

            addCriterion("NEW_LOC <", value, "newLoc");
            return (Criteria) this;
        }

        public Criteria andNewLocLessThanOrEqualTo(String value) {

            addCriterion("NEW_LOC <=", value, "newLoc");
            return (Criteria) this;
        }

        public Criteria andNewLocLike(String value) {

            addCriterion("NEW_LOC like", value, "newLoc");
            return (Criteria) this;
        }

        public Criteria andNewLocNotLike(String value) {

            addCriterion("NEW_LOC not like", value, "newLoc");
            return (Criteria) this;
        }

        public Criteria andNewLocIn(List<String> values) {

            addCriterion("NEW_LOC in", values, "newLoc");
            return (Criteria) this;
        }

        public Criteria andNewLocNotIn(List<String> values) {

            addCriterion("NEW_LOC not in", values, "newLoc");
            return (Criteria) this;
        }

        public Criteria andNewLocBetween(String value1, String value2) {

            addCriterion("NEW_LOC between", value1, value2, "newLoc");
            return (Criteria) this;
        }

        public Criteria andNewLocNotBetween(String value1, String value2) {

            addCriterion("NEW_LOC not between", value1, value2, "newLoc");
            return (Criteria) this;
        }

        public Criteria andCarrierJobIdIsNull() {

            addCriterion("CARRIER_JOB_ID is null");
            return (Criteria) this;
        }

        public Criteria andCarrierJobIdIsNotNull() {

            addCriterion("CARRIER_JOB_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCarrierJobIdEqualTo(String value) {

            addCriterion("CARRIER_JOB_ID =", value, "carrierJobId");
            return (Criteria) this;
        }

        public Criteria andCarrierJobIdNotEqualTo(String value) {

            addCriterion("CARRIER_JOB_ID <>", value, "carrierJobId");
            return (Criteria) this;
        }

        public Criteria andCarrierJobIdGreaterThan(String value) {

            addCriterion("CARRIER_JOB_ID >", value, "carrierJobId");
            return (Criteria) this;
        }

        public Criteria andCarrierJobIdGreaterThanOrEqualTo(String value) {

            addCriterion("CARRIER_JOB_ID >=", value, "carrierJobId");
            return (Criteria) this;
        }

        public Criteria andCarrierJobIdLessThan(String value) {

            addCriterion("CARRIER_JOB_ID <", value, "carrierJobId");
            return (Criteria) this;
        }

        public Criteria andCarrierJobIdLessThanOrEqualTo(String value) {

            addCriterion("CARRIER_JOB_ID <=", value, "carrierJobId");
            return (Criteria) this;
        }

        public Criteria andCarrierJobIdLike(String value) {

            addCriterion("CARRIER_JOB_ID like", value, "carrierJobId");
            return (Criteria) this;
        }

        public Criteria andCarrierJobIdNotLike(String value) {

            addCriterion("CARRIER_JOB_ID not like", value, "carrierJobId");
            return (Criteria) this;
        }

        public Criteria andCarrierJobIdIn(List<String> values) {

            addCriterion("CARRIER_JOB_ID in", values, "carrierJobId");
            return (Criteria) this;
        }

        public Criteria andCarrierJobIdNotIn(List<String> values) {

            addCriterion("CARRIER_JOB_ID not in", values, "carrierJobId");
            return (Criteria) this;
        }

        public Criteria andCarrierJobIdBetween(String value1, String value2) {

            addCriterion("CARRIER_JOB_ID between", value1, value2, "carrierJobId");
            return (Criteria) this;
        }

        public Criteria andCarrierJobIdNotBetween(String value1, String value2) {

            addCriterion("CARRIER_JOB_ID not between", value1, value2, "carrierJobId");
            return (Criteria) this;
        }

        public Criteria andCarrierStateIsNull() {

            addCriterion("CARRIER_STATE is null");
            return (Criteria) this;
        }

        public Criteria andCarrierStateIsNotNull() {

            addCriterion("CARRIER_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andCarrierStateEqualTo(Short value) {

            addCriterion("CARRIER_STATE =", value, "carrierState");
            return (Criteria) this;
        }

        public Criteria andCarrierStateNotEqualTo(Short value) {

            addCriterion("CARRIER_STATE <>", value, "carrierState");
            return (Criteria) this;
        }

        public Criteria andCarrierStateGreaterThan(Short value) {

            addCriterion("CARRIER_STATE >", value, "carrierState");
            return (Criteria) this;
        }

        public Criteria andCarrierStateGreaterThanOrEqualTo(Short value) {

            addCriterion("CARRIER_STATE >=", value, "carrierState");
            return (Criteria) this;
        }

        public Criteria andCarrierStateLessThan(Short value) {

            addCriterion("CARRIER_STATE <", value, "carrierState");
            return (Criteria) this;
        }

        public Criteria andCarrierStateLessThanOrEqualTo(Short value) {

            addCriterion("CARRIER_STATE <=", value, "carrierState");
            return (Criteria) this;
        }

        public Criteria andCarrierStateIn(List<Short> values) {

            addCriterion("CARRIER_STATE in", values, "carrierState");
            return (Criteria) this;
        }

        public Criteria andCarrierStateNotIn(List<Short> values) {

            addCriterion("CARRIER_STATE not in", values, "carrierState");
            return (Criteria) this;
        }

        public Criteria andCarrierStateBetween(Short value1, Short value2) {

            addCriterion("CARRIER_STATE between", value1, value2, "carrierState");
            return (Criteria) this;
        }

        public Criteria andCarrierStateNotBetween(Short value1, Short value2) {

            addCriterion("CARRIER_STATE not between", value1, value2, "carrierState");
            return (Criteria) this;
        }

        public Criteria andCarrierTypeIdIsNull() {

            addCriterion("CARRIER_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCarrierTypeIdIsNotNull() {

            addCriterion("CARRIER_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCarrierTypeIdEqualTo(String value) {

            addCriterion("CARRIER_TYPE_ID =", value, "carrierTypeId");
            return (Criteria) this;
        }

        public Criteria andCarrierTypeIdNotEqualTo(String value) {

            addCriterion("CARRIER_TYPE_ID <>", value, "carrierTypeId");
            return (Criteria) this;
        }

        public Criteria andCarrierTypeIdGreaterThan(String value) {

            addCriterion("CARRIER_TYPE_ID >", value, "carrierTypeId");
            return (Criteria) this;
        }

        public Criteria andCarrierTypeIdGreaterThanOrEqualTo(String value) {

            addCriterion("CARRIER_TYPE_ID >=", value, "carrierTypeId");
            return (Criteria) this;
        }

        public Criteria andCarrierTypeIdLessThan(String value) {

            addCriterion("CARRIER_TYPE_ID <", value, "carrierTypeId");
            return (Criteria) this;
        }

        public Criteria andCarrierTypeIdLessThanOrEqualTo(String value) {

            addCriterion("CARRIER_TYPE_ID <=", value, "carrierTypeId");
            return (Criteria) this;
        }

        public Criteria andCarrierTypeIdLike(String value) {

            addCriterion("CARRIER_TYPE_ID like", value, "carrierTypeId");
            return (Criteria) this;
        }

        public Criteria andCarrierTypeIdNotLike(String value) {

            addCriterion("CARRIER_TYPE_ID not like", value, "carrierTypeId");
            return (Criteria) this;
        }

        public Criteria andCarrierTypeIdIn(List<String> values) {

            addCriterion("CARRIER_TYPE_ID in", values, "carrierTypeId");
            return (Criteria) this;
        }

        public Criteria andCarrierTypeIdNotIn(List<String> values) {

            addCriterion("CARRIER_TYPE_ID not in", values, "carrierTypeId");
            return (Criteria) this;
        }

        public Criteria andCarrierTypeIdBetween(String value1, String value2) {

            addCriterion("CARRIER_TYPE_ID between", value1, value2, "carrierTypeId");
            return (Criteria) this;
        }

        public Criteria andCarrierTypeIdNotBetween(String value1, String value2) {

            addCriterion("CARRIER_TYPE_ID not between", value1, value2, "carrierTypeId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table CARRIER_MOTION_HISTORY
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
     * CARRIER_MOTION_HISTORY
     *
     * @mbggenerated do_not_delete_during_merge Wed Sep 07 15:13:24 JST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}
