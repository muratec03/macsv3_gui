package net.muratec.mcs.model;

public class Port {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PORT.PORT_ID
     *
     * @mbg.generated
     */
    private String portId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PORT.PORT_MODE
     *
     * @mbg.generated
     */
    private String portMode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PORT.MANAGEMENT_TSC_ID
     *
     * @mbg.generated
     */
    private Integer managementTscId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PORT.AVAILABLE
     *
     * @mbg.generated
     */
    private String available;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PORT.IBSEM_AVAIL
     *
     * @mbg.generated
     */
    private String ibsemAvail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PORT.PORT_ABBREVIATION
     *
     * @mbg.generated
     */
    private String portAbbreviation;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PORT.VENDOR_PORT_NAME
     *
     * @mbg.generated
     */
    private String vendorPortName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PORT.IDR_FLG
     *
     * @mbg.generated
     */
    private Short idrFlg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PORT.IDR_MODE
     *
     * @mbg.generated
     */
    private String idrMode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PORT.PORT_TYPE
     *
     * @mbg.generated
     */
    private Short portType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PORT.PORT_IO
     *
     * @mbg.generated
     */
    private String portIo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PORT.REJECT_PORT
     *
     * @mbg.generated
     */
    private String rejectPort;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PORT.E10_PORT_MODE
     *
     * @mbg.generated
     */
    private String e10PortMode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PORT.E10_SET_TIME
     *
     * @mbg.generated
     */
    private String e10SetTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PORT.ID_ERROR_COUNT
     *
     * @mbg.generated
     */
    private Short idErrorCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PORT.DPL_ERROR_COUNT
     *
     * @mbg.generated
     */
    private Short dplErrorCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PORT.INCORRECT_ERROR_COUNT
     *
     * @mbg.generated
     */
    private Short incorrectErrorCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PORT.WAITIN_RETRY_COUNT
     *
     * @mbg.generated
     */
    private Short waitinRetryCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PORT.DST_CHANGE_COUNT
     *
     * @mbg.generated
     */
    private Short dstChangeCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PORT.MODE_SET_TIME
     *
     * @mbg.generated
     */
    private String modeSetTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PORT.MODE_SET_SID
     *
     * @mbg.generated
     */
    private Integer modeSetSid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PORT.MODE_SET_ORIGINATOR
     *
     * @mbg.generated
     */
    private String modeSetOriginator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PORT.FLOOR
     *
     * @mbg.generated
     */
    private String floor;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PORT.PORT_ID
     *
     * @return the value of PORT.PORT_ID
     *
     * @mbg.generated
     */
    public String getPortId() {
        return portId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PORT.PORT_ID
     *
     * @param portId the value for PORT.PORT_ID
     *
     * @mbg.generated
     */
    public void setPortId(String portId) {
        this.portId = portId == null ? null : portId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PORT.PORT_MODE
     *
     * @return the value of PORT.PORT_MODE
     *
     * @mbg.generated
     */
    public String getPortMode() {
        return portMode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PORT.PORT_MODE
     *
     * @param portMode the value for PORT.PORT_MODE
     *
     * @mbg.generated
     */
    public void setPortMode(String portMode) {
        this.portMode = portMode == null ? null : portMode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PORT.MANAGEMENT_TSC_ID
     *
     * @return the value of PORT.MANAGEMENT_TSC_ID
     *
     * @mbg.generated
     */
    public Integer getManagementTscId() {
        return managementTscId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PORT.MANAGEMENT_TSC_ID
     *
     * @param managementTscId the value for PORT.MANAGEMENT_TSC_ID
     *
     * @mbg.generated
     */
    public void setManagementTscId(Integer managementTscId) {
        this.managementTscId = managementTscId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PORT.AVAILABLE
     *
     * @return the value of PORT.AVAILABLE
     *
     * @mbg.generated
     */
    public String getAvailable() {
        return available;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PORT.AVAILABLE
     *
     * @param available the value for PORT.AVAILABLE
     *
     * @mbg.generated
     */
    public void setAvailable(String available) {
        this.available = available == null ? null : available.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PORT.IBSEM_AVAIL
     *
     * @return the value of PORT.IBSEM_AVAIL
     *
     * @mbg.generated
     */
    public String getIbsemAvail() {
        return ibsemAvail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PORT.IBSEM_AVAIL
     *
     * @param ibsemAvail the value for PORT.IBSEM_AVAIL
     *
     * @mbg.generated
     */
    public void setIbsemAvail(String ibsemAvail) {
        this.ibsemAvail = ibsemAvail == null ? null : ibsemAvail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PORT.PORT_ABBREVIATION
     *
     * @return the value of PORT.PORT_ABBREVIATION
     *
     * @mbg.generated
     */
    public String getPortAbbreviation() {
        return portAbbreviation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PORT.PORT_ABBREVIATION
     *
     * @param portAbbreviation the value for PORT.PORT_ABBREVIATION
     *
     * @mbg.generated
     */
    public void setPortAbbreviation(String portAbbreviation) {
        this.portAbbreviation = portAbbreviation == null ? null : portAbbreviation.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PORT.VENDOR_PORT_NAME
     *
     * @return the value of PORT.VENDOR_PORT_NAME
     *
     * @mbg.generated
     */
    public String getVendorPortName() {
        return vendorPortName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PORT.VENDOR_PORT_NAME
     *
     * @param vendorPortName the value for PORT.VENDOR_PORT_NAME
     *
     * @mbg.generated
     */
    public void setVendorPortName(String vendorPortName) {
        this.vendorPortName = vendorPortName == null ? null : vendorPortName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PORT.IDR_FLG
     *
     * @return the value of PORT.IDR_FLG
     *
     * @mbg.generated
     */
    public Short getIdrFlg() {
        return idrFlg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PORT.IDR_FLG
     *
     * @param idrFlg the value for PORT.IDR_FLG
     *
     * @mbg.generated
     */
    public void setIdrFlg(Short idrFlg) {
        this.idrFlg = idrFlg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PORT.IDR_MODE
     *
     * @return the value of PORT.IDR_MODE
     *
     * @mbg.generated
     */
    public String getIdrMode() {
        return idrMode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PORT.IDR_MODE
     *
     * @param idrMode the value for PORT.IDR_MODE
     *
     * @mbg.generated
     */
    public void setIdrMode(String idrMode) {
        this.idrMode = idrMode == null ? null : idrMode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PORT.PORT_TYPE
     *
     * @return the value of PORT.PORT_TYPE
     *
     * @mbg.generated
     */
    public Short getPortType() {
        return portType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PORT.PORT_TYPE
     *
     * @param portType the value for PORT.PORT_TYPE
     *
     * @mbg.generated
     */
    public void setPortType(Short portType) {
        this.portType = portType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PORT.PORT_IO
     *
     * @return the value of PORT.PORT_IO
     *
     * @mbg.generated
     */
    public String getPortIo() {
        return portIo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PORT.PORT_IO
     *
     * @param portIo the value for PORT.PORT_IO
     *
     * @mbg.generated
     */
    public void setPortIo(String portIo) {
        this.portIo = portIo == null ? null : portIo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PORT.REJECT_PORT
     *
     * @return the value of PORT.REJECT_PORT
     *
     * @mbg.generated
     */
    public String getRejectPort() {
        return rejectPort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PORT.REJECT_PORT
     *
     * @param rejectPort the value for PORT.REJECT_PORT
     *
     * @mbg.generated
     */
    public void setRejectPort(String rejectPort) {
        this.rejectPort = rejectPort == null ? null : rejectPort.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PORT.E10_PORT_MODE
     *
     * @return the value of PORT.E10_PORT_MODE
     *
     * @mbg.generated
     */
    public String getE10PortMode() {
        return e10PortMode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PORT.E10_PORT_MODE
     *
     * @param e10PortMode the value for PORT.E10_PORT_MODE
     *
     * @mbg.generated
     */
    public void setE10PortMode(String e10PortMode) {
        this.e10PortMode = e10PortMode == null ? null : e10PortMode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PORT.E10_SET_TIME
     *
     * @return the value of PORT.E10_SET_TIME
     *
     * @mbg.generated
     */
    public String getE10SetTime() {
        return e10SetTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PORT.E10_SET_TIME
     *
     * @param e10SetTime the value for PORT.E10_SET_TIME
     *
     * @mbg.generated
     */
    public void setE10SetTime(String e10SetTime) {
        this.e10SetTime = e10SetTime == null ? null : e10SetTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PORT.ID_ERROR_COUNT
     *
     * @return the value of PORT.ID_ERROR_COUNT
     *
     * @mbg.generated
     */
    public Short getIdErrorCount() {
        return idErrorCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PORT.ID_ERROR_COUNT
     *
     * @param idErrorCount the value for PORT.ID_ERROR_COUNT
     *
     * @mbg.generated
     */
    public void setIdErrorCount(Short idErrorCount) {
        this.idErrorCount = idErrorCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PORT.DPL_ERROR_COUNT
     *
     * @return the value of PORT.DPL_ERROR_COUNT
     *
     * @mbg.generated
     */
    public Short getDplErrorCount() {
        return dplErrorCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PORT.DPL_ERROR_COUNT
     *
     * @param dplErrorCount the value for PORT.DPL_ERROR_COUNT
     *
     * @mbg.generated
     */
    public void setDplErrorCount(Short dplErrorCount) {
        this.dplErrorCount = dplErrorCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PORT.INCORRECT_ERROR_COUNT
     *
     * @return the value of PORT.INCORRECT_ERROR_COUNT
     *
     * @mbg.generated
     */
    public Short getIncorrectErrorCount() {
        return incorrectErrorCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PORT.INCORRECT_ERROR_COUNT
     *
     * @param incorrectErrorCount the value for PORT.INCORRECT_ERROR_COUNT
     *
     * @mbg.generated
     */
    public void setIncorrectErrorCount(Short incorrectErrorCount) {
        this.incorrectErrorCount = incorrectErrorCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PORT.WAITIN_RETRY_COUNT
     *
     * @return the value of PORT.WAITIN_RETRY_COUNT
     *
     * @mbg.generated
     */
    public Short getWaitinRetryCount() {
        return waitinRetryCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PORT.WAITIN_RETRY_COUNT
     *
     * @param waitinRetryCount the value for PORT.WAITIN_RETRY_COUNT
     *
     * @mbg.generated
     */
    public void setWaitinRetryCount(Short waitinRetryCount) {
        this.waitinRetryCount = waitinRetryCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PORT.DST_CHANGE_COUNT
     *
     * @return the value of PORT.DST_CHANGE_COUNT
     *
     * @mbg.generated
     */
    public Short getDstChangeCount() {
        return dstChangeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PORT.DST_CHANGE_COUNT
     *
     * @param dstChangeCount the value for PORT.DST_CHANGE_COUNT
     *
     * @mbg.generated
     */
    public void setDstChangeCount(Short dstChangeCount) {
        this.dstChangeCount = dstChangeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PORT.MODE_SET_TIME
     *
     * @return the value of PORT.MODE_SET_TIME
     *
     * @mbg.generated
     */
    public String getModeSetTime() {
        return modeSetTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PORT.MODE_SET_TIME
     *
     * @param modeSetTime the value for PORT.MODE_SET_TIME
     *
     * @mbg.generated
     */
    public void setModeSetTime(String modeSetTime) {
        this.modeSetTime = modeSetTime == null ? null : modeSetTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PORT.MODE_SET_SID
     *
     * @return the value of PORT.MODE_SET_SID
     *
     * @mbg.generated
     */
    public Integer getModeSetSid() {
        return modeSetSid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PORT.MODE_SET_SID
     *
     * @param modeSetSid the value for PORT.MODE_SET_SID
     *
     * @mbg.generated
     */
    public void setModeSetSid(Integer modeSetSid) {
        this.modeSetSid = modeSetSid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PORT.MODE_SET_ORIGINATOR
     *
     * @return the value of PORT.MODE_SET_ORIGINATOR
     *
     * @mbg.generated
     */
    public String getModeSetOriginator() {
        return modeSetOriginator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PORT.MODE_SET_ORIGINATOR
     *
     * @param modeSetOriginator the value for PORT.MODE_SET_ORIGINATOR
     *
     * @mbg.generated
     */
    public void setModeSetOriginator(String modeSetOriginator) {
        this.modeSetOriginator = modeSetOriginator == null ? null : modeSetOriginator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PORT.FLOOR
     *
     * @return the value of PORT.FLOOR
     *
     * @mbg.generated
     */
    public String getFloor() {
        return floor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PORT.FLOOR
     *
     * @param floor the value for PORT.FLOOR
     *
     * @mbg.generated
     */
    public void setFloor(String floor) {
        this.floor = floor == null ? null : floor.trim();
    }
}