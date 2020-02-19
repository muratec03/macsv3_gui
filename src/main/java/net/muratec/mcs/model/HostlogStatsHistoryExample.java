package net.muratec.mcs.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class HostlogStatsHistoryExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table HOSTLOG_STATS_HISTORY
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table HOSTLOG_STATS_HISTORY
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table HOSTLOG_STATS_HISTORY
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HOSTLOG_STATS_HISTORY
     *
     * @mbg.generated
     */
    public HostlogStatsHistoryExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HOSTLOG_STATS_HISTORY
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HOSTLOG_STATS_HISTORY
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HOSTLOG_STATS_HISTORY
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HOSTLOG_STATS_HISTORY
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HOSTLOG_STATS_HISTORY
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HOSTLOG_STATS_HISTORY
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HOSTLOG_STATS_HISTORY
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
     * This method corresponds to the database table HOSTLOG_STATS_HISTORY
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
     * This method corresponds to the database table HOSTLOG_STATS_HISTORY
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HOSTLOG_STATS_HISTORY
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
     * This class corresponds to the database table HOSTLOG_STATS_HISTORY
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

        public Criteria andHostNameIsNull() {
            addCriterion("HOST_NAME is null");
            return (Criteria) this;
        }

        public Criteria andHostNameIsNotNull() {
            addCriterion("HOST_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andHostNameEqualTo(String value) {
            addCriterion("HOST_NAME =", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameNotEqualTo(String value) {
            addCriterion("HOST_NAME <>", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameGreaterThan(String value) {
            addCriterion("HOST_NAME >", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameGreaterThanOrEqualTo(String value) {
            addCriterion("HOST_NAME >=", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameLessThan(String value) {
            addCriterion("HOST_NAME <", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameLessThanOrEqualTo(String value) {
            addCriterion("HOST_NAME <=", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameLike(String value) {
            addCriterion("HOST_NAME like", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameNotLike(String value) {
            addCriterion("HOST_NAME not like", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameIn(List<String> values) {
            addCriterion("HOST_NAME in", values, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameNotIn(List<String> values) {
            addCriterion("HOST_NAME not in", values, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameBetween(String value1, String value2) {
            addCriterion("HOST_NAME between", value1, value2, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameNotBetween(String value1, String value2) {
            addCriterion("HOST_NAME not between", value1, value2, "hostName");
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

        public Criteria andTransactionIdIsNull() {
            addCriterion("TRANSACTION_ID is null");
            return (Criteria) this;
        }

        public Criteria andTransactionIdIsNotNull() {
            addCriterion("TRANSACTION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionIdEqualTo(String value) {
            addCriterion("TRANSACTION_ID =", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotEqualTo(String value) {
            addCriterion("TRANSACTION_ID <>", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdGreaterThan(String value) {
            addCriterion("TRANSACTION_ID >", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSACTION_ID >=", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLessThan(String value) {
            addCriterion("TRANSACTION_ID <", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLessThanOrEqualTo(String value) {
            addCriterion("TRANSACTION_ID <=", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLike(String value) {
            addCriterion("TRANSACTION_ID like", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotLike(String value) {
            addCriterion("TRANSACTION_ID not like", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdIn(List<String> values) {
            addCriterion("TRANSACTION_ID in", values, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotIn(List<String> values) {
            addCriterion("TRANSACTION_ID not in", values, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdBetween(String value1, String value2) {
            addCriterion("TRANSACTION_ID between", value1, value2, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotBetween(String value1, String value2) {
            addCriterion("TRANSACTION_ID not between", value1, value2, "transactionId");
            return (Criteria) this;
        }

        public Criteria andDirectionIsNull() {
            addCriterion("DIRECTION is null");
            return (Criteria) this;
        }

        public Criteria andDirectionIsNotNull() {
            addCriterion("DIRECTION is not null");
            return (Criteria) this;
        }

        public Criteria andDirectionEqualTo(Short value) {
            addCriterion("DIRECTION =", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotEqualTo(Short value) {
            addCriterion("DIRECTION <>", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionGreaterThan(Short value) {
            addCriterion("DIRECTION >", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionGreaterThanOrEqualTo(Short value) {
            addCriterion("DIRECTION >=", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLessThan(Short value) {
            addCriterion("DIRECTION <", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLessThanOrEqualTo(Short value) {
            addCriterion("DIRECTION <=", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionIn(List<Short> values) {
            addCriterion("DIRECTION in", values, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotIn(List<Short> values) {
            addCriterion("DIRECTION not in", values, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionBetween(Short value1, Short value2) {
            addCriterion("DIRECTION between", value1, value2, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotBetween(Short value1, Short value2) {
            addCriterion("DIRECTION not between", value1, value2, "direction");
            return (Criteria) this;
        }

        public Criteria andAveSecIsNull() {
            addCriterion("AVE_SEC is null");
            return (Criteria) this;
        }

        public Criteria andAveSecIsNotNull() {
            addCriterion("AVE_SEC is not null");
            return (Criteria) this;
        }

        public Criteria andAveSecEqualTo(BigDecimal value) {
            addCriterion("AVE_SEC =", value, "aveSec");
            return (Criteria) this;
        }

        public Criteria andAveSecNotEqualTo(BigDecimal value) {
            addCriterion("AVE_SEC <>", value, "aveSec");
            return (Criteria) this;
        }

        public Criteria andAveSecGreaterThan(BigDecimal value) {
            addCriterion("AVE_SEC >", value, "aveSec");
            return (Criteria) this;
        }

        public Criteria andAveSecGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AVE_SEC >=", value, "aveSec");
            return (Criteria) this;
        }

        public Criteria andAveSecLessThan(BigDecimal value) {
            addCriterion("AVE_SEC <", value, "aveSec");
            return (Criteria) this;
        }

        public Criteria andAveSecLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AVE_SEC <=", value, "aveSec");
            return (Criteria) this;
        }

        public Criteria andAveSecIn(List<BigDecimal> values) {
            addCriterion("AVE_SEC in", values, "aveSec");
            return (Criteria) this;
        }

        public Criteria andAveSecNotIn(List<BigDecimal> values) {
            addCriterion("AVE_SEC not in", values, "aveSec");
            return (Criteria) this;
        }

        public Criteria andAveSecBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AVE_SEC between", value1, value2, "aveSec");
            return (Criteria) this;
        }

        public Criteria andAveSecNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AVE_SEC not between", value1, value2, "aveSec");
            return (Criteria) this;
        }

        public Criteria andMaxSecIsNull() {
            addCriterion("MAX_SEC is null");
            return (Criteria) this;
        }

        public Criteria andMaxSecIsNotNull() {
            addCriterion("MAX_SEC is not null");
            return (Criteria) this;
        }

        public Criteria andMaxSecEqualTo(BigDecimal value) {
            addCriterion("MAX_SEC =", value, "maxSec");
            return (Criteria) this;
        }

        public Criteria andMaxSecNotEqualTo(BigDecimal value) {
            addCriterion("MAX_SEC <>", value, "maxSec");
            return (Criteria) this;
        }

        public Criteria andMaxSecGreaterThan(BigDecimal value) {
            addCriterion("MAX_SEC >", value, "maxSec");
            return (Criteria) this;
        }

        public Criteria andMaxSecGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MAX_SEC >=", value, "maxSec");
            return (Criteria) this;
        }

        public Criteria andMaxSecLessThan(BigDecimal value) {
            addCriterion("MAX_SEC <", value, "maxSec");
            return (Criteria) this;
        }

        public Criteria andMaxSecLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MAX_SEC <=", value, "maxSec");
            return (Criteria) this;
        }

        public Criteria andMaxSecIn(List<BigDecimal> values) {
            addCriterion("MAX_SEC in", values, "maxSec");
            return (Criteria) this;
        }

        public Criteria andMaxSecNotIn(List<BigDecimal> values) {
            addCriterion("MAX_SEC not in", values, "maxSec");
            return (Criteria) this;
        }

        public Criteria andMaxSecBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAX_SEC between", value1, value2, "maxSec");
            return (Criteria) this;
        }

        public Criteria andMaxSecNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAX_SEC not between", value1, value2, "maxSec");
            return (Criteria) this;
        }

        public Criteria andMinSecIsNull() {
            addCriterion("MIN_SEC is null");
            return (Criteria) this;
        }

        public Criteria andMinSecIsNotNull() {
            addCriterion("MIN_SEC is not null");
            return (Criteria) this;
        }

        public Criteria andMinSecEqualTo(BigDecimal value) {
            addCriterion("MIN_SEC =", value, "minSec");
            return (Criteria) this;
        }

        public Criteria andMinSecNotEqualTo(BigDecimal value) {
            addCriterion("MIN_SEC <>", value, "minSec");
            return (Criteria) this;
        }

        public Criteria andMinSecGreaterThan(BigDecimal value) {
            addCriterion("MIN_SEC >", value, "minSec");
            return (Criteria) this;
        }

        public Criteria andMinSecGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MIN_SEC >=", value, "minSec");
            return (Criteria) this;
        }

        public Criteria andMinSecLessThan(BigDecimal value) {
            addCriterion("MIN_SEC <", value, "minSec");
            return (Criteria) this;
        }

        public Criteria andMinSecLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MIN_SEC <=", value, "minSec");
            return (Criteria) this;
        }

        public Criteria andMinSecIn(List<BigDecimal> values) {
            addCriterion("MIN_SEC in", values, "minSec");
            return (Criteria) this;
        }

        public Criteria andMinSecNotIn(List<BigDecimal> values) {
            addCriterion("MIN_SEC not in", values, "minSec");
            return (Criteria) this;
        }

        public Criteria andMinSecBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MIN_SEC between", value1, value2, "minSec");
            return (Criteria) this;
        }

        public Criteria andMinSecNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MIN_SEC not between", value1, value2, "minSec");
            return (Criteria) this;
        }

        public Criteria andTotalNumIsNull() {
            addCriterion("TOTAL_NUM is null");
            return (Criteria) this;
        }

        public Criteria andTotalNumIsNotNull() {
            addCriterion("TOTAL_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andTotalNumEqualTo(BigDecimal value) {
            addCriterion("TOTAL_NUM =", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotEqualTo(BigDecimal value) {
            addCriterion("TOTAL_NUM <>", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumGreaterThan(BigDecimal value) {
            addCriterion("TOTAL_NUM >", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_NUM >=", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumLessThan(BigDecimal value) {
            addCriterion("TOTAL_NUM <", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_NUM <=", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumIn(List<BigDecimal> values) {
            addCriterion("TOTAL_NUM in", values, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotIn(List<BigDecimal> values) {
            addCriterion("TOTAL_NUM not in", values, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_NUM between", value1, value2, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_NUM not between", value1, value2, "totalNum");
            return (Criteria) this;
        }

        public Criteria andDeviationNumIsNull() {
            addCriterion("DEVIATION_NUM is null");
            return (Criteria) this;
        }

        public Criteria andDeviationNumIsNotNull() {
            addCriterion("DEVIATION_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andDeviationNumEqualTo(BigDecimal value) {
            addCriterion("DEVIATION_NUM =", value, "deviationNum");
            return (Criteria) this;
        }

        public Criteria andDeviationNumNotEqualTo(BigDecimal value) {
            addCriterion("DEVIATION_NUM <>", value, "deviationNum");
            return (Criteria) this;
        }

        public Criteria andDeviationNumGreaterThan(BigDecimal value) {
            addCriterion("DEVIATION_NUM >", value, "deviationNum");
            return (Criteria) this;
        }

        public Criteria andDeviationNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DEVIATION_NUM >=", value, "deviationNum");
            return (Criteria) this;
        }

        public Criteria andDeviationNumLessThan(BigDecimal value) {
            addCriterion("DEVIATION_NUM <", value, "deviationNum");
            return (Criteria) this;
        }

        public Criteria andDeviationNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DEVIATION_NUM <=", value, "deviationNum");
            return (Criteria) this;
        }

        public Criteria andDeviationNumIn(List<BigDecimal> values) {
            addCriterion("DEVIATION_NUM in", values, "deviationNum");
            return (Criteria) this;
        }

        public Criteria andDeviationNumNotIn(List<BigDecimal> values) {
            addCriterion("DEVIATION_NUM not in", values, "deviationNum");
            return (Criteria) this;
        }

        public Criteria andDeviationNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEVIATION_NUM between", value1, value2, "deviationNum");
            return (Criteria) this;
        }

        public Criteria andDeviationNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEVIATION_NUM not between", value1, value2, "deviationNum");
            return (Criteria) this;
        }

        public Criteria andErrorNumIsNull() {
            addCriterion("ERROR_NUM is null");
            return (Criteria) this;
        }

        public Criteria andErrorNumIsNotNull() {
            addCriterion("ERROR_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andErrorNumEqualTo(BigDecimal value) {
            addCriterion("ERROR_NUM =", value, "errorNum");
            return (Criteria) this;
        }

        public Criteria andErrorNumNotEqualTo(BigDecimal value) {
            addCriterion("ERROR_NUM <>", value, "errorNum");
            return (Criteria) this;
        }

        public Criteria andErrorNumGreaterThan(BigDecimal value) {
            addCriterion("ERROR_NUM >", value, "errorNum");
            return (Criteria) this;
        }

        public Criteria andErrorNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ERROR_NUM >=", value, "errorNum");
            return (Criteria) this;
        }

        public Criteria andErrorNumLessThan(BigDecimal value) {
            addCriterion("ERROR_NUM <", value, "errorNum");
            return (Criteria) this;
        }

        public Criteria andErrorNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ERROR_NUM <=", value, "errorNum");
            return (Criteria) this;
        }

        public Criteria andErrorNumIn(List<BigDecimal> values) {
            addCriterion("ERROR_NUM in", values, "errorNum");
            return (Criteria) this;
        }

        public Criteria andErrorNumNotIn(List<BigDecimal> values) {
            addCriterion("ERROR_NUM not in", values, "errorNum");
            return (Criteria) this;
        }

        public Criteria andErrorNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ERROR_NUM between", value1, value2, "errorNum");
            return (Criteria) this;
        }

        public Criteria andErrorNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ERROR_NUM not between", value1, value2, "errorNum");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table HOSTLOG_STATS_HISTORY
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
     * This class corresponds to the database table HOSTLOG_STATS_HISTORY
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