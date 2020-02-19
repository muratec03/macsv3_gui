//@formatter:off
/**
 ******************************************************************************
 * @file        SystemMonitorEntity.java
 * @brief      システムモニタ表示画面ステータス情報データエンティティ
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
 * 2017/03/31 0.2         Step2_2リリース                                   CSC
 ******************************************************************************
 */
//@formatter:on
package net.muratec.mcs.entity.top;

//@formatter:off
/**
 ******************************************************************************
 * @brief     システムモニタ表示画面ステータス情報データクラス
 * @par       メソッド無
 *
 * @attention
 * @note
 * ----------------------------------------------------------------------------
 * VER.        DESCRIPTION                                               AUTHOR
 * ----------------------------------------------------------------------------
 ******************************************************************************
 */
//@formatter:on
public class SystemMonitorEntity {

    public String commState;
    public String controlState;
    public String mcsVer;
    public String guiVer;
    public String userId;
    public String userName;
    public String description;
    public String autoLogoutTime;

}
