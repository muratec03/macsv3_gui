//@formatter:off
/**
 ******************************************************************************
 * @file        IndividualMonitorStokerInfoEntity.java
 * @brief       個別モニタ_状態画面(テーブル部)用共通データエンティティ
 * @par
 * @author      DQY
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
 * 2020/02/28			  MACSV3->MACSV4
 ******************************************************************************
 */
//@formatter:on
package net.muratec.mcs.entity.top;

import lombok.Getter;
import lombok.Setter;
import net.muratec.mcs.entity.common.AjaxResBaseEntity;

//@formatter:off
/**
 ******************************************************************************
 * @brief     個別モニタ_状態画面(テーブル部)用共通データエンティティクラス
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
public class IndividualMonitorStokerInfoEntity extends AjaxResBaseEntity {

    public String  empty = null;
    public String  occupied = null;
    public String  reserved = null;
    public String  total = null;
}
