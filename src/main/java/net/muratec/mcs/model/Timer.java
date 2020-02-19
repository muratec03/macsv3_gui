﻿package net.muratec.mcs.model;

import java.sql.Timestamp;

public class Timer extends TimerKey {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column TIMER.TIMER_TYPE
     * @mbg.generated
     */
    private Short timerType;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column TIMER.SET_TIME
     * @mbg.generated
     */
    private Timestamp setTime;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column TIMER.INTERVAL
     * @mbg.generated
     */
    private Integer interval;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column TIMER.CARRIER_JOB_ID
     * @mbg.generated
     */
    private String carrierJobId;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column TIMER.CARRIER_ID
     * @mbg.generated
     */
    private String carrierId;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column TIMER.RCV_SUBJECT
     * @mbg.generated
     */
    private String rcvSubject;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column TIMER.EVENT_DATA
     * @mbg.generated
     */
    private byte[] eventData;

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column TIMER.TIMER_TYPE
     * @return  the value of TIMER.TIMER_TYPE
     * @mbg.generated
     */
    public Short getTimerType() {

        return timerType;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column TIMER.TIMER_TYPE
     * @param timerType  the value for TIMER.TIMER_TYPE
     * @mbg.generated
     */
    public void setTimerType(Short timerType) {

        this.timerType = timerType;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column TIMER.SET_TIME
     * @return  the value of TIMER.SET_TIME
     * @mbg.generated
     */
    public Timestamp getSetTime() {

        return setTime;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column TIMER.SET_TIME
     * @param setTime  the value for TIMER.SET_TIME
     * @mbg.generated
     */
    public void setSetTime(Timestamp setTime) {

        this.setTime = setTime;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column TIMER.INTERVAL
     * @return  the value of TIMER.INTERVAL
     * @mbg.generated
     */
    public Integer getInterval() {

        return interval;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column TIMER.INTERVAL
     * @param interval  the value for TIMER.INTERVAL
     * @mbg.generated
     */
    public void setInterval(Integer interval) {

        this.interval = interval;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column TIMER.CARRIER_JOB_ID
     * @return  the value of TIMER.CARRIER_JOB_ID
     * @mbg.generated
     */
    public String getCarrierJobId() {

        return carrierJobId;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column TIMER.CARRIER_JOB_ID
     * @param carrierJobId  the value for TIMER.CARRIER_JOB_ID
     * @mbg.generated
     */
    public void setCarrierJobId(String carrierJobId) {

        this.carrierJobId = carrierJobId;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column TIMER.CARRIER_ID
     * @return  the value of TIMER.CARRIER_ID
     * @mbg.generated
     */
    public String getCarrierId() {

        return carrierId;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column TIMER.CARRIER_ID
     * @param carrierId  the value for TIMER.CARRIER_ID
     * @mbg.generated
     */
    public void setCarrierId(String carrierId) {

        this.carrierId = carrierId;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column TIMER.RCV_SUBJECT
     * @return  the value of TIMER.RCV_SUBJECT
     * @mbg.generated
     */
    public String getRcvSubject() {

        return rcvSubject;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column TIMER.RCV_SUBJECT
     * @param rcvSubject  the value for TIMER.RCV_SUBJECT
     * @mbg.generated
     */
    public void setRcvSubject(String rcvSubject) {

        this.rcvSubject = rcvSubject;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column TIMER.EVENT_DATA
     * @return  the value of TIMER.EVENT_DATA
     * @mbg.generated
     */
    public byte[] getEventData() {

        return eventData;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column TIMER.EVENT_DATA
     * @param eventData  the value for TIMER.EVENT_DATA
     * @mbg.generated
     */
    public void setEventData(byte[] eventData) {

        this.eventData = eventData;
    }
}
