package net.muratec.mcs.mapper;

import java.util.List;

import net.muratec.mcs.model.Host;
import net.muratec.mcs.model.Macs;
import net.muratec.mcs.model.MacsExample;
import org.apache.ibatis.annotations.Param;

public interface MacsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MACS
     *
     * @mbggenerated Wed Mar 04 06:38:21 CST 2020
     */
    int countByExample(MacsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MACS
     *
     * @mbggenerated Wed Mar 04 06:38:21 CST 2020
     */
    int deleteByExample(MacsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MACS
     *
     * @mbggenerated Wed Mar 04 06:38:21 CST 2020
     */
    int insert(Macs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MACS
     *
     * @mbggenerated Wed Mar 04 06:38:21 CST 2020
     */
    int insertSelective(Macs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MACS
     *
     * @mbggenerated Wed Mar 04 06:38:21 CST 2020
     */
    List<Macs> selectByExample(MacsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MACS
     *
     * @mbggenerated Wed Mar 04 06:38:21 CST 2020
     */
    int updateByExampleSelective(@Param("record") Macs record, @Param("example") MacsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MACS
     *
     * @mbggenerated Wed Mar 04 06:38:21 CST 2020
     */
    int updateByExample(@Param("record") Macs record, @Param("example") MacsExample example);
    
    //ADD STD APL 2020.03.04 song 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
    //@formatter:off
    /**
     ******************************************************************************
     * @brief       Select All Macs List
     * @param
     * @return      Macs List
     * @retval      List of Macs
     * @attention
     * @note        Select all Macs List.
     * ----------------------------------------------------------------------------
     * DATE       VER.        DESCRIPTION                                    AUTHOR
     * ----------------------------------------------------------------------------
     ******************************************************************************
     */
     //@formatter:on
     List<Macs> selectAll();
     //ADD END APL 2020.03.04 song 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000
}