﻿//@formatter:off
/**
 ******************************************************************************
 * @file        AverageTransferTimeCarrierJobModel.java
 * @brief       平均搬送時間(キャリアJob)用モデル
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
 * 2017/09/20 0.5         Step4リリース                                     CSC
 ******************************************************************************
 */
//@formatter:on
package net.muratec.mcs.model;

import lombok.Getter;
import lombok.Setter;

//@formatter:off
/**
 ******************************************************************************
 * @brief     平均搬送時間(キャリアJob)用モデルクラス
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
public class AverageTransferTimeCarrierJobModel {

    private String macroSrcAmhsId;
    private String macroDstAmhsId;
    private Long averageSecond;
    private Integer times;
    private Long allAverageSecond;
    private Integer allTimes;

}
