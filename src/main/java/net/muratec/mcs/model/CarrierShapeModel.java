//@formatter:off
/**
 ******************************************************************************
 * @file        CarrierShapeModel.java
 * @brief       キャリアシェイプマスタメンテナンス一覧連携用モデル
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

import lombok.Getter;
import lombok.Setter;

//@formatter:off
/**
 ******************************************************************************
 * @brief     キャリアシェイプマスタメンテナンス一覧連携用モデルクラス
 * @par
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
public class CarrierShapeModel {

    private String carrierShapeId;
    private String description;
    private Short carrierShapeCode;

}
