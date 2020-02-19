﻿package net.muratec.mcs.model;

public class RouteDetail extends RouteDetailKey {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column ROUTE_DETAIL.AMHS_ID
     * @mbg.generated
     */
    private String amhsId;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column ROUTE_DETAIL.NODE_ID
     * @mbg.generated
     */
    private String nodeId;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column ROUTE_DETAIL.SRC_LOC
     * @mbg.generated
     */
    private String srcLoc;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column ROUTE_DETAIL.DST_LOC
     * @mbg.generated
     */
    private String dstLoc;

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column ROUTE_DETAIL.AMHS_ID
     * @return  the value of ROUTE_DETAIL.AMHS_ID
     * @mbg.generated
     */
    public String getAmhsId() {

        return amhsId;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column ROUTE_DETAIL.AMHS_ID
     * @param amhsId  the value for ROUTE_DETAIL.AMHS_ID
     * @mbg.generated
     */
    public void setAmhsId(String amhsId) {

        this.amhsId = amhsId;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column ROUTE_DETAIL.NODE_ID
     * @return  the value of ROUTE_DETAIL.NODE_ID
     * @mbg.generated
     */
    public String getNodeId() {

        return nodeId;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column ROUTE_DETAIL.NODE_ID
     * @param nodeId  the value for ROUTE_DETAIL.NODE_ID
     * @mbg.generated
     */
    public void setNodeId(String nodeId) {

        this.nodeId = nodeId;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column ROUTE_DETAIL.SRC_LOC
     * @return  the value of ROUTE_DETAIL.SRC_LOC
     * @mbg.generated
     */
    public String getSrcLoc() {

        return srcLoc;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column ROUTE_DETAIL.SRC_LOC
     * @param srcLoc  the value for ROUTE_DETAIL.SRC_LOC
     * @mbg.generated
     */
    public void setSrcLoc(String srcLoc) {

        this.srcLoc = srcLoc;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column ROUTE_DETAIL.DST_LOC
     * @return  the value of ROUTE_DETAIL.DST_LOC
     * @mbg.generated
     */
    public String getDstLoc() {

        return dstLoc;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column ROUTE_DETAIL.DST_LOC
     * @param dstLoc  the value for ROUTE_DETAIL.DST_LOC
     * @mbg.generated
     */
    public void setDstLoc(String dstLoc) {

        this.dstLoc = dstLoc;
    }
}
