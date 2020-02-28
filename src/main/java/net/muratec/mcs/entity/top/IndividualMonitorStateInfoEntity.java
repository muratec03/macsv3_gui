//@formatter:off
/**
 ******************************************************************************
 * @file        IndividualMonitorStateInfoEntity.java
 * @brief       個別モニタ_状態画面(テキスト部)用共通データエンティティ
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
import net.muratec.mcs.entity.common.AjaxResBaseEntity;

//@formatter:off
/**
 ******************************************************************************
 * @brief     個別モニタ_状態画面(テキスト部)用共通データエンティティクラス
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
public class IndividualMonitorStateInfoEntity extends AjaxResBaseEntity {

//    public Short zoneOccupied = null;
//    public Short zoneCapacity = null;
//    public String zoneUtility = null;
    
	// STD APL 2020.02.25 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
    public String llcName = null;
    public String llcId = null;
    public String llcType= null;
    public String llcMode= null;
    public String available = null;
    public String controlState = null;
    public String alarmState = null;
    public String commState = null;
    public String systemState = null;
    public String tscName = null;
    public String tscId = null;
    public String tscMode= null;
    public String tscAvailable = null;
    public String craneId = null;
    public String craneStatus = null;
//    public String craneAvailable = null;
    public String stokerAvailable = null;
    public String stokerAlarmState = null;
	// END APL 2020.02.25 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 

}
