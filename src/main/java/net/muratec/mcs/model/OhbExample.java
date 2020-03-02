package net.muratec.mcs.model;

import java.util.ArrayList;
import java.util.List;

public class OhbExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OhbExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andTscIdIsNull() {
            addCriterion("TSC_ID is null");
            return (Criteria) this;
        }

        public Criteria andTscIdIsNotNull() {
            addCriterion("TSC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTscIdEqualTo(String value) {
            addCriterion("TSC_ID =", value, "tscId");
            return (Criteria) this;
        }

        public Criteria andTscIdNotEqualTo(String value) {
            addCriterion("TSC_ID <>", value, "tscId");
            return (Criteria) this;
        }

        public Criteria andTscIdGreaterThan(String value) {
            addCriterion("TSC_ID >", value, "tscId");
            return (Criteria) this;
        }

        public Criteria andTscIdGreaterThanOrEqualTo(String value) {
            addCriterion("TSC_ID >=", value, "tscId");
            return (Criteria) this;
        }

        public Criteria andTscIdLessThan(String value) {
            addCriterion("TSC_ID <", value, "tscId");
            return (Criteria) this;
        }

        public Criteria andTscIdLessThanOrEqualTo(String value) {
            addCriterion("TSC_ID <=", value, "tscId");
            return (Criteria) this;
        }

        public Criteria andTscIdLike(String value) {
            addCriterion("TSC_ID like", value, "tscId");
            return (Criteria) this;
        }

        public Criteria andTscIdNotLike(String value) {
            addCriterion("TSC_ID not like", value, "tscId");
            return (Criteria) this;
        }

        public Criteria andTscIdIn(List<String> values) {
            addCriterion("TSC_ID in", values, "tscId");
            return (Criteria) this;
        }

        public Criteria andTscIdNotIn(List<String> values) {
            addCriterion("TSC_ID not in", values, "tscId");
            return (Criteria) this;
        }

        public Criteria andTscIdBetween(String value1, String value2) {
            addCriterion("TSC_ID between", value1, value2, "tscId");
            return (Criteria) this;
        }

        public Criteria andTscIdNotBetween(String value1, String value2) {
            addCriterion("TSC_ID not between", value1, value2, "tscId");
            return (Criteria) this;
        }

        public Criteria andOhbNameIsNull() {
            addCriterion("OHB_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOhbNameIsNotNull() {
            addCriterion("OHB_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOhbNameEqualTo(String value) {
            addCriterion("OHB_NAME =", value, "ohbName");
            return (Criteria) this;
        }

        public Criteria andOhbNameNotEqualTo(String value) {
            addCriterion("OHB_NAME <>", value, "ohbName");
            return (Criteria) this;
        }

        public Criteria andOhbNameGreaterThan(String value) {
            addCriterion("OHB_NAME >", value, "ohbName");
            return (Criteria) this;
        }

        public Criteria andOhbNameGreaterThanOrEqualTo(String value) {
            addCriterion("OHB_NAME >=", value, "ohbName");
            return (Criteria) this;
        }

        public Criteria andOhbNameLessThan(String value) {
            addCriterion("OHB_NAME <", value, "ohbName");
            return (Criteria) this;
        }

        public Criteria andOhbNameLessThanOrEqualTo(String value) {
            addCriterion("OHB_NAME <=", value, "ohbName");
            return (Criteria) this;
        }

        public Criteria andOhbNameLike(String value) {
            addCriterion("OHB_NAME like", value, "ohbName");
            return (Criteria) this;
        }

        public Criteria andOhbNameNotLike(String value) {
            addCriterion("OHB_NAME not like", value, "ohbName");
            return (Criteria) this;
        }

        public Criteria andOhbNameIn(List<String> values) {
            addCriterion("OHB_NAME in", values, "ohbName");
            return (Criteria) this;
        }

        public Criteria andOhbNameNotIn(List<String> values) {
            addCriterion("OHB_NAME not in", values, "ohbName");
            return (Criteria) this;
        }

        public Criteria andOhbNameBetween(String value1, String value2) {
            addCriterion("OHB_NAME between", value1, value2, "ohbName");
            return (Criteria) this;
        }

        public Criteria andOhbNameNotBetween(String value1, String value2) {
            addCriterion("OHB_NAME not between", value1, value2, "ohbName");
            return (Criteria) this;
        }

        public Criteria andE10StateIsNull() {
            addCriterion("E10_STATE is null");
            return (Criteria) this;
        }

        public Criteria andE10StateIsNotNull() {
            addCriterion("E10_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andE10StateEqualTo(String value) {
            addCriterion("E10_STATE =", value, "e10State");
            return (Criteria) this;
        }

        public Criteria andE10StateNotEqualTo(String value) {
            addCriterion("E10_STATE <>", value, "e10State");
            return (Criteria) this;
        }

        public Criteria andE10StateGreaterThan(String value) {
            addCriterion("E10_STATE >", value, "e10State");
            return (Criteria) this;
        }

        public Criteria andE10StateGreaterThanOrEqualTo(String value) {
            addCriterion("E10_STATE >=", value, "e10State");
            return (Criteria) this;
        }

        public Criteria andE10StateLessThan(String value) {
            addCriterion("E10_STATE <", value, "e10State");
            return (Criteria) this;
        }

        public Criteria andE10StateLessThanOrEqualTo(String value) {
            addCriterion("E10_STATE <=", value, "e10State");
            return (Criteria) this;
        }

        public Criteria andE10StateLike(String value) {
            addCriterion("E10_STATE like", value, "e10State");
            return (Criteria) this;
        }

        public Criteria andE10StateNotLike(String value) {
            addCriterion("E10_STATE not like", value, "e10State");
            return (Criteria) this;
        }

        public Criteria andE10StateIn(List<String> values) {
            addCriterion("E10_STATE in", values, "e10State");
            return (Criteria) this;
        }

        public Criteria andE10StateNotIn(List<String> values) {
            addCriterion("E10_STATE not in", values, "e10State");
            return (Criteria) this;
        }

        public Criteria andE10StateBetween(String value1, String value2) {
            addCriterion("E10_STATE between", value1, value2, "e10State");
            return (Criteria) this;
        }

        public Criteria andE10StateNotBetween(String value1, String value2) {
            addCriterion("E10_STATE not between", value1, value2, "e10State");
            return (Criteria) this;
        }

        public Criteria andE10StateSetTimeIsNull() {
            addCriterion("E10_STATE_SET_TIME is null");
            return (Criteria) this;
        }

        public Criteria andE10StateSetTimeIsNotNull() {
            addCriterion("E10_STATE_SET_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andE10StateSetTimeEqualTo(String value) {
            addCriterion("E10_STATE_SET_TIME =", value, "e10StateSetTime");
            return (Criteria) this;
        }

        public Criteria andE10StateSetTimeNotEqualTo(String value) {
            addCriterion("E10_STATE_SET_TIME <>", value, "e10StateSetTime");
            return (Criteria) this;
        }

        public Criteria andE10StateSetTimeGreaterThan(String value) {
            addCriterion("E10_STATE_SET_TIME >", value, "e10StateSetTime");
            return (Criteria) this;
        }

        public Criteria andE10StateSetTimeGreaterThanOrEqualTo(String value) {
            addCriterion("E10_STATE_SET_TIME >=", value, "e10StateSetTime");
            return (Criteria) this;
        }

        public Criteria andE10StateSetTimeLessThan(String value) {
            addCriterion("E10_STATE_SET_TIME <", value, "e10StateSetTime");
            return (Criteria) this;
        }

        public Criteria andE10StateSetTimeLessThanOrEqualTo(String value) {
            addCriterion("E10_STATE_SET_TIME <=", value, "e10StateSetTime");
            return (Criteria) this;
        }

        public Criteria andE10StateSetTimeLike(String value) {
            addCriterion("E10_STATE_SET_TIME like", value, "e10StateSetTime");
            return (Criteria) this;
        }

        public Criteria andE10StateSetTimeNotLike(String value) {
            addCriterion("E10_STATE_SET_TIME not like", value, "e10StateSetTime");
            return (Criteria) this;
        }

        public Criteria andE10StateSetTimeIn(List<String> values) {
            addCriterion("E10_STATE_SET_TIME in", values, "e10StateSetTime");
            return (Criteria) this;
        }

        public Criteria andE10StateSetTimeNotIn(List<String> values) {
            addCriterion("E10_STATE_SET_TIME not in", values, "e10StateSetTime");
            return (Criteria) this;
        }

        public Criteria andE10StateSetTimeBetween(String value1, String value2) {
            addCriterion("E10_STATE_SET_TIME between", value1, value2, "e10StateSetTime");
            return (Criteria) this;
        }

        public Criteria andE10StateSetTimeNotBetween(String value1, String value2) {
            addCriterion("E10_STATE_SET_TIME not between", value1, value2, "e10StateSetTime");
            return (Criteria) this;
        }

        public Criteria andE10StateSetOriginatorIsNull() {
            addCriterion("E10_STATE_SET_ORIGINATOR is null");
            return (Criteria) this;
        }

        public Criteria andE10StateSetOriginatorIsNotNull() {
            addCriterion("E10_STATE_SET_ORIGINATOR is not null");
            return (Criteria) this;
        }

        public Criteria andE10StateSetOriginatorEqualTo(String value) {
            addCriterion("E10_STATE_SET_ORIGINATOR =", value, "e10StateSetOriginator");
            return (Criteria) this;
        }

        public Criteria andE10StateSetOriginatorNotEqualTo(String value) {
            addCriterion("E10_STATE_SET_ORIGINATOR <>", value, "e10StateSetOriginator");
            return (Criteria) this;
        }

        public Criteria andE10StateSetOriginatorGreaterThan(String value) {
            addCriterion("E10_STATE_SET_ORIGINATOR >", value, "e10StateSetOriginator");
            return (Criteria) this;
        }

        public Criteria andE10StateSetOriginatorGreaterThanOrEqualTo(String value) {
            addCriterion("E10_STATE_SET_ORIGINATOR >=", value, "e10StateSetOriginator");
            return (Criteria) this;
        }

        public Criteria andE10StateSetOriginatorLessThan(String value) {
            addCriterion("E10_STATE_SET_ORIGINATOR <", value, "e10StateSetOriginator");
            return (Criteria) this;
        }

        public Criteria andE10StateSetOriginatorLessThanOrEqualTo(String value) {
            addCriterion("E10_STATE_SET_ORIGINATOR <=", value, "e10StateSetOriginator");
            return (Criteria) this;
        }

        public Criteria andE10StateSetOriginatorLike(String value) {
            addCriterion("E10_STATE_SET_ORIGINATOR like", value, "e10StateSetOriginator");
            return (Criteria) this;
        }

        public Criteria andE10StateSetOriginatorNotLike(String value) {
            addCriterion("E10_STATE_SET_ORIGINATOR not like", value, "e10StateSetOriginator");
            return (Criteria) this;
        }

        public Criteria andE10StateSetOriginatorIn(List<String> values) {
            addCriterion("E10_STATE_SET_ORIGINATOR in", values, "e10StateSetOriginator");
            return (Criteria) this;
        }

        public Criteria andE10StateSetOriginatorNotIn(List<String> values) {
            addCriterion("E10_STATE_SET_ORIGINATOR not in", values, "e10StateSetOriginator");
            return (Criteria) this;
        }

        public Criteria andE10StateSetOriginatorBetween(String value1, String value2) {
            addCriterion("E10_STATE_SET_ORIGINATOR between", value1, value2, "e10StateSetOriginator");
            return (Criteria) this;
        }

        public Criteria andE10StateSetOriginatorNotBetween(String value1, String value2) {
            addCriterion("E10_STATE_SET_ORIGINATOR not between", value1, value2, "e10StateSetOriginator");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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