/**
 ******************************************************************************
 * @file        mcs-Remarks.js
 * @brief       凡例用JavaScript
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
  
  focus();

  // アイコン生成
  createRemarksIcon($('#container1'));
  createRemarksIcon2($('#container2'));

  // ステータス色一覧
  $('#color1').css('background-color', screenText.colorText.Running);
  $('#color2').css('background-color', screenText.colorText.OUT_ONLY);
  $('#color3').css('background-color', screenText.colorText.TSC_NotAvailable);
  $('#color4').css('background-color', screenText.colorText.LLC_NotAvailable);
  $('#color5').css('background-color', screenText.colorText.TSC_Alarm);
  $('#color6').css('background-color', screenText.colorText.LLC_Alarm);
  $('#color7').css('background-color', screenText.colorText.TSC_Down);
  $('#color8').css('background-color', screenText.colorText.LLC_Down);
  $('#color9').css('background-color', screenText.colorText.CommErr);
  $('#color10').css('background-color', screenText.colorText.SysErr);
  $('#color11').css('background-color', screenText.colorText.CtlErr);
  $('#color12').css('background-color', screenText.colorText.PortErr);
  $('#color13').css('background-color', screenText.colorText.Normal);
  $('#color14').css('background-color', screenText.colorText.Low);
  $('#color15').css('background-color', screenText.colorText.High);
  
  // コントローラ状態
  var ctrl1 = new McsTextBox($('#ctrl1'));
  var ctrl2 = new McsTextBox($('#ctrl2'));
  var ctrl3 = new McsTextBox($('#ctrl3'));
  var ctrl4 = new McsTextBox($('#ctrl4'));
  var ctrl5 = new McsTextBox($('#ctrl5'));
  var ctrl6 = new McsTextBox($('#ctrl6'));
  var ctrl7 = new McsTextBox($('#ctrl7'));
  var ctrl8 = new McsTextBox($('#ctrl8'));
  var ctrl9 = new McsTextBox($('#ctrl9'));
  var ctrl10 = new McsTextBox($('#ctrl10'));
  var ctrl11 = new McsTextBox($('#ctrl11'));
  var ctrl12 = new McsTextBox($('#ctrl12'));
  var ctrl13 = new McsTextBox($('#ctrl13'));
  var ctrl14 = new McsTextBox($('#ctrl14'));
  var ctrl15 = new McsTextBox($('#ctrl15'));

  ctrl1.setReadonly(true);
  ctrl2.setReadonly(true);
  ctrl3.setReadonly(true);
  ctrl4.setReadonly(true);
  ctrl5.setReadonly(true);
  ctrl6.setReadonly(true);
  ctrl7.setReadonly(true);
  ctrl8.setReadonly(true);
  ctrl9.setReadonly(true);
  ctrl10.setReadonly(true);
  ctrl11.setReadonly(true);
  ctrl12.setReadonly(true);
  ctrl13.setReadonly(true);
  ctrl14.setReadonly(true);
  ctrl15.setReadonly(true);

  // コントローラ状態 対象メッセージセット
  ctrl1.setValue(screenText.ctrlText.Running);
  ctrl2.setValue(screenText.ctrlText.OUT_ONLY);
  ctrl3.setValue(screenText.ctrlText.TSC_NotAvailable);
  ctrl4.setValue(screenText.ctrlText.LLC_NotAvailable);
  ctrl5.setValue(screenText.ctrlText.TSC_Alarm);
  ctrl6.setValue(screenText.ctrlText.LLC_Alarm);
  ctrl7.setValue(screenText.ctrlText.TSC_Down);
  ctrl8.setValue(screenText.ctrlText.LLC_Down);
  ctrl9.setValue(screenText.ctrlText.CommErr);
  ctrl10.setValue(screenText.ctrlText.SysErr);
  ctrl11.setValue(screenText.ctrlText.CtlErr);
  ctrl12.setValue(screenText.ctrlText.PortErr);
  ctrl13.setValue(screenText.ctrlText.Normal);
  ctrl14.setValue(screenText.ctrlText.Low);
  ctrl15.setValue(screenText.ctrlText.High);
  
  /**
   ******************************************************************************
   * @brief    アイコン生成
   * @param    {jQuery} containerDiv アイコン格納先のdiv要素
   * @return
   * @retval
   * @attention
   * @note     凡例画面用のアイコンを生成する
   * ----------------------------------------------------------------------------
   * VER.        DESCRIPTION                                               AUTHOR
   * ----------------------------------------------------------------------------
   ******************************************************************************
   */
   function createRemarksIcon(containerDiv) {
	    // SVGのDOM生成
	    var parentDiv = $('<div />');
	    var i = $('<i class="icon-set status-block" />');
	    var svg = $('<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 52 52" />');
	    // eslintで警告が出るが、ソースコードの可読性を考慮し無視する。
	    var polygon = $('<polygon points="10.5 42.52 10.5 18.21 18.21 10.5 33.79 10.5 41.5 18.21 41.5 42.52 10.5 42.52" />');
	    var path = $('<path d="M33.59,11,41,18.51V42H11V18.51L18.51,11H33.69M34,10H18L10,18V43H42V18L34,10Z" />');
	    var rect1 = $('<rect class="stat-02 status-box" x="12" y="24" width="28" height="13" />');
	    var text1 = $('<text class="stat-num" x="11.5" y="22">Occupied Status</text>');
	    var text2 = $('<text class="stat-num" x="13" y="29.5">OccupancyRate</text>');
	    var text3 = $('<text class="stat-num" x="13" y="35">TSC Status</text>');
	    parentDiv.append(i);
	    i.append(svg);
	    svg.append(polygon, path, rect1, text1, text2, text3);

	    // アイコンを反映する
	    containerDiv.append($(parentDiv.html()));
   }
   /**
   ******************************************************************************
   * @brief    アイコン2生成
   * @param    {jQuery} containerDiv アイコン格納先のdiv要素
   * @return
   * @retval
   * @attention
   * @note     凡例画面用のアイコンを生成する
   * ----------------------------------------------------------------------------
   * VER.        DESCRIPTION                                               AUTHOR
   * ----------------------------------------------------------------------------
   ******************************************************************************
   */
   function createRemarksIcon2(containerDiv) {
	    // SVGのDOM生成
	    var parentDiv = $('<div />');
	    var i = $('<i class="icon-set status-block" />');
	    var svg = $('<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 52 52" />');
	    // eslintで警告が出るが、ソースコードの可読性を考慮し無視する。
	    var polygon = $('<polygon points="10.5 42.52 10.5 18.28 12.09 18.28 12.09 13.87 10.5 13.87 10.5 10.5 41.5 10.5 41.5 13.87 40 13.87 40 18.28 41.5 18.28 41.5 42.52 10.5 42.52" />');
	    // eslintで警告が出るが、ソースコードの可読性を考慮し無視する。
	    var path = $('<path d="M41,11V13.36H39.5V18.78H41V42H11V18.78H12.59V13.36H11V11H41m1-1H10V14.36H11.59V17.78H10V43H42V17.78H40.5V14.36H42V10Z" />');
	    var rect1 = $('<rect class="stat-01 status-box" x="12" y="23" width="28" height="8" />');
	    var text1 = $('<text class="stat-num" x="15" y="28.5">TSC Status</text>');
	    parentDiv.append(i);
	    i.append(svg);
	    svg.append(polygon, path, rect1, text1);

	    // アイコンを反映する
	    containerDiv.append($(parentDiv.html()));
   }
});
