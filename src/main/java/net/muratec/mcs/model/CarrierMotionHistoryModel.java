//@formatter:off
/**
 ******************************************************************************
 * @file        CarrierMotionHistoryModel.java
 * @brief       キャリア監視来歴表示設定 一覧連携用モデルクラス
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
 * 2018/01/31 0.7         Step4phase2updateリリース                         CSC
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
 * @brief     キャリア監視来歴表示設定 一覧連携用モデル
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
public class CarrierMotionHistoryModel {

    private String entityId;
    private String newLocation;
    private String carrierJobId;
    private String carrierState;
    private String carrierStateNum;
    private String carrierTypeId;
    private String carrierId;
    private Timestamp time;

}
