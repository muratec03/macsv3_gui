//@formatter:off
/**
 ******************************************************************************
 * @file        AlarmService.java
 * @brief       アラーム情報表示画面のサービス
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
 * 2017/01/31 0.2         Step2_1リリース                                   CSC
 * 2018/12/03 MACS4#0047  GUI要望分                                   T.Iga/CSC
 * 2019/03/06 MACS4#0114  GUI MCSAlarmクリア対応                      T.Iga/CSC
 ******************************************************************************
 */
//@formatter:on
package net.muratec.mcs.service.top;

//import java.text.SimpleDateFormat;            // MACS4#0114 Del
import java.util.ArrayList;
//import java.util.Date;                        // MACS4#0114 Del
import java.util.List;
//import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//import net.muratec.mcs.common.ComMsgDef;
import net.muratec.mcs.entity.top.AlarmListEntity;
//import net.muratec.mcs.entity.top.ReqExeDelAlarmEntity;
import net.muratec.mcs.entity.top.ReqGetAlarmListEntity;
//import net.muratec.mcs.exception.McsException;
import net.muratec.mcs.mapper.AlarmMapper;
//import net.muratec.mcs.mapper.AmhsMapper;     // MACS4#0114 Del
import net.muratec.mcs.model.AlarmModel;
//import net.muratec.mcs.model.Amhs;            // MACS4#0114 Del
//import net.muratec.mcs.model.MsgData;
//import net.muratec.mcs.model.MsgResult;
import net.muratec.mcs.service.common.BaseService;
//import net.muratec.mcs.service.common.MsgUtilService;

//@formatter:off
/**
 ******************************************************************************
 * @brief     アラーム情報表示画面のサービスクラス
 * @par       機能:
 *              getCount(アラーム情報一覧の全レコード数を取得)
 *              getAlarmList(アラーム情報一覧の取得)
 * @attention
 * @note
 * ----------------------------------------------------------------------------
 * VER.        DESCRIPTION                                               AUTHOR
 * ----------------------------------------------------------------------------
 * MACS4#0047  GUI要望分                                              T.Iga/CSC
 ******************************************************************************
 */
//@formatter:on
@Service
public class AlarmService extends BaseService {

    // ------------------------------------
    // アラーム情報マッパー
    // ------------------------------------
    @Autowired private AlarmMapper alarmMapper;

    // ------------------------------------
    // AMHS情報マッパー - MACS4#0047 Add - MACS4#0114 Del
    // ------------------------------------
//  @Autowired private AmhsMapper amhsMapper;

    // ------------------------------------
    // メッセージ送受信サービス - MACS4#0047 Add
    // ------------------------------------
    //@Autowired private MsgUtilService msgUtilService;

    // ------------------------------------
    // メッセージフォーマットプロパティ - MACS4#0047 Add
    // ------------------------------------
    //@Autowired private Properties m_formatProperties;

    //@formatter:off
    /**
     ******************************************************************************
     * @brief     getCount(アラーム情報一覧の全レコード数を取得)機能
     * @param     reqEntity      リクエスト(検索条件)
     * @return    一覧の全レコード数
     * @retval    int形式で返却
     * @attention
     * @note      検索条件に一致したアラーム情報一覧の全レコード数を取得する
     * ----------------------------------------------------------------------------
     * VER.        DESCRIPTION                                               AUTHOR
     * ----------------------------------------------------------------------------
     ******************************************************************************
     */
    //@formatter:on
    @Transactional
    public int getCount(ReqGetAlarmListEntity reqEntity) {

        return alarmMapper.getCount(reqEntity);
    }

    //@formatter:off
    /**
     ******************************************************************************
     * @brief     getAlarmList(アラーム情報一覧の取得)機能
     * @param     reqEntity      リクエスト(検索条件)
     * @return    アラーム情報一覧
     * @retval    アラーム情報のLIST形式で返却
     * @attention
     * @note      検索条件に一致したアラーム情報一覧の取得を行う
     * ----------------------------------------------------------------------------
     * VER.        DESCRIPTION                                               AUTHOR
     * ----------------------------------------------------------------------------
     * MACS4#0114  GUI MCSAlarmクリア対応                                 T.Iga/CSC
     ******************************************************************************
     */
    //@formatter:on
    @Transactional
    public List<AlarmListEntity> getAlarmList(ReqGetAlarmListEntity reqEntity) {

        List<AlarmModel> recList = null;

        recList = alarmMapper.selectList(reqEntity);

        if (recList == null) {
            return null;
        }

        List<AlarmListEntity> retRecList = new ArrayList<AlarmListEntity>();
        for (AlarmModel alarm : recList) {
            AlarmListEntity entity = new AlarmListEntity();
            
            //MODEL STD APL 2020.02.22 song 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000
            String setTime = alarm.getSetTime();
            String setTime1 = setTime.substring(0,4) + "/" + setTime.substring(4,6) + "/" + setTime.substring(6,8) + " " + setTime.substring(8,10) + ":" + setTime.substring(10,12) + ":" + setTime.substring(12,14);
            entity.setTime = setTime1;
            entity.alarmId = alarm.getAlarmId();
            entity.alarmText = alarm.getAlarmText();
            entity.alarmLocation = alarm.getAlarmLocation();
            entity.llcId = alarm.getLlcId();
            entity.llcName = alarm.getLlcName();
            retRecList.add(entity);
            
//            entity.occurrenceTime = ComFunction.dateToString(alarm.getOccurrenceTime());  //occurrenceTime is setTime
//			  entity.alarmCode = alarm.getAlarmCode(); 
//			  entity.alarmSubCode = alarm.getAlarmSubCode(); 
//			  entity.alarmLevel = alarm.getAlarmLevel();
//			  entity.errorId = alarm.getErrorId(); 
//			  entity.classInformation = alarm.getClassInformation(); 
//			  entity.recoveryOption = alarm.getRecoveryOption(); 
//			  entity.machineId = alarm.getMachineId();
//			  entity.zoneId = alarm.getZoneId(); 
//			  entity.stockerUnitId = alarm.getStockerUnitId(); 
//			  entity.stockerUnitState = alarm.getStockerUnitState(); 
//			  entity.carrierJobId = alarm.getCarrierJobId();
//			  entity.amhsId = alarm.getAmhsId(); 
//			  entity.sourceLocation = alarm.getSourceLocation(); 
//			  entity.destinationLocation = alarm.getDestinationLocation(); 
//			  entity.type = alarm.getType();
//			  entity.carrierId = alarm.getCarrierId(); 
//			  entity.eqpInfo = alarm.getEqpInfo();
//			  entity.amhsType = alarm.getAmhsType().toString();           // MACS4#0114 Add
//			  entity.setTime = alarm.getOccurrenceTime().toString();      // MACS4#0114 Add
			  
            //MODEL END APL 2020.02.22 song 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000
            
        }

        return retRecList;
    }

    //@formatter:off
    /**
     ******************************************************************************
     * @brief     exeDelAlarmList(アラーム情の錯書)機能
     * @param     reqEntity      リクエスト(削除対象)
     * @return
     * @retval
     * @attention
     * @note      アラームの削除を行う
     * ----------------------------------------------------------------------------
     * VER.        DESCRIPTION                                               AUTHOR
     * ----------------------------------------------------------------------------
     * MACS4#0047  GUI要望分(新規作成)                                    T.Iga/CSC
     * MACS4#0114  GUI MCSAlarmクリア対応                                 T.Iga/CSC
     ******************************************************************************
     */
    /*
    //@formatter:on
    public void exeDelAlarmList(ReqExeDelAlarmEntity reqEntity) throws McsException {

//      if (reqEntity.getAmhsId() != null) {                                    // MACS4#0114 Del
//          Amhs amhs = amhsMapper.selectByPrimaryKey(reqEntity.amhsId);        // MACS4#0114 Del

        MsgResult msgResult = new MsgResult();
            // MACS4#0114 Del Start
//          SimpleDateFormat dateFormat = new SimpleDateFormat(ComConst.DATE_TIME_FORMAT_FF6);
//          if (amhs.getAmhsType() != ComConst.AmhsType.CODE_OHVC) {
//              MsgData msgData = new MsgData(m_formatProperties, ComMsgDef.k_strAlarmServer, ComMsgDef.k_strSubSend, ComMsgDef.k_strAlarmClear);
//
//              // ヘッダ情報設定
//              msgData.setValByte(ComMsgDef.k_strKeyReply, ComMsgDef.k_btNoReply);
//              msgData.setValByte(ComMsgDef.k_strKeySrcProcType, ComMsgDef.k_btSrcProcTypeGUI);
//
//              // メッセージ本文設定
//              msgData.setValString(ComMsgDef.k_strKeyClock, dateFormat.format(new Date()));
//              msgData.setValInteger(ComMsgDef.k_strKeyAlarmID, new Long(reqEntity.getAlarmId()).intValue());
//              msgData.setValShort(ComMsgDef.k_strKeyAlarmSubCode, new Long(reqEntity.getAlarmSubCode()).shortValue());
//              msgData.setValString(ComMsgDef.k_strKeyAmhsID, reqEntity.getAmhsId());
//              msgData.setValString(ComMsgDef.k_strKeyAlarmLoc, reqEntity.getAlarmLoc());
//
//              msgResult = msgUtilService.communicationMsgSvr(msgData, ComMsgDef.k_strAlarmServer, ComMsgDef.k_strAlarmClear, false, ComMsgDef.k_strApplicationMessageItem);
//          } else {
//              MsgData msgData = new MsgData(m_formatProperties, ComMsgDef.k_strAlarmServer, ComMsgDef.k_strSubSend, ComMsgDef.k_strAlarmClearByOhvc);
//
//              // ヘッダ情報設定
//              msgData.setValByte(ComMsgDef.k_strKeyReply, ComMsgDef.k_btNoReply);
//              msgData.setValByte(ComMsgDef.k_strKeySrcProcType, ComMsgDef.k_btSrcProcTypeGUI);
//
//              // メッセージ本文設定
//              msgData.setValString(ComMsgDef.k_strKeyClearTime, dateFormat.format(new Date()));
//              msgData.setValString(ComMsgDef.k_strKeySALUnitID, reqEntity.getMachineId());
//              msgData.setValString(ComMsgDef.k_strKeyAmhsID, reqEntity.getAmhsId());
//
//              msgResult = msgUtilService.communicationMsgSvr(msgData, ComMsgDef.k_strAlarmServer, ComMsgDef.k_strAlarmClearByOhvc, false, ComMsgDef.k_strApplicationMessageItem);
//          }
            // MACS4#0114 Del End
        // MACS4#0114 Add Start
        String setTime = reqEntity.getSetTime().replaceAll("-", "").replaceAll(" ", "").replaceAll(":", "").replaceAll("\\.", "");
        MsgData msgData = new MsgData(m_formatProperties, ComMsgDef.k_strAlarmServer, ComMsgDef.k_strSubSend, ComMsgDef.k_strAlarmReset);

        // ヘッダ情報設定
        msgData.setValByte(ComMsgDef.k_strKeyReply, ComMsgDef.k_btNoReply);
        msgData.setValByte(ComMsgDef.k_strKeySrcProcType, ComMsgDef.k_btSrcProcTypeGUI);

        msgData.setValString(ComMsgDef.k_strKeyAmhsID, reqEntity.getAmhsId());
        msgData.setValString(ComMsgDef.k_strKeySetTime, setTime);
        msgData.setValInteger(ComMsgDef.k_strKeyAlarmID, new Long(reqEntity.getAlarmId()).intValue());
        msgData.setValShort(ComMsgDef.k_strKeyAlarmCode, new Long(reqEntity.getAlarmCode()).shortValue());
        msgData.setValShort(ComMsgDef.k_strKeyAlarmSubCode, new Long(reqEntity.getAlarmSubCode()).shortValue());
        msgData.setValInteger(ComMsgDef.k_strKeyAmhsType, new Long(reqEntity.getAmhsType()).intValue());

        msgResult = msgUtilService.communicationMsgSvr(msgData, ComMsgDef.k_strAlarmServer, ComMsgDef.k_strAlarmReset, false, ComMsgDef.k_strApplicationMessageItem);
        // MACS4#0114 Add End
        if (msgResult.getResult() != MsgResult.k_nResultOK) {
            // エラーメッセージはコントローラで設定
            throw new McsException("");
        }
        // MACS4#0114 Del Start
//      } else {
//          // エラーメッセージはコントローラで設定
//          throw new McsException("");
//      }
        // MACS4#0114 Del End
    }
    */
}
