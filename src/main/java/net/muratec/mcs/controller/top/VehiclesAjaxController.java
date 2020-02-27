//@formatter:off
/**
 ******************************************************************************
 * @file        VehiclesAjaxController.java
 * @brief       アラーム情報表示関連のコントローラ
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
package net.muratec.mcs.controller.top;

import java.util.Locale;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import net.muratec.mcs.annotation.OpLog;
import net.muratec.mcs.common.ComConst;
import net.muratec.mcs.common.ComFunction;
import net.muratec.mcs.controller.common.BaseAjaxController;
//import net.muratec.mcs.entity.common.AjaxResBaseEntity;
import net.muratec.mcs.entity.common.AuthenticationEntity;
//import net.muratec.mcs.entity.common.OpeLogInfoEntity;
//import net.muratec.mcs.entity.top.ReqExeDelAlarmEntity;
//import net.muratec.mcs.entity.top.ReqExeDelAlarmListTaskEntity;
import net.muratec.mcs.entity.top.ReqGetVehiclesListEntity;
import net.muratec.mcs.entity.top.ReqGetVehiclesListValidateEntity;
import net.muratec.mcs.entity.top.ResGetVehiclesListEntity;
import net.muratec.mcs.exception.AjaxAurgumentException;
import net.muratec.mcs.exception.McsException;
import net.muratec.mcs.service.common.McsDataTablesService;
import net.muratec.mcs.service.common.OpeLogService;
import net.muratec.mcs.service.top.PortsService;
import net.muratec.mcs.service.top.VehiclesService;

//@formatter:off
/**
 ******************************************************************************
 * @brief     アラーム情報表示関連のコントローラクラス
 * @par       機能:
 *              getPortsList(アラーム情報一覧の取得)
 *              setCsvPortsList(検索条件の保存を行う)
 *              exeDeletePortsList(アラームの削除を行う)
 * @attention
 * @note
 * ----------------------------------------------------------------------------
 * VER.        DESCRIPTION                                               AUTHOR
 * ----------------------------------------------------------------------------
 ******************************************************************************
 */
//@formatter:on
@Controller
public class VehiclesAjaxController extends BaseAjaxController {

    private static final Logger logger = LoggerFactory.getLogger(VehiclesAjaxController.class);

    // ------------------------------------
    // アラーム情報画面用サービス
    // ------------------------------------
    @Autowired private VehiclesService vehiclesService;

    // ------------------------------------
    // グリッド用サービス
    // ------------------------------------
    @Autowired private McsDataTablesService mcsDataTablesService;

    // ------------------------------------
    // 操作ログサービス - MACS4#0047 Add
    // ------------------------------------
    //@Autowired private OpeLogService opeLogService;

    // ------------------------------------
    // メッセージリソース - MACS4#0047 Add
    // ------------------------------------
    //@Autowired private MessageSource messageSource;

    //@formatter:off
    /**
     ******************************************************************************
     * @brief     getVehiclesList(アラーム情報表示一覧の取得)機能
     * @param     session        セッション情報(Frameworkより付加)
     * @param     reqValidate    画面より入力された情報
     * @param     errors         エラー情報(Frameworkより付加)
     * @param     locale         ロケーション情報(Frameworkより付加)
     * @param     model          モデル情報(Frameworkより付加)
     * @return    アラーム情報表示一覧検索結果
     * @retval    JSON形式で返却
     * @attention
     * @note      アラーム情報表示一覧の検索処理を行う
     * ----------------------------------------------------------------------------
     * VER.        DESCRIPTION                                               AUTHOR
     * ----------------------------------------------------------------------------
     ******************************************************************************
     */
    //@formatter:on
    @RequestMapping(value = "/Vehicles/GetVehiclesList", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    //@OpLog(screenInfo = ComConst.ScreenInfo.INFO_ALARM, logOperationType = ComConst.LogOperationType.GET, number = 3L)
    public ResGetVehiclesListEntity getVehiclesList(HttpSession session,
            @Valid @RequestBody ReqGetVehiclesListValidateEntity reqValidate, Errors errors, Locale locale, Model model)
            throws AjaxAurgumentException, McsException {

        // ------------------------------------
        // アクセス権チェック
        // ------------------------------------
        setUserInfo(session, model, locale, ComConst.ScreenInfo.INFO_ALARM.getRefAuthFuncId());

        // ------------------------------------
        // ユーザ情報の取得
        // ------------------------------------
        AuthenticationEntity sessionUserInfo = getUserInfo(session);

        // ------------------------------------
        // エラーチェック(エラー時はAjaxAurgumentExceptionをthrow)
        // ------------------------------------
        ReqGetVehiclesListEntity reqEntity = ComFunction.ajaxAurgumentCheck(errors, logger, locale, reqValidate,
                ReqGetVehiclesListEntity.class);

        // ------------------------------------
        // レスポンスエンティティ生成
        // ------------------------------------
        ResGetVehiclesListEntity resEntity = mcsDataTablesService.createResEntity(ResGetVehiclesListEntity.class, reqEntity,
                sessionUserInfo.userName, locale);

        // ------------------------------------
        // 検索処理実装判定
        // ------------------------------------
        if (reqEntity.searchDataFlag) {

            // ------------------------------------
            // データ取得、設定
            // ------------------------------------
            resEntity.body = vehiclesService.getPortsList(reqEntity);

            // ------------------------------------
            // 全体レコード数取得、設定
            // ------------------------------------
            resEntity.pageInfo.totalRecords = vehiclesService.getCount(reqEntity);
        }

        return resEntity;
    }

    //@formatter:off
    /**
     ******************************************************************************
     * @brief     setCsvAlarmList(検索条件の保存)機能
     * @param     reqEntity      画面より入力された情報
     * @param     session        セッション情報(Frameworkより付加)
     * @param     errors         エラー情報(Frameworkより付加)
     * @param     locale         ロケーション情報(Frameworkより付加)
     * @param     model          モデル情報(Frameworkより付加)
     * @return    処理結果
     * @retval    JSON形式で返却
     * @attention
     * @note      CSV出力のため、検索条件の保存を行う
     * ----------------------------------------------------------------------------
     * VER.        DESCRIPTION                                               AUTHOR
     * ----------------------------------------------------------------------------
     ******************************************************************************
     */
    /*
    //@formatter:on
    @RequestMapping(value = "/Alarm/SetCsvAlarmList", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @OpLog(screenInfo = ComConst.ScreenInfo.INFO_ALARM, logOperationType = ComConst.LogOperationType.CSV_SET,
            number = 4L)
    public AjaxResBaseEntity setCsvAlarmList(@Valid @RequestBody ReqGetAlarmListEntity reqEntity, HttpSession session,
            Errors errors, Locale locale, Model model) throws AjaxAurgumentException, McsException {

        // アクセス権チェック
        setUserInfo(session, model, locale, ComConst.ScreenInfo.INFO_ALARM.getRefAuthFuncId());
        // レスポンスエンティティ生成
        // 返すJSON全体のオブジェクトをnew

        // 戻り値宣言
        AjaxResBaseEntity resEntity = new AjaxResBaseEntity();

        String sessionKey = ComConst.ScreenInfo.INFO_ALARM.getFunctionId() + ComConst.SessionKey.CSV_INFO;

        super.setSessionAttribute(session, sessionKey, reqEntity);
        // 実行結果設定
        resEntity.result.status = ComConst.AjaxStatus.SUCCESS;
        resEntity.result.message = "";

        return resEntity;
    }
     */
    //@formatter:off
    /**
     ******************************************************************************
     * @brief     exeDeleteAlarmList(アラームの削除)機能
     * @param     reqEntity      画面より入力された情報
     * @param     session        セッション情報(Frameworkより付加)
     * @param     errors         エラー情報(Frameworkより付加)
     * @param     locale         ロケーション情報(Frameworkより付加)
     * @param     model          モデル情報(Frameworkより付加)
     * @return    処理結果
     * @retval    JSON形式で返却
     * @attention
     * @note      アラームの削除を行う
     * ----------------------------------------------------------------------------
     * VER.        DESCRIPTION                                               AUTHOR
     * ----------------------------------------------------------------------------
     * MACS4#0047  GUI要望分(新規作成)                                    T.Iga/CSC
     ******************************************************************************
     */
    /*
    //@formatter:on
    @RequestMapping(value = "/Alarm/ExeDeleteAlarmList", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public AjaxResBaseEntity exeDeleteAlarmList(@Valid @RequestBody ReqExeDelAlarmListTaskEntity reqValidate, HttpSession session,
            Errors errors, Locale locale, Model model) throws AjaxAurgumentException, McsException {

        // アクセス権チェック
        setUserInfo(session, model, locale, ComConst.ScreenInfo.INFO_ALARM.getChgAuthFuncId());

        // レスポンスエンティティ生成
        // 返すJSON全体のオブジェクトをnew

        OpeLogInfoEntity opeLogInfo = ComFunction.createOpeLogInfo(session, ComConst.ScreenInfo.INFO_ALARM, ComConst.LogOperationType.EXECUTE, 5L);

        int nErrCnt = 0;
        int nSucCnt = 0;
        String strErrMsg = "";
        for (ReqExeDelAlarmEntity reqEntity: reqValidate.delete) {
            try {
                alarmService.exeDelAlarmList(reqEntity);
                nSucCnt++;

                // 正常時に操作ログ出力
                String delParam = ComFunction.toStringMcs(reqEntity);
                opeLogService.getOpeLog(opeLogInfo.logCode, delParam, opeLogInfo.userName, opeLogInfo.ipAddress);
            } catch (Exception e) {
                // エラーメッセージ作成
                if (nErrCnt == 0) {
                    strErrMsg = "Alarm ID = " + reqEntity.getAlarmId() + " AMHS ID = " + reqEntity.getAmhsId();
                } else {
                    strErrMsg += "\n Alarm ID = " + reqEntity.getAlarmId() + " AMHS ID = " + reqEntity.getAmhsId();
                }
                nErrCnt++;
            }
        }

        // 戻り値宣言
        AjaxResBaseEntity resEntity = new AjaxResBaseEntity();

        // 実行結果設定
        if (nErrCnt == 0) {
            // すべて成功時
            resEntity.result.status = ComConst.AjaxStatus.SUCCESS;
            resEntity.result.message = "";
            resEntity.result.value = String.valueOf(nSucCnt);
        } else {
            // 失敗含む
            String[] strArgs = { String.valueOf(nErrCnt), String.valueOf(reqValidate.delete.size()) };
            String strMsg = messageSource.getMessage("ERR0016", strArgs, "ERR0016", locale);
            resEntity.result.status = ComConst.AjaxStatus.ERROR;
            resEntity.result.message = strMsg + "\n" + strErrMsg + "\n";
            resEntity.result.value = String.valueOf(nSucCnt) + ',' + String.valueOf(nErrCnt);
        }

        return resEntity;
    }
    */
}