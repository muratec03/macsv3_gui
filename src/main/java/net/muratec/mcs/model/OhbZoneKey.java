package net.muratec.mcs.model;

public class OhbZoneKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OHB_ZONE.TSC_ID
     *
     * @mbg.generated
     */
    private String tscId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OHB_ZONE.OHB_ZONE_ID
     *
     * @mbg.generated
     */
    private String ohbZoneId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OHB_ZONE.TSC_ID
     *
     * @return the value of OHB_ZONE.TSC_ID
     *
     * @mbg.generated
     */
    public String getTscId() {
        return tscId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OHB_ZONE.TSC_ID
     *
     * @param tscId the value for OHB_ZONE.TSC_ID
     *
     * @mbg.generated
     */
    public void setTscId(String tscId) {
        this.tscId = tscId == null ? null : tscId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OHB_ZONE.OHB_ZONE_ID
     *
     * @return the value of OHB_ZONE.OHB_ZONE_ID
     *
     * @mbg.generated
     */
    public String getOhbZoneId() {
        return ohbZoneId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OHB_ZONE.OHB_ZONE_ID
     *
     * @param ohbZoneId the value for OHB_ZONE.OHB_ZONE_ID
     *
     * @mbg.generated
     */
    public void setOhbZoneId(String ohbZoneId) {
        this.ohbZoneId = ohbZoneId == null ? null : ohbZoneId.trim();
    }
}