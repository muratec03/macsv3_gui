package net.muratec.mcs.model;

public class EmptyCarrierDistribution extends EmptyCarrierDistributionKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMPTY_CARRIER_DISTRIBUTION.DISTRIBUTION_CONTROLLER_ID
     *
     * @mbg.generated
     */
    private String distributionControllerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMPTY_CARRIER_DISTRIBUTION.FLAG
     *
     * @mbg.generated
     */
    private Short flag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMPTY_CARRIER_DISTRIBUTION.DISTRIBUTION_CONTROLLER_ID
     *
     * @return the value of EMPTY_CARRIER_DISTRIBUTION.DISTRIBUTION_CONTROLLER_ID
     *
     * @mbg.generated
     */
    public String getDistributionControllerId() {
        return distributionControllerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMPTY_CARRIER_DISTRIBUTION.DISTRIBUTION_CONTROLLER_ID
     *
     * @param distributionControllerId the value for EMPTY_CARRIER_DISTRIBUTION.DISTRIBUTION_CONTROLLER_ID
     *
     * @mbg.generated
     */
    public void setDistributionControllerId(String distributionControllerId) {
        this.distributionControllerId = distributionControllerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMPTY_CARRIER_DISTRIBUTION.FLAG
     *
     * @return the value of EMPTY_CARRIER_DISTRIBUTION.FLAG
     *
     * @mbg.generated
     */
    public Short getFlag() {
        return flag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMPTY_CARRIER_DISTRIBUTION.FLAG
     *
     * @param flag the value for EMPTY_CARRIER_DISTRIBUTION.FLAG
     *
     * @mbg.generated
     */
    public void setFlag(Short flag) {
        this.flag = flag;
    }
}