//@formatter:off
/**
 ******************************************************************************
 * @file        PortsService.java
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

 ******************************************************************************
 */
//@formatter:on
package net.muratec.mcs.service.top;

//import java.text.SimpleDateFormat;            // MACS4#0114 Del
import java.util.ArrayList;
//import java.util.Date;
//import java.util.Date;                        // MACS4#0114 Del
import java.util.List;
//import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//import net.muratec.mcs.common.ComConst;
//import net.muratec.mcs.common.ComFunction;
//import net.muratec.mcs.common.ComMsgDef;
import net.muratec.mcs.entity.top.PortsListEntity;
//import net.muratec.mcs.entity.top.ReqExeDelAlarmEntity;
import net.muratec.mcs.entity.top.ReqGetPortsListEntity;
//import net.muratec.mcs.exception.McsException;
import net.muratec.mcs.mapper.PortMapper;
//import net.muratec.mcs.mapper.AmhsMapper;     // MACS4#0114 Del
import net.muratec.mcs.model.PortsModel;
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
 *              getPortsList(アラーム情報一覧の取得)
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
public class PortsService extends BaseService {

    // ------------------------------------
    // アラーム情報マッパー
    // ------------------------------------
    @Autowired private PortMapper portMapper;

    // ------------------------------------
    // AMHS情報マッパー - MACS4#0047 Add - MACS4#0114 Del
    // ------------------------------------
//  @Autowired private AmhsMapper amhsMapper;

    // ------------------------------------
    // メッセージ送受信サービス - MACS4#0047 Add
    // ------------------------------------
    // @Autowired private MsgUtilService msgUtilService;

    // ------------------------------------
    // メッセージフォーマットプロパティ - MACS4#0047 Add
    // ------------------------------------
    // @Autowired private Properties m_formatProperties;
 
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
    public int getCount(ReqGetPortsListEntity reqEntity) {

        return portMapper.getCount(reqEntity);
    }

    //@formatter:off
    /**
     ******************************************************************************
     * @brief     getPortsList(アラーム情報一覧の取得)機能
     * @param     reqEntity      リクエスト(検索条件)
     * @return    アラーム情報一覧
     * @retval    アラーム情報のLIST形式で返却
     * @attention
     * @note      検索条件に一致したアラーム情報一覧の取得を行う
     * ----------------------------------------------------------------------------
     * VER.        DESCRIPTION                                               AUTHOR
     * ----------------------------------------------------------------------------
     * MACS4#0114  GUI MCSPortsクリア対応                                 T.Iga/CSC
     ******************************************************************************
     */
    //@formatter:on
    @Transactional
    public List<PortsListEntity> getPortsList(ReqGetPortsListEntity reqEntity) {

        List<PortsModel> recList = null;

        recList = portMapper.selectList(reqEntity);

        if (recList == null) {
            return null;
        }

        List<PortsListEntity> retRecList = new ArrayList<PortsListEntity>();
        for (PortsModel port : recList) {
        	
            PortsListEntity entity = new PortsListEntity();
            
            entity.portId = port.getPortId();
            entity.tscId =  port.getTscId();
            entity.carrierId = port.getCarrierId();
            entity.alarmText = port.getAlarmText();
            entity.available = port.getAvailable();
            entity.ibsemAvail = port.getIbsemAvail();
            entity.portMode = port.getPortMode();
            
            retRecList.add(entity);
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
