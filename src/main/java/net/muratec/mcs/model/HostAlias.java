﻿package net.muratec.mcs.model;

public class HostAlias extends HostAliasKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column HOST_ALIAS.ALIAS
     *
     * @mbg.generated
     */
    private String alias;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column HOST_ALIAS.ALIAS
     *
     * @return the value of HOST_ALIAS.ALIAS
     *
     * @mbg.generated
     */
    public String getAlias() {
        return alias;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column HOST_ALIAS.ALIAS
     *
     * @param alias the value for HOST_ALIAS.ALIAS
     *
     * @mbg.generated
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }
}
