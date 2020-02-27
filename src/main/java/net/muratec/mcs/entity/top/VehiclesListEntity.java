//@formatter:off
/**
 ******************************************************************************
 * @file        VehiclesListEntity.java
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
public class VehiclesListEntity {
    public String vehicleId;
    public String llcName;
    public String alarmText;
    public String vehicleKind;
    public String vehicleState;   
}
