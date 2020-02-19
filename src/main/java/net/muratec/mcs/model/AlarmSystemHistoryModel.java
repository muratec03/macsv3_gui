//@formatter:off
/**
 ******************************************************************************
 * @file        AlarmSystemHistoryModel.java
 * @brief       アラームシステム来歴 一覧連携用モデル
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
 * 2018/10/02 MACS4#0001  AlarmSystem対応(STEP2) 登録画面、ログ             CSC
 * 2018/11/12 MACS4#0039  AlarmSystem 送信・表示内容修正              T.Iga/CSC
 ******************************************************************************
 */
//@formatter:on
package net.muratec.mcs.model;

import lombok.Getter;
import lombok.Setter;

//@formatter:off
/**
 ******************************************************************************
 * @brief     アラームシステム来歴 一覧連携用モデルクラス
 * @par       機能:
 * @attention
 * @note
 * ----------------------------------------------------------------------------
 * VER.        DESCRIPTION                                               AUTHOR
 * ----------------------------------------------------------------------------
 * MACS4#0039  AlarmSystem 送信・表示内容修正                         T.Iga/CSC
 ******************************************************************************
 */
//@formatter:on
@Getter
@Setter
public class AlarmSystemHistoryModel {
//  private String time;        // MACS4#0039 Del
    private String sndTime;     // MACS4#0039 Add
    private String rcvTime;
    private String result;
    private String hostAlarmId;
    private String eqpType;
    private String subject;
    private String content;
}
