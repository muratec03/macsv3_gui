<%--
 ******************************************************************************
 * @file        IndividualScMonitor.jsp
 * @brief       個別モニタ(SCモニタ)関連のJSP
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
<%-- Modifyヘッダ --%>
<%@ include file="../common/modifyTableHeader.jsp"%>

<%-- 画面固有ヘッダ --%>
<%--  <title><spring:message code="IT-001-11-001" /></title> --%>  <%-- 20191223 Song Del --%>
<title>${memberGroupName} Detail</title>  <%-- 20191223 Song Add --%>

<link rel="stylesheet" href="<c:url value='/resources/css/top/mcs-IndividualScMonitor.css?Ver=${version}'/>" media="all">
<script src="<c:url value='/resources/js/top/mcs-IndividualScMonitor.js?Ver=${version}'/>"></script>

<script>
  var screenText = {
    state: {
      alarmDateTime: '<spring:message code="IT-001-11-021"/>',
      alarmId: '<spring:message code="IT-001-11-022"/>',
      alarmText: '<spring:message code="IT-001-11-023"/>',
      alarmLoc: '<spring:message code="IT-001-11-024"/>',
      vehicleId: '<spring:message code="IT-001-11-025"/>'
    },
    
    stokerZone: {
    	empty: '<spring:message code="IT-001-11-040"/>',
    	occupied: '<spring:message code="IT-001-11-041"/>',
    	reserved: '<spring:message code="IT-001-11-042"/>',
    	total: '<spring:message code="IT-001-11-043"/>'
      },
    
    port: {
        portId: '<spring:message code="IT-001-12-002"/>',
        carrierId: '<spring:message code="IT-001-12-003"/>',
        available: '<spring:message code="IT-001-12-004"/>',
        ibsemAvail: '<spring:message code="IT-001-12-005"/>',
        portMode: '<spring:message code="IT-001-12-006"/>'
      },
      
     vehicle: {
    	 vehicleId: '<spring:message code="IT-001-13-002"/>',
    	 alarmText: '<spring:message code="IT-001-13-003"/>',
    	 vehicleKind: '<spring:message code="IT-001-13-004"/>',
    	 vehicleState: '<spring:message code="IT-001-13-005"/>'
    },
    
    
    microCmd: {
      commandId: '<spring:message code="IT-001-13-005"/>',
      priority: '<spring:message code="IT-001-13-006"/>',
      carrierId: '<spring:message code="IT-001-13-007"/>',
      microFrom: '<spring:message code="IT-001-13-008"/>',
      microTo: '<spring:message code="IT-001-13-009"/>',
      jobState: '<spring:message code="IT-001-13-010"/>',
      waitInTime: '<spring:message code="IT-001-13-011"/>'
    },
    transferJob: {
      waitTime: '<spring:message code="IT-001-14-005"/>',
      jobOwner: '<spring:message code="IT-001-14-006"/>',
      carrierId: '<spring:message code="IT-001-14-007"/>',
      priority: '<spring:message code="IT-001-14-008"/>',
      carrierJobState: '<spring:message code="IT-001-14-009"/>',
      location: '<spring:message code="IT-001-14-010"/>',
      fromAmhsId: '<spring:message code="IT-001-14-011"/>',
      fromPort: '<spring:message code="IT-001-14-012"/>',
      toAmhsId: '<spring:message code="IT-001-14-013"/>',
      toPort: '<spring:message code="IT-001-14-014"/>',
      microFrom: '<spring:message code="IT-001-14-015"/>',
      microTo: '<spring:message code="IT-001-14-016"/>',
      controller: '<spring:message code="IT-001-14-017"/>',
      waitInTime: '<spring:message code="IT-001-14-018"/>'
    },
    slideMenuBtn: {
      reload: '<spring:message code="IT-001-15-001"/>',
      state: '<spring:message code="IT-001-15-002"/>',
      port: '<spring:message code="IT-001-15-003"/>',
      microCmd: '<spring:message code="IT-001-15-004"/>',
      transferJob: '<spring:message code="IT-001-15-005"/>',
      ret: '<spring:message code="IT-001-15-006"/>'
    }
  };
  var screenValue = {
    <%--  amhsName: JSON.parse('${AmhsNameList}'), --%>  <%-- 20191223 Song Del 这是v2的代码不用 AmhsNameList了 改用displayNameList--%>
    <%--amhsId: '${amhsId}'--%>  <%-- 20191223 Song Del 这是v2的代码不用 amhsId了 改用displayId--%>
    <%-- STD APL 2020.02.21 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 --%>
    <%--displayNames: JSON.parse('${displayNameList}'),
    displayId: '${displayId}'--%>
    llcNames: JSON.parse('${llcNameList}'),
    llcId: '${llcId}',
    tscId: '${tscId}'<%-- dqy add 20200227 --%>
    <%-- END APL 2020.02.21 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 --%>
  };
</script>

<%-- デザイン適用ヘッダ --%>
<%@ include file="../common/designHeader.jsp"%>
</head>

<body>
    <header id="mcs-header-menu">
        <h1>
            ${memberGroupName} Monitor   <%-- <spring:message code="IT-001-11-001" />  --%>
        </h1>
        <%@ include file="../common/headerCommonMenu.jsp"%>
    </header>

    <div id="mcs-alert-dialog"></div>
    <div id="mcs-confirm-dialog"></div>
    <div id="mcs-information-dialog"></div>

    <div id="mcs-subheader-menu">
        <table>
            <tr>
                <%-- <td><span><spring:message code="IT-001-11-002" /></span></td>  --%>   <%-- 20200103 Song Del  --%>
                <td><span>${llcType}</span></td>     <%-- 2020.02.24 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000  --%>
               
                <td class="mcs-td-selectbox">
                    <div id="sel-amhs"></div>
                </td>
            </tr>
        </table>
    </div>

    <div class="mcs-content mcs-with-subheader mcs-with-subtitle">
        <!-- 状態表示画面 start -->
            <div class="mcs-content-subtitle">
                <span><spring:message code="IT-001-11-004" /></span>
            </div>
            <div id="state-text-target">
                <div>
                    <div>
                        <span><spring:message code="IT-001-11-005" /></span>
                    </div>
                    <div id="state-llc-name"></div>
                </div>
                <div>
                    <div>
                        <span><spring:message code="IT-001-11-007" /></span>
                    </div>
                    <div id="state-llc-mode"></div>
                </div>
                <!--2020.02.25 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000  -->
                <!-- <div>
                    <div>
                         <span>${llcType} Available</span>
                    </div>
                    <div id="state-available"></div>
                </div> -->
                <div>
                    <div>
                        <span><spring:message code="IT-001-11-009" /></span>
                    </div>
                    <div id="state-available"></div>
                </div>
                <div>
                    <div>
                        <span><spring:message code="IT-001-11-011" /></span>
                    </div>
                    <div id="state-control-state"></div>
                </div>
                <div>
                    <div>
                        <span><spring:message code="IT-001-11-013" /></span>
                    </div>
                    <div id="state-alarm-state"></div>
                </div>
                <div>
                    <div>
                        <span><spring:message code="IT-001-11-015" /></span>
                    </div>
                    <div id="state-comm-state"></div>
                </div>
                <div>
                    <div>
                        <span><spring:message code="IT-001-11-017" /></span>
                    </div>
                    <div id="state-system-state"></div>
                </div>
                <!--2020.02.24 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 -->
                <!-- <div>
                    <div>
                       <span>${llcType} Mode</span>  
                    </div>
                    <div id="OCDC-mode"></div>
                </div> -->
            </div>
            
            <div id="state-text-target-tsc">
                <div>
                    <div>
                        <span><spring:message code="IT-001-11-026" /></span>
                    </div>
                    <div id="state-tsc-name"></div>
                </div>
                <div>
                    <div>
                        <span><spring:message code="IT-001-11-028" /></span>
                    </div>
                    <div id="state-tsc-mode"></div>
                </div>
                <div>
                    <div>
                        <span><spring:message code="IT-001-11-030" /></span>
                    </div>
                    <div id="state-tsc-available"></div>
                </div>
                <div>
                    <div>
                        <span><spring:message code="IT-001-11-032" /></span>
                    </div>
                    <div id="state-crane-id"></div>
                </div>
                <div>
                    <div>
                        <span><spring:message code="IT-001-11-034" /></span>
                    </div>
                    <div id="state-crane-state"></div>
                </div>
                <div>
                    <div>
                        <span><spring:message code="IT-001-11-036" /></span>
                    </div>
                    <div id="state-stoker-available"></div>
                </div>
                <div>
                    <div>
                        <span><spring:message code="IT-001-11-038" /></span>
                    </div>
                    <div id="state-stoker-alarm-state"></div>
                </div>
            </div>
            
            <!-- 2020.02.28 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000  -->
            <div id="state-stokerZoneTable-target"></div>
            <div id="state-portTable-target"></div>
            <div id="state-vehicleTable-target"></div>
            <div id="state-table-target"></div>
        </div> 
        <!-- 状態表示画面 end -->
		<!-- Vehicle 表示画面 start -->
        <!--<div id="port-screen">
            <div class="mcs-content-subtitle">
                <span><spring:message code="IT-001-12-001" /></span>
            </div>
            <div id="port-table-target"></div>
        </div>-->
        <!-- ポート表示画面 end -->
        <!-- ポート表示画面 start -->
        <!--<div id="vehicle-screen">
            <div class="mcs-content-subtitle">
                <span><spring:message code="IT-001-13-001" /></span>
            </div>
            <div id="vehicle-table-target"></div>
        </div>-->
        <!-- ポート表示画面 end -->

        <!-- Microコマンド表示画面 start -->
        <div id="microCmd-screen">
            <div class="mcs-content-subtitle">
                <span><spring:message code="IT-001-13-004" /></span>
            </div>
            <div id="microCmd-table-target"></div>
        </div>
        <!-- Microコマンド表示画面 end -->

        <!-- 搬送Job表示画面 start -->
        <div id="trnJob-screen">
            <div class="mcs-content-subtitle">
                <span><spring:message code="IT-001-14-004" /></span>
            </div>
            <div id="trnJob-table-target"></div>
        </div>
        <!-- 搬送Job表示画面 end -->

    </div>

    <!--  右メニュースライド -->
    <nav id="mcs-right-menu">
        <div id="btn-reload" class="btn-mcs-slide"></div>
        <div id="btn-state" class="btn-mcs-slide"></div>
        <div id="btn-port" class="btn-mcs-slide"></div>
        <div id="btn-micro-cmd" class="btn-mcs-slide"></div>
        <div id="btn-trn-job" class="btn-mcs-slide"></div>
        <div id="btn-return" class="btn-mcs-slide btn-mcs-slide-return"></div>
    </nav>

</body>
</html>
