package net.muratec.mcs.model;

import java.util.ArrayList;
import java.util.List;

public class PortConnExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table PORT_CONN
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table PORT_CONN
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table PORT_CONN
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PORT_CONN
     *
     * @mbg.generated
     */
    public PortConnExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PORT_CONN
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PORT_CONN
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PORT_CONN
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PORT_CONN
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PORT_CONN
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PORT_CONN
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PORT_CONN
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
     * This method corresponds to the database table PORT_CONN
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
     * This method corresponds to the database table PORT_CONN
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PORT_CONN
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
     * This class corresponds to the database table PORT_CONN
     *
     * @mbg.generated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andConnFromTscIdIsNull() {
            addCriterion("CONN_FROM_TSC_ID is null");
            return (Criteria) this;
        }

        public Criteria andConnFromTscIdIsNotNull() {
            addCriterion("CONN_FROM_TSC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andConnFromTscIdEqualTo(Integer value) {
            addCriterion("CONN_FROM_TSC_ID =", value, "connFromTscId");
            return (Criteria) this;
        }

        public Criteria andConnFromTscIdNotEqualTo(Integer value) {
            addCriterion("CONN_FROM_TSC_ID <>", value, "connFromTscId");
            return (Criteria) this;
        }

        public Criteria andConnFromTscIdGreaterThan(Integer value) {
            addCriterion("CONN_FROM_TSC_ID >", value, "connFromTscId");
            return (Criteria) this;
        }

        public Criteria andConnFromTscIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CONN_FROM_TSC_ID >=", value, "connFromTscId");
            return (Criteria) this;
        }

        public Criteria andConnFromTscIdLessThan(Integer value) {
            addCriterion("CONN_FROM_TSC_ID <", value, "connFromTscId");
            return (Criteria) this;
        }

        public Criteria andConnFromTscIdLessThanOrEqualTo(Integer value) {
            addCriterion("CONN_FROM_TSC_ID <=", value, "connFromTscId");
            return (Criteria) this;
        }

        public Criteria andConnFromTscIdIn(List<Integer> values) {
            addCriterion("CONN_FROM_TSC_ID in", values, "connFromTscId");
            return (Criteria) this;
        }

        public Criteria andConnFromTscIdNotIn(List<Integer> values) {
            addCriterion("CONN_FROM_TSC_ID not in", values, "connFromTscId");
            return (Criteria) this;
        }

        public Criteria andConnFromTscIdBetween(Integer value1, Integer value2) {
            addCriterion("CONN_FROM_TSC_ID between", value1, value2, "connFromTscId");
            return (Criteria) this;
        }

        public Criteria andConnFromTscIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CONN_FROM_TSC_ID not between", value1, value2, "connFromTscId");
            return (Criteria) this;
        }

        public Criteria andConnToTscIdIsNull() {
            addCriterion("CONN_TO_TSC_ID is null");
            return (Criteria) this;
        }

        public Criteria andConnToTscIdIsNotNull() {
            addCriterion("CONN_TO_TSC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andConnToTscIdEqualTo(Integer value) {
            addCriterion("CONN_TO_TSC_ID =", value, "connToTscId");
            return (Criteria) this;
        }

        public Criteria andConnToTscIdNotEqualTo(Integer value) {
            addCriterion("CONN_TO_TSC_ID <>", value, "connToTscId");
            return (Criteria) this;
        }

        public Criteria andConnToTscIdGreaterThan(Integer value) {
            addCriterion("CONN_TO_TSC_ID >", value, "connToTscId");
            return (Criteria) this;
        }

        public Criteria andConnToTscIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CONN_TO_TSC_ID >=", value, "connToTscId");
            return (Criteria) this;
        }

        public Criteria andConnToTscIdLessThan(Integer value) {
            addCriterion("CONN_TO_TSC_ID <", value, "connToTscId");
            return (Criteria) this;
        }

        public Criteria andConnToTscIdLessThanOrEqualTo(Integer value) {
            addCriterion("CONN_TO_TSC_ID <=", value, "connToTscId");
            return (Criteria) this;
        }

        public Criteria andConnToTscIdIn(List<Integer> values) {
            addCriterion("CONN_TO_TSC_ID in", values, "connToTscId");
            return (Criteria) this;
        }

        public Criteria andConnToTscIdNotIn(List<Integer> values) {
            addCriterion("CONN_TO_TSC_ID not in", values, "connToTscId");
            return (Criteria) this;
        }

        public Criteria andConnToTscIdBetween(Integer value1, Integer value2) {
            addCriterion("CONN_TO_TSC_ID between", value1, value2, "connToTscId");
            return (Criteria) this;
        }

        public Criteria andConnToTscIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CONN_TO_TSC_ID not between", value1, value2, "connToTscId");
            return (Criteria) this;
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
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table PORT_CONN
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
     * This class corresponds to the database table PORT_CONN
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