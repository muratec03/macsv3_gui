//@formatter:off
/**
 ******************************************************************************
 * @file        AlarmModel.java
 * @brief       アラーム情報表示画面用モデル
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
package net.muratec.mcs.model;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

//@formatter:off
/**
 ******************************************************************************
 * @brief     アラーム情報表示画面用モデルクラス
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
@Getter
@Setter
public class AlarmModel {

    private Timestamp occurrenceTime;
    private String alarmId;
    private String alarmCode;
    private String alarmSubCode;
    private String alarmLocation;
    private String alarmLevel;
    private String alarmText;
    private String errorId;
    private String classInformation;
    private String recoveryOption;
    private String machineId;
    private String zoneId;
    private String stockerUnitId;
    private String stockerUnitState;
    private String carrierJobId;
    private String amhsId;
    private String sourceLocation;
    private String destinationLocation;
    private String type;
    private String carrierId;
    private String eqpInfo;
    private Integer amhsType;        // MACS4#0114 Add
}
