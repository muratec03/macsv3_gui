﻿//@formatter:off
/**
 ******************************************************************************
 * @file        ReqIndividualMonitorEntity.java
 * @brief       個別モニタ情報取得用共通リクエストエンティティ
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
package net.muratec.mcs.entity.top;

import lombok.Getter;
import lombok.Setter;
import net.muratec.mcs.annotation.FieldNameKey;
import net.muratec.mcs.entity.common.AjaxReqBaseEntity;

//@formatter:off
/**
 ******************************************************************************
 * @brief    個別モニタ情報取得用共通リクエストエンティティクラス
 * @par
 * @attention
 * @note
 * ----------------------------------------------------------------------------
 * VER.        DESCRIPTION                                               AUTHOR
 * ----------------------------------------------------------------------------
 *  2019/12/18 MACS4#0225  MACSV2→MACSV4対応                         天津村研　董
 ******************************************************************************
 */
//@formatter:on
@Getter
@Setter
public class ReqIndividualMonitorEntity extends AjaxReqBaseEntity {

//    @FieldNameKey(key = "IT-001-11-002") public String amhsId; 	 //20191218 DQY DEL
	// STD APL 2020.02.25 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
	//    @FieldNameKey(key = "IT-001-11-002") public Integer displayId;	 //20191218 DQY ADD
    @FieldNameKey(key = "IT-001-11-002") public String llcId;
    public String tscId;//20200227 DQY ADD
    // END APL 2020.02.25 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
    public boolean ctrlChgFlag;
}
