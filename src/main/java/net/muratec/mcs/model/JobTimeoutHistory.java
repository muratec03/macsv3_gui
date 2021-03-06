package net.muratec.mcs.model;

import java.sql.Timestamp;

public class JobTimeoutHistory {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column JOB_TIMEOUT_HISTORY.TIME
     * @mbg.generated
     */
    private Timestamp time;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column JOB_TIMEOUT_HISTORY.CARRIER_JOB_ID
     * @mbg.generated
     */
    private String carrierJobId;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column JOB_TIMEOUT_HISTORY.TIMER_TYPE
     * @mbg.generated
     */
    private Short timerType;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column JOB_TIMEOUT_HISTORY.DESCRIPTION
     * @mbg.generated
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column JOB_TIMEOUT_HISTORY.TIME
     * @return  the value of JOB_TIMEOUT_HISTORY.TIME
     * @mbg.generated
     */
    public Timestamp getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column JOB_TIMEOUT_HISTORY.TIME
     * @param time  the value for JOB_TIMEOUT_HISTORY.TIME
     * @mbg.generated
     */
    public void setTime(Timestamp time) {
        this.time = time;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column JOB_TIMEOUT_HISTORY.CARRIER_JOB_ID
     * @return  the value of JOB_TIMEOUT_HISTORY.CARRIER_JOB_ID
     * @mbg.generated
     */
    public String getCarrierJobId() {
        return carrierJobId;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column JOB_TIMEOUT_HISTORY.CARRIER_JOB_ID
     * @param carrierJobId  the value for JOB_TIMEOUT_HISTORY.CARRIER_JOB_ID
     * @mbg.generated
     */
    public void setCarrierJobId(String carrierJobId) {
        this.carrierJobId = carrierJobId;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column JOB_TIMEOUT_HISTORY.TIMER_TYPE
     * @return  the value of JOB_TIMEOUT_HISTORY.TIMER_TYPE
     * @mbg.generated
     */
    public Short getTimerType() {
        return timerType;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column JOB_TIMEOUT_HISTORY.TIMER_TYPE
     * @param timerType  the value for JOB_TIMEOUT_HISTORY.TIMER_TYPE
     * @mbg.generated
     */
    public void setTimerType(Short timerType) {
        this.timerType = timerType;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column JOB_TIMEOUT_HISTORY.DESCRIPTION
     * @return  the value of JOB_TIMEOUT_HISTORY.DESCRIPTION
     * @mbg.generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column JOB_TIMEOUT_HISTORY.DESCRIPTION
     * @param description  the value for JOB_TIMEOUT_HISTORY.DESCRIPTION
     * @mbg.generated
     */
    public void setDescription(String description) {
        this.description = description;
    }
}