﻿package net.muratec.mcs.model;

import java.sql.Timestamp;

public class ProcTimeStatsKey {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column PROC_TIME_STATS.TIME
     * @mbg.generated
     */
    private Timestamp time;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column PROC_TIME_STATS.SYSTEM_ID
     * @mbg.generated
     */
    private Integer systemId;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column PROC_TIME_STATS.EVENT_NAME
     * @mbg.generated
     */
    private String eventName;

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column PROC_TIME_STATS.TIME
     * @return  the value of PROC_TIME_STATS.TIME
     * @mbg.generated
     */
    public Timestamp getTime() {

        return time;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column PROC_TIME_STATS.TIME
     * @param time  the value for PROC_TIME_STATS.TIME
     * @mbg.generated
     */
    public void setTime(Timestamp time) {

        this.time = time;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column PROC_TIME_STATS.SYSTEM_ID
     * @return  the value of PROC_TIME_STATS.SYSTEM_ID
     * @mbg.generated
     */
    public Integer getSystemId() {

        return systemId;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column PROC_TIME_STATS.SYSTEM_ID
     * @param systemId  the value for PROC_TIME_STATS.SYSTEM_ID
     * @mbg.generated
     */
    public void setSystemId(Integer systemId) {

        this.systemId = systemId;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column PROC_TIME_STATS.EVENT_NAME
     * @return  the value of PROC_TIME_STATS.EVENT_NAME
     * @mbg.generated
     */
    public String getEventName() {

        return eventName;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column PROC_TIME_STATS.EVENT_NAME
     * @param eventName  the value for PROC_TIME_STATS.EVENT_NAME
     * @mbg.generated
     */
    public void setEventName(String eventName) {

        this.eventName = eventName;
    }
}
