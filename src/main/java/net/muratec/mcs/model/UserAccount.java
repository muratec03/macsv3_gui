﻿package net.muratec.mcs.model;

import java.sql.Timestamp;

public class UserAccount {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column USER_ACCOUNT.USER_ID
     * @mbg.generated
     */
    private Short userId;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column USER_ACCOUNT.USER_NAME
     * @mbg.generated
     */
    private String userName;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column USER_ACCOUNT.DESCRIPTION
     * @mbg.generated
     */
    private String description;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column USER_ACCOUNT.GUI_GROUP_ID
     * @mbg.generated
     */
    private String guiGroupId;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column USER_ACCOUNT.PASSWORD
     * @mbg.generated
     */
    private String password;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column USER_ACCOUNT.PASS_ERROR_COUNT
     * @mbg.generated
     */
    private Short passErrorCount;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column USER_ACCOUNT.ACCOUNT_STATE
     * @mbg.generated
     */
    private Short accountState;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column USER_ACCOUNT.LAST_LOGIN
     * @mbg.generated
     */
    private Timestamp lastLogin;

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column USER_ACCOUNT.USER_ID
     * @return  the value of USER_ACCOUNT.USER_ID
     * @mbg.generated
     */
    public Short getUserId() {

        return userId;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column USER_ACCOUNT.USER_ID
     * @param userId  the value for USER_ACCOUNT.USER_ID
     * @mbg.generated
     */
    public void setUserId(Short userId) {

        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column USER_ACCOUNT.USER_NAME
     * @return  the value of USER_ACCOUNT.USER_NAME
     * @mbg.generated
     */
    public String getUserName() {

        return userName;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column USER_ACCOUNT.USER_NAME
     * @param userName  the value for USER_ACCOUNT.USER_NAME
     * @mbg.generated
     */
    public void setUserName(String userName) {

        this.userName = userName;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column USER_ACCOUNT.DESCRIPTION
     * @return  the value of USER_ACCOUNT.DESCRIPTION
     * @mbg.generated
     */
    public String getDescription() {

        return description;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column USER_ACCOUNT.DESCRIPTION
     * @param description  the value for USER_ACCOUNT.DESCRIPTION
     * @mbg.generated
     */
    public void setDescription(String description) {

        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column USER_ACCOUNT.GUI_GROUP_ID
     * @return  the value of USER_ACCOUNT.GUI_GROUP_ID
     * @mbg.generated
     */
    public String getGuiGroupId() {

        return guiGroupId;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column USER_ACCOUNT.GUI_GROUP_ID
     * @param guiGroupId  the value for USER_ACCOUNT.GUI_GROUP_ID
     * @mbg.generated
     */
    public void setGuiGroupId(String guiGroupId) {

        this.guiGroupId = guiGroupId;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column USER_ACCOUNT.PASSWORD
     * @return  the value of USER_ACCOUNT.PASSWORD
     * @mbg.generated
     */
    public String getPassword() {

        return password;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column USER_ACCOUNT.PASSWORD
     * @param password  the value for USER_ACCOUNT.PASSWORD
     * @mbg.generated
     */
    public void setPassword(String password) {

        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column USER_ACCOUNT.PASS_ERROR_COUNT
     * @return  the value of USER_ACCOUNT.PASS_ERROR_COUNT
     * @mbg.generated
     */
    public Short getPassErrorCount() {

        return passErrorCount;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column USER_ACCOUNT.PASS_ERROR_COUNT
     * @param passErrorCount  the value for USER_ACCOUNT.PASS_ERROR_COUNT
     * @mbg.generated
     */
    public void setPassErrorCount(Short passErrorCount) {

        this.passErrorCount = passErrorCount;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column USER_ACCOUNT.ACCOUNT_STATE
     * @return  the value of USER_ACCOUNT.ACCOUNT_STATE
     * @mbg.generated
     */
    public Short getAccountState() {

        return accountState;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column USER_ACCOUNT.ACCOUNT_STATE
     * @param accountState  the value for USER_ACCOUNT.ACCOUNT_STATE
     * @mbg.generated
     */
    public void setAccountState(Short accountState) {

        this.accountState = accountState;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column USER_ACCOUNT.LAST_LOGIN
     * @return  the value of USER_ACCOUNT.LAST_LOGIN
     * @mbg.generated
     */
    public Timestamp getLastLogin() {

        return lastLogin;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column USER_ACCOUNT.LAST_LOGIN
     * @param lastLogin  the value for USER_ACCOUNT.LAST_LOGIN
     * @mbg.generated
     */
    public void setLastLogin(Timestamp lastLogin) {

        this.lastLogin = lastLogin;
    }
}
