package net.muratec.mcs.model;

public class StockerZoneKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column STOCKER_ZONE.LLC_ID
     *
     * @mbg.generated
     */
    private String llcId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column STOCKER_ZONE.TSC_ID
     *
     * @mbg.generated
     */
    private String tscId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column STOCKER_ZONE.ZONE_ID
     *
     * @mbg.generated
     */
    private String zoneId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STOCKER_ZONE.LLC_ID
     *
     * @return the value of STOCKER_ZONE.LLC_ID
     *
     * @mbg.generated
     */
    public String getLlcId() {
        return llcId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STOCKER_ZONE.LLC_ID
     *
     * @param llcId the value for STOCKER_ZONE.LLC_ID
     *
     * @mbg.generated
     */
    public void setLlcId(String llcId) {
        this.llcId = llcId == null ? null : llcId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STOCKER_ZONE.TSC_ID
     *
     * @return the value of STOCKER_ZONE.TSC_ID
     *
     * @mbg.generated
     */
    public String getTscId() {
        return tscId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STOCKER_ZONE.TSC_ID
     *
     * @param tscId the value for STOCKER_ZONE.TSC_ID
     *
     * @mbg.generated
     */
    public void setTscId(String tscId) {
        this.tscId = tscId == null ? null : tscId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STOCKER_ZONE.ZONE_ID
     *
     * @return the value of STOCKER_ZONE.ZONE_ID
     *
     * @mbg.generated
     */
    public String getZoneId() {
        return zoneId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STOCKER_ZONE.ZONE_ID
     *
     * @param zoneId the value for STOCKER_ZONE.ZONE_ID
     *
     * @mbg.generated
     */
    public void setZoneId(String zoneId) {
        this.zoneId = zoneId == null ? null : zoneId.trim();
    }
}