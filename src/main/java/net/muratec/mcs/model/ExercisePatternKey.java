﻿package net.muratec.mcs.model;

public class ExercisePatternKey {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column EXERCISE_PATTERN.PATTERN_ID
     * @mbg.generated
     */
    private String patternId;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column EXERCISE_PATTERN.ORDER_NO
     * @mbg.generated
     */
    private Short orderNo;

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column EXERCISE_PATTERN.PATTERN_ID
     * @return  the value of EXERCISE_PATTERN.PATTERN_ID
     * @mbg.generated
     */
    public String getPatternId() {

        return patternId;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column EXERCISE_PATTERN.PATTERN_ID
     * @param patternId  the value for EXERCISE_PATTERN.PATTERN_ID
     * @mbg.generated
     */
    public void setPatternId(String patternId) {

        this.patternId = patternId;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column EXERCISE_PATTERN.ORDER_NO
     * @return  the value of EXERCISE_PATTERN.ORDER_NO
     * @mbg.generated
     */
    public Short getOrderNo() {

        return orderNo;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column EXERCISE_PATTERN.ORDER_NO
     * @param orderNo  the value for EXERCISE_PATTERN.ORDER_NO
     * @mbg.generated
     */
    public void setOrderNo(Short orderNo) {

        this.orderNo = orderNo;
    }
}
