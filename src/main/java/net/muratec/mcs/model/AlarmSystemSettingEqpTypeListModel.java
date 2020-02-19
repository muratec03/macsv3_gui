//@formatter:off
/**
 ******************************************************************************
 * @file        AlarmSystemSettingEqpTypeListModel.java
 * @brief       アラームシステム設定 – EQP Type 一覧用モデル
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
 ******************************************************************************
 */
//@formatter:on
package net.muratec.mcs.model;

import lombok.Getter;
import lombok.Setter;

//@formatter:off
/**
 ******************************************************************************
 * @brief     アラームシステム設定 – EQP Type 一覧用モデルクラス
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
public class AlarmSystemSettingEqpTypeListModel {

    private String eqpType;

}
