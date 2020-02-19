//@formatter:off
/**
 ******************************************************************************
 * @file        CarrierModel.java
 * @brief       キャリア情報用モデル
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
 * 2016/12/26 0.1         Step1リリース                                     CSC
 * 2018/10/23 MACS4#0021  LotID,ProductID表示                         T.Iga/CSC
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
 * @brief     キャリア情報用モデルクラス
 * @par       機能:
 * @attention
 * @note
 * ----------------------------------------------------------------------------
 * VER.        DESCRIPTION                                               AUTHOR
 * ----------------------------------------------------------------------------
 * MACS4#0021  LotID,ProductID表示                                    T.Iga/CSC
 ******************************************************************************
 */
//@formatter:on
@Getter
@Setter
public class CarrierModel {

    private String entityId;
    private String carrierId;
    private String carrierState;
    private Short  carrierStateCode;
    private String prevCarrierState;
    private String carrierTypeId;
    private String carrierShapeId;
    private String currentAmhsId;
    private String currentLoc;
    private String hostZoneId;
    private String shelfNo;
    private String prevAmhsId;
    private String prevCarrierLoc;
    private Timestamp storedTime;
    private String carrierEmpty;
    private Timestamp waitInTime;
    private Timestamp waitOutTime;
    private String insystemCarrierId;
    private Timestamp insystemTime;
    private String carrierAlarm;
    private String carrierActionCtrl;
    private Timestamp carrierActionTime;
    private String passingMode;
    private Short available;
    private Short systemState;
    private Short alarmState;
    private Short commState;
    private Short controlState;
    private Short amhsLState;
    private String carrierJobId;
    private String alias;
    private Short cleanRequest;
    private String contamiId;
    private String puroposeType;
    private String mesMessege;
    private Timestamp setTime;
    private String productId;   // MACS4#0021 Add
    private String lotId;       // MACS4#0021 Add
}
