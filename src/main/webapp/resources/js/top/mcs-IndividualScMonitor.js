﻿/**
 ******************************************************************************
 * @file        mcs-IndividualScMonitor.js
 * @brief       個別モニタ(SCモニタ)関連のJavaScript
 * @par
 * @author      CSC
 * $Id:         $
 * @attention
 *
 * Copyright (c) 2016 MURATA MACHINERY,LTD. All rights reserved.
 *
 * @note        Tabstop=2
 * ----------------------------------------------------------------------------
 * DATE       VER.        DESCRIPTION                                    AUTHOR
 * ----------------------------------------------------------------------------
 * 2017/09/20 0.5         Step4リリース                                     CSC
 ******************************************************************************
 */
$(function() {
  /* Step4 2017_08_10：ウィンドウ生成時にフォーカスを当てるよう修正 */
  focus();

  // Step4 2017_09_06
  // 非アクティブ状態でも自動更新を行う
  AutoReloadTimerManager.setEnableBlurExecute();

  // 画面の番号定義
  const
  SCREEN = {
    STATE: 0,
    PORT: 1,
    //MICRO_CMD: 2,  
    //TRN_JOB: 3
  };

  // 現在表示している画面の番号
  var screenIndex;

  // 直近の検索成功時の検索条件(amhsId)
  var latestAmhsId;
  var latestTscId;

  // AMHS選択用セレクトボックス生成
  var amhsSelBox = new McsSelectBox($('#sel-amhs'));
  var amhsNameList = screenValue.llcNames;  //2020.02.24 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000
  amhsSelBox.setList(amhsNameList);
  amhsSelBox.setValue(screenValue.llcId); //2020.02.24 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000

  //STD APL 2020.03.02 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
  //var tscId = screenValue.tscId;  //2020.02.27 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000
  //END APL 2020.03.02 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
  
  amhsSelBox.onChange(function() {
    /* Step4 2017_08_16 */
    // エラー表示をクリア
    selComp.clearErrors();
	// STD APL 2020.02.28 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
    //getData(amhsSelBox.getValue(), true);//20200228 dqy del
    //STD APL 2020.03.02 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
    getData(amhsSelBox.getValue().substring(0,3),amhsSelBox.getValue().substring(3), true);
    //END APL 2020.03.02 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
	// END APL 2020.02.28 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 

  });

  // コンポーネントマネージャ
  var selComp = new McsComponentManager();
  /* Step4 2017_08_16 */
  selComp.add('llcId', amhsSelBox);  //2020.02.24 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000

  // スライドメニュー生成
  var slideMenuTop = McsSlideMenu.primaryMenuSlide;
  creTopMenu();

  // ---------------------------------------
  // 状態画面コンポーネント生成
  // ---------------------------------------

  // テキストボックス
  //STD APL 2020.02.25 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
  var stateLlcName = new McsTextBox($('#state-llc-name'));
//  var stateLlcId = new McsTextBox($('#'));
//  var stateLlcType= new McsTextBox($('#'));
  var stateLlcMode = new McsTextBox($('#state-llc-mode'));
  var stateAvailable = new McsTextBox($('#state-available'));
  var stateControlState = new McsTextBox($('#state-control-state'));
  var stateAlarmState = new McsTextBox($('#state-alarm-state'));
  var stateCommState = new McsTextBox($('#state-comm-state'));
  var stateSystemState = new McsTextBox($('#state-system-state'));
  //END APL 2020.02.25 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
  
  //STD APL 2020.02.28 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
  //TSC DATA
  var stateTscName = new McsTextBox($('#state-tsc-name'));
  var stateTscMode = new McsTextBox($('#state-tsc-mode'));
  var stateTscAvailable = new McsTextBox($('#state-tsc-available'));
  //STOKER DATA
  var stateCraneId = new McsTextBox($('#state-crane-id'));
  var stateCraneState = new McsTextBox($('#state-crane-state'));
  var stateStokerAvailable = new McsTextBox($('#state-stoker-available'));
  var stateStokerAlarmState = new McsTextBox($('#state-stoker-alarm-state'));
  
  stateTscName.setReadonly(true);
  stateTscMode.setReadonly(true);
  stateTscAvailable.setReadonly(true);
  
  stateCraneId.setReadonly(true); 
  stateCraneState.setReadonly(true); 
  stateStokerAvailable.setReadonly(true); 
  stateStokerAlarmState.setReadonly(true);
  //END APL 2020.02.28 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
  
  // テキストボックス読み取り専用化
  stateLlcName.setReadonly(true);
  stateLlcMode.setReadonly(true); 
  stateAvailable.setReadonly(true);
  stateControlState.setReadonly(true);
  stateAlarmState.setReadonly(true);
  stateCommState.setReadonly(true);
  stateSystemState.setReadonly(true);
  
  // テーブル
  var stateTable = new McsTable($('#state-table-target'));
  stateTable.setNotRowSelect(true);
  
  // 状態テーブルヘッダ(状態テーブル)
  var stateHeader = [/*{
    name: 'setTime',
    text: screenText.state.alarmDateTime,
    display: true
  },*/ {
    name: 'alarmId',
    text: screenText.state.alarmId,
    display: true
  }, {
    name: 'alarmText',
    text: screenText.state.alarmText,
    display: true
  }, {
    name: 'alarmLoc',
    text: screenText.state.alarmLoc,
    display: true
  }/*, {
    name: 'vehicleId',
    text: screenText.state.vehicleId,
    display: true
  }*/];

  // ヘッダ設定(状態テーブル)
  stateTable.setHeader(stateHeader);
//  stateTable.setBodyHeight($('.mcs-content.mcs-with-subheader.mcs-with-subtitle').outerHeight() - 40);

  //STD APL 2020.02.28 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
  var stokerZoneTable = new McsTable($('#state-stokerZoneTable-target'));
  stokerZoneTable.setNotRowSelect(true);
  
  // 状態テーブルヘッダ(状態テーブル)
  var stokerZoneHeader = [{
    name: 'empty',
    text: screenText.stokerZone.empty,
    display: true
  }, {
    name: 'occupied',
    text: screenText.stokerZone.occupied,
    display: true
  }, {
    name: 'reserved',
    text: screenText.stokerZone.reserved,
    display: true
  }, {
	    name: 'total',
	    text: screenText.stokerZone.total,
	    display: true
	  }];
  
  // ヘッダ設定(状態テーブル)
  stokerZoneTable.setHeader(stokerZoneHeader);
  //stokerZoneTable.setBodyHeight($('.mcs-content.mcs-with-subheader.mcs-with-subtitle').outerHeight() - 40);
  //stokerZoneTable.setBodyHeight(50);
  //END APL 2020.02.28 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 

  //STD APL 2020.03.03 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
  var vehicleTable = new McsTable($('#state-vehicleTable-target'));
  vehicleTable.setNotRowSelect(true);
  
  // 状態テーブルヘッダ(状態テーブル)
  var vehicleHeader = [{
    name: 'vehicleId',
    text: screenText.vehicle.vehicleId,
    display: true
  }, {
    name: 'alarmText',
    text: screenText.vehicle.alarmText,
    display: true
  }, {
    name: 'vehicleKind',
    text: screenText.vehicle.vehicleKind,
    display: true
  }, {
	    name: 'vehicleState',
	    text: screenText.vehicle.vehicleState,
	    display: true
	  }];
  
  // ヘッダ設定(状態テーブル)
  vehicleTable.setHeader(vehicleHeader);
//  vehicleTable.setBodyHeight($('.mcs-content.mcs-with-subheader.mcs-with-subtitle').outerHeight() - 40);
 
  // ---------------------------------------
  // ポート画面コンポーネント生成
  // ---------------------------------------
  // ポートテーブル生成
//  var portTable = new McsTable($('#port-table-target'));
  var portTable = new McsTable($('#state-portTable-target'));
  portTable.setNotRowSelect(true);

  // ポートテーブルヘッダ
  var portHeader = [{
    name: 'portId',
    text: screenText.port.portId,
    display: true
  }, {
    name: 'carrierId',
    text: screenText.port.carrierId,
    display: true
  }, {
    name: 'available',
    text: screenText.port.available,
    display: true
  }, {
    name: 'ibsemAvail',
    text: screenText.port.ibsemAvail,
    display: true
  },{
	    name: 'portMode',
	    text: screenText.port.portMode,
	    display: true
	  }];
  
  // ヘッダ設定(ポートテーブル)
  portTable.setHeader(portHeader);
//  portTable.setBodyHeight($('.mcs-content.mcs-with-subheader.mcs-with-subtitle').outerHeight() - 40);
  //END APL 2020.03.03 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
  
  // ---------------------------------------
  // Microコマンド画面コンポーネント生成
  // ---------------------------------------
  // Microコマンドテーブル生成
  var microCmdTable = new McsTable($('#microCmd-table-target'));
  microCmdTable.setNotRowSelect(true);

  // Step4 2017/09/04
  // Microコマンドテーブルヘッダ
  var microCmdHeader = [{
    name: 'commandId',
    text: screenText.microCmd.commandId,
    display: true
  }, {
    name: 'priority',
    align: 'right',
    text: screenText.microCmd.priority,
    display: true
  }, {
    name: 'carrierId',
    text: screenText.microCmd.carrierId,
    display: true
  }, {
    name: 'srcLoc',
    text: screenText.microCmd.microFrom,
    display: true
  }, {
    name: 'dstLoc',
    text: screenText.microCmd.microTo,
    display: true
  }, {
    name: 'carrierJobState',
    text: screenText.microCmd.jobState,
    display: true
  }, {
    name: 'waitInTime',
    text: screenText.microCmd.waitInTime,
    display: true
  }];

  // ヘッダ設定(Microコマンドテーブル)
  microCmdTable.setHeader(microCmdHeader);
  microCmdTable.setBodyHeight($('.mcs-content.mcs-with-subheader.mcs-with-subtitle').outerHeight() - 40);

  // ---------------------------------------
  // 搬送Job画面コンポーネント生成
  // ---------------------------------------
  // 搬送Jobテーブル生成
  var trnJobTable = new McsTable($('#trnJob-table-target'));
  trnJobTable.setNotRowSelect(true);

  // Step4 2017/09/04
  // 搬送Jobテーブルヘッダ
  var trnJobHeader = [{
    name: 'receivedTime',
    text: screenText.transferJob.waitTime,
    display: true
  }, {
    name: 'jobOwner',
    text: screenText.transferJob.jobOwner,
    display: true
  }, {
    name: 'carrierId',
    text: screenText.transferJob.carrierId,
    display: true
  }, {
    name: 'priority',
    align: 'right',
    text: screenText.transferJob.priority,
    display: true
  }, {
    name: 'carrierJobState',
    text: screenText.transferJob.carrierJobState,
    display: true
  }, {
    name: 'currentLoc',
    text: screenText.transferJob.location,
    display: true
  }, {
    name: 'srcAmhsId',
    text: screenText.transferJob.fromAmhsId,
    display: true
  }, {
    name: 'srcLoc',
    text: screenText.transferJob.fromPort,
    display: true
  }, {
    name: 'dstAmhsId',
    text: screenText.transferJob.toAmhsId,
    display: true
  }, {
    name: 'dstLoc',
    text: screenText.transferJob.toPort,
    display: true
  }, {
    name: 'microFrom',
    text: screenText.transferJob.microFrom,
    display: true
  }, {
    name: 'microTo',
    text: screenText.transferJob.microTo,
    display: true
  }, {
    name: 'amhsId',
    text: screenText.transferJob.controller,
    display: true
  }, {
    name: 'waitInTime',
    text: screenText.transferJob.waitInTime,
    display: true
  }];

  // ヘッダ設定(搬送Jobテーブル)
  trnJobTable.setHeader(trnJobHeader);
  trnJobTable.setBodyHeight($('.mcs-content.mcs-with-subheader.mcs-with-subtitle').outerHeight() - 40);

  // ---------------------------------------
  // 初期表示処理
  // ---------------------------------------
  // 状態画面の表示
  showStateScreen();
  // 状態画面のデータ取得、表示
//  getState(amhsSelBox.getValue(), true);//20200228 DQY DEL
  getState(amhsSelBox.getValue().substring(0,3),amhsSelBox.getValue().substring(3), true);//20200228 DQY ADD//20200302 DQY DEL
//  getState(llcId,tscId, true);//20200302 DQY ADD
  // 自動更新有効化
  AutoReloadTimerManager.addTimeoutCallback(function() {
    if (latestAmhsId !== undefined) {
//      getData(latestAmhsId, false, true, true);//20200228 dqy del
      getData(latestAmhsId,latestTscId, false, true, true);//20200302 dqy add
    }
    AutoReloadTimerManager.start();
  });
  AutoReloadTimerManager.start();

  /**
   ******************************************************************************
   * @brief   右スライドメニュー生成メソッド
   * @param
   * @return
   * @retval
   * @attention
   * @note    ボタン等のコンポーネント生成を行い、各処理を設定。
   * ----------------------------------------------------------------------------
   * VER.        DESCRIPTION                                               AUTHOR
   * ----------------------------------------------------------------------------
   ******************************************************************************
   */
  function creTopMenu() {
    // ボタン生成
    var reloadBtn = new McsButton($('#btn-reload'), screenText.slideMenuBtn.reload);
    var stateBtn = new McsButton($('#btn-state'), screenText.slideMenuBtn.state);
    var portBtn = new McsButton($('#btn-port'), screenText.slideMenuBtn.port);
    //var microCmdBtn = new McsButton($('#btn-micro-cmd'), screenText.slideMenuBtn.microCmd);
    //var trnJobBtn = new McsButton($('#btn-trn-job'), screenText.slideMenuBtn.transferJob);
    var rtnBtn = new McsButton($('#btn-return'), screenText.slideMenuBtn.ret);

    // 再表示ボタン押下処理
    reloadBtn.onClick(function() {
      if (latestAmhsId !== undefined) {
        /* Step4 2017_08_16 */
        // エラー表示をクリア
        selComp.clearErrors();

//        getData(latestAmhsId, false, true);//20200228 dqy del
        getData(latestAmhsId,latestTscId, false, true);//20200302 dqy add
      }
    });

    // 状態ボタン押下処理
    stateBtn.onClick(function() {
      /* Step4 2017_08_16 */
      // エラー表示をクリア
      selComp.clearErrors();
      // 状態画面のデータ取得、表示
//      getState(amhsSelBox.getValue(), false);
      getState(amhsSelBox.getValue(),tscId, false);//20200228 dqy mod
    });

    // ポートボタン押下処理
    portBtn.onClick(function() {
      /* Step4 2017_08_16 */
      // エラー表示をクリア
      selComp.clearErrors();
      // ポート画面のデータ取得、表示
      getPort(amhsSelBox.getValue(), false);
    });

    
    // Microコマンドボタン押下処理
//    microCmdBtn.onClick(function() {
//      /* Step4 2017_08_16 */
//      // エラー表示をクリア
//      selComp.clearErrors();
//      // Microコマンド画面のデータ取得、表示
//      getMicroCmd(amhsSelBox.getValue(), false);
//    });

    // 搬送Jobボタン押下処理
//    trnJobBtn.onClick(function() {
//      /* Step4 2017_08_16 */
//      // エラー表示をクリア
//      selComp.clearErrors();
//      // 搬送Job画面のデータ取得、表示
//      getTrnJob(amhsSelBox.getValue(), false);
//    });

    // 戻るボタン押下処理
    rtnBtn.onClick(function() {
      slideMenuTop.toggle();
    });
  }

  /**
   ******************************************************************************
   * @brief   状態画面表示メソッド
   * @param
   * @return
   * @retval
   * @attention
   * @note    状態画面の表示を行う。
   * ----------------------------------------------------------------------------
   * VER.        DESCRIPTION                                               AUTHOR
   * ----------------------------------------------------------------------------
   ******************************************************************************
   */
  function showStateScreen() {
    // 表示画面番号の更新
    screenIndex = SCREEN.STATE;

    // 状態ボタン非表示
    $('#btn-state').hide();
    $('#btn-port').show();
    $('#btn-micro-cmd').show();
    $('#btn-trn-job').show();

    // 各画面の表示切替
    $('#state-screen').show();
    $('#port-screen').hide();
    $('#microCmd-screen').hide();
    $('#trnJob-screen').hide();

    // テーブルのヘッダ幅調整
    stateTable.resizeColWidth();
    stokerZoneTable.resizeColWidth();//DQY ADD 20200228
  }

  /**
   ******************************************************************************
   * @brief   ポート画面表示メソッド
   * @param
   * @return
   * @retval
   * @attention
   * @note    ポート画面の表示を行う。
   * ----------------------------------------------------------------------------
   * VER.        DESCRIPTION                                               AUTHOR
   * ----------------------------------------------------------------------------
   ******************************************************************************
   */
  function showPortScreen() {
    // 表示画面番号の更新
    screenIndex = SCREEN.PORT;

    // ポートボタン非表示
    $('#btn-state').show();
    $('#btn-port').hide();
    //$('#btn-micro-cmd').show();
    //$('#btn-trn-job').show();

    // 各画面の表示切替
    $('#state-screen').hide();
    $('#port-screen').show();
    //$('#microCmd-screen').hide();
    //$('#trnJob-screen').hide();

    // テーブルのヘッダ幅調整
    portTable.resizeColWidth();
  }

  /**
   ******************************************************************************
   * @brief   Microコマンド画面表示メソッド
   * @param
   * @return
   * @retval
   * @attention
   * @note    Microコマンド画面の表示を行う。
   * ----------------------------------------------------------------------------
   * VER.        DESCRIPTION                                               AUTHOR
   * ----------------------------------------------------------------------------
   ******************************************************************************
   */
  function showMicroCmdScreen() {
    // 表示画面番号の更新
    screenIndex = SCREEN.MICRO_CMD;

    // Micoroコマンドボタン非表示
    $('#btn-state').show();
    $('#btn-port').show();
    $('#btn-micro-cmd').hide();
    $('#btn-trn-job').show();

    // 各画面の表示切替
    $('#state-screen').hide();
    $('#port-screen').hide();
    $('#microCmd-screen').show();
    $('#trnJob-screen').hide();

    // テーブルのヘッダ幅調整
    microCmdTable.resizeColWidth();
  }

  /**
   ******************************************************************************
   * @brief   搬送Job画面表示メソッド
   * @param
   * @return
   * @retval
   * @attention
   * @note    搬送Job画面の表示を行う。
   * ----------------------------------------------------------------------------
   * VER.        DESCRIPTION                                               AUTHOR
   * ----------------------------------------------------------------------------
   ******************************************************************************
   */
  function showTrnJobScreen() {
    // 表示画面番号の更新
    screenIndex = SCREEN.TRN_JOB;

    // 搬送Jobボタン非表示
    $('#btn-state').show();
    $('#btn-port').show();
    $('#btn-micro-cmd').show();
    $('#btn-trn-job').hide();

    // 各画面の表示切替
    $('#state-screen').hide();
    $('#port-screen').hide();
    $('#microCmd-screen').hide();
    $('#trnJob-screen').show();

    // テーブルのヘッダ幅調整
    trnJobTable.resizeColWidth();
  }

  /**
   ******************************************************************************
   * @brief   表示画面のデータ取得メソッド
   * @param   {String} amhsId 検索条件のAMHSID
   * @param   {boolean} ctrlChgFlag(true:コントローラ変更時 / false:画面遷移時)
   * @param   {boolean} scrollFixFlag
   *                    (true:スクロール位置保持 / false:スクロール位置初期化)
   * @return
   * @retval
   * @attention
   * @note    現在表示している画面のデータを取得する。
   * ----------------------------------------------------------------------------
   * VER.        DESCRIPTION                                               AUTHOR
   * ----------------------------------------------------------------------------
   ******************************************************************************
   */
//  function getData(amhsId, ctrlChgFlag, scrollFixFlag, autoReloadFlag) {
  function getData(amhsId, tscId,ctrlChgFlag, scrollFixFlag, autoReloadFlag) {//20200228 dqy add
    switch (screenIndex) {
      case SCREEN.STATE:
//        getState(amhsId, ctrlChgFlag, scrollFixFlag, autoReloadFlag);
        getState(amhsId,tscId, ctrlChgFlag, scrollFixFlag, autoReloadFlag);//20200228 dqy add
        break;
      case SCREEN.PORT:
        getPort(amhsId, ctrlChgFlag, scrollFixFlag, autoReloadFlag);
        break;
//      case SCREEN.MICRO_CMD:
//        getMicroCmd(amhsId, ctrlChgFlag, scrollFixFlag, autoReloadFlag);
//        break;
//      case SCREEN.TRN_JOB:
//        getTrnJob(amhsId, ctrlChgFlag, scrollFixFlag, autoReloadFlag);
//        break;
    }
  }

  /**
   ******************************************************************************
   * @brief   状態取得メソッド
   * @param   {String} amhsId 検索条件のAMHSID
   * @param   {boolean} ctrlChgFlag(true:コントローラ変更時 / false:画面遷移時)
   * @param   {boolean} scrollFixFlag
   *                    (true:スクロール位置保持 / false:スクロール位置初期化)
   * @return
   * @retval
   * @attention
   * @note    状態の取得を行う。
   * ----------------------------------------------------------------------------
   * VER.        DESCRIPTION                                               AUTHOR
   * ----------------------------------------------------------------------------
   ******************************************************************************
   */
    //function getState(amhsId, ctrlChgFlag, scrollFixFlag, autoReloadFlag) { //20191225 Song DEL
//   function getState(llcId, ctrlChgFlag, scrollFixFlag, autoReloadFlag) {//20191225 Song ADD   
   function getState(llcId, tscId,ctrlChgFlag, scrollFixFlag, autoReloadFlag) {//20191225 Song ADD   
    var url = getUrl('/Individual/GetScStateInfo');
    var cond = {
      //amhsId: amhsId,      //20191223 Song Del
      llcId: llcId,	 //2020.02.24 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000
      tscId: tscId,	 //2020.02.28 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000
      ctrlChgFlag: ctrlChgFlag
    };

    // 成功時処理
    var onSuccess = function(retObj) {
      // 直近の検索成功時のAMHSIDを更新
      //latestAmhsId = amhsId;   //20191223 Song Del
      latestAmhsId = llcId;  //2020.02.24 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000
      latestTscId = tscId;//20200302 DQY ADD

      // スクロール位置を保持
      var top = stateTable.getScrollTop();
      var left = stateTable.getScrollLeft();

      // 表示をクリア
      clearState();
      showPortScreen()
      
      if (retObj.body) {
        // テキストボックスのデータ
        var textValue = retObj.body.state;
        // テーブルのデータ
        var tableValue = retObj.body.alarmList;
        var stokerZoneTableValue = retObj.body.stokerZoneList;
        var portTableValue = retObj.body.portList;
        var vehicleTableValue = retObj.body.vehicleList;

	    // STD APL 2020.02.28 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
        var tscMode = textValue.tscMode;
        var tscAvailable = textValue.tscAvailable;
        var tscAlarmState = textValue.tscAlarmState;
        var downCount = textValue.downCount;
//        var tscMode = textValue.tscMode;
//        var tscMode = textValue.tscMode;
        // END APL 2020.02.28 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 

        // データをテキストボックスにセット
        stateLlcName.setValue(textValue.llcName);
        stateLlcMode.setValue(textValue.llcMode); 
        stateAlarmState.setValue(textValue.alarmState);
        stateCommState.setValue(textValue.commState);
        stateControlState.setValue(textValue.controlState);
        stateSystemState.setValue(textValue.systemState);
        stateAvailable.setValue(textValue.available);
        
        stateTscName.setValue(textValue.tscName);
        stateTscMode.setValue(textValue.tscMode);
        stateTscAvailable.setValue(textValue.tscAvailable);
        
        stateCraneId.setValue(textValue.craneId); 
        stateCraneState.setValue(textValue.craneStatus); 
        stateStokerAvailable.setValue(textValue.stokerAvailable); 
        stateStokerAlarmState.setValue(textValue.stokerAlarmState);
        
        var test = stateStokerAlarmState.getValue();
        
        // STD APL 2020.02.26 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
        /**
    	 * LLCのステータスに基づきコントローラの背景色を設定します。
    	 */
        //LLC_NAME
        if(stateCommState.getValue()!="Communicating"){
        	// Communication State Error PINK
        	$("#state-llc-name input[name='colorText']").css('background-color','#FF00FF');
        }
        else if(stateLlcMode.getValue()!="Up"){
        	// Down YELLOW gold
        	$("#state-llc-name input[name='colorText']").css('background-color','#FFD700');
        }
        else if(stateAvailable.getValue()!="Available"){
        	// Error RED
        	$("#state-llc-name input[name='colorText']").css('background-color','#FF0000');
        }
        else if(stateAlarmState.getValue()!="NoAlarms"){
        	// アラーム発生 ORANGE
        	$("#state-llc-name input[name='colorText']").css('background-color','#FF7536');
        }
        else if(stateControlState.getValue()!="Online/Remote"){
        	// Control State Error PURPLE
        	$("#state-llc-name input[name='colorText']").css('background-color','#7575FF');
        }
        else  if(stateSystemState.getValue()!="Auto"){
        	// System State Error LIGHTBLUE
        	$("#state-llc-name input[name='colorText']").css('background-color','#75FFFF');
        }
        else{
        	$("#state-llc-name input[name='colorText']").css('background-color','#90EE90');
        }
        
 		//CONTROL_STATE
    	if(stateCommState.getValue()!="Communicating"){
        	// Communication State Error PINK
        	$("#state-comm-state input[name='colorText']").css('background-color','#FF00FF');
        }
    	else{
        	$("#state-comm-state input[name='colorText']").css('background-color','#90EE90');
        }
    	
    	if(stateLlcMode.getValue()!="Up"){
        	// Down YELLOW
        	$("#state-llc-mode input[name='colorText']").css('background-color','#FFD700');
        }
        else{
        	$("#state-llc-mode input[name='colorText']").css('background-color','#90EE90');
        }
    	
        if(stateAvailable.getValue()!="Available"){
        	// Error RED
        	$("#state-available input[name='colorText']").css('background-color','#FF0000');
        }
        else{
        	$("#state-available input[name='colorText']").css('background-color','#90EE90');
        }
        //ALARM_STATE
        if(stateAlarmState.getValue()!="NoAlarms"){
        	// アラーム発生 ORANGE
        	$("#state-alarm-state input[name='colorText']").css('background-color','#FF7536');
        }
        else{
        	$("#state-alarm-state input[name='colorText']").css('background-color','#90EE90');
        }
        
        if(stateControlState.getValue()!="Online/Remote"){
        	// Control State Error PURPLE
        	$("#state-control-state input[name='colorText']").css('background-color','#7575FF');
        }
        else{
        	$("#state-control-state input[name='colorText']").css('background-color','#90EE90');
        }
        //SYSTEM_STATE(OCDC State)
        if(stateSystemState.getValue()!="Auto"){
        	// System State Error LIGHTBLUE
        	$("#state-system-state input[name='colorText']").css('background-color','#75FFFF');
        }
        else{
        	$("#state-system-state input[name='colorText']").css('background-color','#90EE90');
        }
        // END APL 2020.02.26 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
	    // STD APL 2020.02.28 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
        //TSC TABLE STATE COLOR ADD
        
        //TSC_NAME COLOR
        if(tscMode == "Down"){
        	// Down YELLOW
        	$("#state-tsc-name input[name='colorText']").css('background-color','#FFFF00');
        }
        else if(tscAvailable != "Available"){
        	// Error RED
        	$("#state-tsc-name input[name='colorText']").css('background-color','#FF5555');
        }
        else if(tscMode == "OUT_ONLY"){
        	// OUT_ONLY PURPLE
        	$("#state-tsc-name input[name='colorText']").css('background-color','#A349A4');
        }
        else if(tscAlarmState!="NoAlarms"){
        	// アラーム発生 ORANGE
        	$("#state-tsc-name input[name='colorText']").css('background-color','#FFA500');
        }
        else if(downCount > 0){
        	$("#state-tsc-name input[name='colorText']").css('background-color','#F0E68C');
        }
        else
        {
        	//green
        	$("#state-tsc-name input[name='colorText']").css('background-color','#90EE90');
        }
        
        //TSC_MODE
        if(tscMode == "Down"){
	    	// Down YELLOW
	    	$("#state-tsc-mode input[name='colorText']").css('background-color','#FFFF00');
        }
        else if(tscMode == "OUT_ONLY"){
        	// OUT_ONLY PURPLE
        	$("#state-tsc-mode input[name='colorText']").css('background-color','#A349A4');
        }
        else
        {
        	//green
        	$("#state-tsc-mode input[name='colorText']").css('background-color','#90EE90');
        }
        
        //TSC_AVAILABLE
        if(tscAvailable != "Available"){
        	// Error RED
        	$("#state-tsc-available input[name='colorText']").css('background-color','#FF5555');
        }
        else
        {
        	//green
        	$("#state-tsc-available input[name='colorText']").css('background-color','#90EE90');
        }
        // END APL 2020.02.28 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
        // STD APL 2020.03.02 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
        if(stateCraneId.getValue()==null || stateCraneId.getValue() == "")
        {
        	stateCraneId.setDisabled(true);
        	stateCraneState.setDisabled(true); 
            stateStokerAvailable.setDisabled(true); 
            stateStokerAlarmState.setDisabled(true);
        }
        else{
        	stateCraneId.setDisabled(false);
        	stateCraneState.setDisabled(false); 
            stateStokerAvailable.setDisabled(false); 
            stateStokerAlarmState.setDisabled(false);
        // END APL 2020.03.02 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
        // STD APL 2020.03.01 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
        //STOCKER STATE COLOR
        
	        //CraneId color
	        if(stateStokerAvailable.getValue()!="Available"){
	        	// Error RED
	        	$("#state-crane-id input[name='colorText']").css('background-color','#FF5555');
	        }
	        else if(stateStokerAlarmState.getValue()!="NoAlarms"){
	        	// アラーム発生 ORANGE
	        	$("#state-crane-id input[name='colorText']").css('background-color','#FFA500');
	        }
	        else 
	        {
	        	//green
	        	$("#state-crane-id input[name='colorText']").css('background-color','#90EE90');
	        }
	        
	        //STOKER-AVAILABLE
	        if(stateStokerAvailable.getValue()!="Available"){
	        	// Error RED
	        	$("#state-stoker-available input[name='colorText']").css('background-color','#FF5555');
	        }
	        else 
	        {
	        	//green
	        	$("#state-stoker-available input[name='colorText']").css('background-color','#90EE90');
	        }
	        //Crane Status
	        	//green
	        	$("#state-crane-state input[name='colorText']").css('background-color','#90EE90');
	        
	        //STOKER-ALARM-STATE
	        if(stateStokerAlarmState.getValue()!="NoAlarms"){
	        	// アラーム発生 ORANGE
	        	$("#state-stoker-alarm-state input[name='colorText']").css('background-color','#FFA500');
	        }
	        else 
	        {
	        	//green
	        	$("#state-stoker-alarm-state input[name='colorText']").css('background-color','#90EE90');
	        }
        
        // END APL 2020.03.01 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
	    // STD APL 2020.03.02 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
         }
	    // END APL 2020.03.02 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
        
       /* 
        //PIECE_MODE
        if(textValue.pieceMode==null || textValue.pieceMode == "")
        {
        	pieceMode.setDisabled(true);
        }
        else{
        	pieceMode.setDisabled(false);
        	if(pieceMode.getValue()!="Up"){
        		$("#piece-mode input[name='colorText']").css('background-color','#ff0000');
            }
            else{
            	$("#piece-mode input[name='colorText']").css('background-color','#38FF61');
            }
        	
        }*/
        
        // データをテーブルにセット
        stateTable.addDataList(tableValue);
        
        // STD APL 2020.02.28 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
        stokerZoneTable.addDataList(stokerZoneTableValue);
        
        // END APL 2020.02.28 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
        // STD APL 2020.03.04 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
        portTable.addDataList(portTableValue);
        vehicleTable.addDataList(vehicleTableValue);
        
        var stateTableSize = stateTable.getRowCount();
        if(stateTableSize == 0){
        	$('#state-table-target').hide();
        }
        else if(stateTableSize < 11){
        	stateTable.setBodyHeight(50*stateTableSize);
        }
        else{
        	stateTable.setBodyHeight(50*10);
        }
        
        var stokerZoneTableSize = stokerZoneTable.getRowCount();
        if(stokerZoneTableSize == 0){
        	$('#state-stokerZoneTable-target').hide();
        }
        else if(stokerZoneTableSize < 11){
        	stokerZoneTable.setBodyHeight(50*stokerZoneTableSize);
        }
        else{
        	stokerZoneTable.setBodyHeight(50*10);
        }
        
        var portTableSize = portTable.getRowCount();
        if(portTableSize == 0){
        	$('#state-portTable-target').hide();
        }
        else if(portTableSize < 11){
        	portTable.setBodyHeight(50*portTableSize);
        }
        else{
        	portTable.setBodyHeight(50*10);
        }
        
        var vehicleTableSize = vehicleTable.getRowCount();
        if(vehicleTableSize == 0){
        	$('#state-vehicleTable-target').hide();
        }
        else if(vehicleTableSize < 11){
        	vehicleTable.setBodyHeight(50*vehicleTableSize);
        }
        else{
        	vehicleTable.setBodyHeight(50*10);
        }
        stokerZoneTable.resizeColWidth();
        portTable.resizeColWidth();
        vehicleTable.resizeColWidth();
        stateTable.resizeColWidth();
        // END APL 2020.03.04 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
      }

      // 選択したコントローラのAMHSタイプによる状態の項目表示切替
      //toggleStockerZoneRlt(amhsId);     //20191225 Song Del

      // 状態画面の表示
      showStateScreen();

      // テーブルのスクロール位置を設定
      if (scrollFixFlag !== undefined && scrollFixFlag) {
        stateTable.setScrollTop(top);
        stateTable.setScrollLeft(left);
      }
    };

    // エラー時処理
    var onError = function(retObj) {
      // 検索失敗時はエラーを反映
      selComp.setErrors(retObj.result.errorInfoList);
    };

    // 取得結果0件時処理
    var onEmpty = onSuccess;

    // 検索を実行
    callAjax(url, cond, true, onSuccess, onError, null, true, onEmpty, 0, autoReloadFlag);
  }

  /**
   ******************************************************************************
   * @brief   ポート取得メソッド
   * @param   {String} amhsId 検索条件のAMHSID
   * @param   {boolean} ctrlChgFlag(true:コントローラ変更時 / false:画面遷移時)
   * @param   {boolean} scrollFixFlag
   *                    (true:スクロール位置保持 / false:スクロール位置初期化)
   * @return
   * @retval
   * @attention
   * @note    ポートの取得を行う。
   * ----------------------------------------------------------------------------
   * VER.        DESCRIPTION                                               AUTHOR
   * ----------------------------------------------------------------------------
   ******************************************************************************
   */
  //function getPort(amhsId, ctrlChgFlag, scrollFixFlag, autoReloadFlag) { //20191223 Song Del
   function getPort(llcId, ctrlChgFlag, scrollFixFlag, autoReloadFlag) {//2020.02.24 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000
    var url = getUrl('/Individual/GetScPortInfo');
    var cond = {
      //amhsId: amhsId,      //20191223 Song Del
    		llcId: llcId,  //2020.02.24 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000
      ctrlChgFlag: ctrlChgFlag
    };

    // 成功時処理
    var onSuccess = function(retObj) {
      // 直近の検索成功時のAMHSIDを更新
      //latestAmhsId = amhsId;   //20191223 Song Del
      latestAmhsId = llcId;  //2020.02.24 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000

      // テーブルのスクロール位置を保持
      var top = portTable.getScrollTop();
      var left = portTable.getScrollLeft();

      // テーブルのクリア
      portTable.clear();
      // データをテーブルにセット
      //portTable.addDataList(retObj.body, retObj.rowColorList); //20200102 Song Del
      portTable.addPortDataList(retObj.body, retObj.rowColorList); //20200102 Song Add

      // ポート画面の表示
      showPortScreen();

      // テーブルのスクロール位置を設定
      if (scrollFixFlag !== undefined && scrollFixFlag) {
        portTable.setScrollTop(top);
        portTable.setScrollLeft(left);
      }
    };

    // エラー時処理
    var onError = function(retObj) {
      // 検索失敗時はエラーを反映
      selComp.setErrors(retObj.result.errorInfoList);
    };

    // 取得結果0件時処理
    var onEmpty = onSuccess;

    // 検索を実行
    callAjax(url, cond, true, onSuccess, onError, null, true, onEmpty, 0, autoReloadFlag);
  }

  /**
   ******************************************************************************
   * @brief   Microコマンド取得メソッド
   * @param   {String} amhsId 検索条件のAMHSID
   * @param   {boolean} ctrlChgFlag(true:コントローラ変更時 / false:画面遷移時)
   * @param   {boolean} scrollFixFlag
   *                    (true:スクロール位置保持 / false:スクロール位置初期化)
   * @return
   * @retval
   * @attention
   * @note    Microコマンドの取得を行う。
   * ----------------------------------------------------------------------------
   * VER.        DESCRIPTION                                               AUTHOR
   * ----------------------------------------------------------------------------
   ******************************************************************************
   */
  function getMicroCmd(amhsId, ctrlChgFlag, scrollFixFlag, autoReloadFlag) {
    var url = getUrl('/Individual/GetScMicroCmdInfo');
    var cond = {
      amhsId: amhsId,
      ctrlChgFlag: ctrlChgFlag
    };

    // 成功時処理
    var onSuccess = function(retObj) {
      // 直近の検索成功時のAMHSIDを更新
      latestAmhsId = amhsId;

      // テーブルのスクロール位置を保持
      var top = microCmdTable.getScrollTop();
      var left = microCmdTable.getScrollLeft();

      // テーブルのクリア
      microCmdTable.clear();
      // データをテーブルにセット
      microCmdTable.addDataList(retObj.body, retObj.rowColorList);

      // Microコマンド画面の表示
      showMicroCmdScreen();

      // テーブルのスクロール位置を設定
      if (scrollFixFlag !== undefined && scrollFixFlag) {
        microCmdTable.setScrollTop(top);
        microCmdTable.setScrollLeft(left);
      }
    };

    // エラー時処理
    var onError = function(retObj) {
      // 検索失敗時はエラーを反映
      selComp.setErrors(retObj.result.errorInfoList);
    };

    // 取得結果0件時処理
    var onEmpty = onSuccess;

    // 検索を実行
    callAjax(url, cond, true, onSuccess, onError, null, true, onEmpty, 0, autoReloadFlag);
  }

  /**
   ******************************************************************************
   * @brief   搬送Job取得メソッド
   * @param   {String} amhsId 検索条件のAMHSID
   * @param   {boolean} ctrlChgFlag(true:コントローラ変更時 / false:画面遷移時)
   * @param   {boolean} scrollFixFlag
   *                    (true:スクロール位置保持 / false:スクロール位置初期化)
   * @return
   * @retval
   * @attention
   * @note    搬送Jobの取得を行う。
   * ----------------------------------------------------------------------------
   * VER.        DESCRIPTION                                               AUTHOR
   * ----------------------------------------------------------------------------
   ******************************************************************************
   */
  function getTrnJob(amhsId, ctrlChgFlag, scrollFixFlag, autoReloadFlag) {
    var url = getUrl('/Individual/GetScTransferJobInfo');
    var cond = {
      amhsId: amhsId,
      ctrlChgFlag: ctrlChgFlag
    };

    // 成功時処理
    var onSuccess = function(retObj) {
      // 直近の検索成功時のAMHSIDを更新
      latestAmhsId = amhsId;

      // テーブルのスクロール位置を保持
      var top = trnJobTable.getScrollTop();
      var left = trnJobTable.getScrollLeft();

      // テーブルのクリア
      trnJobTable.clear();
      // データをテーブルにセット
      trnJobTable.addDataList(retObj.body, retObj.rowColorList);

      // 搬送Job画面の表示
      showTrnJobScreen();

      // テーブルのスクロール位置を設定
      if (scrollFixFlag !== undefined && scrollFixFlag) {
        trnJobTable.setScrollTop(top ? top : 0);
        trnJobTable.setScrollLeft(left ? left : 0);
      }
    };

    // エラー時処理
    var onError = function(retObj) {
      // 検索失敗時はエラーを反映
      selComp.setErrors(retObj.result.errorInfoList);
    };

    // 取得結果0件時処理
    var onEmpty = onSuccess;

    // 検索を実行
    callAjax(url, cond, true, onSuccess, onError, null, true, onEmpty, 0, autoReloadFlag);
  }

  /**
   ******************************************************************************
   * @brief   StockerZoneRlt表示切替メソッド
   * @param   {String} amhsId 検索条件のAMHSID
   * @return
   * @retval
   * @attention
   * @note     引数のAMHSIDに紐付くAMHSタイプが3なら非表示、それ以外は表示
   * ----------------------------------------------------------------------------
   * VER.        DESCRIPTION                                               AUTHOR
   * ----------------------------------------------------------------------------
   ******************************************************************************
   */
  function toggleStockerZoneRlt(amhsId) {
    if (_getAmhsTypeByAmhsId(amhsId) == AMHS_TYPE.LFC) {
      $('.state-stocker-zone-rlt').hide();
    } else {
      $('.state-stocker-zone-rlt').show();
    }
  }

  /**
   ******************************************************************************
   * @brief   AMHSタイプ取得メソッド
   * @param   {String} amhsId AMHSタイプ取得元のAMHSID
   * @return  {String} AMHSタイプ
   * @retval
   * @attention
   * @note     対象のAMHSIDが存在しなければnullを返す。
   * ----------------------------------------------------------------------------
   * VER.        DESCRIPTION                                               AUTHOR
   * ----------------------------------------------------------------------------
   ******************************************************************************
   */
  function _getAmhsTypeByAmhsId(amhsId) {
    for (var i = 0; i < amhsNameList.length; i++) {
      if (amhsNameList[i][0] == amhsId) {
        return amhsNameList[i][2];
      }
    }
    return null;
  }

  /**
   ******************************************************************************
   * @brief   状態画面の表示クリア機能
   * @param
   * @return
   * @retval
   * @attention
   * @note     状態画面のコンポーネントをクリアする。
   * ----------------------------------------------------------------------------
   * VER.        DESCRIPTION                                               AUTHOR
   * ----------------------------------------------------------------------------
   ******************************************************************************
   */
  function clearState() {
    // 状態画面のテキストボックスをクリア
	stateLlcName.clear();
    stateLlcMode.clear();
    stateAlarmState.clear();
    stateCommState.clear();
    stateControlState.clear();
    stateSystemState.clear();
    stateAvailable.clear();
    //20191225 Song Mod Start
    //stateZoneOccupied.clear();
    //stateZoneCapacity.clear();
    //stateZoneUtility.clear();
    //stateAmhsLState.clear();
/*    alarmState.clear();
    ocdcMode.clear();
    pieceMode.clear();
    pieceAvailable.clear();*/
    //20191225 Song Mod End
    // 状態画面のテーブルをクリア
    stateTable.clear();
    stokerZoneTable.clear();//DQY ADD 20200228
  }
});
