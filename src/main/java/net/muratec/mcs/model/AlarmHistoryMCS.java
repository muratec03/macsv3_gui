//@formatter:off
/**
 ******************************************************************************
 * @file        AlarmHistoryMCS.java
 * @brief       アラーム来歴 一覧連携用モデル
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
 ******************************************************************************
 */
//@formatter:on
package net.muratec.mcs.model;

import lombok.Getter;
import lombok.Setter;

//@formatter:off
/**
 ******************************************************************************
 * @brief     アラーム来歴 一覧連携用モデルクラス
 * @par       機能:
 * @attention
 * @note
 * ----------------------------------------------------------------------------
 * VER.        DESCRIPTION                                               AUTHOR
 * ----------------------------------------------------------------------------
 ******************************************************************************
 */
//@formatter:on
@Getter
@Setter
public class AlarmHistoryMCS {

    private String time;

    private String setTime;

    private Long alarmId;

    private Long alarmSubCode;

    private String alarmLoc;

    private String alarmLevel;

    private Short alarmLevelCode;

    private String alarmText;

    private String errorId;

    private String clazz;

    private String recoveryOption;

    private String machineId;

    private String zoneId;

    private String stockerUnitId;

    private String stockerUnitState;

    private String carrierJobId;

    private String amhsName;

    private String srcLoc;

    private String dstLoc;

    private String amhsType;

    private String carrierId;

    private String clearTime;

    private String eqpInfo;
}
