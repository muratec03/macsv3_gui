﻿//@formatter:off
/**
 ******************************************************************************
 * @file        ReqOpenIndMonEntity.java
 * @brief       個別モニタ表示用リクエストエンティティ
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

//@formatter:off
/**
 ******************************************************************************
 * @brief    個別モニタ表示用リクエストエンティティクラス
 * @par
 * @attention
 * @note
 * ----------------------------------------------------------------------------
 * VER.        DESCRIPTION                                               AUTHOR
 * ----------------------------------------------------------------------------
 * 2019/12/18 MACS4#0225  MACSV2→MACSV4対応                         天津村研　董
 ******************************************************************************
 */
//@formatter:on
@Getter
@Setter
public class ReqOpenIndMonEntity {

//    public String amhsType;//20191218 DQY DEL
//    public String amhsId;	 //20191218 DQY DEL
	// STD APL 2020.02.21 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
//    public String memberGroup;  //20191218 DQY ADD
//    public String displayName;  //20191218 DQY ADD
//    public String displayId;  //20191220 DQY ADD
	public String  moduleName;
	public String  llcName;
	public String  llcId;
	public String  llcType;
	public String  tscId;// DQY ADD 20200227
    // END APL 2020.02.21 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
	// STD APL 2020.03.05 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
	public String  portsSize;
	// END APL 2020.03.05 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 

}
