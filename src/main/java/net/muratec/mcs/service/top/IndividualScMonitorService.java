//@formatter:off
/**
 ******************************************************************************
 * @file        IndividualScMonitorService.java
 * @brief       個別モニタ(SCモニタ)関連のサービス
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
package net.muratec.mcs.service.top;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.muratec.mcs.common.ComFunction;
import net.muratec.mcs.common.defines.State;
import net.muratec.mcs.entity.top.IndividualMonitorAlarmInfoEntity;
import net.muratec.mcs.entity.top.IndividualMonitorMicroCmdEntity;
import net.muratec.mcs.entity.top.IndividualMonitorPortEntity;
import net.muratec.mcs.entity.top.IndividualMonitorStateEntity;
import net.muratec.mcs.entity.top.IndividualMonitorStokerInfoEntity;
import net.muratec.mcs.entity.top.IndividualMonitorTransferJobEntity;
import net.muratec.mcs.entity.top.IndividualMonitorVehicleEntity;
import net.muratec.mcs.entity.top.ReqIndividualMonitorEntity;
import net.muratec.mcs.exception.McsException;
import net.muratec.mcs.mapper.AlarmMapper;
import net.muratec.mcs.mapper.GuiColorMapper;
import net.muratec.mcs.mapper.IndividualMonitorMapper;
import net.muratec.mcs.mapper.JobPriorityMapper;
import net.muratec.mcs.mapper.LlcMapper;
import net.muratec.mcs.mapper.PortMapper;
import net.muratec.mcs.mapper.StockerMapper;
import net.muratec.mcs.mapper.TscMapper;
import net.muratec.mcs.mapper.VehicleMapper;
import net.muratec.mcs.model.Alarm;
import net.muratec.mcs.model.AlarmExample;
import net.muratec.mcs.model.AlarmModel;
import net.muratec.mcs.model.GuiColor;
import net.muratec.mcs.model.GuiColorExample;
import net.muratec.mcs.model.IconInfo;
import net.muratec.mcs.model.IndividualMonitorTransferJob;
import net.muratec.mcs.model.JobPriority;
import net.muratec.mcs.model.Llc;
import net.muratec.mcs.model.LlcExample;
import net.muratec.mcs.model.Port;
import net.muratec.mcs.model.PortExample;
import net.muratec.mcs.model.PortsModel;
import net.muratec.mcs.model.Stocker;
import net.muratec.mcs.model.StockerExample;
import net.muratec.mcs.model.Tsc;
import net.muratec.mcs.model.Vehicle;
import net.muratec.mcs.model.VehicleExample;
import net.muratec.mcs.model.VehiclesModel;
import net.muratec.mcs.service.common.BaseService;
import net.muratec.mcs.service.common.ExeForeignFileService;

//@formatter:off
/**
 ******************************************************************************
 * @brief     個別モニタ(SCモニタ)関連のサービス
 * @par       機能:
 *              getStateInfo（状態画面用データ取得機能）
 *              getStateInfoForeignFile（状態画面用外部ファイル参照機能）
 *              getPortInfo（ポート画面用データ取得機能）
 *              getPortInfoListForeignFile（ポート画面用外部ファイル参照機能）
 *              getPortColorInfoList（ポート画面用文字色設定機能）
 *              getMicroCmdInfo（Microコマンド画面用データ取得機能）
 *              getMicroCmdInfoListForeignFile（Microコマンド画面用外部ファイル参照機能）
 *              getMicroCmdColorInfoList（Microコマンド画面用文字色設定機能）
 *              getTransferJobInfo（搬送Job画面用データ取得機能）
 *              getTransferJobInfoListForeignFile（搬送Job画面用外部ファイル参照機能）
 *              getTransferJobColorInfoList（搬送Job画面用文字色設定機能）
 *              getHotlotCategoryByPriority（ジョブ状態のチェック機能）
 *              creRgbArray（GUI_COLORレコードからRGB配列を生成する機能）
 *              stringToShortNumber（String型の数値からShort型の数値へ変換する機能）
 *              decimalToPerNumString（小数値をString型の百分率形式に変換する機能）
 * @attention
 * @note
 * ----------------------------------------------------------------------------
 * VER.        DESCRIPTION                                               AUTHOR
 * ----------------------------------------------------------------------------
 ******************************************************************************
 */
//@formatter:on
@Service
public class IndividualScMonitorService extends BaseService {

    /** 個別モニタ用マッパー生成 */
    @Autowired private IndividualMonitorMapper iMonitorMapper;

    /** GUI_COLORマッパー生成 */
    @Autowired private GuiColorMapper guiColorMapper;

    /** JOB_PRIORITYマッパー生成 */
    @Autowired private JobPriorityMapper jobPriorityMapper;

    /** Alarmマッパー生成 */
    @Autowired private AlarmMapper alarmMapper;

    /** 外部ファイル参照用サービス生成 */
    @Autowired ExeForeignFileService exeForeignFileService;
    
    // STD APL 2020.02.25 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
  /*  *//** ScreenMonitorMemberMapper用サービス生成 *//*
    @Autowired private ScreenMonitorMemberMapper ScreenMonitorMemberMapper;//20191225 Song ADD FOR STATEINFO OF THE MAIN
*/    /** ScreenMonitorMemberMapper用サービス生成 */
    @Autowired private LlcMapper llcMapper;
    @Autowired private TscMapper tscMapper;
    // END APL 2020.02.25 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
    
    // STD APL 2020.02.28 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
    @Autowired private StockerMapper stockerMapper;
    // END APL 2020.02.85 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
    // STD APL 2020.02.28 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
    @Autowired private PortMapper portMapper;
    @Autowired private VehicleMapper vehicleMapper;
    // END APL 2020.02.85 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 

    //@formatter:off
    /**
     ******************************************************************************
     * @brief     状態画面用データ取得機能
     * @param     reqEntity      画面項目情報
     * @return    状態情報
     * @retval    Entity形式で返却
     * @attention
     * @note
     * ----------------------------------------------------------------------------
     * VER.        DESCRIPTION                                               AUTHOR
     * ----------------------------------------------------------------------------
     ******************************************************************************
     */
    //@formatter:on
    @Transactional(readOnly = true)
    public IndividualMonitorStateEntity getStateInfo(ReqIndividualMonitorEntity reqEntity) throws McsException {

        // -----------------------------------------
        // 返却データの生成
        // -----------------------------------------
        IndividualMonitorStateEntity resEntity = new IndividualMonitorStateEntity();

        // -----------------------------------------
        // 状態データ取得
        // -----------------------------------------
        
        //IndividualMonitorStateInfo stateRec = iMonitorMapper.getScMonitorState(reqEntity);  //20191225 Song DEL FOR TABLE CHANGE TO ScreenMonitorMember
        //20191225 Song Add Start
//        ScreenMonitorMemberExample configExample = new ScreenMonitorMemberExample();
//        configExample.createCriteria().andDisplayIdEqualTo(reqEntity.displayId);
//        List<ScreenMonitorMember> stateRec = ScreenMonitorMemberMapper.selectByExample(configExample);
        //20191225 Song Add End
	     // STD APL 2020.02.25 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
        LlcExample configExample = new LlcExample();
        configExample.createCriteria().andLlcIdEqualTo(reqEntity.llcId);
        List<Llc> llcState = llcMapper.selectByExample(configExample);
	     // END APL 2020.02.25 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
        
        // STD APL 2020.02.27 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
        Tsc tscPa = new Tsc();
        tscPa.setLlcId(reqEntity.llcId);
        tscPa.setTscId(reqEntity.tscId);
	 	List<IconInfo> tscState = tscMapper.selectTscInfoById(tscPa);  //llcTypeによって、設備のデータを探す
	 	// END APL 2020.02.27 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
	 	
	 	
	 	// STD APL 2020.02.28 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 TSC Table Data
	 	for (IconInfo tscStateRec : tscState) {
        	resEntity.state.tscName = tscStateRec.getTscName();
        	resEntity.state.tscMode = tscStateRec.getTscMode();
        	resEntity.state.tscAvailable = tscStateRec.getTscAvailable();
        	// STD APL 2020.03.02 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
        	resEntity.state.tscAlarmState = tscStateRec.getTscAlarmState();
        	resEntity.state.downCount = tscStateRec.getDownCount();
        	// END APL 2020.03.02 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
	 	}   
	 	// END APL 2020.02.28 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
	 	
	 	// STD APL 2020.02.28 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 Stocker Table Data
	 	StockerExample stockerConfigExample = new StockerExample();
	 	stockerConfigExample.createCriteria().andTscIdEqualTo(reqEntity.tscId);
        List<Stocker> stockerState = stockerMapper.selectByExample(stockerConfigExample);//tscIdによって、Stokerのデータを探す
	 	
	 	for (Stocker stockerStateRec : stockerState) {
        	resEntity.state.craneId = stockerStateRec.getCraneId();
        	resEntity.state.craneStatus = stockerStateRec.getCraneState();
        	resEntity.state.stokerAvailable = stockerStateRec.getAvailable();
        	resEntity.state.stokerAlarmState = stockerStateRec.getCraneAlarmState();
	 	} 
	 	
	 	for (IconInfo stockerZoneStateRec : tscState) {
	 		IndividualMonitorStokerInfoEntity stockerZoneRes = new IndividualMonitorStokerInfoEntity();

	 		stockerZoneRes.total = stockerZoneStateRec.getTotal();
	 		stockerZoneRes.empty = stockerZoneStateRec.getEmpty();
	 		stockerZoneRes.occupied = stockerZoneStateRec.getOccupied();
	 		if(stockerZoneStateRec.getReserved()!=null) {
	 		stockerZoneRes.reserved = stockerZoneStateRec.getReserved();
	 		}
	 		else {
	 			stockerZoneRes.reserved = "0";	
	 		}
	 		// STD APL 2020.03.06 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
	 		if(!stockerZoneStateRec.getTotal().equals("0")) {
	 			resEntity.stokerZoneList.add(stockerZoneRes);
	 		}
	 		// END APL 2020.03.06 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
        }
	 	// END APL 2020.02.28 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 Stocker Table Data
		// STD APL 2020.03.03 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
//	 	 	PortExample portExample = new PortExample();
//	 	 	portExample.createCriteria().andTscIdEqualTo(reqEntity.tscId);
	 		Port portPa = new Port();
	 	 	portPa.setTscId(reqEntity.tscId);
	        List<PortsModel> portList = portMapper.selectPortList(portPa);//tscIdによって、Portのデータを探す
	 	 	// STD APL 2020.03.05 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
	        String  portsSize = String.valueOf(portList.size()) ;
	        resEntity.portSize = portsSize;
	 		// END APL 2020.03.05 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
	        
	 	 	for (PortsModel portListRec : portList) {
	 	 		IndividualMonitorPortEntity portRes = new IndividualMonitorPortEntity();

	 	 		portRes.portId = portListRec.getPortId();
	 	 		portRes.tscId = portListRec.getTscId();
	 	 		portRes.alarmText = portListRec.getAlarmText();
	 	 		portRes.available = portListRec.getAvailable();
	 	 		portRes.ibsemAvail = portListRec.getIbsemAvail();
	 	 		portRes.portMode = portListRec.getPortMode();
	 	 		portRes.carrierId = portListRec.getCarrierId();
	 	 		

	 	 		resEntity.portList.add(portRes);
	 	 	} 
	 	 	
//	 	 	VehicleExample vehicleExample = new VehicleExample();
//	 	 	vehicleExample.createCriteria().andLlcIdEqualTo(reqEntity.llcId);
	 	 	Vehicle vehiclePa = new Vehicle();
	 	 	vehiclePa.setLlcId(reqEntity.llcId);
	        List<VehiclesModel> vehicleList = vehicleMapper.selectVehicleList(vehiclePa);//tscIdによって、Portのデータを探す
	 	 	
	 	 	for (VehiclesModel vehicleListRec : vehicleList) {
	 	 		IndividualMonitorVehicleEntity vehicleRes = new IndividualMonitorVehicleEntity();

	 	 		vehicleRes.vehicleId = vehicleListRec.getVehicleId();
	 	 		vehicleRes.llcId = vehicleListRec.getLlcId();
	 	 		vehicleRes.llcName = vehicleListRec.getLlcName();
	 	 		vehicleRes.alarmText = vehicleListRec.getAlarmText();
	 	 		vehicleRes.vehicleKind = vehicleListRec.getVehicleKind();
	 	 		vehicleRes.vehicleState = vehicleListRec.getVehicleState();
	 	 		resEntity.vehicleList.add(vehicleRes);
	 	 	} 
	 	// END APL 2020.03.03 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 

        if (llcState == null ) {
            return null;
        }

        // -----------------------------------------
        // アラーム一覧取得
        // -----------------------------------------
        
	    // STD APL 2020.03.04 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
        /*AlarmExample example = new AlarmExample();//2025 del dqy
        example.createCriteria().andLlcIdEqualTo(reqEntity.llcId);  //20191223 Song Add
        example.setOrderByClause("SET_TIME desc");
        List<Alarm> alarmRecList = alarmMapper.selectByExample(example);*/
        
        Alarm alarmPa = new Alarm();
        alarmPa.setLlcId(reqEntity.llcId);
        alarmPa.setTscId(reqEntity.tscId);
        alarmPa.setSetVendor(reqEntity.llcId);
        List<AlarmModel> alarmRecList = alarmMapper.selectAlarmList(alarmPa);//tscIdによって、Portのデータを探す
        // END APL 2020.03.04 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
        
        // -----------------------------------------
        // エンティティ形式に変換
        // -----------------------------------------
        // 状態データ
        
        for (Llc llcStateRec : llcState) {
            // 状態データ
            if(!State.COMM_STATE_COMMUNICATING.equals(llcStateRec.getCommState())) 
            {
            	resEntity.state.llcName = llcStateRec.getLlcName();
    	        resEntity.state.llcId = llcStateRec.getLlcId();
    	        resEntity.state.llcType = llcStateRec.getLlcType();
            	resEntity.state.commState = llcStateRec.getCommState();
            	resEntity.state.llcMode = State.TSC_SYSTEM_NONE;
            	resEntity.state.controlState = State.TSC_SYSTEM_NONE;
            	resEntity.state.systemState = State.TSC_SYSTEM_NONE;
            	resEntity.state.available = State.TSC_SYSTEM_NONE;
            	resEntity.state.tscMode = State.TSC_SYSTEM_NONE;
            }
            else 
            {
    	        resEntity.state.llcName = llcStateRec.getLlcName();
    	        resEntity.state.llcId = llcStateRec.getLlcId();
    	        resEntity.state.llcType = llcStateRec.getLlcType();
    	        resEntity.state.llcMode = llcStateRec.getLlcMode();
    	        resEntity.state.available = llcStateRec.getAvailable();
    	        resEntity.state.controlState = llcStateRec.getControlState();
    	        resEntity.state.alarmState = llcStateRec.getAlarmState();
    	        resEntity.state.commState = llcStateRec.getCommState();
    	        resEntity.state.systemState = llcStateRec.getSystemState();
            }
        }
        //20191225 Song Mod End FOR MCSV2
            
            
        // アラーム一覧
        for (AlarmModel alarmRec : alarmRecList) {
            IndividualMonitorAlarmInfoEntity alarmRes = new IndividualMonitorAlarmInfoEntity();

            alarmRes.setTime = ComFunction.timestampToStringSmall(alarmRec.getSetTime());
            alarmRes.alarmId = alarmRec.getAlarmId();
            alarmRes.alarmText = alarmRec.getAlarmText();
            alarmRes.alarmLoc = alarmRec.getAlarmLocation();
            alarmRes.vehicleId = alarmRec.getVehicleId();
            resEntity.alarmList.add(alarmRes);
        }

        return resEntity;
    }

    //@formatter:off
    /**
     ******************************************************************************
     * @brief     状態画面用データ取得機能（外部ファイル参照）
     * @param     reqEntity      画面項目情報
     * @return    状態情報
     * @retval    Entity形式で返却
     * @attention
     * @note
     * ----------------------------------------------------------------------------
     * VER.        DESCRIPTION                                               AUTHOR
     * ----------------------------------------------------------------------------
     ******************************************************************************
     */
    //@formatter:on
    @Transactional(readOnly = true)
    public IndividualMonitorStateEntity getStateInfoForeignFile(ReqIndividualMonitorEntity reqEntity)
            throws McsException {

        // -----------------------------------------
        // 返却データの生成
        // -----------------------------------------
        IndividualMonitorStateEntity resEntity = new IndividualMonitorStateEntity();

        // -----------------------------------------
        // 状態データ取得
        // -----------------------------------------
        // TODO ダミーファイルの場所を指定
        String stateCmd = "c:\\StateInfoFormat.csv";
        List<String[]> stateColumnList = exeForeignFileService.exeForeignFile(reqEntity, stateCmd);

        // 状態情報0件チェック
        if (stateColumnList == null || stateColumnList.isEmpty()) {
            return null;
        }

        // -----------------------------------------
        // アラーム一覧取得
        // -----------------------------------------
        // TODO ダミーファイルの場所を指定
        String alarmCmd = "c:\\AlarmInfoFormat.csv";
        List<String[]> alarmColumnList = exeForeignFileService.exeForeignFile(reqEntity, alarmCmd);

        // -----------------------------------------
        // エンティティ形式に変換
        // -----------------------------------------
        // 状態データ
        String[] stateRec = stateColumnList.get(0);
        resEntity.state.commState = stateRec[0];
        resEntity.state.controlState = stateRec[1];
        resEntity.state.systemState = stateRec[2];
        resEntity.state.available = stateRec[3];

        // アラーム一覧
        for (String[] alarmRec : alarmColumnList) {
            IndividualMonitorAlarmInfoEntity alarmRes = new IndividualMonitorAlarmInfoEntity();

            alarmRes.setTime = ComFunction.timestampToStringSmall(alarmRec[0]);
            alarmRes.alarmId = (!alarmRec[1].isEmpty()) ? alarmRec[1] : null;
            alarmRes.alarmText = alarmRec[2];

            resEntity.alarmList.add(alarmRes);
        }

        return resEntity;
    }

    //@formatter:off
    /**
     ******************************************************************************
     * @brief     ポート画面用データ取得機能
     * @param     reqEntity      画面項目情報
     * @return    ポート情報
     * @retval    List形式で返却
     * @attention
     * @note
     * ----------------------------------------------------------------------------
     * VER.        DESCRIPTION                                               AUTHOR
     * ----------------------------------------------------------------------------
     ******************************************************************************
     */
    //@formatter:on
    @Transactional(readOnly = true)
    public List<IndividualMonitorPortEntity> getPortInfoList(ReqIndividualMonitorEntity reqEntity) {

        // -----------------------------------------
        // 返却データの生成
        // -----------------------------------------
        List<IndividualMonitorPortEntity> resEntity = new ArrayList<IndividualMonitorPortEntity>();

        // -----------------------------------------
        // データ取得
        // -----------------------------------------
        resEntity = iMonitorMapper.getIndividualMonitorPortList(reqEntity);

        return resEntity;
    }

    //@formatter:off
    /**
     ******************************************************************************
     * @brief     ポート画面用データ取得機能（外部ファイル参照）
     * @param     reqEntity      画面項目情報
     * @return    ポート情報
     * @throws    McsException
     * @retval    List形式で返却
     * @attention
     * @note
     * ----------------------------------------------------------------------------
     * VER.        DESCRIPTION                                               AUTHOR
     * ----------------------------------------------------------------------------
     ******************************************************************************
     */
    //@formatter:on
    @Transactional(readOnly = true)
    public List<IndividualMonitorPortEntity> getPortInfoListForeignFile(ReqIndividualMonitorEntity reqEntity)
            throws McsException {

        // -----------------------------------------
        // 返却データの生成
        // -----------------------------------------
        List<IndividualMonitorPortEntity> resEntity = new ArrayList<IndividualMonitorPortEntity>();

        // -----------------------------------------
        // データ取得
        // -----------------------------------------
        // TODO ダミーファイルの場所を指定
        String portCmd = "c:\\PortInfoFormat.csv";
        List<String[]> portColumnList = exeForeignFileService.exeForeignFile(reqEntity, portCmd);

        // -----------------------------------------
        // エンティティ形式に変換
        // -----------------------------------------
        for (String[] portColumn : portColumnList) {
            IndividualMonitorPortEntity res = new IndividualMonitorPortEntity();

            res.portId = portColumn[0];
            res.portType = portColumn[1];
            res.portIo = portColumn[2];
            res.portAvail = portColumn[3];
            res.portLState = portColumn[4];

            resEntity.add(res);
        }

        return resEntity;
    }

    //@formatter:off
    /**
     ******************************************************************************
     * @brief     ポート画面の色情報を取得する機能
     * @param     recList    Tableに表示するデータ
     * @return    色情報一覧
     * @retval    List形式で返却
     * @attention
     * @note      GUI_COLORテーブルの色情報を使用する
     * ----------------------------------------------------------------------------
     * VER.        DESCRIPTION                                               AUTHOR
     * ----------------------------------------------------------------------------
     ******************************************************************************
     */
    //@formatter:on
    @Transactional(readOnly = true)
    public List<String> getPortColorInfoList(List<IndividualMonitorPortEntity> recList) {

        String[] rgbColorArray = creRgbArray("PORT_STATE", 1000);

        List<String> portColorInfoList = new ArrayList<String>();
        for (IndividualMonitorPortEntity record : recList) {
            Short index = record.getHidePortAvail();

            // PORTの可用性に対応するカラーが無い場合は
            // 固定の色情報を設定(GUI_COLOR.KEY = 999)
            portColorInfoList.add((index != null && 0 <= index && index < 1000 && rgbColorArray[index] != null)
                    ? rgbColorArray[index] : rgbColorArray[999]);
        }

        return portColorInfoList;
    }

    //@formatter:off
    /**
     ******************************************************************************
     * @brief     Microコマンド画面用データ取得機能
     * @param     reqEntity      画面項目情報
     * @return    Microコマンド情報
     * @retval    List形式で返却
     * @attention
     * @note
     * ----------------------------------------------------------------------------
     * VER.        DESCRIPTION                                               AUTHOR
     * ----------------------------------------------------------------------------
     ******************************************************************************
     */
    //@formatter:on
    @Transactional(readOnly = true)
    public List<IndividualMonitorMicroCmdEntity> getMicroCmdInfoList(ReqIndividualMonitorEntity reqEntity) {

        // -----------------------------------------
        // 返却データの生成
        // -----------------------------------------
        List<IndividualMonitorMicroCmdEntity> resEntity = new ArrayList<IndividualMonitorMicroCmdEntity>();

        // -----------------------------------------
        // データ取得
        // -----------------------------------------
        resEntity = iMonitorMapper.getIndividualMonitorMicroCmdList(reqEntity);

        return resEntity;
    }

    //@formatter:off
    /**
     ******************************************************************************
     * @brief     Microコマンド画面用データ取得機能（外部ファイル参照）
     * @param     reqEntity      画面項目情報
     * @return    Microコマンド情報
     * @throws McsException
     * @retval    List形式で返却
     * @attention
     * @note
     * ----------------------------------------------------------------------------
     * VER.        DESCRIPTION                                               AUTHOR
     * ----------------------------------------------------------------------------
     ******************************************************************************
     */
    //@formatter:on
    @Transactional(readOnly = true)
    public List<IndividualMonitorMicroCmdEntity> getMicroCmdInfoListForeignFile(ReqIndividualMonitorEntity reqEntity)
            throws McsException {

        // -----------------------------------------
        // 返却データの生成
        // -----------------------------------------
        List<IndividualMonitorMicroCmdEntity> resEntity = new ArrayList<IndividualMonitorMicroCmdEntity>();

        // -----------------------------------------
        // データ取得
        // -----------------------------------------
        // TODO ダミーファイルの場所を指定
        String microCommandCmd = "c:\\MicroCmdInfoFormat.csv";
        List<String[]> microCmdColumnList = exeForeignFileService.exeForeignFile(reqEntity, microCommandCmd);

        // -----------------------------------------
        // エンティティ形式に変換
        // -----------------------------------------
        for (String[] microCmdColumn : microCmdColumnList) {
            IndividualMonitorMicroCmdEntity res = new IndividualMonitorMicroCmdEntity();

            res.commandId = microCmdColumn[0];
            res.priority = microCmdColumn[1];
            res.carrierId = microCmdColumn[2];
            res.srcLoc = microCmdColumn[3];
            res.dstLoc = microCmdColumn[4];
            res.carrierJobState = microCmdColumn[5];

            resEntity.add(res);
        }

        return resEntity;
    }

    //@formatter:off
    /**
     ******************************************************************************
     * @brief     Microコマンド画面の色情報を取得する機能
     * @param     recList    Tableに表示するデータ
     * @return    色情報一覧
     * @retval    List形式で返却
     * @attention
     * @note      GUI_COLORテーブルの色情報を使用する
     * ----------------------------------------------------------------------------
     * VER.        DESCRIPTION                                               AUTHOR
     * ----------------------------------------------------------------------------
     ******************************************************************************
     */
    //@formatter:on
    @Transactional(readOnly = true)
    public List<String> getMicroCmdColorInfoList(List<IndividualMonitorMicroCmdEntity> recList) {

        // 色情報を取得
        String[] rgbColorArray = creRgbArray("CARRIER_JOB", 1000);

        List<String> retList = new ArrayList<String>();
        for (IndividualMonitorMicroCmdEntity record : recList) {
            String color = rgbColorArray[record.hideCarrierJobState];
            retList.add(color);
        }

        return retList;
    }

    //@formatter:off
    /**
     ******************************************************************************
     * @brief     搬送Job画面用データ取得機能
     * @param     reqEntity      画面項目情報
     * @return    搬送Job情報
     * @retval    List形式で返却
     * @attention
     * @note
     * ----------------------------------------------------------------------------
     * VER.        DESCRIPTION                                               AUTHOR
     * ----------------------------------------------------------------------------
     ******************************************************************************
     */
    //@formatter:on
    @Transactional(readOnly = true)
    public List<IndividualMonitorTransferJobEntity> getTransferJobInfoList(ReqIndividualMonitorEntity reqEntity)
            throws McsException {

        // -----------------------------------------
        // データ取得
        // -----------------------------------------
        List<IndividualMonitorTransferJob> recList = iMonitorMapper.getScMonitorTransferJobList(reqEntity);

        // -----------------------------------------
        // 返却データの生成
        // -----------------------------------------
        List<IndividualMonitorTransferJobEntity> resEntity = new ArrayList<IndividualMonitorTransferJobEntity>();

        // -----------------------------------------
        // エンティティ形式に変換
        // -----------------------------------------
        for (IndividualMonitorTransferJob rec : recList) {
            IndividualMonitorTransferJobEntity res = new IndividualMonitorTransferJobEntity();

            res.receivedTime = ComFunction.timestampToStringSmall(rec.getReceivedTime());
            res.jobOwner = rec.getJobOwner();
            res.carrierId = rec.getCarrierId();
            res.priority = rec.getPriority();
            res.carrierJobState = rec.getCarrierJobState();
            res.currentLoc = rec.getCurrentLoc();
            res.srcAmhsId = rec.getSrcAmhsId();
            res.srcLoc = rec.getSrcLoc();
            res.dstAmhsId = rec.getDstAmhsId();
            res.dstLoc = rec.getDstLoc();
            res.microFrom = rec.getMicroFrom();
            res.microTo = rec.getMicroTo();
            res.amhsId = rec.getAmhsId();
            res.hideCarrierJobState = rec.getHideCarrierJobState();
            res.waitInTime = rec.getWaitInTime();

            resEntity.add(res);
        }

        return resEntity;
    }

    //@formatter:off
    /**
     ******************************************************************************
     * @brief     搬送Job画面用データ取得機能
     * @param     reqEntity      画面項目情報
     * @return    搬送Job情報
     * @retval    List形式で返却
     * @attention
     * @note
     * ----------------------------------------------------------------------------
     * VER.        DESCRIPTION                                               AUTHOR
     * ----------------------------------------------------------------------------
     ******************************************************************************
     */
    //@formatter:on
    @Transactional(readOnly = true)
    public List<IndividualMonitorTransferJobEntity> getTransferJobInfoListForeignFile(
            ReqIndividualMonitorEntity reqEntity) throws McsException {

        // -----------------------------------------
        // 返却データの生成
        // -----------------------------------------
        List<IndividualMonitorTransferJobEntity> resEntity = new ArrayList<IndividualMonitorTransferJobEntity>();

        // -----------------------------------------
        // データ取得
        // -----------------------------------------
        // TODO ダミーファイルの場所を指定
        String transferJobCmd = "c:\\PortInfoFormat.csv";
        List<String[]> transferJobColumnList = exeForeignFileService.exeForeignFile(reqEntity, transferJobCmd);

        // -----------------------------------------
        // エンティティ形式に変換
        // -----------------------------------------
        for (String[] rec : transferJobColumnList) {
            IndividualMonitorTransferJobEntity res = new IndividualMonitorTransferJobEntity();

            res.receivedTime = ComFunction.timestampToStringSmall(rec[0]);
            res.jobOwner = rec[1];
            res.carrierId = rec[2];
            res.priority = rec[3] != null ? Short.parseShort(rec[3]) : null;
            res.carrierJobState = rec[4];
            res.currentLoc = rec[5];
            res.srcAmhsId = rec[6];
            res.srcLoc = rec[7];
            res.dstAmhsId = rec[8];
            res.dstLoc = rec[9];
            res.microFrom = rec[10];
            res.microTo = rec[11];
            res.amhsId = rec[12];
            res.hideCarrierJobState = rec[13] != null ? Short.parseShort(rec[13]) : null;

            resEntity.add(res);
        }

        return resEntity;
    }

    //@formatter:off
    /**
     ******************************************************************************
     * @brief     搬送Job画面の色情報を取得する機能
     * @param     recList    Tableに表示するデータ
     * @return    色情報一覧
     * @retval    List形式で返却
     * @attention
     * @note      GUI_COLORテーブルの色情報を使用する
     * ----------------------------------------------------------------------------
     * VER.        DESCRIPTION                                               AUTHOR
     * ----------------------------------------------------------------------------
     ******************************************************************************
     */
    //@formatter:on
    @Transactional(readOnly = true)
    public List<String> getTransferJobColorInfoList(List<IndividualMonitorTransferJobEntity> recList) {

        // 色情報を取得
        String[] rgbColorArray = creRgbArray("CARRIER_JOB", 1000);

        // 優先順位による状態(Normal, Hot, SuperHot)の情報を取得する
        List<JobPriority> jobPriorityList = jobPriorityMapper.selectMinPriority();

        // 色情報のリスト
        List<String> retList = new ArrayList<String>();

        // 色情報を取得し、リストに追加
        for (IndividualMonitorTransferJobEntity record : recList) {
            String color = null;

            // 対応する状態色付与(Normal, Hot, SuperHot)
            Short hotCategory = getHotlotCategoryByPriority(jobPriorityList, record.priority);

            // RGB情報にアクセスするindex番号を設定 (Normal：0～60、Hot&SuperHot：61～69)
            if (hotCategory == 0 && 0 <= record.hideCarrierJobState && record.hideCarrierJobState <= 60) {
                color = rgbColorArray[record.hideCarrierJobState];
            } else if (0 <= hotCategory && hotCategory < 10) {
                color = rgbColorArray[hotCategory + 60];
            }

            retList.add(color);
        }

        // RGB配列の解放
        rgbColorArray = null;

        return retList;
    }

    //@formatter:off
    /**
     ******************************************************************************
     * @brief      ジョブの状態(Normal, Hot, SuperHot)を取得する機能
     * @param      jobPriorityList    ジョブの優先順位情報
     * @param      recPriority        レコードの優先順位
     * @return     ジョブの状態(Normal, Hot, SuperHot)
     * @retval
     * @attention 対応するジョブがなければ0(normal)を返す
     * @note       0:Normal, 1:Hot, 2:SuperHot
     * ----------------------------------------------------------------------------
     * VER.        DESCRIPTION                                               AUTHOR
     * ----------------------------------------------------------------------------
     ******************************************************************************
     */
    //@formatter:on
    private Short getHotlotCategoryByPriority(List<JobPriority> jobPriorityList, Short recPriority) {

        for (JobPriority jobPriority : jobPriorityList) {
            if (jobPriority.getThresholdPriority() <= recPriority) {
                return jobPriority.getHotlotCategory();
            }
        }
        return 0;
    }

    //@formatter:off
    /**
     ******************************************************************************
     * @brief      GUI_COLOR.SECTIONを指定し、String配列で色情報を取得
     * @param      section         取得する色情報のGUI_COLOR.SECTION
     * @param      maxIndex        返却配列のサイズ
     * @return     色情報
     * @retval     String配列形式で返却
     * @note       色情報は#000000の形式で返す
     * ----------------------------------------------------------------------------
     * VER.        DESCRIPTION                                               AUTHOR
     * ----------------------------------------------------------------------------
     ******************************************************************************
     */
    //@formatter:on
    private String[] creRgbArray(String section, int maxIndex) {

        String[] rgbColorArray = new String[maxIndex];

        // 色情報を取得
        GuiColorExample example = new GuiColorExample();
        example.createCriteria().andSectionEqualTo(section);
        example.setOrderByClause("KEY asc");
        List<GuiColor> guiColorList = guiColorMapper.selectByExample(example);

        // 取得した設定色をRGBに変換し、配列化
        for (GuiColor guiColor : guiColorList) {
            Short index = stringToShortNumber(guiColor.getKey());
            if (index != null && 0 <= index && index < maxIndex) {
                rgbColorArray[index] = ComFunction.rgbToHex(guiColor.getRgbRed(), guiColor.getRgbGreen(),
                        guiColor.getRgbBlue());
            }
        }

        return rgbColorArray;
    }

    //@formatter:off
    /**
     ******************************************************************************
     * @brief     文字列からShort型数値への変換メソッド
     * @param     value              Short型数値に変換する文字列
     * @return    Short型へ変換された値
     * @retval    Short型で返却
     * @attention
     * @note      Short型へ変換可能な文字列のみ変換を行う
     * ----------------------------------------------------------------------------
     * VER.        DESCRIPTION                                               AUTHOR
     * ----------------------------------------------------------------------------
     ******************************************************************************
     */
    //@formatter:on
    private Short stringToShortNumber(String value) {

        Short convValue = null;
        try {
            convValue = Short.parseShort(value);
        } catch (Exception e) {
            return null;
        }

        return convValue;
    }

    //@formatter:off
    /**
     ******************************************************************************
     * @brief     小数値からパーセント表記への変換メソッド
     * @param     obj              パーセント表記に変換する小数値
     * @return    パーセント表記へ変換された値
     * @retval    String形式で返却
     * @attention
     * @note      小数値をパーセント表記への変換する
     * ----------------------------------------------------------------------------
     * VER.        DESCRIPTION                                               AUTHOR
     * ----------------------------------------------------------------------------
     ******************************************************************************
     */
    //@formatter:on
    private String decimalToPerNumString(Object obj) throws McsException {

        String perNumStr = "";
        int perNum = 0;

        if (obj == null) {
            // 変換する値が設定されていない場合
            return perNumStr;
        } else if (obj.getClass().equals(java.math.BigDecimal.class)) {
            // 変換する値がBigDecimal型の場合
            BigDecimal decNum = (BigDecimal) obj;
            perNum = decNum.intValue();

            // パーセント(%)の付与
            perNumStr = String.valueOf(perNum) + "%";
        }

        return perNumStr;
    }

}
