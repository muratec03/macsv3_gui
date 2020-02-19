﻿package net.muratec.mcs.model;

import java.sql.Timestamp;

public class Mcs {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column MCS.MCS_NAME
     * @mbg.generated
     */
    private String mcsName;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column MCS.SYSTEM_STATE
     * @mbg.generated
     */
    private Short systemState;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column MCS.MCS_VERSION
     * @mbg.generated
     */
    private String mcsVersion;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column MCS.GUI_VERSION
     * @mbg.generated
     */
    private String guiVersion;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column MCS.AVAILABILITY
     * @mbg.generated
     */
    private Short availability;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column MCS.MCS_L_STATE
     * @mbg.generated
     */
    private Short mcsLState;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column MCS.MCS_L_STATE_SET_TIME
     * @mbg.generated
     */
    private Timestamp mcsLStateSetTime;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column MCS.MCS_L_STATE_SET_AUTHOR
     * @mbg.generated
     */
    private String mcsLStateSetAuthor;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column MCS.TABLE_NO
     * @mbg.generated
     */
    private Short tableNo;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column MCS.ROUTE_STATE
     * @mbg.generated
     */
    private Short routeState;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column MCS.REPRESENTATIVE_IP
     * @mbg.generated
     */
    private String representativeIp;

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column MCS.MCS_NAME
     * @return  the value of MCS.MCS_NAME
     * @mbg.generated
     */
    public String getMcsName() {

        return mcsName;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column MCS.MCS_NAME
     * @param mcsName  the value for MCS.MCS_NAME
     * @mbg.generated
     */
    public void setMcsName(String mcsName) {

        this.mcsName = mcsName;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column MCS.SYSTEM_STATE
     * @return  the value of MCS.SYSTEM_STATE
     * @mbg.generated
     */
    public Short getSystemState() {

        return systemState;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column MCS.SYSTEM_STATE
     * @param systemState  the value for MCS.SYSTEM_STATE
     * @mbg.generated
     */
    public void setSystemState(Short systemState) {

        this.systemState = systemState;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column MCS.MCS_VERSION
     * @return  the value of MCS.MCS_VERSION
     * @mbg.generated
     */
    public String getMcsVersion() {

        return mcsVersion;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column MCS.MCS_VERSION
     * @param mcsVersion  the value for MCS.MCS_VERSION
     * @mbg.generated
     */
    public void setMcsVersion(String mcsVersion) {

        this.mcsVersion = mcsVersion;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column MCS.GUI_VERSION
     * @return  the value of MCS.GUI_VERSION
     * @mbg.generated
     */
    public String getGuiVersion() {

        return guiVersion;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column MCS.GUI_VERSION
     * @param guiVersion  the value for MCS.GUI_VERSION
     * @mbg.generated
     */
    public void setGuiVersion(String guiVersion) {

        this.guiVersion = guiVersion;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column MCS.AVAILABILITY
     * @return  the value of MCS.AVAILABILITY
     * @mbg.generated
     */
    public Short getAvailability() {

        return availability;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column MCS.AVAILABILITY
     * @param availability  the value for MCS.AVAILABILITY
     * @mbg.generated
     */
    public void setAvailability(Short availability) {

        this.availability = availability;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column MCS.MCS_L_STATE
     * @return  the value of MCS.MCS_L_STATE
     * @mbg.generated
     */
    public Short getMcsLState() {

        return mcsLState;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column MCS.MCS_L_STATE
     * @param mcsLState  the value for MCS.MCS_L_STATE
     * @mbg.generated
     */
    public void setMcsLState(Short mcsLState) {

        this.mcsLState = mcsLState;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column MCS.MCS_L_STATE_SET_TIME
     * @return  the value of MCS.MCS_L_STATE_SET_TIME
     * @mbg.generated
     */
    public Timestamp getMcsLStateSetTime() {

        return mcsLStateSetTime;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column MCS.MCS_L_STATE_SET_TIME
     * @param mcsLStateSetTime  the value for MCS.MCS_L_STATE_SET_TIME
     * @mbg.generated
     */
    public void setMcsLStateSetTime(Timestamp mcsLStateSetTime) {

        this.mcsLStateSetTime = mcsLStateSetTime;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column MCS.MCS_L_STATE_SET_AUTHOR
     * @return  the value of MCS.MCS_L_STATE_SET_AUTHOR
     * @mbg.generated
     */
    public String getMcsLStateSetAuthor() {

        return mcsLStateSetAuthor;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column MCS.MCS_L_STATE_SET_AUTHOR
     * @param mcsLStateSetAuthor  the value for MCS.MCS_L_STATE_SET_AUTHOR
     * @mbg.generated
     */
    public void setMcsLStateSetAuthor(String mcsLStateSetAuthor) {

        this.mcsLStateSetAuthor = mcsLStateSetAuthor;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column MCS.TABLE_NO
     * @return  the value of MCS.TABLE_NO
     * @mbg.generated
     */
    public Short getTableNo() {

        return tableNo;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column MCS.TABLE_NO
     * @param tableNo  the value for MCS.TABLE_NO
     * @mbg.generated
     */
    public void setTableNo(Short tableNo) {

        this.tableNo = tableNo;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column MCS.ROUTE_STATE
     * @return  the value of MCS.ROUTE_STATE
     * @mbg.generated
     */
    public Short getRouteState() {

        return routeState;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column MCS.ROUTE_STATE
     * @param routeState  the value for MCS.ROUTE_STATE
     * @mbg.generated
     */
    public void setRouteState(Short routeState) {

        this.routeState = routeState;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column MCS.REPRESENTATIVE_IP
     * @return  the value of MCS.REPRESENTATIVE_IP
     * @mbg.generated
     */
    public String getRepresentativeIp() {
        return representativeIp;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column MCS.REPRESENTATIVE_IP
     * @param representativeIp  the value for MCS.REPRESENTATIVE_IP
     * @mbg.generated
     */
    public void setRepresentativeIp(String representativeIp) {
        this.representativeIp = representativeIp;
    }
}
