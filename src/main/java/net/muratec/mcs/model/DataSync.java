﻿package net.muratec.mcs.model;

import java.sql.Timestamp;

public class DataSync {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DATA_SYNC.AMHS_ID
     *
     * @mbg.generated
     */
    private String amhsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DATA_SYNC.SYNC_ACTION_CTRL
     *
     * @mbg.generated
     */
    private Short syncActionCtrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DATA_SYNC.SYNC_ACTION_TIME
     *
     * @mbg.generated
     */
    private Timestamp syncActionTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DATA_SYNC.AMHS_ID
     *
     * @return the value of DATA_SYNC.AMHS_ID
     *
     * @mbg.generated
     */
    public String getAmhsId() {
        return amhsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DATA_SYNC.AMHS_ID
     *
     * @param amhsId the value for DATA_SYNC.AMHS_ID
     *
     * @mbg.generated
     */
    public void setAmhsId(String amhsId) {
        this.amhsId = amhsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DATA_SYNC.SYNC_ACTION_CTRL
     *
     * @return the value of DATA_SYNC.SYNC_ACTION_CTRL
     *
     * @mbg.generated
     */
    public Short getSyncActionCtrl() {
        return syncActionCtrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DATA_SYNC.SYNC_ACTION_CTRL
     *
     * @param syncActionCtrl the value for DATA_SYNC.SYNC_ACTION_CTRL
     *
     * @mbg.generated
     */
    public void setSyncActionCtrl(Short syncActionCtrl) {
        this.syncActionCtrl = syncActionCtrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DATA_SYNC.SYNC_ACTION_TIME
     *
     * @return the value of DATA_SYNC.SYNC_ACTION_TIME
     *
     * @mbg.generated
     */
    public Timestamp getSyncActionTime() {
        return syncActionTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DATA_SYNC.SYNC_ACTION_TIME
     *
     * @param syncActionTime the value for DATA_SYNC.SYNC_ACTION_TIME
     *
     * @mbg.generated
     */
    public void setSyncActionTime(Timestamp syncActionTime) {
        this.syncActionTime = syncActionTime;
    }
}
