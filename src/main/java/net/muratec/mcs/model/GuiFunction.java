﻿package net.muratec.mcs.model;

public class GuiFunction {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column GUI_FUNCTION.FUNC_ID
     * @mbg.generated
     */
    private String funcId;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column GUI_FUNCTION.FUNCTION
     * @mbg.generated
     */
    private String function;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column GUI_FUNCTION.CATEGORY
     * @mbg.generated
     */
    private Short category;

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column GUI_FUNCTION.FUNC_ID
     * @return  the value of GUI_FUNCTION.FUNC_ID
     * @mbg.generated
     */
    public String getFuncId() {

        return funcId;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column GUI_FUNCTION.FUNC_ID
     * @param funcId  the value for GUI_FUNCTION.FUNC_ID
     * @mbg.generated
     */
    public void setFuncId(String funcId) {

        this.funcId = funcId;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column GUI_FUNCTION.FUNCTION
     * @return  the value of GUI_FUNCTION.FUNCTION
     * @mbg.generated
     */
    public String getFunction() {

        return function;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column GUI_FUNCTION.FUNCTION
     * @param function  the value for GUI_FUNCTION.FUNCTION
     * @mbg.generated
     */
    public void setFunction(String function) {

        this.function = function;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column GUI_FUNCTION.CATEGORY
     * @return  the value of GUI_FUNCTION.CATEGORY
     * @mbg.generated
     */
    public Short getCategory() {

        return category;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column GUI_FUNCTION.CATEGORY
     * @param category  the value for GUI_FUNCTION.CATEGORY
     * @mbg.generated
     */
    public void setCategory(Short category) {

        this.category = category;
    }
}
