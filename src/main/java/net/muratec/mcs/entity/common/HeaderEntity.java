﻿//@formatter:off
/**
 ******************************************************************************
 * @file        HeaderEntity.java
 * @brief       McsDataTables用のヘッダ情報（カラム情報）エンティティ
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
 ******************************************************************************
 */
//@formatter:on
package net.muratec.mcs.entity.common;

import java.util.ArrayList;
import java.util.List;

//@formatter:off
/**
 ******************************************************************************
 * @brief     McsDataTables用のヘッダ情報（カラム情報）エンティティ
 * @par      McsDataTables用のヘッダ情報（カラム情報）エンティティクラス。
 * @attention 
 * @note      
 * ----------------------------------------------------------------------------
 * VER.        DESCRIPTION                                               AUTHOR
 * ----------------------------------------------------------------------------
 ******************************************************************************
 */
//@formatter:on
public class HeaderEntity {

    // ------------------------------------
    // カラム情報
    // ------------------------------------
    public List<ColumnInfoEntity> columnInfoList = new ArrayList<ColumnInfoEntity>();

}
