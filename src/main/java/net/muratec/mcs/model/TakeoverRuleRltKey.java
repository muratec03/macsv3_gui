﻿package net.muratec.mcs.model;

public class TakeoverRuleRltKey {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column TAKEOVER_RULE_RLT.RULE_NO
     * @mbg.generated
     */
    private Short ruleNo;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column TAKEOVER_RULE_RLT.SERVICE_ID
     * @mbg.generated
     */
    private String serviceId;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column TAKEOVER_RULE_RLT.PRIORITY
     * @mbg.generated
     */
    private Short priority;

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column TAKEOVER_RULE_RLT.RULE_NO
     * @return  the value of TAKEOVER_RULE_RLT.RULE_NO
     * @mbg.generated
     */
    public Short getRuleNo() {

        return ruleNo;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column TAKEOVER_RULE_RLT.RULE_NO
     * @param ruleNo  the value for TAKEOVER_RULE_RLT.RULE_NO
     * @mbg.generated
     */
    public void setRuleNo(Short ruleNo) {

        this.ruleNo = ruleNo;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column TAKEOVER_RULE_RLT.SERVICE_ID
     * @return  the value of TAKEOVER_RULE_RLT.SERVICE_ID
     * @mbg.generated
     */
    public String getServiceId() {

        return serviceId;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column TAKEOVER_RULE_RLT.SERVICE_ID
     * @param serviceId  the value for TAKEOVER_RULE_RLT.SERVICE_ID
     * @mbg.generated
     */
    public void setServiceId(String serviceId) {

        this.serviceId = serviceId;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column TAKEOVER_RULE_RLT.PRIORITY
     * @return  the value of TAKEOVER_RULE_RLT.PRIORITY
     * @mbg.generated
     */
    public Short getPriority() {

        return priority;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column TAKEOVER_RULE_RLT.PRIORITY
     * @param priority  the value for TAKEOVER_RULE_RLT.PRIORITY
     * @mbg.generated
     */
    public void setPriority(Short priority) {

        this.priority = priority;
    }
}
