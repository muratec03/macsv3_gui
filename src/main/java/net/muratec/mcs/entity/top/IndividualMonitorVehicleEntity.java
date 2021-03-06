﻿//@formatter:off
/**
 ******************************************************************************
 * @file        IndividualMonitorVehicleEntity.java
 * @brief       個別モニタ台車画面用共通データエンティティ
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
 * @brief    個別モニタ台車画面用共通データエンティティクラス
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
public class IndividualMonitorVehicleEntity {

    public String vehicleId = null;
    public String vehicleState = null;
    // STD APL 2020.03.03 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
    public String alarmText = null;
    public String llcId = null;
    public String llcName = null;
    public String vehicleKind = null;
	// END APL 2020.03.03 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 

}
