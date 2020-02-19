﻿package net.muratec.mcs.model;

import java.sql.Timestamp;

public class BinUtilizationHistoryKey {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column BIN_UTILIZATION_HISTORY.TIME
     * @mbg.generated
     */
    private Timestamp time;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column BIN_UTILIZATION_HISTORY.AMHS_ID
     * @mbg.generated
     */
    private String amhsId;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column BIN_UTILIZATION_HISTORY.ZONE_ID
     * @mbg.generated
     */
    private String zoneId;

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column BIN_UTILIZATION_HISTORY.TIME
     * @return  the value of BIN_UTILIZATION_HISTORY.TIME
     * @mbg.generated
     */
    public Timestamp getTime() {

        return time;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column BIN_UTILIZATION_HISTORY.TIME
     * @param time  the value for BIN_UTILIZATION_HISTORY.TIME
     * @mbg.generated
     */
    public void setTime(Timestamp time) {

        this.time = time;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column BIN_UTILIZATION_HISTORY.AMHS_ID
     * @return  the value of BIN_UTILIZATION_HISTORY.AMHS_ID
     * @mbg.generated
     */
    public String getAmhsId() {

        return amhsId;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column BIN_UTILIZATION_HISTORY.AMHS_ID
     * @param amhsId  the value for BIN_UTILIZATION_HISTORY.AMHS_ID
     * @mbg.generated
     */
    public void setAmhsId(String amhsId) {

        this.amhsId = amhsId;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column BIN_UTILIZATION_HISTORY.ZONE_ID
     * @return  the value of BIN_UTILIZATION_HISTORY.ZONE_ID
     * @mbg.generated
     */
    public String getZoneId() {

        return zoneId;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column BIN_UTILIZATION_HISTORY.ZONE_ID
     * @param zoneId  the value for BIN_UTILIZATION_HISTORY.ZONE_ID
     * @mbg.generated
     */
    public void setZoneId(String zoneId) {

        this.zoneId = zoneId;
    }
}
