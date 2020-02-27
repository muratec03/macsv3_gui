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
public class PortsListEntity {

    public String portId;
    public String tscId;
    public String alarmText;
    public String available;
    public String ibsemAvail;
    public String portMode;
    public String carrierId;
    
}
