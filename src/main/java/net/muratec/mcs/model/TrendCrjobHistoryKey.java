package net.muratec.mcs.model;

import java.sql.Timestamp;

public class TrendCrjobHistoryKey {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column TREND_CRJOB_HISTORY.TIME
     * @mbg.generated
     */
    private Timestamp time;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column TREND_CRJOB_HISTORY.CARRIER_JOB_STATE
     * @mbg.generated
     */
    private Short carrierJobState;

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column TREND_CRJOB_HISTORY.TIME
     * @return  the value of TREND_CRJOB_HISTORY.TIME
     * @mbg.generated
     */
    public Timestamp getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column TREND_CRJOB_HISTORY.TIME
     * @param time  the value for TREND_CRJOB_HISTORY.TIME
     * @mbg.generated
     */
    public void setTime(Timestamp time) {
        this.time = time;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column TREND_CRJOB_HISTORY.CARRIER_JOB_STATE
     * @return  the value of TREND_CRJOB_HISTORY.CARRIER_JOB_STATE
     * @mbg.generated
     */
    public Short getCarrierJobState() {
        return carrierJobState;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column TREND_CRJOB_HISTORY.CARRIER_JOB_STATE
     * @param carrierJobState  the value for TREND_CRJOB_HISTORY.CARRIER_JOB_STATE
     * @mbg.generated
     */
    public void setCarrierJobState(Short carrierJobState) {
        this.carrierJobState = carrierJobState;
    }
}