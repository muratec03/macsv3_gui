﻿package net.muratec.mcs.model;

import java.util.ArrayList;
import java.util.List;

public class GuiFuncGroupExample {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table GUI_FUNC_GROUP
     * @mbg.generated
     */
    protected String orderByClause;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table GUI_FUNC_GROUP
     * @mbg.generated
     */
    protected boolean distinct;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table GUI_FUNC_GROUP
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table GUI_FUNC_GROUP
     * @mbg.generated
     */
    public GuiFuncGroupExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table GUI_FUNC_GROUP
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {

        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table GUI_FUNC_GROUP
     * @mbg.generated
     */
    public String getOrderByClause() {

        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table GUI_FUNC_GROUP
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {

        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table GUI_FUNC_GROUP
     * @mbg.generated
     */
    public boolean isDistinct() {

        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table GUI_FUNC_GROUP
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {

        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table GUI_FUNC_GROUP
     * @mbg.generated
     */
    public void or(Criteria criteria) {

        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table GUI_FUNC_GROUP
     * @mbg.generated
     */
    public Criteria or() {

        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table GUI_FUNC_GROUP
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
     * This method was generated by MyBatis Generator. This method corresponds to the database table GUI_FUNC_GROUP
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {

        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table GUI_FUNC_GROUP
     * @mbg.generated
     */
    public void clear() {

        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table GUI_FUNC_GROUP
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
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table GUI_FUNC_GROUP
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
     * GUI_FUNC_GROUP
     *
     * @mbggenerated do_not_delete_during_merge Wed Sep 07 15:13:24 JST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}
