//@formatter:off
/**
 ******************************************************************************
 * @file        EmptyCarrierModel.java
 * @brief       空FOUP管理用モデル
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
 * 2019/02/19 MACS4#0099  iFoup設定画面変更                           T.Iga/CSC
 ******************************************************************************
 */
//@formatter:on
package net.muratec.mcs.model;

import lombok.Getter;
import lombok.Setter;

//@formatter:off
/**
 ******************************************************************************
 * @brief     空FOUP管理用モデルクラス
 * @par       機能:
 * @attention
 * @note
 * ----------------------------------------------------------------------------
 * VER.        DESCRIPTION                                               AUTHOR
 * ----------------------------------------------------------------------------
 * MACS4#0099  iFoup設定画面変更                                      T.Iga/CSC
 ******************************************************************************
 */
//@formatter:on
@Getter
@Setter
public class EmptyCarrierModel  {

    private String controllerId = "";

    private String contamiId = "";

//  private String purposeType = "";        // MACS4#0099 Del

    private Short standardStockNum = 0;

    private Short currentStockNum = 0;

    private Short reservedSupplyNum = 0;

    private Short lackStockNum = 0;

    private Short lackStockPer = 0;

    private Short surplusStockNum = 0;

    private Short surplusStockPer = 0;

    private String supplyStatus = "";

}
