﻿package net.muratec.mcs.model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class BinUtilStatsHistoryExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table BIN_UTIL_STATS_HISTORY
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table BIN_UTIL_STATS_HISTORY
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table BIN_UTIL_STATS_HISTORY
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BIN_UTIL_STATS_HISTORY
     *
     * @mbg.generated
     */
    public BinUtilStatsHistoryExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BIN_UTIL_STATS_HISTORY
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BIN_UTIL_STATS_HISTORY
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BIN_UTIL_STATS_HISTORY
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BIN_UTIL_STATS_HISTORY
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BIN_UTIL_STATS_HISTORY
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BIN_UTIL_STATS_HISTORY
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BIN_UTIL_STATS_HISTORY
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BIN_UTIL_STATS_HISTORY
     *
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
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BIN_UTIL_STATS_HISTORY
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BIN_UTIL_STATS_HISTORY
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table BIN_UTIL_STATS_HISTORY
     *
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

        public Criteria andElementIdIsNull() {
            addCriterion("ELEMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andElementIdIsNotNull() {
            addCriterion("ELEMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andElementIdEqualTo(String value) {
            addCriterion("ELEMENT_ID =", value, "elementId");
            return (Criteria) this;
        }

        public Criteria andElementIdNotEqualTo(String value) {
            addCriterion("ELEMENT_ID <>", value, "elementId");
            return (Criteria) this;
        }

        public Criteria andElementIdGreaterThan(String value) {
            addCriterion("ELEMENT_ID >", value, "elementId");
            return (Criteria) this;
        }

        public Criteria andElementIdGreaterThanOrEqualTo(String value) {
            addCriterion("ELEMENT_ID >=", value, "elementId");
            return (Criteria) this;
        }

        public Criteria andElementIdLessThan(String value) {
            addCriterion("ELEMENT_ID <", value, "elementId");
            return (Criteria) this;
        }

        public Criteria andElementIdLessThanOrEqualTo(String value) {
            addCriterion("ELEMENT_ID <=", value, "elementId");
            return (Criteria) this;
        }

        public Criteria andElementIdLike(String value) {
            addCriterion("ELEMENT_ID like", value, "elementId");
            return (Criteria) this;
        }

        public Criteria andElementIdNotLike(String value) {
            addCriterion("ELEMENT_ID not like", value, "elementId");
            return (Criteria) this;
        }

        public Criteria andElementIdIn(List<String> values) {
            addCriterion("ELEMENT_ID in", values, "elementId");
            return (Criteria) this;
        }

        public Criteria andElementIdNotIn(List<String> values) {
            addCriterion("ELEMENT_ID not in", values, "elementId");
            return (Criteria) this;
        }

        public Criteria andElementIdBetween(String value1, String value2) {
            addCriterion("ELEMENT_ID between", value1, value2, "elementId");
            return (Criteria) this;
        }

        public Criteria andElementIdNotBetween(String value1, String value2) {
            addCriterion("ELEMENT_ID not between", value1, value2, "elementId");
            return (Criteria) this;
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

        public Criteria andElementTypeIsNull() {
            addCriterion("ELEMENT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andElementTypeIsNotNull() {
            addCriterion("ELEMENT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andElementTypeEqualTo(Short value) {
            addCriterion("ELEMENT_TYPE =", value, "elementType");
            return (Criteria) this;
        }

        public Criteria andElementTypeNotEqualTo(Short value) {
            addCriterion("ELEMENT_TYPE <>", value, "elementType");
            return (Criteria) this;
        }

        public Criteria andElementTypeGreaterThan(Short value) {
            addCriterion("ELEMENT_TYPE >", value, "elementType");
            return (Criteria) this;
        }

        public Criteria andElementTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("ELEMENT_TYPE >=", value, "elementType");
            return (Criteria) this;
        }

        public Criteria andElementTypeLessThan(Short value) {
            addCriterion("ELEMENT_TYPE <", value, "elementType");
            return (Criteria) this;
        }

        public Criteria andElementTypeLessThanOrEqualTo(Short value) {
            addCriterion("ELEMENT_TYPE <=", value, "elementType");
            return (Criteria) this;
        }

        public Criteria andElementTypeIn(List<Short> values) {
            addCriterion("ELEMENT_TYPE in", values, "elementType");
            return (Criteria) this;
        }

        public Criteria andElementTypeNotIn(List<Short> values) {
            addCriterion("ELEMENT_TYPE not in", values, "elementType");
            return (Criteria) this;
        }

        public Criteria andElementTypeBetween(Short value1, Short value2) {
            addCriterion("ELEMENT_TYPE between", value1, value2, "elementType");
            return (Criteria) this;
        }

        public Criteria andElementTypeNotBetween(Short value1, Short value2) {
            addCriterion("ELEMENT_TYPE not between", value1, value2, "elementType");
            return (Criteria) this;
        }

        public Criteria andOccupiedIsNull() {
            addCriterion("OCCUPIED is null");
            return (Criteria) this;
        }

        public Criteria andOccupiedIsNotNull() {
            addCriterion("OCCUPIED is not null");
            return (Criteria) this;
        }

        public Criteria andOccupiedEqualTo(Short value) {
            addCriterion("OCCUPIED =", value, "occupied");
            return (Criteria) this;
        }

        public Criteria andOccupiedNotEqualTo(Short value) {
            addCriterion("OCCUPIED <>", value, "occupied");
            return (Criteria) this;
        }

        public Criteria andOccupiedGreaterThan(Short value) {
            addCriterion("OCCUPIED >", value, "occupied");
            return (Criteria) this;
        }

        public Criteria andOccupiedGreaterThanOrEqualTo(Short value) {
            addCriterion("OCCUPIED >=", value, "occupied");
            return (Criteria) this;
        }

        public Criteria andOccupiedLessThan(Short value) {
            addCriterion("OCCUPIED <", value, "occupied");
            return (Criteria) this;
        }

        public Criteria andOccupiedLessThanOrEqualTo(Short value) {
            addCriterion("OCCUPIED <=", value, "occupied");
            return (Criteria) this;
        }

        public Criteria andOccupiedIn(List<Short> values) {
            addCriterion("OCCUPIED in", values, "occupied");
            return (Criteria) this;
        }

        public Criteria andOccupiedNotIn(List<Short> values) {
            addCriterion("OCCUPIED not in", values, "occupied");
            return (Criteria) this;
        }

        public Criteria andOccupiedBetween(Short value1, Short value2) {
            addCriterion("OCCUPIED between", value1, value2, "occupied");
            return (Criteria) this;
        }

        public Criteria andOccupiedNotBetween(Short value1, Short value2) {
            addCriterion("OCCUPIED not between", value1, value2, "occupied");
            return (Criteria) this;
        }

        public Criteria andCapacityIsNull() {
            addCriterion("CAPACITY is null");
            return (Criteria) this;
        }

        public Criteria andCapacityIsNotNull() {
            addCriterion("CAPACITY is not null");
            return (Criteria) this;
        }

        public Criteria andCapacityEqualTo(Short value) {
            addCriterion("CAPACITY =", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityNotEqualTo(Short value) {
            addCriterion("CAPACITY <>", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityGreaterThan(Short value) {
            addCriterion("CAPACITY >", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityGreaterThanOrEqualTo(Short value) {
            addCriterion("CAPACITY >=", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityLessThan(Short value) {
            addCriterion("CAPACITY <", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityLessThanOrEqualTo(Short value) {
            addCriterion("CAPACITY <=", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityIn(List<Short> values) {
            addCriterion("CAPACITY in", values, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityNotIn(List<Short> values) {
            addCriterion("CAPACITY not in", values, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityBetween(Short value1, Short value2) {
            addCriterion("CAPACITY between", value1, value2, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityNotBetween(Short value1, Short value2) {
            addCriterion("CAPACITY not between", value1, value2, "capacity");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table BIN_UTIL_STATS_HISTORY
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
     * This class corresponds to the database table BIN_UTIL_STATS_HISTORY
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}