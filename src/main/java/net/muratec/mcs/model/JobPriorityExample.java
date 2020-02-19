﻿package net.muratec.mcs.model;

import java.util.ArrayList;
import java.util.List;

public class JobPriorityExample {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table JOB_PRIORITY
     * @mbg.generated
     */
    protected String orderByClause;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table JOB_PRIORITY
     * @mbg.generated
     */
    protected boolean distinct;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table JOB_PRIORITY
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table JOB_PRIORITY
     * @mbg.generated
     */
    public JobPriorityExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table JOB_PRIORITY
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {

        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table JOB_PRIORITY
     * @mbg.generated
     */
    public String getOrderByClause() {

        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table JOB_PRIORITY
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {

        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table JOB_PRIORITY
     * @mbg.generated
     */
    public boolean isDistinct() {

        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table JOB_PRIORITY
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {

        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table JOB_PRIORITY
     * @mbg.generated
     */
    public void or(Criteria criteria) {

        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table JOB_PRIORITY
     * @mbg.generated
     */
    public Criteria or() {

        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table JOB_PRIORITY
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
     * This method was generated by MyBatis Generator. This method corresponds to the database table JOB_PRIORITY
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {

        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table JOB_PRIORITY
     * @mbg.generated
     */
    public void clear() {

        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table JOB_PRIORITY
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

        public Criteria andThresholdPriorityIsNull() {

            addCriterion("THRESHOLD_PRIORITY is null");
            return (Criteria) this;
        }

        public Criteria andThresholdPriorityIsNotNull() {

            addCriterion("THRESHOLD_PRIORITY is not null");
            return (Criteria) this;
        }

        public Criteria andThresholdPriorityEqualTo(Short value) {

            addCriterion("THRESHOLD_PRIORITY =", value, "thresholdPriority");
            return (Criteria) this;
        }

        public Criteria andThresholdPriorityNotEqualTo(Short value) {

            addCriterion("THRESHOLD_PRIORITY <>", value, "thresholdPriority");
            return (Criteria) this;
        }

        public Criteria andThresholdPriorityGreaterThan(Short value) {

            addCriterion("THRESHOLD_PRIORITY >", value, "thresholdPriority");
            return (Criteria) this;
        }

        public Criteria andThresholdPriorityGreaterThanOrEqualTo(Short value) {

            addCriterion("THRESHOLD_PRIORITY >=", value, "thresholdPriority");
            return (Criteria) this;
        }

        public Criteria andThresholdPriorityLessThan(Short value) {

            addCriterion("THRESHOLD_PRIORITY <", value, "thresholdPriority");
            return (Criteria) this;
        }

        public Criteria andThresholdPriorityLessThanOrEqualTo(Short value) {

            addCriterion("THRESHOLD_PRIORITY <=", value, "thresholdPriority");
            return (Criteria) this;
        }

        public Criteria andThresholdPriorityIn(List<Short> values) {

            addCriterion("THRESHOLD_PRIORITY in", values, "thresholdPriority");
            return (Criteria) this;
        }

        public Criteria andThresholdPriorityNotIn(List<Short> values) {

            addCriterion("THRESHOLD_PRIORITY not in", values, "thresholdPriority");
            return (Criteria) this;
        }

        public Criteria andThresholdPriorityBetween(Short value1, Short value2) {

            addCriterion("THRESHOLD_PRIORITY between", value1, value2, "thresholdPriority");
            return (Criteria) this;
        }

        public Criteria andThresholdPriorityNotBetween(Short value1, Short value2) {

            addCriterion("THRESHOLD_PRIORITY not between", value1, value2, "thresholdPriority");
            return (Criteria) this;
        }

        public Criteria andUseAcceleratorIsNull() {

            addCriterion("USE_ACCELERATOR is null");
            return (Criteria) this;
        }

        public Criteria andUseAcceleratorIsNotNull() {

            addCriterion("USE_ACCELERATOR is not null");
            return (Criteria) this;
        }

        public Criteria andUseAcceleratorEqualTo(Short value) {

            addCriterion("USE_ACCELERATOR =", value, "useAccelerator");
            return (Criteria) this;
        }

        public Criteria andUseAcceleratorNotEqualTo(Short value) {

            addCriterion("USE_ACCELERATOR <>", value, "useAccelerator");
            return (Criteria) this;
        }

        public Criteria andUseAcceleratorGreaterThan(Short value) {

            addCriterion("USE_ACCELERATOR >", value, "useAccelerator");
            return (Criteria) this;
        }

        public Criteria andUseAcceleratorGreaterThanOrEqualTo(Short value) {

            addCriterion("USE_ACCELERATOR >=", value, "useAccelerator");
            return (Criteria) this;
        }

        public Criteria andUseAcceleratorLessThan(Short value) {

            addCriterion("USE_ACCELERATOR <", value, "useAccelerator");
            return (Criteria) this;
        }

        public Criteria andUseAcceleratorLessThanOrEqualTo(Short value) {

            addCriterion("USE_ACCELERATOR <=", value, "useAccelerator");
            return (Criteria) this;
        }

        public Criteria andUseAcceleratorIn(List<Short> values) {

            addCriterion("USE_ACCELERATOR in", values, "useAccelerator");
            return (Criteria) this;
        }

        public Criteria andUseAcceleratorNotIn(List<Short> values) {

            addCriterion("USE_ACCELERATOR not in", values, "useAccelerator");
            return (Criteria) this;
        }

        public Criteria andUseAcceleratorBetween(Short value1, Short value2) {

            addCriterion("USE_ACCELERATOR between", value1, value2, "useAccelerator");
            return (Criteria) this;
        }

        public Criteria andUseAcceleratorNotBetween(Short value1, Short value2) {

            addCriterion("USE_ACCELERATOR not between", value1, value2, "useAccelerator");
            return (Criteria) this;
        }

        public Criteria andLimitPriorityIsNull() {

            addCriterion("LIMIT_PRIORITY is null");
            return (Criteria) this;
        }

        public Criteria andLimitPriorityIsNotNull() {

            addCriterion("LIMIT_PRIORITY is not null");
            return (Criteria) this;
        }

        public Criteria andLimitPriorityEqualTo(Short value) {

            addCriterion("LIMIT_PRIORITY =", value, "limitPriority");
            return (Criteria) this;
        }

        public Criteria andLimitPriorityNotEqualTo(Short value) {

            addCriterion("LIMIT_PRIORITY <>", value, "limitPriority");
            return (Criteria) this;
        }

        public Criteria andLimitPriorityGreaterThan(Short value) {

            addCriterion("LIMIT_PRIORITY >", value, "limitPriority");
            return (Criteria) this;
        }

        public Criteria andLimitPriorityGreaterThanOrEqualTo(Short value) {

            addCriterion("LIMIT_PRIORITY >=", value, "limitPriority");
            return (Criteria) this;
        }

        public Criteria andLimitPriorityLessThan(Short value) {

            addCriterion("LIMIT_PRIORITY <", value, "limitPriority");
            return (Criteria) this;
        }

        public Criteria andLimitPriorityLessThanOrEqualTo(Short value) {

            addCriterion("LIMIT_PRIORITY <=", value, "limitPriority");
            return (Criteria) this;
        }

        public Criteria andLimitPriorityIn(List<Short> values) {

            addCriterion("LIMIT_PRIORITY in", values, "limitPriority");
            return (Criteria) this;
        }

        public Criteria andLimitPriorityNotIn(List<Short> values) {

            addCriterion("LIMIT_PRIORITY not in", values, "limitPriority");
            return (Criteria) this;
        }

        public Criteria andLimitPriorityBetween(Short value1, Short value2) {

            addCriterion("LIMIT_PRIORITY between", value1, value2, "limitPriority");
            return (Criteria) this;
        }

        public Criteria andLimitPriorityNotBetween(Short value1, Short value2) {

            addCriterion("LIMIT_PRIORITY not between", value1, value2, "limitPriority");
            return (Criteria) this;
        }

        public Criteria andTimeLimitIsNull() {

            addCriterion("TIME_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andTimeLimitIsNotNull() {

            addCriterion("TIME_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andTimeLimitEqualTo(Integer value) {

            addCriterion("TIME_LIMIT =", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitNotEqualTo(Integer value) {

            addCriterion("TIME_LIMIT <>", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitGreaterThan(Integer value) {

            addCriterion("TIME_LIMIT >", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitGreaterThanOrEqualTo(Integer value) {

            addCriterion("TIME_LIMIT >=", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitLessThan(Integer value) {

            addCriterion("TIME_LIMIT <", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitLessThanOrEqualTo(Integer value) {

            addCriterion("TIME_LIMIT <=", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitIn(List<Integer> values) {

            addCriterion("TIME_LIMIT in", values, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitNotIn(List<Integer> values) {

            addCriterion("TIME_LIMIT not in", values, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitBetween(Integer value1, Integer value2) {

            addCriterion("TIME_LIMIT between", value1, value2, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitNotBetween(Integer value1, Integer value2) {

            addCriterion("TIME_LIMIT not between", value1, value2, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andOvertimeAlarmIdIsNull() {

            addCriterion("OVERTIME_ALARM_ID is null");
            return (Criteria) this;
        }

        public Criteria andOvertimeAlarmIdIsNotNull() {

            addCriterion("OVERTIME_ALARM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOvertimeAlarmIdEqualTo(Long value) {

            addCriterion("OVERTIME_ALARM_ID =", value, "overtimeAlarmId");
            return (Criteria) this;
        }

        public Criteria andOvertimeAlarmIdNotEqualTo(Long value) {

            addCriterion("OVERTIME_ALARM_ID <>", value, "overtimeAlarmId");
            return (Criteria) this;
        }

        public Criteria andOvertimeAlarmIdGreaterThan(Long value) {

            addCriterion("OVERTIME_ALARM_ID >", value, "overtimeAlarmId");
            return (Criteria) this;
        }

        public Criteria andOvertimeAlarmIdGreaterThanOrEqualTo(Long value) {

            addCriterion("OVERTIME_ALARM_ID >=", value, "overtimeAlarmId");
            return (Criteria) this;
        }

        public Criteria andOvertimeAlarmIdLessThan(Long value) {

            addCriterion("OVERTIME_ALARM_ID <", value, "overtimeAlarmId");
            return (Criteria) this;
        }

        public Criteria andOvertimeAlarmIdLessThanOrEqualTo(Long value) {

            addCriterion("OVERTIME_ALARM_ID <=", value, "overtimeAlarmId");
            return (Criteria) this;
        }

        public Criteria andOvertimeAlarmIdIn(List<Long> values) {

            addCriterion("OVERTIME_ALARM_ID in", values, "overtimeAlarmId");
            return (Criteria) this;
        }

        public Criteria andOvertimeAlarmIdNotIn(List<Long> values) {

            addCriterion("OVERTIME_ALARM_ID not in", values, "overtimeAlarmId");
            return (Criteria) this;
        }

        public Criteria andOvertimeAlarmIdBetween(Long value1, Long value2) {

            addCriterion("OVERTIME_ALARM_ID between", value1, value2, "overtimeAlarmId");
            return (Criteria) this;
        }

        public Criteria andOvertimeAlarmIdNotBetween(Long value1, Long value2) {

            addCriterion("OVERTIME_ALARM_ID not between", value1, value2, "overtimeAlarmId");
            return (Criteria) this;
        }

        public Criteria andUltimateTimeIsNull() {

            addCriterion("ULTIMATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUltimateTimeIsNotNull() {

            addCriterion("ULTIMATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUltimateTimeEqualTo(Integer value) {

            addCriterion("ULTIMATE_TIME =", value, "ultimateTime");
            return (Criteria) this;
        }

        public Criteria andUltimateTimeNotEqualTo(Integer value) {

            addCriterion("ULTIMATE_TIME <>", value, "ultimateTime");
            return (Criteria) this;
        }

        public Criteria andUltimateTimeGreaterThan(Integer value) {

            addCriterion("ULTIMATE_TIME >", value, "ultimateTime");
            return (Criteria) this;
        }

        public Criteria andUltimateTimeGreaterThanOrEqualTo(Integer value) {

            addCriterion("ULTIMATE_TIME >=", value, "ultimateTime");
            return (Criteria) this;
        }

        public Criteria andUltimateTimeLessThan(Integer value) {

            addCriterion("ULTIMATE_TIME <", value, "ultimateTime");
            return (Criteria) this;
        }

        public Criteria andUltimateTimeLessThanOrEqualTo(Integer value) {

            addCriterion("ULTIMATE_TIME <=", value, "ultimateTime");
            return (Criteria) this;
        }

        public Criteria andUltimateTimeIn(List<Integer> values) {

            addCriterion("ULTIMATE_TIME in", values, "ultimateTime");
            return (Criteria) this;
        }

        public Criteria andUltimateTimeNotIn(List<Integer> values) {

            addCriterion("ULTIMATE_TIME not in", values, "ultimateTime");
            return (Criteria) this;
        }

        public Criteria andUltimateTimeBetween(Integer value1, Integer value2) {

            addCriterion("ULTIMATE_TIME between", value1, value2, "ultimateTime");
            return (Criteria) this;
        }

        public Criteria andUltimateTimeNotBetween(Integer value1, Integer value2) {

            addCriterion("ULTIMATE_TIME not between", value1, value2, "ultimateTime");
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

        public Criteria andHotlotCategoryIsNull() {

            addCriterion("HOTLOT_CATEGORY is null");
            return (Criteria) this;
        }

        public Criteria andHotlotCategoryIsNotNull() {

            addCriterion("HOTLOT_CATEGORY is not null");
            return (Criteria) this;
        }

        public Criteria andHotlotCategoryEqualTo(Short value) {

            addCriterion("HOTLOT_CATEGORY =", value, "hotlotCategory");
            return (Criteria) this;
        }

        public Criteria andHotlotCategoryNotEqualTo(Short value) {

            addCriterion("HOTLOT_CATEGORY <>", value, "hotlotCategory");
            return (Criteria) this;
        }

        public Criteria andHotlotCategoryGreaterThan(Short value) {

            addCriterion("HOTLOT_CATEGORY >", value, "hotlotCategory");
            return (Criteria) this;
        }

        public Criteria andHotlotCategoryGreaterThanOrEqualTo(Short value) {

            addCriterion("HOTLOT_CATEGORY >=", value, "hotlotCategory");
            return (Criteria) this;
        }

        public Criteria andHotlotCategoryLessThan(Short value) {

            addCriterion("HOTLOT_CATEGORY <", value, "hotlotCategory");
            return (Criteria) this;
        }

        public Criteria andHotlotCategoryLessThanOrEqualTo(Short value) {

            addCriterion("HOTLOT_CATEGORY <=", value, "hotlotCategory");
            return (Criteria) this;
        }

        public Criteria andHotlotCategoryIn(List<Short> values) {

            addCriterion("HOTLOT_CATEGORY in", values, "hotlotCategory");
            return (Criteria) this;
        }

        public Criteria andHotlotCategoryNotIn(List<Short> values) {

            addCriterion("HOTLOT_CATEGORY not in", values, "hotlotCategory");
            return (Criteria) this;
        }

        public Criteria andHotlotCategoryBetween(Short value1, Short value2) {

            addCriterion("HOTLOT_CATEGORY between", value1, value2, "hotlotCategory");
            return (Criteria) this;
        }

        public Criteria andHotlotCategoryNotBetween(Short value1, Short value2) {

            addCriterion("HOTLOT_CATEGORY not between", value1, value2, "hotlotCategory");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table JOB_PRIORITY
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
     * JOB_PRIORITY
     *
     * @mbggenerated do_not_delete_during_merge Wed Sep 07 15:13:24 JST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}
