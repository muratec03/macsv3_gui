package net.muratec.mcs.model;

import java.util.ArrayList;
import java.util.List;

public class EjectDeviceExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table EJECT_DEVICE
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table EJECT_DEVICE
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table EJECT_DEVICE
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EJECT_DEVICE
     *
     * @mbg.generated
     */
    public EjectDeviceExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EJECT_DEVICE
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EJECT_DEVICE
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EJECT_DEVICE
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EJECT_DEVICE
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EJECT_DEVICE
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EJECT_DEVICE
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EJECT_DEVICE
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
     * This method corresponds to the database table EJECT_DEVICE
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
     * This method corresponds to the database table EJECT_DEVICE
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EJECT_DEVICE
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
     * This class corresponds to the database table EJECT_DEVICE
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

        public Criteria andKeyIsNull() {
            addCriterion("KEY is null");
            return (Criteria) this;
        }

        public Criteria andKeyIsNotNull() {
            addCriterion("KEY is not null");
            return (Criteria) this;
        }

        public Criteria andKeyEqualTo(String value) {
            addCriterion("KEY =", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotEqualTo(String value) {
            addCriterion("KEY <>", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyGreaterThan(String value) {
            addCriterion("KEY >", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyGreaterThanOrEqualTo(String value) {
            addCriterion("KEY >=", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyLessThan(String value) {
            addCriterion("KEY <", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyLessThanOrEqualTo(String value) {
            addCriterion("KEY <=", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyLike(String value) {
            addCriterion("KEY like", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotLike(String value) {
            addCriterion("KEY not like", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyIn(List<String> values) {
            addCriterion("KEY in", values, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotIn(List<String> values) {
            addCriterion("KEY not in", values, "key");
            return (Criteria) this;
        }

        public Criteria andKeyBetween(String value1, String value2) {
            addCriterion("KEY between", value1, value2, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotBetween(String value1, String value2) {
            addCriterion("KEY not between", value1, value2, "key");
            return (Criteria) this;
        }

        public Criteria andEjectPriorityIsNull() {
            addCriterion("EJECT_PRIORITY is null");
            return (Criteria) this;
        }

        public Criteria andEjectPriorityIsNotNull() {
            addCriterion("EJECT_PRIORITY is not null");
            return (Criteria) this;
        }

        public Criteria andEjectPriorityEqualTo(Short value) {
            addCriterion("EJECT_PRIORITY =", value, "ejectPriority");
            return (Criteria) this;
        }

        public Criteria andEjectPriorityNotEqualTo(Short value) {
            addCriterion("EJECT_PRIORITY <>", value, "ejectPriority");
            return (Criteria) this;
        }

        public Criteria andEjectPriorityGreaterThan(Short value) {
            addCriterion("EJECT_PRIORITY >", value, "ejectPriority");
            return (Criteria) this;
        }

        public Criteria andEjectPriorityGreaterThanOrEqualTo(Short value) {
            addCriterion("EJECT_PRIORITY >=", value, "ejectPriority");
            return (Criteria) this;
        }

        public Criteria andEjectPriorityLessThan(Short value) {
            addCriterion("EJECT_PRIORITY <", value, "ejectPriority");
            return (Criteria) this;
        }

        public Criteria andEjectPriorityLessThanOrEqualTo(Short value) {
            addCriterion("EJECT_PRIORITY <=", value, "ejectPriority");
            return (Criteria) this;
        }

        public Criteria andEjectPriorityIn(List<Short> values) {
            addCriterion("EJECT_PRIORITY in", values, "ejectPriority");
            return (Criteria) this;
        }

        public Criteria andEjectPriorityNotIn(List<Short> values) {
            addCriterion("EJECT_PRIORITY not in", values, "ejectPriority");
            return (Criteria) this;
        }

        public Criteria andEjectPriorityBetween(Short value1, Short value2) {
            addCriterion("EJECT_PRIORITY between", value1, value2, "ejectPriority");
            return (Criteria) this;
        }

        public Criteria andEjectPriorityNotBetween(Short value1, Short value2) {
            addCriterion("EJECT_PRIORITY not between", value1, value2, "ejectPriority");
            return (Criteria) this;
        }

        public Criteria andEjectDeviceIsNull() {
            addCriterion("EJECT_DEVICE is null");
            return (Criteria) this;
        }

        public Criteria andEjectDeviceIsNotNull() {
            addCriterion("EJECT_DEVICE is not null");
            return (Criteria) this;
        }

        public Criteria andEjectDeviceEqualTo(String value) {
            addCriterion("EJECT_DEVICE =", value, "ejectDevice");
            return (Criteria) this;
        }

        public Criteria andEjectDeviceNotEqualTo(String value) {
            addCriterion("EJECT_DEVICE <>", value, "ejectDevice");
            return (Criteria) this;
        }

        public Criteria andEjectDeviceGreaterThan(String value) {
            addCriterion("EJECT_DEVICE >", value, "ejectDevice");
            return (Criteria) this;
        }

        public Criteria andEjectDeviceGreaterThanOrEqualTo(String value) {
            addCriterion("EJECT_DEVICE >=", value, "ejectDevice");
            return (Criteria) this;
        }

        public Criteria andEjectDeviceLessThan(String value) {
            addCriterion("EJECT_DEVICE <", value, "ejectDevice");
            return (Criteria) this;
        }

        public Criteria andEjectDeviceLessThanOrEqualTo(String value) {
            addCriterion("EJECT_DEVICE <=", value, "ejectDevice");
            return (Criteria) this;
        }

        public Criteria andEjectDeviceLike(String value) {
            addCriterion("EJECT_DEVICE like", value, "ejectDevice");
            return (Criteria) this;
        }

        public Criteria andEjectDeviceNotLike(String value) {
            addCriterion("EJECT_DEVICE not like", value, "ejectDevice");
            return (Criteria) this;
        }

        public Criteria andEjectDeviceIn(List<String> values) {
            addCriterion("EJECT_DEVICE in", values, "ejectDevice");
            return (Criteria) this;
        }

        public Criteria andEjectDeviceNotIn(List<String> values) {
            addCriterion("EJECT_DEVICE not in", values, "ejectDevice");
            return (Criteria) this;
        }

        public Criteria andEjectDeviceBetween(String value1, String value2) {
            addCriterion("EJECT_DEVICE between", value1, value2, "ejectDevice");
            return (Criteria) this;
        }

        public Criteria andEjectDeviceNotBetween(String value1, String value2) {
            addCriterion("EJECT_DEVICE not between", value1, value2, "ejectDevice");
            return (Criteria) this;
        }

        public Criteria andEnableFlagIsNull() {
            addCriterion("ENABLE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andEnableFlagIsNotNull() {
            addCriterion("ENABLE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andEnableFlagEqualTo(Short value) {
            addCriterion("ENABLE_FLAG =", value, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andEnableFlagNotEqualTo(Short value) {
            addCriterion("ENABLE_FLAG <>", value, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andEnableFlagGreaterThan(Short value) {
            addCriterion("ENABLE_FLAG >", value, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andEnableFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("ENABLE_FLAG >=", value, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andEnableFlagLessThan(Short value) {
            addCriterion("ENABLE_FLAG <", value, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andEnableFlagLessThanOrEqualTo(Short value) {
            addCriterion("ENABLE_FLAG <=", value, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andEnableFlagIn(List<Short> values) {
            addCriterion("ENABLE_FLAG in", values, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andEnableFlagNotIn(List<Short> values) {
            addCriterion("ENABLE_FLAG not in", values, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andEnableFlagBetween(Short value1, Short value2) {
            addCriterion("ENABLE_FLAG between", value1, value2, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andEnableFlagNotBetween(Short value1, Short value2) {
            addCriterion("ENABLE_FLAG not between", value1, value2, "enableFlag");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table EJECT_DEVICE
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table EJECT_DEVICE
     *
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
}