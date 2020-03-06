<%--
 ******************************************************************************
 * @file        Remarks.jsp
 * @brief       凡例画面用JSP
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
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%-- 共通ヘッダ --%>
<%@ include file="../common/commonHeader.jsp"%>

<%-- 画面固有ヘッダ --%>
<title><spring:message code="IT-001-27-001" /></title>

<link rel="stylesheet" href="<c:url value='/resources/css/top/mcs-Remarks.css?Ver=${version}'/>" media="all">
<script src="<c:url value='/resources/js/top/mcs-Remarks.js?Ver=${version}'/>"></script>

<script>
  var screenText = {
    commText: {
      onLineRemote: '<spring:message code="IT-001-27-021" />',
      offLine: '<spring:message code="IT-001-27-022" />',
      notComm: '<spring:message code="IT-001-27-023" />',
      onLineLocal: '<spring:message code="IT-001-27-024" />'
    },
    ctrlText: {
      <%-- 20200106 DQY DEL
      noAlarmsAuto: '<spring:message code="IT-001-27-003"/>',
      noAlarmsOther: '<spring:message code="IT-001-27-004"/>',
      alarms: '<spring:message code="IT-001-27-005"/>',
      pm: '<spring:message code="IT-001-27-006"/>',
      unknown: '<spring:message code="IT-001-27-007"/>',
      offline: '<spring:message code="IT-001-27-030"/>'       --%>   <%-- for example --%>
      
      <%--  allUp:   '${IT_001_27_020}',
   	  		timeout: '${IT_001_27_032}',
   	 		other:   '${IT_001_27_033}'  --%>   <%-- for example --%>
      
      Running:  'Running ',
      OUT_ONLY: 'OUT_ONLY',
      TSC_NotAvailable: 'TSC_NotAvailable',
      LLC_NotAvailable: 'LLC_NotAvailable',
      TSC_Alarm:  'TSC_Alarm',
      LLC_Alarm:  'LLC_Alarm',
      TSC_Down:   'TSC_Down',
      LLC_Down:   'LLC_Down',
      CommErr:    'CommErr',
      SysErr:  'SysErr',
      CtlErr:  'CtlErr',
      PortErr: 'PortErr',
      Normal:  'Normal',
      Low:     'Low',
      High:    'High'
    },
    portText: {
      noAlarms: '<spring:message code="IT-001-27-027"/>',
      someAlarms: '<spring:message code="IT-001-27-028"/>',
      alarms: '<spring:message code="IT-001-27-029"/>'
    },
    carrierText: {
      noCarrier: '<spring:message code="IT-001-27-015"/>',
      carrierExist: '<spring:message code="IT-001-27-016"/>'
    },
    colorText: {
    	 
    	<%-- allUp:   '${IT_001_27_040}',
    	     timeout: '${IT_001_27_052}',
    	     other:   '${IT_001_27_053}'   --%>  <%-- for example --%>
    	
        Running:   '#33FF00',
        OUT_ONLY:  '#A349A4',
        TSC_NotAvailable: '#FF5555',
        LLC_NotAvailable: '#FF0000',
        TSC_Alarm: '#FFA500',
        LLC_Alarm: '#FF7536',
        TSC_Down:  '#FFFF00',
        LLC_Down:  '#FFD700',
        CommErr:   '#FF00FF',
        SysErr:    '#75FFFF',
        CtlErr:    '#7575FF',
        PortErr:   '#F0E68C',
        Normal:    '#33FF00',
        Low: 	   '#FFFF00',
        High: 	   '#FF5555'
      }
  };
  var screenValue = {
    occuLowRate: JSON.parse('${IT_001_27_009}'),
    occuMiddleRate: JSON.parse('${IT_001_27_010}'),
    occuHighRate: JSON.parse('${IT_001_27_011}')
  };
</script>

<%-- デザイン適用ヘッダ --%>
<%@ include file="../common/designHeader.jsp"%>
</head>

<body>
    <header id="mcs-header-menu">
        <h1>
            <spring:message code="IT-001-27-001" />
        </h1>
    </header>

    <div id="mcs-alert-dialog"></div>
    <div id="mcs-confirm-dialog"></div>
    <div id="mcs-information-dialog"></div>

    <div id="mcs-content" class="mcs-content">
        <!-- アイコン表示部 start -->
        <table id="container-screen">
            <tr>
                <td><div class="container" id="container1"></div></td>
                <td><div class="container" id="container2"></div></td>
            </tr>
        </table>
        <!-- アイコン表示部 end -->

        <!-- ステータス一覧 start -->
        <!-- <span id="condition" style="font-size:18px" class=""><spring:message code="IT-001-27-002" /></span>  -->
        <span id="condition" style="font-size:18px" class="">Status</span>
        
        <div>
            <!-- ステータス色 start -->
            <div id="colorColumn1" class="remarks-content-color">
                <div id="color1"></div>
                <div id="color2"></div>
                <div id="color3"></div>
                <div id="color4"></div>
            </div>
            <!-- ステータス色 end -->

            <!-- コントローラ状態 start -->
            <div id="ctrlColumn1" class="remarks-content">  
                <div id="ctrl1"></div>
                <div id="ctrl2"></div>
                <div id="ctrl3"></div>
                <div id="ctrl4"></div>
            </div>
            <!-- コントローラ状態 end -->
			<div id="colorColumn2" class="remarks-content-color">  
                <div id="color5"></div>
                <div id="color6"></div>
                <div id="color7"></div>
                <div id="color8"></div>
            </div>

            <div id="ctrlColumn2" class="remarks-content">  
                 <!--20200108 DQY DEL  <span id="carrierCol"><spring:message code="IT-001-27-014" /></span>-->
                <div id="ctrl5"></div>
                <div id="ctrl6"></div>
                <div id="ctrl7"></div>
                <div id="ctrl8"></div>
            </div>
            
            <div id="colorColumn3" class="remarks-content-color">  
                <div id="color9"></div>
                <div id="color10"></div>
                <div id="color11"></div>
                <div id="color12"></div>
            </div>
            
            <div id="ctrlColumn3" class="remarks-content">  
                <div id="ctrl9"></div>
                <div id="ctrl10"></div>
                <div id="ctrl11"></div>
                <div id="ctrl12"></div>
            </div>
          
        </div>
        
         <div id="OccupancyDiv" style="clear: both;">
               <span id="Occupancy" style="font-size:18px" class="">Occupancy</span>
         </div>
         <div id="OccupancyDiv" >
            <div id="colorColumn4" class="remarks-content-color">
                <div id="color13"></div>
            </div>
            <div id="ctrlColumn4" class="remarks-content">  
                <div id="ctrl13"></div>
            </div>
            
            <div id="colorColumn5" class="remarks-content-color">
                <div id="color14"></div>
            </div>
            <div id="ctrlColumn5" class="remarks-content">  
                <div id="ctrl14"></div>
            </div>
            
            <div id="colorColumn6" class="remarks-content-color">
                <div id="color15"></div>
            </div>
            <div id="ctrlColumn6" class="remarks-content">  
                <div id="ctrl15"></div>
            </div>
         </div>
        
        <!-- ステータス一覧 end -->
    </div>
</body>
</html>
