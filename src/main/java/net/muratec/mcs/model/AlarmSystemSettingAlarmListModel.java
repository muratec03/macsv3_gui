//@formatter:off
/**
 ******************************************************************************
 * @file        AlarmSystemSettingAlarmListModel.java
 * @brief       アラームシステム アラーム一覧モデル
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
 * 2018/10/29 MACS4#0027  AlarmSystem対応(STEP2) 登録画面、ログ（改訂分）   CSC
 ******************************************************************************
 */
//@formatter:on
package net.muratec.mcs.model;

import lombok.Getter;
import lombok.Setter;

//@formatter:off
/**
 ******************************************************************************
 * @brief     アラーム一覧用モデルクラス
 * @par       機能:
 * @attention
 * @note
 * ----------------------------------------------------------------------------
 * VER.        DESCRIPTION                                               AUTHOR
 * ----------------------------------------------------------------------------
 * MACS4#0027  AlarmSystem対応(STEP2) 登録画面、ログ（改訂分）              CSC
 ******************************************************************************
 */
//@formatter:on
@Getter
@Setter
public class AlarmSystemSettingAlarmListModel {

    // MACS4#0027 Del Start
//  private Short enable;
//  private Long mcsAlarmId;
//  private String hostAlarmId;
//  private String eqpType;
//  private String subject;
//  private String selectContent;
//  private String content;
    // MACS4#0027 Del End

    // MACS4#0027 Add Start
    private Short enable;
    private Long mcsAlarmId;
    private String hostAlarmId;
    private String eqpType;
    private String selectSubject;
    private String hostSubject;
    private String defaultSubject;
    private String selectContent;
    private String hostContent;
    private String defaultContent;
    // MACS4#0027 Add End

}
