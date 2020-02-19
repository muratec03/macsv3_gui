﻿package net.muratec.mcs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import net.muratec.mcs.entity.common.AjaxDataTablesReqBaseEntity;
import net.muratec.mcs.model.CarrierShape;
import net.muratec.mcs.model.CarrierShapeExample;
import net.muratec.mcs.model.CarrierShapeModel;

public interface CarrierShapeMapper {

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table CARRIER_SHAPE
     * @mbg.generated
     */
    long countByExample(CarrierShapeExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table CARRIER_SHAPE
     * @mbg.generated
     */
    int deleteByExample(CarrierShapeExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table CARRIER_SHAPE
     * @mbg.generated
     */
    int deleteByPrimaryKey(Short carrierShapeId);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table CARRIER_SHAPE
     * @mbg.generated
     */
    int insert(CarrierShape record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table CARRIER_SHAPE
     * @mbg.generated
     */
    int insertSelective(CarrierShape record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table CARRIER_SHAPE
     * @mbg.generated
     */
    List<CarrierShape> selectByExample(CarrierShapeExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table CARRIER_SHAPE
     * @mbg.generated
     */
    CarrierShape selectByPrimaryKey(Short carrierShapeId);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table CARRIER_SHAPE
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") CarrierShape record, @Param("example") CarrierShapeExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table CARRIER_SHAPE
     * @mbg.generated
     */
    int updateByExample(@Param("record") CarrierShape record, @Param("example") CarrierShapeExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table CARRIER_SHAPE
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CarrierShape record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table CARRIER_SHAPE
     * @mbg.generated
     */
    int updateByPrimaryKey(CarrierShape record);

    // =============================
    // MCS Unique Function From Here
    // =============================
    //@formatter:off
    /**
     ******************************************************************************
     * @brief       Get All CarrierShape ID
     * @param
     * @return      CARRIER_SHAPE_ID
     * @retval      List of String Style
     * @attention
     * @note        Get All CarrierShape ID.
     * ----------------------------------------------------------------------------
     * DATE       VER.        DESCRIPTION                                    AUTHOR
     * ----------------------------------------------------------------------------
     ******************************************************************************
     */
    //@formatter:on
    List<String> getCarrierShapeId();

    //@formatter:off
    /**
     ******************************************************************************
     * @brief     getCarrierShapeCount (Get the total number of records in Carrier Shape list)
     * @param
     * @return    The total number of records in Carrier Shape list
     * @retval    Integer Style
     * @attention
     * @note      SQL-0397
     * ----------------------------------------------------------------------------
     * VER.        DESCRIPTION                                               AUTHOR
     * ----------------------------------------------------------------------------
     ******************************************************************************
     */
    //@formatter:on
    int getCarrierShapeCount();

    //@formatter:off
    /**
     ******************************************************************************
     * @brief     getCarrierShapeList (Select Carrier Shape List (RowNum))
     * @param     reqEntity    (Screen Info)
     * @return    Carrier Shape List
     * @retval    List Style
     * @attention
     * @note      SQL-0396
     * ----------------------------------------------------------------------------
     * VER.        DESCRIPTION                                               AUTHOR
     * ----------------------------------------------------------------------------
     ******************************************************************************
     */
    //@formatter:on
    List<CarrierShapeModel> getCarrierShapeList(AjaxDataTablesReqBaseEntity reqEntity);

}
