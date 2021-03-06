﻿/**
 ******************************************************************************
 * @file        mcs-ColorPicker.js
 * @brief       カラーピッカーを管理する部品
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
 * 2016/12/26 0.1         Step1リリース                                     CSC
 ******************************************************************************
 */
/**
 ******************************************************************************
 * @brief    カラーピッカーコンポーネント
 * @param    {jQuery} containerDiv 格納先のdiv要素
 * @return
 * @retval
 * @attention
 * @note     カラーピッカーコンポーネント
 * ----------------------------------------------------------------------------
 * VER.        DESCRIPTION                                               AUTHOR
 * ----------------------------------------------------------------------------
 ******************************************************************************
 */
var McsColorPicker = function(containerDiv) {
  // コンストラクタ
  this.init(containerDiv);
};

// メソッド類
McsColorPicker.prototype = {

  /**
   ******************************************************************************
   * @brief   初期化処理
   * @param {jQuery} containerDiv 格納先のdiv要素
   * @return
   * @retval
   * @attention
   * @note  初期化処理を実施する。
   * ----------------------------------------------------------------------------
   * VER.        DESCRIPTION                                               AUTHOR
   * ----------------------------------------------------------------------------
   ******************************************************************************
   */
  init: function(containerDiv) {
    this.containerDiv = containerDiv;
    this.enabled = true;

    // 全体を囲むdiv
    var wrapperDiv = $('<div class="mcs-colorpicker-wrapper"></div>');
    containerDiv.append(wrapperDiv);

    // ピッカーを配置するdiv
    var pickerDiv = $('<div class="mcs-colorpicker-picker"></div>');
    this.pickerDiv = pickerDiv;
    wrapperDiv.append(pickerDiv);

    // テキストボックスのinput
    var input = $('<input type="text" class="mcs-colorpicker-dst form-control mcs-textbox" />');
    input.prop('readonly', true);
    this.input = input;
    wrapperDiv.append($('<br>')).append(input);

    // 初期値を設定
    input.val('#ff0000');

    // farbtasticを初期化
    this.farb = $.farbtastic(pickerDiv, input);
  },

  /**
   ******************************************************************************
   * @brief   カラーパレットの表示処理
   * @return {McsColorPicker} このコンポーネント
   * @retval
   * @attention
   * @note    カラーピッカーを表示する。
   * ----------------------------------------------------------------------------
   * VER.        DESCRIPTION                                               AUTHOR
   * ----------------------------------------------------------------------------
   ******************************************************************************
   */
  show: function() {
    this.containerDiv.show();
    return this;
  },

  /**
   ******************************************************************************
   * @brief   カラーパレットの非表示処理
   * @return {McsColorPicker} このコンポーネント
   * @retval
   * @attention
   * @note    カラーピッカーを非表示にする。
   * ----------------------------------------------------------------------------
   * VER.        DESCRIPTION                                               AUTHOR
   * ----------------------------------------------------------------------------
   ******************************************************************************
   */
  hide: function() {
    this.containerDiv.hide();
    return this;
  },

  /**
   ******************************************************************************
   * @brief   値クリア処理
   * @return {McsColorPicker} このコンポーネント
   * @retval
   * @attention
   * @note    色を#ff0000にする。
   * ----------------------------------------------------------------------------
   * VER.        DESCRIPTION                                               AUTHOR
   * ----------------------------------------------------------------------------
   ******************************************************************************
   */
  clear: function() {
    return this.setValue('#ff0000');
  },

  /**
   ******************************************************************************
   * @brief   値取得処理
   * @return  {String} 色情報。#RRGGBBの形式
   * @retval
   * @attention
   * @note    色情報を#RRGGBB形式で取得する。
   * ----------------------------------------------------------------------------
   * VER.        DESCRIPTION                                               AUTHOR
   * ----------------------------------------------------------------------------
   ******************************************************************************
   */
  getValue: function() {
    return this.farb.color;
  },

  /**
   ******************************************************************************
   * @brief   値設定処理
   * @param   {String} color 色情報。#RRGGBBの形式
   * @return  {McsColorPicker} このコンポーネント
   * @retval
   * @attention
   * @note    色情報を#RRGGBB形式で設定する
   * ----------------------------------------------------------------------------
   * VER.        DESCRIPTION                                               AUTHOR
   * ----------------------------------------------------------------------------
   ******************************************************************************
   */
  setValue: function(color) {
    this.farb.setColor(color);
    return this;
  },

  /**
   ******************************************************************************
   * @brief     指定要素に追加
   * @param     {jQueryObj} jQueryObj jQueryオブジェクト
   * @return    {McsColorPicker} このコンポーネント
   * @retval
   * @attention
   * @note      指定された要素の配下に、本コンポーネントを追加する。
   * ----------------------------------------------------------------------------
   * VER.        DESCRIPTION                                               AUTHOR
   * ----------------------------------------------------------------------------
   ******************************************************************************
   */
  appendTo: function(jQueryObj) {
    jQueryObj.append(this.containerDiv);
    return this;
  }
};
