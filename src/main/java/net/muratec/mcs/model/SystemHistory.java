package net.muratec.mcs.model;

import java.sql.Timestamp;

public class SystemHistory {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column SYSTEM_HISTORY.TIME
     * @mbg.generated
     */
    private Timestamp time;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column SYSTEM_HISTORY.LOG_CODE
     * @mbg.generated
     */
    private Long logCode;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column SYSTEM_HISTORY.LOG_TEXT
     * @mbg.generated
     */
    private String logText;

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column SYSTEM_HISTORY.TIME
     * @return  the value of SYSTEM_HISTORY.TIME
     * @mbg.generated
     */
    public Timestamp getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column SYSTEM_HISTORY.TIME
     * @param time  the value for SYSTEM_HISTORY.TIME
     * @mbg.generated
     */
    public void setTime(Timestamp time) {
        this.time = time;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column SYSTEM_HISTORY.LOG_CODE
     * @return  the value of SYSTEM_HISTORY.LOG_CODE
     * @mbg.generated
     */
    public Long getLogCode() {
        return logCode;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column SYSTEM_HISTORY.LOG_CODE
     * @param logCode  the value for SYSTEM_HISTORY.LOG_CODE
     * @mbg.generated
     */
    public void setLogCode(Long logCode) {
        this.logCode = logCode;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column SYSTEM_HISTORY.LOG_TEXT
     * @return  the value of SYSTEM_HISTORY.LOG_TEXT
     * @mbg.generated
     */
    public String getLogText() {
        return logText;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column SYSTEM_HISTORY.LOG_TEXT
     * @param logText  the value for SYSTEM_HISTORY.LOG_TEXT
     * @mbg.generated
     */
    public void setLogText(String logText) {
        this.logText = logText;
    }
}