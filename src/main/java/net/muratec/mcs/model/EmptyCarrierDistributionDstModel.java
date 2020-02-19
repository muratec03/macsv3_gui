//@formatter:off
/**
 ******************************************************************************
 * @file        EmptyCarrierDistributionDstModel.java
 * @brief       空FOUP – 配給先一覧用モデル
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
 * @brief     空FOUP – 配給先一覧用モデル
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
public class EmptyCarrierDistributionDstModel {
  private String controllerId;
  private String contamiId;
//private String purposeType;       // MACS4#0099 Del
  private Short priority;
  private String distributionControllerId;
}
