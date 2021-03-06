﻿package net.muratec.mcs.model;

public class HostReportInfo extends HostReportInfoKey {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column HOST_REPORT_INFO.REPORT_FLAG
     * @mbg.generated
     */
    private Short reportFlag;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column HOST_REPORT_INFO.QUEUE_MODE
     * @mbg.generated
     */
    private Short queueMode;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column HOST_REPORT_INFO.RETRY_LIMIT
     * @mbg.generated
     */
    private Short retryLimit;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column HOST_REPORT_INFO.RETRY_RET_CODE_LIST
     * @mbg.generated
     */
    private String retryRetCodeList;

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column HOST_REPORT_INFO.REPORT_FLAG
     * @return  the value of HOST_REPORT_INFO.REPORT_FLAG
     * @mbg.generated
     */
    public Short getReportFlag() {

        return reportFlag;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column HOST_REPORT_INFO.REPORT_FLAG
     * @param reportFlag  the value for HOST_REPORT_INFO.REPORT_FLAG
     * @mbg.generated
     */
    public void setReportFlag(Short reportFlag) {

        this.reportFlag = reportFlag;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column HOST_REPORT_INFO.QUEUE_MODE
     * @return  the value of HOST_REPORT_INFO.QUEUE_MODE
     * @mbg.generated
     */
    public Short getQueueMode() {

        return queueMode;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column HOST_REPORT_INFO.QUEUE_MODE
     * @param queueMode  the value for HOST_REPORT_INFO.QUEUE_MODE
     * @mbg.generated
     */
    public void setQueueMode(Short queueMode) {

        this.queueMode = queueMode;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column HOST_REPORT_INFO.RETRY_LIMIT
     * @return  the value of HOST_REPORT_INFO.RETRY_LIMIT
     * @mbg.generated
     */
    public Short getRetryLimit() {

        return retryLimit;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column HOST_REPORT_INFO.RETRY_LIMIT
     * @param retryLimit  the value for HOST_REPORT_INFO.RETRY_LIMIT
     * @mbg.generated
     */
    public void setRetryLimit(Short retryLimit) {

        this.retryLimit = retryLimit;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column HOST_REPORT_INFO.RETRY_RET_CODE_LIST
     * @return  the value of HOST_REPORT_INFO.RETRY_RET_CODE_LIST
     * @mbg.generated
     */
    public String getRetryRetCodeList() {

        return retryRetCodeList;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column HOST_REPORT_INFO.RETRY_RET_CODE_LIST
     * @param retryRetCodeList  the value for HOST_REPORT_INFO.RETRY_RET_CODE_LIST
     * @mbg.generated
     */
    public void setRetryRetCodeList(String retryRetCodeList) {

        this.retryRetCodeList = retryRetCodeList;
    }
}
