package net.muratec.mcs.model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class HostAlarmHistoryExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table HOST_ALARM_HISTORY
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table HOST_ALARM_HISTORY
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table HOST_ALARM_HISTORY
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HOST_ALARM_HISTORY
     *
     * @mbg.generated
     */
    public HostAlarmHistoryExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HOST_ALARM_HISTORY
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HOST_ALARM_HISTORY
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HOST_ALARM_HISTORY
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HOST_ALARM_HISTORY
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HOST_ALARM_HISTORY
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HOST_ALARM_HISTORY
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HOST_ALARM_HISTORY
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
     * This method corresponds to the database table HOST_ALARM_HISTORY
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
     * This method corresponds to the database table HOST_ALARM_HISTORY
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HOST_ALARM_HISTORY
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
     * This class corresponds to the database table HOST_ALARM_HISTORY
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

        public Criteria andSndTimeIsNull() {
            addCriterion("SND_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSndTimeIsNotNull() {
            addCriterion("SND_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSndTimeEqualTo(Timestamp value) {
            addCriterion("SND_TIME =", value, "sndTime");
            return (Criteria) this;
        }

        public Criteria andSndTimeNotEqualTo(Timestamp value) {
            addCriterion("SND_TIME <>", value, "sndTime");
            return (Criteria) this;
        }

        public Criteria andSndTimeGreaterThan(Timestamp value) {
            addCriterion("SND_TIME >", value, "sndTime");
            return (Criteria) this;
        }

        public Criteria andSndTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("SND_TIME >=", value, "sndTime");
            return (Criteria) this;
        }

        public Criteria andSndTimeLessThan(Timestamp value) {
            addCriterion("SND_TIME <", value, "sndTime");
            return (Criteria) this;
        }

        public Criteria andSndTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("SND_TIME <=", value, "sndTime");
            return (Criteria) this;
        }

        public Criteria andSndTimeIn(List<Timestamp> values) {
            addCriterion("SND_TIME in", values, "sndTime");
            return (Criteria) this;
        }

        public Criteria andSndTimeNotIn(List<Timestamp> values) {
            addCriterion("SND_TIME not in", values, "sndTime");
            return (Criteria) this;
        }

        public Criteria andSndTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("SND_TIME between", value1, value2, "sndTime");
            return (Criteria) this;
        }

        public Criteria andSndTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("SND_TIME not between", value1, value2, "sndTime");
            return (Criteria) this;
        }

        public Criteria andResultIsNull() {
            addCriterion("RESULT is null");
            return (Criteria) this;
        }

        public Criteria andResultIsNotNull() {
            addCriterion("RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andResultEqualTo(String value) {
            addCriterion("RESULT =", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotEqualTo(String value) {
            addCriterion("RESULT <>", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThan(String value) {
            addCriterion("RESULT >", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThanOrEqualTo(String value) {
            addCriterion("RESULT >=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThan(String value) {
            addCriterion("RESULT <", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThanOrEqualTo(String value) {
            addCriterion("RESULT <=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLike(String value) {
            addCriterion("RESULT like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotLike(String value) {
            addCriterion("RESULT not like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultIn(List<String> values) {
            addCriterion("RESULT in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotIn(List<String> values) {
            addCriterion("RESULT not in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultBetween(String value1, String value2) {
            addCriterion("RESULT between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotBetween(String value1, String value2) {
            addCriterion("RESULT not between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andHostAlarmIdIsNull() {
            addCriterion("HOST_ALARM_ID is null");
            return (Criteria) this;
        }

        public Criteria andHostAlarmIdIsNotNull() {
            addCriterion("HOST_ALARM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andHostAlarmIdEqualTo(String value) {
            addCriterion("HOST_ALARM_ID =", value, "hostAlarmId");
            return (Criteria) this;
        }

        public Criteria andHostAlarmIdNotEqualTo(String value) {
            addCriterion("HOST_ALARM_ID <>", value, "hostAlarmId");
            return (Criteria) this;
        }

        public Criteria andHostAlarmIdGreaterThan(String value) {
            addCriterion("HOST_ALARM_ID >", value, "hostAlarmId");
            return (Criteria) this;
        }

        public Criteria andHostAlarmIdGreaterThanOrEqualTo(String value) {
            addCriterion("HOST_ALARM_ID >=", value, "hostAlarmId");
            return (Criteria) this;
        }

        public Criteria andHostAlarmIdLessThan(String value) {
            addCriterion("HOST_ALARM_ID <", value, "hostAlarmId");
            return (Criteria) this;
        }

        public Criteria andHostAlarmIdLessThanOrEqualTo(String value) {
            addCriterion("HOST_ALARM_ID <=", value, "hostAlarmId");
            return (Criteria) this;
        }

        public Criteria andHostAlarmIdLike(String value) {
            addCriterion("HOST_ALARM_ID like", value, "hostAlarmId");
            return (Criteria) this;
        }

        public Criteria andHostAlarmIdNotLike(String value) {
            addCriterion("HOST_ALARM_ID not like", value, "hostAlarmId");
            return (Criteria) this;
        }

        public Criteria andHostAlarmIdIn(List<String> values) {
            addCriterion("HOST_ALARM_ID in", values, "hostAlarmId");
            return (Criteria) this;
        }

        public Criteria andHostAlarmIdNotIn(List<String> values) {
            addCriterion("HOST_ALARM_ID not in", values, "hostAlarmId");
            return (Criteria) this;
        }

        public Criteria andHostAlarmIdBetween(String value1, String value2) {
            addCriterion("HOST_ALARM_ID between", value1, value2, "hostAlarmId");
            return (Criteria) this;
        }

        public Criteria andHostAlarmIdNotBetween(String value1, String value2) {
            addCriterion("HOST_ALARM_ID not between", value1, value2, "hostAlarmId");
            return (Criteria) this;
        }

        public Criteria andEqpTypeIsNull() {
            addCriterion("EQP_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andEqpTypeIsNotNull() {
            addCriterion("EQP_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andEqpTypeEqualTo(String value) {
            addCriterion("EQP_TYPE =", value, "eqpType");
            return (Criteria) this;
        }

        public Criteria andEqpTypeNotEqualTo(String value) {
            addCriterion("EQP_TYPE <>", value, "eqpType");
            return (Criteria) this;
        }

        public Criteria andEqpTypeGreaterThan(String value) {
            addCriterion("EQP_TYPE >", value, "eqpType");
            return (Criteria) this;
        }

        public Criteria andEqpTypeGreaterThanOrEqualTo(String value) {
            addCriterion("EQP_TYPE >=", value, "eqpType");
            return (Criteria) this;
        }

        public Criteria andEqpTypeLessThan(String value) {
            addCriterion("EQP_TYPE <", value, "eqpType");
            return (Criteria) this;
        }

        public Criteria andEqpTypeLessThanOrEqualTo(String value) {
            addCriterion("EQP_TYPE <=", value, "eqpType");
            return (Criteria) this;
        }

        public Criteria andEqpTypeLike(String value) {
            addCriterion("EQP_TYPE like", value, "eqpType");
            return (Criteria) this;
        }

        public Criteria andEqpTypeNotLike(String value) {
            addCriterion("EQP_TYPE not like", value, "eqpType");
            return (Criteria) this;
        }

        public Criteria andEqpTypeIn(List<String> values) {
            addCriterion("EQP_TYPE in", values, "eqpType");
            return (Criteria) this;
        }

        public Criteria andEqpTypeNotIn(List<String> values) {
            addCriterion("EQP_TYPE not in", values, "eqpType");
            return (Criteria) this;
        }

        public Criteria andEqpTypeBetween(String value1, String value2) {
            addCriterion("EQP_TYPE between", value1, value2, "eqpType");
            return (Criteria) this;
        }

        public Criteria andEqpTypeNotBetween(String value1, String value2) {
            addCriterion("EQP_TYPE not between", value1, value2, "eqpType");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNull() {
            addCriterion("SUBJECT is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNotNull() {
            addCriterion("SUBJECT is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectEqualTo(String value) {
            addCriterion("SUBJECT =", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotEqualTo(String value) {
            addCriterion("SUBJECT <>", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThan(String value) {
            addCriterion("SUBJECT >", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("SUBJECT >=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThan(String value) {
            addCriterion("SUBJECT <", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThanOrEqualTo(String value) {
            addCriterion("SUBJECT <=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLike(String value) {
            addCriterion("SUBJECT like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotLike(String value) {
            addCriterion("SUBJECT not like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectIn(List<String> values) {
            addCriterion("SUBJECT in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotIn(List<String> values) {
            addCriterion("SUBJECT not in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectBetween(String value1, String value2) {
            addCriterion("SUBJECT between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotBetween(String value1, String value2) {
            addCriterion("SUBJECT not between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("CONTENT =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("CONTENT <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("CONTENT >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENT >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("CONTENT <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("CONTENT <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("CONTENT like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("CONTENT not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("CONTENT in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("CONTENT not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("CONTENT between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("CONTENT not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andRcvTimeIsNull() {
            addCriterion("RCV_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRcvTimeIsNotNull() {
            addCriterion("RCV_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRcvTimeEqualTo(Timestamp value) {
            addCriterion("RCV_TIME =", value, "rcvTime");
            return (Criteria) this;
        }

        public Criteria andRcvTimeNotEqualTo(Timestamp value) {
            addCriterion("RCV_TIME <>", value, "rcvTime");
            return (Criteria) this;
        }

        public Criteria andRcvTimeGreaterThan(Timestamp value) {
            addCriterion("RCV_TIME >", value, "rcvTime");
            return (Criteria) this;
        }

        public Criteria andRcvTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("RCV_TIME >=", value, "rcvTime");
            return (Criteria) this;
        }

        public Criteria andRcvTimeLessThan(Timestamp value) {
            addCriterion("RCV_TIME <", value, "rcvTime");
            return (Criteria) this;
        }

        public Criteria andRcvTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("RCV_TIME <=", value, "rcvTime");
            return (Criteria) this;
        }

        public Criteria andRcvTimeIn(List<Timestamp> values) {
            addCriterion("RCV_TIME in", values, "rcvTime");
            return (Criteria) this;
        }

        public Criteria andRcvTimeNotIn(List<Timestamp> values) {
            addCriterion("RCV_TIME not in", values, "rcvTime");
            return (Criteria) this;
        }

        public Criteria andRcvTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("RCV_TIME between", value1, value2, "rcvTime");
            return (Criteria) this;
        }

        public Criteria andRcvTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("RCV_TIME not between", value1, value2, "rcvTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table HOST_ALARM_HISTORY
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
     * This class corresponds to the database table HOST_ALARM_HISTORY
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