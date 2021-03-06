﻿<%--
 ******************************************************************************
 * @file        Vehicles.jsp
 * @brief       アラーム情報表示画面用JSP
 * @par
 * @author      CSC
 * $Id:         $
 * @attention
 *
 * Copyright (c) 2020 MURATA MACHINERY,LTD. All rights reserved.
 *
 * @note        Tabstop=4
 * ----------------------------------------------------------------------------
 * DATE       VER.        DESCRIPTION                                    AUTHOR
 * ----------------------------------------------------------------------------
 ******************************************************************************
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%-- 共通ヘッダ --%>
<%@ include file="../common/commonHeader.jsp"%>
<%-- グリッドヘッダ --%>
<%@ include file="../common/dataTablesHeader.jsp"%>

<%-- メッセージ類取得 --%>
<%--
<script>
  var screenText = {
    // メニュー用テキスト
    list: {
      reLoad: '<spring:message code="II-001-01-022" />',
      save: '<spring:message code="II-001-01-023" />',
      ret: '<spring:message code="II-001-01-024" />',
      del: '<spring:message code="II-001-01-027" />'       // MACS4#0047 Add
    },
    saveText: {
      dateTime: '<spring:message code="II-001-02-001"/>',
      saveStart: '<spring:message code="II-001-02-002"/>',
      saveEnd: '<spring:message code="II-001-02-003"/>'
    },
    btnText: {
      confirm: '<spring:message code="II-001-02-004"/>',
      saveReturn: '<spring:message code="II-001-02-005"/>'
    },
    // MACS4#0047 Add Start
    dialog: {
      noSelectMsg: '<spring:message code="II-001-01.001" />',
      delCfmMsg: '<spring:message code="II-001-01.002" />',
      delCompMsg: '<spring:message code="II-001-01.003" />',
      confirm: '<spring:message code="DIALOG.BUTTON_NAME.OK" />',
      ret: '<spring:message code="DIALOG.BUTTON_NAME.RETURN" />'
    }
    // MACS4#0047 Add End
  };
</script>
 --%>
<%-- 画面固有ヘッダ --%>
<title><spring:message code="II-003-01-001" /></title>
<link rel="stylesheet" href="<c:url value="/resources/css/top/mcs-Vehicles.css?Ver=${version}" />">
<script src="<c:url value='/resources/js/top/mcs-Vehicles.js?Ver=${version}'/>"></script>

<%-- デザイン適用ヘッダ --%>
<%@ include file="../common/designHeader.jsp"%>
</head>

<!-- <body onLoad="setTimeout('check()',100)"> -->
<body>

    <!-- ヘッダーエリア -->
    <header id="mcs-header-menu">
        <h1>
            <spring:message code="II-003-01-001" />
        </h1>
        <%@ include file="../common/headerCommonMenu.jsp"%>
    </header>

<!-- DEL STD APL 2020.02.23 song 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000  -->
    <!-- 右メニューエリア -->
    <!-- 
    <nav id="mcs-right-menu">
        <div id="menu-btn-update" class="btn-mcs-slide"></div>
        <div id="menu-btn-del" class="btn-mcs-slide" data-auth="${I001_CHG}"></div>     <%-- MACS4#0047 Add --%>
        <div id="menu-btn-save" class="btn-mcs-slide"></div>
        <div id="menu-btn-cancel" class="btn-mcs-slide btn-mcs-slide-return"></div>
    </nav>
    -->
<!-- DEL END APL 2020.02.23 song 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000  -->

    <!-- 子スライドメニュー(CSV保存) -->
    <%-- 
    <div id="mcs-saveMenu">
        <spring:message code="II-001-02-001" /> 
        <div id="mcs-saveStartDatetime"></div>
        <div id="mcs-saveEndDatetime"></div>
        <div id="btn-confirm" class="btn-mcs-slide btn-mcs-slide-confirm"></div>
        <div id="btn-saveReturn" class="btn-mcs-slide btn-mcs-slide-return"></div>
    </div>
    --%>
    <!-- 一覧画面 start -->
    <div id="list-screen" class="mcs-content mcs-with-subtitle">
        <div id="mcs-subtitle-list" class="mcs-content-subtitle">
            <spring:message code="II-003-01-002" />
        </div>
        <div id="lst-table-target" style="width: 100%; height: 100%;"></div>
    </div>
    <!-- 一覧画面 end -->

    <%-- MACS4#0047 Add Start --%>
    <!-- ダイアログ -->
    <div id="mcs-error-dialog"></div>
    <div id="mcs-confirm-dialog"></div>
    <%-- MACS4#0047 Add End --%>
</body>
</html>