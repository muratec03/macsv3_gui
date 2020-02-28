package net.muratec.mcs.model;

public class Stocker {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column STOCKER.TSC_ID
     *
     * @mbg.generated
     */
    private Integer tscId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column STOCKER.LLC_ZONE_ID
     *
     * @mbg.generated
     */
    private String llcZoneId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column STOCKER.STOCKER_STATE
     *
     * @mbg.generated
     */
    private String stockerState;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column STOCKER.AVAILABLE
     *
     * @mbg.generated
     */
    private String available;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column STOCKER.REQ_TIME
     *
     * @mbg.generated
     */
    private String reqTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column STOCKER.ACTIVE_TIME
     *
     * @mbg.generated
     */
    private String activeTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column STOCKER.IDLE_TIME
     *
     * @mbg.generated
     */
    private String idleTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column STOCKER.TOTAL_SHELVES
     *
     * @mbg.generated
     */
    private Integer totalShelves;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column STOCKER.ID_ERROR_COUNT
     *
     * @mbg.generated
     */
    private Short idErrorCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column STOCKER.DPL_ERROR_COUNT
     *
     * @mbg.generated
     */
    private Short dplErrorCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column STOCKER.DOWN_SET_TIME
     *
     * @mbg.generated
     */
    private String downSetTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column STOCKER.TOTAL_OPE
     *
     * @mbg.generated
     */
    private Integer totalOpe;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column STOCKER.TOTAL_ERR
     *
     * @mbg.generated
     */
    private Integer totalErr;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column STOCKER.SEARCH_FLG
     *
     * @mbg.generated
     */
    private Short searchFlg;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STOCKER.TSC_ID
     *
     * @return the value of STOCKER.TSC_ID
     *
     * @mbg.generated
     */
    public Integer getTscId() {
        return tscId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STOCKER.TSC_ID
     *
     * @param tscId the value for STOCKER.TSC_ID
     *
     * @mbg.generated
     */
    public void setTscId(Integer tscId) {
        this.tscId = tscId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STOCKER.LLC_ZONE_ID
     *
     * @return the value of STOCKER.LLC_ZONE_ID
     *
     * @mbg.generated
     */
    public String getLlcZoneId() {
        return llcZoneId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STOCKER.LLC_ZONE_ID
     *
     * @param llcZoneId the value for STOCKER.LLC_ZONE_ID
     *
     * @mbg.generated
     */
    public void setLlcZoneId(String llcZoneId) {
        this.llcZoneId = llcZoneId == null ? null : llcZoneId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STOCKER.STOCKER_STATE
     *
     * @return the value of STOCKER.STOCKER_STATE
     *
     * @mbg.generated
     */
    public String getStockerState() {
        return stockerState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STOCKER.STOCKER_STATE
     *
     * @param stockerState the value for STOCKER.STOCKER_STATE
     *
     * @mbg.generated
     */
    public void setStockerState(String stockerState) {
        this.stockerState = stockerState == null ? null : stockerState.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STOCKER.AVAILABLE
     *
     * @return the value of STOCKER.AVAILABLE
     *
     * @mbg.generated
     */
    public String getAvailable() {
        return available;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STOCKER.AVAILABLE
     *
     * @param available the value for STOCKER.AVAILABLE
     *
     * @mbg.generated
     */
    public void setAvailable(String available) {
        this.available = available == null ? null : available.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STOCKER.REQ_TIME
     *
     * @return the value of STOCKER.REQ_TIME
     *
     * @mbg.generated
     */
    public String getReqTime() {
        return reqTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STOCKER.REQ_TIME
     *
     * @param reqTime the value for STOCKER.REQ_TIME
     *
     * @mbg.generated
     */
    public void setReqTime(String reqTime) {
        this.reqTime = reqTime == null ? null : reqTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STOCKER.ACTIVE_TIME
     *
     * @return the value of STOCKER.ACTIVE_TIME
     *
     * @mbg.generated
     */
    public String getActiveTime() {
        return activeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STOCKER.ACTIVE_TIME
     *
     * @param activeTime the value for STOCKER.ACTIVE_TIME
     *
     * @mbg.generated
     */
    public void setActiveTime(String activeTime) {
        this.activeTime = activeTime == null ? null : activeTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STOCKER.IDLE_TIME
     *
     * @return the value of STOCKER.IDLE_TIME
     *
     * @mbg.generated
     */
    public String getIdleTime() {
        return idleTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STOCKER.IDLE_TIME
     *
     * @param idleTime the value for STOCKER.IDLE_TIME
     *
     * @mbg.generated
     */
    public void setIdleTime(String idleTime) {
        this.idleTime = idleTime == null ? null : idleTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STOCKER.TOTAL_SHELVES
     *
     * @return the value of STOCKER.TOTAL_SHELVES
     *
     * @mbg.generated
     */
    public Integer getTotalShelves() {
        return totalShelves;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STOCKER.TOTAL_SHELVES
     *
     * @param totalShelves the value for STOCKER.TOTAL_SHELVES
     *
     * @mbg.generated
     */
    public void setTotalShelves(Integer totalShelves) {
        this.totalShelves = totalShelves;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STOCKER.ID_ERROR_COUNT
     *
     * @return the value of STOCKER.ID_ERROR_COUNT
     *
     * @mbg.generated
     */
    public Short getIdErrorCount() {
        return idErrorCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STOCKER.ID_ERROR_COUNT
     *
     * @param idErrorCount the value for STOCKER.ID_ERROR_COUNT
     *
     * @mbg.generated
     */
    public void setIdErrorCount(Short idErrorCount) {
        this.idErrorCount = idErrorCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STOCKER.DPL_ERROR_COUNT
     *
     * @return the value of STOCKER.DPL_ERROR_COUNT
     *
     * @mbg.generated
     */
    public Short getDplErrorCount() {
        return dplErrorCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STOCKER.DPL_ERROR_COUNT
     *
     * @param dplErrorCount the value for STOCKER.DPL_ERROR_COUNT
     *
     * @mbg.generated
     */
    public void setDplErrorCount(Short dplErrorCount) {
        this.dplErrorCount = dplErrorCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STOCKER.DOWN_SET_TIME
     *
     * @return the value of STOCKER.DOWN_SET_TIME
     *
     * @mbg.generated
     */
    public String getDownSetTime() {
        return downSetTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STOCKER.DOWN_SET_TIME
     *
     * @param downSetTime the value for STOCKER.DOWN_SET_TIME
     *
     * @mbg.generated
     */
    public void setDownSetTime(String downSetTime) {
        this.downSetTime = downSetTime == null ? null : downSetTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STOCKER.TOTAL_OPE
     *
     * @return the value of STOCKER.TOTAL_OPE
     *
     * @mbg.generated
     */
    public Integer getTotalOpe() {
        return totalOpe;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STOCKER.TOTAL_OPE
     *
     * @param totalOpe the value for STOCKER.TOTAL_OPE
     *
     * @mbg.generated
     */
    public void setTotalOpe(Integer totalOpe) {
        this.totalOpe = totalOpe;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STOCKER.TOTAL_ERR
     *
     * @return the value of STOCKER.TOTAL_ERR
     *
     * @mbg.generated
     */
    public Integer getTotalErr() {
        return totalErr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STOCKER.TOTAL_ERR
     *
     * @param totalErr the value for STOCKER.TOTAL_ERR
     *
     * @mbg.generated
     */
    public void setTotalErr(Integer totalErr) {
        this.totalErr = totalErr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STOCKER.SEARCH_FLG
     *
     * @return the value of STOCKER.SEARCH_FLG
     *
     * @mbg.generated
     */
    public Short getSearchFlg() {
        return searchFlg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STOCKER.SEARCH_FLG
     *
     * @param searchFlg the value for STOCKER.SEARCH_FLG
     *
     * @mbg.generated
     */
    public void setSearchFlg(Short searchFlg) {
        this.searchFlg = searchFlg;
    }
}