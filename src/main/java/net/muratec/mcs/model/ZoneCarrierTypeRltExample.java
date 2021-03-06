﻿package net.muratec.mcs.model;

import java.util.ArrayList;
import java.util.List;

public class ZoneCarrierTypeRltExample {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table ZONE_CARRIER_TYPE_RLT
     * @mbg.generated
     */
    protected String orderByClause;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table ZONE_CARRIER_TYPE_RLT
     * @mbg.generated
     */
    protected boolean distinct;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table ZONE_CARRIER_TYPE_RLT
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table ZONE_CARRIER_TYPE_RLT
     * @mbg.generated
     */
    public ZoneCarrierTypeRltExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table ZONE_CARRIER_TYPE_RLT
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {

        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table ZONE_CARRIER_TYPE_RLT
     * @mbg.generated
     */
    public String getOrderByClause() {

        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table ZONE_CARRIER_TYPE_RLT
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {

        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table ZONE_CARRIER_TYPE_RLT
     * @mbg.generated
     */
    public boolean isDistinct() {

        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table ZONE_CARRIER_TYPE_RLT
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {

        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table ZONE_CARRIER_TYPE_RLT
     * @mbg.generated
     */
    public void or(Criteria criteria) {

        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table ZONE_CARRIER_TYPE_RLT
     * @mbg.generated
     */
    public Criteria or() {

        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table ZONE_CARRIER_TYPE_RLT
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
     * This method was generated by MyBatis Generator. This method corresponds to the database table ZONE_CARRIER_TYPE_RLT
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {

        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table ZONE_CARRIER_TYPE_RLT
     * @mbg.generated
     */
    public void clear() {

        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table ZONE_CARRIER_TYPE_RLT
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

        public Criteria andZoneIdIsNull() {

            addCriterion("ZONE_ID is null");
            return (Criteria) this;
        }

        public Criteria andZoneIdIsNotNull() {

            addCriterion("ZONE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andZoneIdEqualTo(String value) {

            addCriterion("ZONE_ID =", value, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdNotEqualTo(String value) {

            addCriterion("ZONE_ID <>", value, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdGreaterThan(String value) {

            addCriterion("ZONE_ID >", value, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdGreaterThanOrEqualTo(String value) {

            addCriterion("ZONE_ID >=", value, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdLessThan(String value) {

            addCriterion("ZONE_ID <", value, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdLessThanOrEqualTo(String value) {

            addCriterion("ZONE_ID <=", value, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdLike(String value) {

            addCriterion("ZONE_ID like", value, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdNotLike(String value) {

            addCriterion("ZONE_ID not like", value, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdIn(List<String> values) {

            addCriterion("ZONE_ID in", values, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdNotIn(List<String> values) {

            addCriterion("ZONE_ID not in", values, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdBetween(String value1, String value2) {

            addCriterion("ZONE_ID between", value1, value2, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdNotBetween(String value1, String value2) {

            addCriterion("ZONE_ID not between", value1, value2, "zoneId");
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

        public Criteria andZonePriorityIsNull() {

            addCriterion("ZONE_PRIORITY is null");
            return (Criteria) this;
        }

        public Criteria andZonePriorityIsNotNull() {

            addCriterion("ZONE_PRIORITY is not null");
            return (Criteria) this;
        }

        public Criteria andZonePriorityEqualTo(Short value) {

            addCriterion("ZONE_PRIORITY =", value, "zonePriority");
            return (Criteria) this;
        }

        public Criteria andZonePriorityNotEqualTo(Short value) {

            addCriterion("ZONE_PRIORITY <>", value, "zonePriority");
            return (Criteria) this;
        }

        public Criteria andZonePriorityGreaterThan(Short value) {

            addCriterion("ZONE_PRIORITY >", value, "zonePriority");
            return (Criteria) this;
        }

        public Criteria andZonePriorityGreaterThanOrEqualTo(Short value) {

            addCriterion("ZONE_PRIORITY >=", value, "zonePriority");
            return (Criteria) this;
        }

        public Criteria andZonePriorityLessThan(Short value) {

            addCriterion("ZONE_PRIORITY <", value, "zonePriority");
            return (Criteria) this;
        }

        public Criteria andZonePriorityLessThanOrEqualTo(Short value) {

            addCriterion("ZONE_PRIORITY <=", value, "zonePriority");
            return (Criteria) this;
        }

        public Criteria andZonePriorityIn(List<Short> values) {

            addCriterion("ZONE_PRIORITY in", values, "zonePriority");
            return (Criteria) this;
        }

        public Criteria andZonePriorityNotIn(List<Short> values) {

            addCriterion("ZONE_PRIORITY not in", values, "zonePriority");
            return (Criteria) this;
        }

        public Criteria andZonePriorityBetween(Short value1, Short value2) {

            addCriterion("ZONE_PRIORITY between", value1, value2, "zonePriority");
            return (Criteria) this;
        }

        public Criteria andZonePriorityNotBetween(Short value1, Short value2) {

            addCriterion("ZONE_PRIORITY not between", value1, value2, "zonePriority");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table ZONE_CARRIER_TYPE_RLT
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
     * ZONE_CARRIER_TYPE_RLT
     *
     * @mbggenerated do_not_delete_during_merge Wed Sep 07 15:13:24 JST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}
