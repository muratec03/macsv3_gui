package net.muratec.mcs.model;

public class EjectDeviceKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EJECT_DEVICE.KEY
     *
     * @mbg.generated
     */
    private String key;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EJECT_DEVICE.EJECT_PRIORITY
     *
     * @mbg.generated
     */
    private Short ejectPriority;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EJECT_DEVICE.KEY
     *
     * @return the value of EJECT_DEVICE.KEY
     *
     * @mbg.generated
     */
    public String getKey() {
        return key;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EJECT_DEVICE.KEY
     *
     * @param key the value for EJECT_DEVICE.KEY
     *
     * @mbg.generated
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EJECT_DEVICE.EJECT_PRIORITY
     *
     * @return the value of EJECT_DEVICE.EJECT_PRIORITY
     *
     * @mbg.generated
     */
    public Short getEjectPriority() {
        return ejectPriority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EJECT_DEVICE.EJECT_PRIORITY
     *
     * @param ejectPriority the value for EJECT_DEVICE.EJECT_PRIORITY
     *
     * @mbg.generated
     */
    public void setEjectPriority(Short ejectPriority) {
        this.ejectPriority = ejectPriority;
    }
}