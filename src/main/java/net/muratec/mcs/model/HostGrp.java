package net.muratec.mcs.model;

/* Hostポートグループ対応 - 制御側未対応のため、未使用 */
public class HostGrp {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column HOST_GRP.GROUP_ID
     * @mbg.generated
     */
    private String groupId;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column HOST_GRP.GROUP_TYPE
     * @mbg.generated
     */
    private Short groupType;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column HOST_GRP.SELECT_PRIORITY
     * @mbg.generated
     */
    private Short selectPriority;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column HOST_GRP.DESCRIPTION
     * @mbg.generated
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column HOST_GRP.GROUP_ID
     * @return  the value of HOST_GRP.GROUP_ID
     * @mbg.generated
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column HOST_GRP.GROUP_ID
     * @param groupId  the value for HOST_GRP.GROUP_ID
     * @mbg.generated
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column HOST_GRP.GROUP_TYPE
     * @return  the value of HOST_GRP.GROUP_TYPE
     * @mbg.generated
     */
    public Short getGroupType() {
        return groupType;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column HOST_GRP.GROUP_TYPE
     * @param groupType  the value for HOST_GRP.GROUP_TYPE
     * @mbg.generated
     */
    public void setGroupType(Short groupType) {
        this.groupType = groupType;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column HOST_GRP.SELECT_PRIORITY
     * @return  the value of HOST_GRP.SELECT_PRIORITY
     * @mbg.generated
     */
    public Short getSelectPriority() {
        return selectPriority;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column HOST_GRP.SELECT_PRIORITY
     * @param selectPriority  the value for HOST_GRP.SELECT_PRIORITY
     * @mbg.generated
     */
    public void setSelectPriority(Short selectPriority) {
        this.selectPriority = selectPriority;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column HOST_GRP.DESCRIPTION
     * @return  the value of HOST_GRP.DESCRIPTION
     * @mbg.generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column HOST_GRP.DESCRIPTION
     * @param description  the value for HOST_GRP.DESCRIPTION
     * @mbg.generated
     */
    public void setDescription(String description) {
        this.description = description;
    }
}