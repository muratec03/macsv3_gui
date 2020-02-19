//@formatter:off
/**
 ******************************************************************************
 * @file        AverageUnitUtilizationList.java
 * @brief       機器平均稼働率統計表示 一覧連携用モデル
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
 * 2017/12/20 0.6         Step4phase2リリース                               CSC
 * 2019/05/15 MACS4#0181  [MCS_GUI] 機器稼働率集計不具合対応          T.Iga/CSC
 ******************************************************************************
 */
//@formatter:on
package net.muratec.mcs.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

//@formatter:off
/**
 ******************************************************************************
 * @brief     機器平均稼働率統計表示 一覧連携用モデルクラス
 * @par       機能:
 * @attention
 * @note
 * ----------------------------------------------------------------------------
 * VER.        DESCRIPTION                                               AUTHOR
 * ----------------------------------------------------------------------------
 * MACS4#0181  [MCS_GUI] 機器稼働率集計不具合対応                     T.Iga/CSC
 ******************************************************************************
 */
//@formatter:on
@Getter
@Setter
public class AverageUnitUtilizationList {

    private String elementId;

    private String controller;

    private Timestamp time;

    private BigDecimal unitUtil;

//  private BigDecimal aveUnitUtil;     // MACS4#0181 Del

}
