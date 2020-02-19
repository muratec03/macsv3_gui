//@formatter:off
/**
 ******************************************************************************
 * @file        HostAlarmInfoModel.java
 * @brief       Host構成 アラームレポート一覧用モデル
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
 * 2018/10/01 v1.0.0      初版作成                                          CSC
 ******************************************************************************
 */
//@formatter:on
package net.muratec.mcs.model;

import lombok.Getter;
import lombok.Setter;

//@formatter:off
/**
 ******************************************************************************
 * @brief     Host構成 アラームレポート一覧用モデルクラス
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
public class HostAlarmInfoModel {

    private Long alarmId = 0L;
    private Long subCode = 0L;
    private Short alarmSet = 0;
    private String hostAlarmCode = "";
    private String hostAlarmId = "";
    private String hostAlarmCategory = "";
    private String hostAlarmTextForm = "";
    private String description = "";
    private Short reportFlag = 0;
    private String alarmSetStr = "";

}
