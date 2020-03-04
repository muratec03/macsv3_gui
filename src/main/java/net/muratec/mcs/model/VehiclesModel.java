//@formatter:off
/**
 ******************************************************************************
 * @file        VehiclesModel.java
 * @brief       アラーム情報表示画面用モデル
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
 * 
 ******************************************************************************
 */
//@formatter:on
package net.muratec.mcs.model;

import lombok.Getter;
import lombok.Setter;

//@formatter:off
/**
 ******************************************************************************
 * @brief     アラーム情報表示画面用モデルクラス
 * @par       機能:
 * @attention
 * @note
 * ----------------------------------------------------------------------------
 * VER.        DESCRIPTION                                               AUTHOR
 * ----------------------------------------------------------------------------
 * MACS4#0114  GUI MCSAlarmクリア対応                                 T.Iga/CSC
 ******************************************************************************
 */
//@formatter:on
@Getter
@Setter
public class VehiclesModel {
	public String vehicleId;
    public String llcName;
    public String alarmText;
    public String vehicleKind;
    public String vehicleState; 
	// STD APL 2020.03.04 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
    public String llcId;
	// END APL 2020.03.04 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
}
