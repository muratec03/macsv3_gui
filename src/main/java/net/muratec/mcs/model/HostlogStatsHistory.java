package net.muratec.mcs.model;

import java.math.BigDecimal;

public class HostlogStatsHistory extends HostlogStatsHistoryKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column HOSTLOG_STATS_HISTORY.AVE_SEC
     *
     * @mbg.generated
     */
    private BigDecimal aveSec;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column HOSTLOG_STATS_HISTORY.MAX_SEC
     *
     * @mbg.generated
     */
    private BigDecimal maxSec;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column HOSTLOG_STATS_HISTORY.MIN_SEC
     *
     * @mbg.generated
     */
    private BigDecimal minSec;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column HOSTLOG_STATS_HISTORY.TOTAL_NUM
     *
     * @mbg.generated
     */
    private BigDecimal totalNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column HOSTLOG_STATS_HISTORY.DEVIATION_NUM
     *
     * @mbg.generated
     */
    private BigDecimal deviationNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column HOSTLOG_STATS_HISTORY.ERROR_NUM
     *
     * @mbg.generated
     */
    private BigDecimal errorNum;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column HOSTLOG_STATS_HISTORY.AVE_SEC
     *
     * @return the value of HOSTLOG_STATS_HISTORY.AVE_SEC
     *
     * @mbg.generated
     */
    public BigDecimal getAveSec() {
        return aveSec;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column HOSTLOG_STATS_HISTORY.AVE_SEC
     *
     * @param aveSec the value for HOSTLOG_STATS_HISTORY.AVE_SEC
     *
     * @mbg.generated
     */
    public void setAveSec(BigDecimal aveSec) {
        this.aveSec = aveSec;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column HOSTLOG_STATS_HISTORY.MAX_SEC
     *
     * @return the value of HOSTLOG_STATS_HISTORY.MAX_SEC
     *
     * @mbg.generated
     */
    public BigDecimal getMaxSec() {
        return maxSec;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column HOSTLOG_STATS_HISTORY.MAX_SEC
     *
     * @param maxSec the value for HOSTLOG_STATS_HISTORY.MAX_SEC
     *
     * @mbg.generated
     */
    public void setMaxSec(BigDecimal maxSec) {
        this.maxSec = maxSec;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column HOSTLOG_STATS_HISTORY.MIN_SEC
     *
     * @return the value of HOSTLOG_STATS_HISTORY.MIN_SEC
     *
     * @mbg.generated
     */
    public BigDecimal getMinSec() {
        return minSec;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column HOSTLOG_STATS_HISTORY.MIN_SEC
     *
     * @param minSec the value for HOSTLOG_STATS_HISTORY.MIN_SEC
     *
     * @mbg.generated
     */
    public void setMinSec(BigDecimal minSec) {
        this.minSec = minSec;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column HOSTLOG_STATS_HISTORY.TOTAL_NUM
     *
     * @return the value of HOSTLOG_STATS_HISTORY.TOTAL_NUM
     *
     * @mbg.generated
     */
    public BigDecimal getTotalNum() {
        return totalNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column HOSTLOG_STATS_HISTORY.TOTAL_NUM
     *
     * @param totalNum the value for HOSTLOG_STATS_HISTORY.TOTAL_NUM
     *
     * @mbg.generated
     */
    public void setTotalNum(BigDecimal totalNum) {
        this.totalNum = totalNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column HOSTLOG_STATS_HISTORY.DEVIATION_NUM
     *
     * @return the value of HOSTLOG_STATS_HISTORY.DEVIATION_NUM
     *
     * @mbg.generated
     */
    public BigDecimal getDeviationNum() {
        return deviationNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column HOSTLOG_STATS_HISTORY.DEVIATION_NUM
     *
     * @param deviationNum the value for HOSTLOG_STATS_HISTORY.DEVIATION_NUM
     *
     * @mbg.generated
     */
    public void setDeviationNum(BigDecimal deviationNum) {
        this.deviationNum = deviationNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column HOSTLOG_STATS_HISTORY.ERROR_NUM
     *
     * @return the value of HOSTLOG_STATS_HISTORY.ERROR_NUM
     *
     * @mbg.generated
     */
    public BigDecimal getErrorNum() {
        return errorNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column HOSTLOG_STATS_HISTORY.ERROR_NUM
     *
     * @param errorNum the value for HOSTLOG_STATS_HISTORY.ERROR_NUM
     *
     * @mbg.generated
     */
    public void setErrorNum(BigDecimal errorNum) {
        this.errorNum = errorNum;
    }
}