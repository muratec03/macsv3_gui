package net.muratec.mcs.model;

public class McsRetCodeKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MCS_RET_CODE.CATEGORY
     *
     * @mbg.generated
     */
    private Short category;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MCS_RET_CODE.MCS_CODE
     *
     * @mbg.generated
     */
    private Long mcsCode;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MCS_RET_CODE.CATEGORY
     *
     * @return the value of MCS_RET_CODE.CATEGORY
     *
     * @mbg.generated
     */
    public Short getCategory() {
        return category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MCS_RET_CODE.CATEGORY
     *
     * @param category the value for MCS_RET_CODE.CATEGORY
     *
     * @mbg.generated
     */
    public void setCategory(Short category) {
        this.category = category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MCS_RET_CODE.MCS_CODE
     *
     * @return the value of MCS_RET_CODE.MCS_CODE
     *
     * @mbg.generated
     */
    public Long getMcsCode() {
        return mcsCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MCS_RET_CODE.MCS_CODE
     *
     * @param mcsCode the value for MCS_RET_CODE.MCS_CODE
     *
     * @mbg.generated
     */
    public void setMcsCode(Long mcsCode) {
        this.mcsCode = mcsCode;
    }
}