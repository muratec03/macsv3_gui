//@formatter:off
/**
 ******************************************************************************
 * @file        FloorTransferModel.java
 * @brief       階間搬送マスタメンテナンス 一覧取得用モデル
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
 ******************************************************************************
 */
//@formatter:on
package net.muratec.mcs.model;

import lombok.Getter;
import lombok.Setter;

//@formatter:off
/**
 ******************************************************************************
 * @brief    階間搬送マスタメンテナンス 一覧取得用モデル
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
public class FloorTransferModel {

    private String groupId;
    private String fromUnitGroup;
    private String toUnitGroup;
    private String fromFloor;
    private String toFloor;
    private Short enableFlag;
    private Short transferRatio;
    private String description;
    private String transferController;
}
