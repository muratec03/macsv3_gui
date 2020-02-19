﻿package net.muratec.mcs.model;

import java.sql.Timestamp;

public class Carrier {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column CARRIER.ENTITY_ID
     * @mbg.generated
     */
    private String entityId;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column CARRIER.CARRIER_ID
     * @mbg.generated
     */
    private String carrierId;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column CARRIER.CARRIER_STATE
     * @mbg.generated
     */
    private Short carrierState;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column CARRIER.PREV_CARRIER_STATE
     * @mbg.generated
     */
    private Short prevCarrierState;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column CARRIER.CARRIER_TYPE_ID
     * @mbg.generated
     */
    private String carrierTypeId;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column CARRIER.CARRIER_SHAPE_ID
     * @mbg.generated
     */
    private Short carrierShapeId;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column CARRIER.CURRENT_AMHS_ID
     * @mbg.generated
     */
    private String currentAmhsId;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column CARRIER.CURRENT_LOC_TYPE
     * @mbg.generated
     */
    private Short currentLocType;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column CARRIER.CURRENT_LOC
     * @mbg.generated
     */
    private String currentLoc;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column CARRIER.HOST_ZONE_ID
     * @mbg.generated
     */
    private String hostZoneId;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column CARRIER.SHELF_NO
     * @mbg.generated
     */
    private String shelfNo;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column CARRIER.PREV_AMHS_ID
     * @mbg.generated
     */
    private String prevAmhsId;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column CARRIER.PREV_CARRIER_LOC_TYPE
     * @mbg.generated
     */
    private Short prevCarrierLocType;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column CARRIER.PREV_CARRIER_LOC
     * @mbg.generated
     */
    private String prevCarrierLoc;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column CARRIER.STORED_TIME
     * @mbg.generated
     */
    private Timestamp storedTime;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column CARRIER.CARRIER_EMPTY
     * @mbg.generated
     */
    private Short carrierEmpty;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column CARRIER.WAIT_IN_TIME
     * @mbg.generated
     */
    private Timestamp waitInTime;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column CARRIER.WAIT_OUT_TIME
     * @mbg.generated
     */
    private Timestamp waitOutTime;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column CARRIER.INSYSTEM_CARRIER_ID
     * @mbg.generated
     */
    private String insystemCarrierId;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column CARRIER.INSYSTEM_TIME
     * @mbg.generated
     */
    private Timestamp insystemTime;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column CARRIER.CARRIER_ALARM
     * @mbg.generated
     */
    private Short carrierAlarm;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column CARRIER.PASSING_MODE
     * @mbg.generated
     */
    private Short passingMode;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column CARRIER.CARRIER_ACTION_CTRL
     * @mbg.generated
     */
    private Short carrierActionCtrl;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column CARRIER.CLEAN_REQUEST
     * @mbg.generated
     */
    private Short cleanRequest;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column CARRIER.CONTAMI_ID
     * @mbg.generated
     */
    private String contamiId;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column CARRIER.PURPOSE_TYPE
     * @mbg.generated
     */
    private String purposeType;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column CARRIER.CARRIER_ACTION_TIME
     * @mbg.generated
     */
    private Timestamp carrierActionTime;

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column CARRIER.ENTITY_ID
     * @return  the value of CARRIER.ENTITY_ID
     * @mbg.generated
     */
    public String getEntityId() {

        return entityId;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column CARRIER.ENTITY_ID
     * @param entityId  the value for CARRIER.ENTITY_ID
     * @mbg.generated
     */
    public void setEntityId(String entityId) {

        this.entityId = entityId;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column CARRIER.CARRIER_ID
     * @return  the value of CARRIER.CARRIER_ID
     * @mbg.generated
     */
    public String getCarrierId() {

        return carrierId;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column CARRIER.CARRIER_ID
     * @param carrierId  the value for CARRIER.CARRIER_ID
     * @mbg.generated
     */
    public void setCarrierId(String carrierId) {

        this.carrierId = carrierId;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column CARRIER.CARRIER_STATE
     * @return  the value of CARRIER.CARRIER_STATE
     * @mbg.generated
     */
    public Short getCarrierState() {

        return carrierState;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column CARRIER.CARRIER_STATE
     * @param carrierState  the value for CARRIER.CARRIER_STATE
     * @mbg.generated
     */
    public void setCarrierState(Short carrierState) {

        this.carrierState = carrierState;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column CARRIER.PREV_CARRIER_STATE
     * @return  the value of CARRIER.PREV_CARRIER_STATE
     * @mbg.generated
     */
    public Short getPrevCarrierState() {

        return prevCarrierState;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column CARRIER.PREV_CARRIER_STATE
     * @param prevCarrierState  the value for CARRIER.PREV_CARRIER_STATE
     * @mbg.generated
     */
    public void setPrevCarrierState(Short prevCarrierState) {

        this.prevCarrierState = prevCarrierState;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column CARRIER.CARRIER_TYPE_ID
     * @return  the value of CARRIER.CARRIER_TYPE_ID
     * @mbg.generated
     */
    public String getCarrierTypeId() {

        return carrierTypeId;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column CARRIER.CARRIER_TYPE_ID
     * @param carrierTypeId  the value for CARRIER.CARRIER_TYPE_ID
     * @mbg.generated
     */
    public void setCarrierTypeId(String carrierTypeId) {

        this.carrierTypeId = carrierTypeId;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column CARRIER.CARRIER_SHAPE_ID
     * @return  the value of CARRIER.CARRIER_SHAPE_ID
     * @mbg.generated
     */
    public Short getCarrierShapeId() {

        return carrierShapeId;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column CARRIER.CARRIER_SHAPE_ID
     * @param carrierShapeId  the value for CARRIER.CARRIER_SHAPE_ID
     * @mbg.generated
     */
    public void setCarrierShapeId(Short carrierShapeId) {

        this.carrierShapeId = carrierShapeId;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column CARRIER.CURRENT_AMHS_ID
     * @return  the value of CARRIER.CURRENT_AMHS_ID
     * @mbg.generated
     */
    public String getCurrentAmhsId() {

        return currentAmhsId;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column CARRIER.CURRENT_AMHS_ID
     * @param currentAmhsId  the value for CARRIER.CURRENT_AMHS_ID
     * @mbg.generated
     */
    public void setCurrentAmhsId(String currentAmhsId) {

        this.currentAmhsId = currentAmhsId;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column CARRIER.CURRENT_LOC_TYPE
     * @return  the value of CARRIER.CURRENT_LOC_TYPE
     * @mbg.generated
     */
    public Short getCurrentLocType() {

        return currentLocType;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column CARRIER.CURRENT_LOC_TYPE
     * @param currentLocType  the value for CARRIER.CURRENT_LOC_TYPE
     * @mbg.generated
     */
    public void setCurrentLocType(Short currentLocType) {

        this.currentLocType = currentLocType;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column CARRIER.CURRENT_LOC
     * @return  the value of CARRIER.CURRENT_LOC
     * @mbg.generated
     */
    public String getCurrentLoc() {

        return currentLoc;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column CARRIER.CURRENT_LOC
     * @param currentLoc  the value for CARRIER.CURRENT_LOC
     * @mbg.generated
     */
    public void setCurrentLoc(String currentLoc) {

        this.currentLoc = currentLoc;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column CARRIER.HOST_ZONE_ID
     * @return  the value of CARRIER.HOST_ZONE_ID
     * @mbg.generated
     */
    public String getHostZoneId() {

        return hostZoneId;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column CARRIER.HOST_ZONE_ID
     * @param hostZoneId  the value for CARRIER.HOST_ZONE_ID
     * @mbg.generated
     */
    public void setHostZoneId(String hostZoneId) {

        this.hostZoneId = hostZoneId;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column CARRIER.SHELF_NO
     * @return  the value of CARRIER.SHELF_NO
     * @mbg.generated
     */
    public String getShelfNo() {

        return shelfNo;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column CARRIER.SHELF_NO
     * @param shelfNo  the value for CARRIER.SHELF_NO
     * @mbg.generated
     */
    public void setShelfNo(String shelfNo) {

        this.shelfNo = shelfNo;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column CARRIER.PREV_AMHS_ID
     * @return  the value of CARRIER.PREV_AMHS_ID
     * @mbg.generated
     */
    public String getPrevAmhsId() {

        return prevAmhsId;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column CARRIER.PREV_AMHS_ID
     * @param prevAmhsId  the value for CARRIER.PREV_AMHS_ID
     * @mbg.generated
     */
    public void setPrevAmhsId(String prevAmhsId) {

        this.prevAmhsId = prevAmhsId;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column CARRIER.PREV_CARRIER_LOC_TYPE
     * @return  the value of CARRIER.PREV_CARRIER_LOC_TYPE
     * @mbg.generated
     */
    public Short getPrevCarrierLocType() {

        return prevCarrierLocType;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column CARRIER.PREV_CARRIER_LOC_TYPE
     * @param prevCarrierLocType  the value for CARRIER.PREV_CARRIER_LOC_TYPE
     * @mbg.generated
     */
    public void setPrevCarrierLocType(Short prevCarrierLocType) {

        this.prevCarrierLocType = prevCarrierLocType;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column CARRIER.PREV_CARRIER_LOC
     * @return  the value of CARRIER.PREV_CARRIER_LOC
     * @mbg.generated
     */
    public String getPrevCarrierLoc() {

        return prevCarrierLoc;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column CARRIER.PREV_CARRIER_LOC
     * @param prevCarrierLoc  the value for CARRIER.PREV_CARRIER_LOC
     * @mbg.generated
     */
    public void setPrevCarrierLoc(String prevCarrierLoc) {

        this.prevCarrierLoc = prevCarrierLoc;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column CARRIER.STORED_TIME
     * @return  the value of CARRIER.STORED_TIME
     * @mbg.generated
     */
    public Timestamp getStoredTime() {

        return storedTime;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column CARRIER.STORED_TIME
     * @param storedTime  the value for CARRIER.STORED_TIME
     * @mbg.generated
     */
    public void setStoredTime(Timestamp storedTime) {

        this.storedTime = storedTime;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column CARRIER.CARRIER_EMPTY
     * @return  the value of CARRIER.CARRIER_EMPTY
     * @mbg.generated
     */
    public Short getCarrierEmpty() {

        return carrierEmpty;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column CARRIER.CARRIER_EMPTY
     * @param carrierEmpty  the value for CARRIER.CARRIER_EMPTY
     * @mbg.generated
     */
    public void setCarrierEmpty(Short carrierEmpty) {

        this.carrierEmpty = carrierEmpty;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column CARRIER.WAIT_IN_TIME
     * @return  the value of CARRIER.WAIT_IN_TIME
     * @mbg.generated
     */
    public Timestamp getWaitInTime() {

        return waitInTime;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column CARRIER.WAIT_IN_TIME
     * @param waitInTime  the value for CARRIER.WAIT_IN_TIME
     * @mbg.generated
     */
    public void setWaitInTime(Timestamp waitInTime) {

        this.waitInTime = waitInTime;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column CARRIER.WAIT_OUT_TIME
     * @return  the value of CARRIER.WAIT_OUT_TIME
     * @mbg.generated
     */
    public Timestamp getWaitOutTime() {

        return waitOutTime;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column CARRIER.WAIT_OUT_TIME
     * @param waitOutTime  the value for CARRIER.WAIT_OUT_TIME
     * @mbg.generated
     */
    public void setWaitOutTime(Timestamp waitOutTime) {

        this.waitOutTime = waitOutTime;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column CARRIER.INSYSTEM_CARRIER_ID
     * @return  the value of CARRIER.INSYSTEM_CARRIER_ID
     * @mbg.generated
     */
    public String getInsystemCarrierId() {

        return insystemCarrierId;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column CARRIER.INSYSTEM_CARRIER_ID
     * @param insystemCarrierId  the value for CARRIER.INSYSTEM_CARRIER_ID
     * @mbg.generated
     */
    public void setInsystemCarrierId(String insystemCarrierId) {

        this.insystemCarrierId = insystemCarrierId;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column CARRIER.INSYSTEM_TIME
     * @return  the value of CARRIER.INSYSTEM_TIME
     * @mbg.generated
     */
    public Timestamp getInsystemTime() {

        return insystemTime;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column CARRIER.INSYSTEM_TIME
     * @param insystemTime  the value for CARRIER.INSYSTEM_TIME
     * @mbg.generated
     */
    public void setInsystemTime(Timestamp insystemTime) {

        this.insystemTime = insystemTime;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column CARRIER.CARRIER_ALARM
     * @return  the value of CARRIER.CARRIER_ALARM
     * @mbg.generated
     */
    public Short getCarrierAlarm() {

        return carrierAlarm;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column CARRIER.CARRIER_ALARM
     * @param carrierAlarm  the value for CARRIER.CARRIER_ALARM
     * @mbg.generated
     */
    public void setCarrierAlarm(Short carrierAlarm) {

        this.carrierAlarm = carrierAlarm;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column CARRIER.PASSING_MODE
     * @return  the value of CARRIER.PASSING_MODE
     * @mbg.generated
     */
    public Short getPassingMode() {

        return passingMode;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column CARRIER.PASSING_MODE
     * @param passingMode  the value for CARRIER.PASSING_MODE
     * @mbg.generated
     */
    public void setPassingMode(Short passingMode) {

        this.passingMode = passingMode;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column CARRIER.CARRIER_ACTION_CTRL
     * @return  the value of CARRIER.CARRIER_ACTION_CTRL
     * @mbg.generated
     */
    public Short getCarrierActionCtrl() {

        return carrierActionCtrl;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column CARRIER.CARRIER_ACTION_CTRL
     * @param carrierActionCtrl  the value for CARRIER.CARRIER_ACTION_CTRL
     * @mbg.generated
     */
    public void setCarrierActionCtrl(Short carrierActionCtrl) {

        this.carrierActionCtrl = carrierActionCtrl;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column CARRIER.CLEAN_REQUEST
     * @return  the value of CARRIER.CLEAN_REQUEST
     * @mbg.generated
     */
    public Short getCleanRequest() {
        return cleanRequest;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column CARRIER.CLEAN_REQUEST
     * @param cleanRequest  the value for CARRIER.CLEAN_REQUEST
     * @mbg.generated
     */
    public void setCleanRequest(Short cleanRequest) {
        this.cleanRequest = cleanRequest;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column CARRIER.CONTAMI_ID
     * @return  the value of CARRIER.CONTAMI_ID
     * @mbg.generated
     */
    public String getContamiId() {
        return contamiId;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column CARRIER.CONTAMI_ID
     * @param contamiId  the value for CARRIER.CONTAMI_ID
     * @mbg.generated
     */
    public void setContamiId(String contamiId) {
        this.contamiId = contamiId;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column CARRIER.PURPOSE_TYPE
     * @return  the value of CARRIER.PURPOSE_TYPE
     * @mbg.generated
     */
    public String getPurposeType() {
        return purposeType;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column CARRIER.PURPOSE_TYPE
     * @param purposeType  the value for CARRIER.PURPOSE_TYPE
     * @mbg.generated
     */
    public void setPurposeType(String purposeType) {
        this.purposeType = purposeType;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column CARRIER.CARRIER_ACTION_TIME
     * @return  the value of CARRIER.CARRIER_ACTION_TIME
     * @mbg.generated
     */
    public Timestamp getCarrierActionTime() {

        return carrierActionTime;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column CARRIER.CARRIER_ACTION_TIME
     * @param carrierActionTime  the value for CARRIER.CARRIER_ACTION_TIME
     * @mbg.generated
     */
    public void setCarrierActionTime(Timestamp carrierActionTime) {

        this.carrierActionTime = carrierActionTime;
    }
}
