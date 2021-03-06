package net.muratec.mcs.model;

public class Tsc {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TSC.TSC_ID
     *
     * @mbg.generated
     */
    private String tscId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TSC.LLC_ID
     *
     * @mbg.generated
     */
    private String llcId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TSC.HOST_ID
     *
     * @mbg.generated
     */
    private String hostId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TSC.TSC_NAME
     *
     * @mbg.generated
     */
    private String tscName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TSC.VENDOR_TSC_NAME
     *
     * @mbg.generated
     */
    private String vendorTscName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TSC.TSC_MODE
     *
     * @mbg.generated
     */
    private String tscMode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TSC.TSC_MODE_SET_TIME
     *
     * @mbg.generated
     */
    private String tscModeSetTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TSC.TSC_MODE_SET_ORIGINATOR
     *
     * @mbg.generated
     */
    private String tscModeSetOriginator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TSC.AVAILABLE
     *
     * @mbg.generated
     */
    private String available;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TSC.ALARM_STATE
     *
     * @mbg.generated
     */
    private String alarmState;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TSC.CLEAN_LEVEL
     *
     * @mbg.generated
     */
    private String cleanLevel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TSC.H_SHOW_STATE
     *
     * @mbg.generated
     */
    private String hShowState;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TSC.H_SHOW_STATE_SET_TIME
     *
     * @mbg.generated
     */
    private String hShowStateSetTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TSC.DUMMY_FLG
     *
     * @mbg.generated
     */
    private String dummyFlg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TSC.DUMMY_SEQ
     *
     * @mbg.generated
     */
    private Integer dummySeq;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TSC.E10_STATE
     *
     * @mbg.generated
     */
    private String e10State;
    
	// STD APL 2020.02.27 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
    private String downCount;
	private String llcType;
    private String moduleName;
    private String total;
    private String occupied;
    private String empty;
    private String reserve;
    
    public String getDownCount() {
    	return downCount;
    }
    
    public void setDownCount(String downCount) {
    	this.downCount = downCount;
    }
    
    public String getLlcType() {
    	return llcType;
    }
    
    public void setLlcType(String llcType) {
    	this.llcType = llcType;
    }
    
    public String getModuleName() {
    	return moduleName;
    }
    
    public void setModuleName(String moduleName) {
    	this.moduleName = moduleName;
    }
    
    public String getTotal() {
    	return total;
    }
    
    public void setTotal(String total) {
    	this.total = total;
    }
    
    public String getOccupied() {
    	return occupied;
    }
    
    public void setOccupied(String occupied) {
    	this.occupied = occupied;
    }
    
    public String getEmpty() {
    	return empty;
    }
    
    public void setEmpty(String empty) {
    	this.empty = empty;
    }
    
    public String getReserve() {
    	return reserve;
    }
    
    public void setReserve(String reserve) {
    	this.reserve = reserve;
    }
    // END APL 2020.02.27 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
    

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TSC.TSC_ID
     *
     * @return the value of TSC.TSC_ID
     *
     * @mbg.generated
     */
    public String getTscId() {
        return tscId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TSC.TSC_ID
     *
     * @param tscId the value for TSC.TSC_ID
     *
     * @mbg.generated
     */
    public void setTscId(String tscId) {
        this.tscId = tscId == null ? null : tscId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TSC.LLC_ID
     *
     * @return the value of TSC.LLC_ID
     *
     * @mbg.generated
     */
    public String getLlcId() {
        return llcId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TSC.LLC_ID
     *
     * @param llcId the value for TSC.LLC_ID
     *
     * @mbg.generated
     */
    public void setLlcId(String llcId) {
        this.llcId = llcId == null ? null : llcId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TSC.HOST_ID
     *
     * @return the value of TSC.HOST_ID
     *
     * @mbg.generated
     */
    public String getHostId() {
        return hostId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TSC.HOST_ID
     *
     * @param hostId the value for TSC.HOST_ID
     *
     * @mbg.generated
     */
    public void setHostId(String hostId) {
        this.hostId = hostId == null ? null : hostId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TSC.TSC_NAME
     *
     * @return the value of TSC.TSC_NAME
     *
     * @mbg.generated
     */
    public String getTscName() {
        return tscName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TSC.TSC_NAME
     *
     * @param tscName the value for TSC.TSC_NAME
     *
     * @mbg.generated
     */
    public void setTscName(String tscName) {
        this.tscName = tscName == null ? null : tscName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TSC.VENDOR_TSC_NAME
     *
     * @return the value of TSC.VENDOR_TSC_NAME
     *
     * @mbg.generated
     */
    public String getVendorTscName() {
        return vendorTscName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TSC.VENDOR_TSC_NAME
     *
     * @param vendorTscName the value for TSC.VENDOR_TSC_NAME
     *
     * @mbg.generated
     */
    public void setVendorTscName(String vendorTscName) {
        this.vendorTscName = vendorTscName == null ? null : vendorTscName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TSC.TSC_MODE
     *
     * @return the value of TSC.TSC_MODE
     *
     * @mbg.generated
     */
    public String getTscMode() {
        return tscMode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TSC.TSC_MODE
     *
     * @param tscMode the value for TSC.TSC_MODE
     *
     * @mbg.generated
     */
    public void setTscMode(String tscMode) {
        this.tscMode = tscMode == null ? null : tscMode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TSC.TSC_MODE_SET_TIME
     *
     * @return the value of TSC.TSC_MODE_SET_TIME
     *
     * @mbg.generated
     */
    public String getTscModeSetTime() {
        return tscModeSetTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TSC.TSC_MODE_SET_TIME
     *
     * @param tscModeSetTime the value for TSC.TSC_MODE_SET_TIME
     *
     * @mbg.generated
     */
    public void setTscModeSetTime(String tscModeSetTime) {
        this.tscModeSetTime = tscModeSetTime == null ? null : tscModeSetTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TSC.TSC_MODE_SET_ORIGINATOR
     *
     * @return the value of TSC.TSC_MODE_SET_ORIGINATOR
     *
     * @mbg.generated
     */
    public String getTscModeSetOriginator() {
        return tscModeSetOriginator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TSC.TSC_MODE_SET_ORIGINATOR
     *
     * @param tscModeSetOriginator the value for TSC.TSC_MODE_SET_ORIGINATOR
     *
     * @mbg.generated
     */
    public void setTscModeSetOriginator(String tscModeSetOriginator) {
        this.tscModeSetOriginator = tscModeSetOriginator == null ? null : tscModeSetOriginator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TSC.AVAILABLE
     *
     * @return the value of TSC.AVAILABLE
     *
     * @mbg.generated
     */
    public String getAvailable() {
        return available;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TSC.AVAILABLE
     *
     * @param available the value for TSC.AVAILABLE
     *
     * @mbg.generated
     */
    public void setAvailable(String available) {
        this.available = available == null ? null : available.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TSC.ALARM_STATE
     *
     * @return the value of TSC.ALARM_STATE
     *
     * @mbg.generated
     */
    public String getAlarmState() {
        return alarmState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TSC.ALARM_STATE
     *
     * @param alarmState the value for TSC.ALARM_STATE
     *
     * @mbg.generated
     */
    public void setAlarmState(String alarmState) {
        this.alarmState = alarmState == null ? null : alarmState.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TSC.CLEAN_LEVEL
     *
     * @return the value of TSC.CLEAN_LEVEL
     *
     * @mbg.generated
     */
    public String getCleanLevel() {
        return cleanLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TSC.CLEAN_LEVEL
     *
     * @param cleanLevel the value for TSC.CLEAN_LEVEL
     *
     * @mbg.generated
     */
    public void setCleanLevel(String cleanLevel) {
        this.cleanLevel = cleanLevel == null ? null : cleanLevel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TSC.H_SHOW_STATE
     *
     * @return the value of TSC.H_SHOW_STATE
     *
     * @mbg.generated
     */
    public String gethShowState() {
        return hShowState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TSC.H_SHOW_STATE
     *
     * @param hShowState the value for TSC.H_SHOW_STATE
     *
     * @mbg.generated
     */
    public void sethShowState(String hShowState) {
        this.hShowState = hShowState == null ? null : hShowState.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TSC.H_SHOW_STATE_SET_TIME
     *
     * @return the value of TSC.H_SHOW_STATE_SET_TIME
     *
     * @mbg.generated
     */
    public String gethShowStateSetTime() {
        return hShowStateSetTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TSC.H_SHOW_STATE_SET_TIME
     *
     * @param hShowStateSetTime the value for TSC.H_SHOW_STATE_SET_TIME
     *
     * @mbg.generated
     */
    public void sethShowStateSetTime(String hShowStateSetTime) {
        this.hShowStateSetTime = hShowStateSetTime == null ? null : hShowStateSetTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TSC.DUMMY_FLG
     *
     * @return the value of TSC.DUMMY_FLG
     *
     * @mbg.generated
     */
    public String getDummyFlg() {
        return dummyFlg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TSC.DUMMY_FLG
     *
     * @param dummyFlg the value for TSC.DUMMY_FLG
     *
     * @mbg.generated
     */
    public void setDummyFlg(String dummyFlg) {
        this.dummyFlg = dummyFlg == null ? null : dummyFlg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TSC.DUMMY_SEQ
     *
     * @return the value of TSC.DUMMY_SEQ
     *
     * @mbg.generated
     */
    public Integer getDummySeq() {
        return dummySeq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TSC.DUMMY_SEQ
     *
     * @param dummySeq the value for TSC.DUMMY_SEQ
     *
     * @mbg.generated
     */
    public void setDummySeq(Integer dummySeq) {
        this.dummySeq = dummySeq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TSC.E10_STATE
     *
     * @return the value of TSC.E10_STATE
     *
     * @mbg.generated
     */
    public String getE10State() {
        return e10State;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TSC.E10_STATE
     *
     * @param e10State the value for TSC.E10_STATE
     *
     * @mbg.generated
     */
    public void setE10State(String e10State) {
        this.e10State = e10State == null ? null : e10State.trim();
    }
}