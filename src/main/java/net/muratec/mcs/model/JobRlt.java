﻿package net.muratec.mcs.model;

public class JobRlt {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column JOB_RLT.CARRIER_JOB_ID
     * @mbg.generated
     */
    private String carrierJobId;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column JOB_RLT.JOB_ID
     * @mbg.generated
     */
    private String jobId;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column JOB_RLT.COMP_FLAG
     * @mbg.generated
     */
    private Short compFlag;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column JOB_RLT.CARRIER_JOB_TYPE
     * @mbg.generated
     */
    private Short carrierJobType;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column JOB_RLT.TRANSFER_ORDER
     * @mbg.generated
     */
    private Short transferOrder;

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column JOB_RLT.CARRIER_JOB_ID
     * @return  the value of JOB_RLT.CARRIER_JOB_ID
     * @mbg.generated
     */
    public String getCarrierJobId() {

        return carrierJobId;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column JOB_RLT.CARRIER_JOB_ID
     * @param carrierJobId  the value for JOB_RLT.CARRIER_JOB_ID
     * @mbg.generated
     */
    public void setCarrierJobId(String carrierJobId) {

        this.carrierJobId = carrierJobId;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column JOB_RLT.JOB_ID
     * @return  the value of JOB_RLT.JOB_ID
     * @mbg.generated
     */
    public String getJobId() {

        return jobId;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column JOB_RLT.JOB_ID
     * @param jobId  the value for JOB_RLT.JOB_ID
     * @mbg.generated
     */
    public void setJobId(String jobId) {

        this.jobId = jobId;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column JOB_RLT.COMP_FLAG
     * @return  the value of JOB_RLT.COMP_FLAG
     * @mbg.generated
     */
    public Short getCompFlag() {

        return compFlag;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column JOB_RLT.COMP_FLAG
     * @param compFlag  the value for JOB_RLT.COMP_FLAG
     * @mbg.generated
     */
    public void setCompFlag(Short compFlag) {

        this.compFlag = compFlag;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column JOB_RLT.CARRIER_JOB_TYPE
     * @return  the value of JOB_RLT.CARRIER_JOB_TYPE
     * @mbg.generated
     */
    public Short getCarrierJobType() {
        return carrierJobType;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column JOB_RLT.CARRIER_JOB_TYPE
     * @param carrierJobType  the value for JOB_RLT.CARRIER_JOB_TYPE
     * @mbg.generated
     */
    public void setCarrierJobType(Short carrierJobType) {
        this.carrierJobType = carrierJobType;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column JOB_RLT.TRANSFER_ORDER
     * @return  the value of JOB_RLT.TRANSFER_ORDER
     * @mbg.generated
     */
    public Short getTransferOrder() {
        return transferOrder;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column JOB_RLT.TRANSFER_ORDER
     * @param transferOrder  the value for JOB_RLT.TRANSFER_ORDER
     * @mbg.generated
     */
    public void setTransferOrder(Short transferOrder) {
        this.transferOrder = transferOrder;
    }
}
