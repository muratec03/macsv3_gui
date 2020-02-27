//@formatter:off
/**
 ******************************************************************************
 * @file        AlarmListEntity.java
 * @brief       アラーム情報画面連携用エンティティ
 * @par
 * @author      CSC
 * $Id:         $
 * @attention
 *
 * Copyright (c) 2016 MURATA MACHINERY,LTD. All rights reserved.
 *
 * @note        Tabstop=4
 * ----------------------------------------------------------------------------
 * DATE       VER.        DESCRIPTION                                    AUTHOR
 * ----------------------------------------------------------------------------
 * 2017/01/31 0.2         Step2_1リリース                                   CSC
 * 2019/03/12 MACS4#0114  GUI MCSAlarmクリア対応                      T.Iga/CSC
 ******************************************************************************
 */
//@formatter:on
package net.muratec.mcs.entity.top;

//@formatter:off
/**
 ******************************************************************************
 * @brief     アラーム情報画面連携用エンティティクラス
 * @par       機能:
 * @attention
 * @note
 * ----------------------------------------------------------------------------
 * VER.        DESCRIPTION                                               AUTHOR
 * ----------------------------------------------------------------------------
 * MACS4#0114  GUI MCSAlarmクリア対応                                 T.Iga/CSC
 ******************************************************************************
 */
//@formatter:on
public class AlarmListEntity {

    public String occurrenceTime;
    public String alarmId;
    public String alarmCode;
    public String alarmSubCode;
    public String alarmLocation;
    public String alarmLevel;
    public String alarmText;
    public String errorId;
    public String classInformation;
    public String recoveryOption;
    public String machineId;
    public String zoneId;
    public String stockerUnitId;
    public String stockerUnitState;
    public String carrierJobId;
    public String amhsId;
    public String sourceLocation;
    public String destinationLocation;
    public String type;
    public String carrierId;
    public String eqpInfo;
    public String setTime;          // MACS4#0114 Add
    public String amhsType;         // MACS4#0114 Add
    //ADD STD APL 2020.02.22 song 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000
    public String llcId;
    public String llcName;
    //ADD END APL 2020.02.22 song 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000
}
