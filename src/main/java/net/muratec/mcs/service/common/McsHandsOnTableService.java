//@formatter:off

/**
 ******************************************************************************
 * @file        McsHandsOnTableService.java
 * @brief       画面部品HandsOnTablesで扱うサービス
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
 * 2019/12/04 MACS4#MACSV2  MACSV2→MACSV4対応            天津村研　董
 ******************************************************************************
 */
//@formatter:on
package net.muratec.mcs.service.common;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.batik.anim.dom.SVGDOMImplementation;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import net.muratec.mcs.common.ComConst;
import net.muratec.mcs.common.ComFunction;
import net.muratec.mcs.entity.common.McsHandsOnTableBorderInfoEntity;
import net.muratec.mcs.entity.common.McsHandsOnTableCellDataElemEntity;
import net.muratec.mcs.entity.common.McsHandsOnTableIconColorEntity;
import net.muratec.mcs.entity.common.McsHandsOnTableIconEntity;
import net.muratec.mcs.entity.common.McsHandsOnTableLineInfoEntity;
import net.muratec.mcs.entity.common.McsHandsOnTableMergeInfoEntity;
import net.muratec.mcs.exception.McsException;
import net.muratec.mcs.mapper.GuiColorMapper;
import net.muratec.mcs.mapper.HandsOnTableConfigMapper;
import net.muratec.mcs.mapper.LlcMapper;
import net.muratec.mcs.mapper.ModuleMapper;
import net.muratec.mcs.mapper.ScreenColorMasterMapper;
import net.muratec.mcs.mapper.ScreenMonitorMapper;
import net.muratec.mcs.mapper.ScreenMonitorMemberMapper;
import net.muratec.mcs.model.GuiColor;
import net.muratec.mcs.model.GuiColorExample;
import net.muratec.mcs.model.HandsOnTableConfig;
import net.muratec.mcs.model.HandsOnTableConfigExample;
import net.muratec.mcs.model.IconInfo;
import net.muratec.mcs.model.Llc;
import net.muratec.mcs.model.Module;
import net.muratec.mcs.model.ModuleExample;
import net.muratec.mcs.model.ScreenColorMaster;
import net.muratec.mcs.model.ScreenMonitor;
import net.muratec.mcs.model.ScreenMonitorMember;
import net.muratec.mcs.model.ScreenMonitorMemberExample;

//@formatter:off
/**
 ******************************************************************************
 * @brief     画面部品HandsOnTablesで扱うサービスクラス
 * @par       機能:
 *              getIcon（アイコン情報を取得する処理）
 *              getLabel（ラベル情報を取得する処理）
 *              getBorder（ボーダー情報を取得する処理）
 *              getMerge（マージ情報を取得する処理）
 *              getRowColSize（行列のサイズ情報を取得する処理）
 *              sortCellData（セルデータ要素のリストをソートする処理）
 *              getColors（アイコンの色情報を取得する処理）
 *              createIconDomStr（アイコンのDOM文字列を生成する処理）
 *              createIconSvg1（アイコン1のDOMを生成する処理）
 *              createIconSvg2（アイコン2のDOMを生成する処理）
 *              createIconSvg4（アイコン4のDOMを生成する処理）
 *              createIconSvg6（アイコン6のDOMを生成する処理）
 *              createIconSvg7（アイコン7のDOMを生成する処理）
 *              createIconSvg8（アイコン8のDOMを生成する処理）
 *              createIconFrame（アイコン外枠のi要素を生成する処理）
 *              createPolygon（アイコン全体のpolygon要素を生成する処理）
 *              createLargeRect（アイコン全体のrect要素を生成する処理）
 *              createText（text要素を生成する処理）
 *              createStatusBoxRect（ステータスのrect要素を生成する処理）
 *              getControllerStateColor（アイコンのコントローラ状態の色を取得する処理）
 *              getPortStateColor（アイコンのポート状態の色を取得する処理）
 *              getCommStateColor（アイコンの通信状態の色を取得する処理）
 *              getShelfOccupancyColor（アイコンの棚占有率の色を取得する処理）
 *              getIssueStateColor（アイコンの出庫状況の色を取得する処理）
 * @attention
 * @note
 * ----------------------------------------------------------------------------
 * VER.        DESCRIPTION                                               AUTHOR
 * ----------------------------------------------------------------------------
 *  MACS4#MACSV2  MACSV2→MACSV4対応      							                                       天津村研　董
 ******************************************************************************
 */
//@formatter:on
@Service
public class McsHandsOnTableService extends BaseService {

    /** HandsOnTableの設定テーブルマッパー */
    @Autowired private HandsOnTableConfigMapper handsOnTableConfigMapper; // MACS4#MACSV2 Del
    // STD APL 2020.02.14 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
    @Autowired private ScreenMonitorMemberMapper screenMonitorMemberMapper; // MACS4#MACSV2 Add
    @Autowired private ModuleMapper moduleMapper; // MACS4#MACSV3 Add
    @Autowired private LlcMapper llcMapper; // MACS4#MACSV3 Add
    // END APL 2020.02.14 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 

    /** 色設定テーブルマッパー */
    @Autowired private GuiColorMapper guiColorMapper;    
    
    /** 色設定テーブルマッパー */
    @Autowired private ScreenColorMasterMapper screenColorMasterMapper;   //MACS4#MACSV2 Add Song 20191210
    
    /** 色設定テーブルマッパー */
    @Autowired private ScreenMonitorMapper screenMonitorMapper;   //MACS4#MACSV2 Add Song 20191211
    
    /** メッセージリソース */
    @Autowired private MessageSource messageSource;

    /** アイコンの色設定格納用配列 */
    private String[] iconColors = new String[1000];

    /** Label設定格納用配列 */
    Map<String, Integer> labelMap = new HashMap<String,Integer>();       // MACS4#MACSV2 Add
    Map<String, Integer> typeDataMap = new HashMap<String,Integer>();       // MACS4#MACSV2 Add
    
    int dataNumRow = 15;  //20191218 Song Add   //每行最多显示多少个Icon
    
    String occupancy = null; //20191231 Song Add For method:  getShelfOccupancyColor
    
    //20200107 Song Add Start For SystemMonitorAjaxController.java
  	/*
    String ipPath = null; 
    
    public void setIpPath(String ipPath) {
    	this.ipPath = ipPath;
    	setData(ipPath,SCREEN_MONITOR);
    	setData(ipPath,SCREEN_MONITOR_MEMBER);
    }
    */
    List<ScreenMonitor> screenMonitorList1  = new ArrayList<ScreenMonitor>();
    List<ScreenMonitorMember> ScreenMonitorMemberList1  = new ArrayList<ScreenMonitorMember>();
    List<ScreenColorMaster> screenColorMasterList1  = new ArrayList<ScreenColorMaster>();
    
    public void setScreenMonitorList1(List<ScreenMonitor> screenMonitorList1) {
    	this.screenMonitorList1 = screenMonitorList1;
    }
    public void setScreenMonitorMemberList1(List<ScreenMonitorMember> ScreenMonitorMemberList1) {
    	this.ScreenMonitorMemberList1 = ScreenMonitorMemberList1;
    }
    public void setScreenColorMasterList1(List<ScreenColorMaster> screenColorMasterList1) {
    	this.screenColorMasterList1 = screenColorMasterList1;
    }
    
    //20200107 Song Add End
    //@formatter:off
    /**
     ******************************************************************************
     * @brief     アイコン情報を取得する処理
     * @param
     * @return    セルのデータ要素リスト（アイコン）
     * @retval
     * @attention
     * @note      HandsOnTableの設定テーブルからアイコン情報を取得する
     * ----------------------------------------------------------------------------
     * VER.        DESCRIPTION                                               AUTHOR
     * ----------------------------------------------------------------------------
     * MACS4#0225  MACSV2→MACSV4対応                         天津村研　董
     ******************************************************************************
     */
    //@formatter:on
    @Transactional
    /*public List<McsHandsOnTableCellDataElemEntity> getIcon() throws McsException {

        List<McsHandsOnTableCellDataElemEntity> cellDataElemList = new ArrayList<McsHandsOnTableCellDataElemEntity>();

        // アイコンの色情報を取得
        iconColors = getColors();

        // アイコン情報を取得
        List<IconInfo> iconInfoList = handsOnTableConfigMapper.selectIconInfo();

        for (IconInfo iconInfo : iconInfoList) {

            // 行番号,列番号,優先順位の位置情報を配列に格納
            String[] positions = super.commaStrToArray(iconInfo.getPosition());

            // アイコンの位置情報が不正ならば例外をthrow
            if (positions.length != 3) {
                throw new McsException(
                        messageSource.getMessage("ERR0042", null, "ERR0042", LocaleContextHolder.getLocale()));
            }

            // アイコンを生成
            McsHandsOnTableIconEntity iconEntity = new McsHandsOnTableIconEntity();
            iconEntity.amhsId = iconInfo.getAmhsId();
            iconEntity.amhsType = iconInfo.getAmhsType();
            iconEntity.iconType = Short.valueOf(iconInfo.getIconType());
            iconEntity.iconDomStr = createIconDomStr(iconInfo);

            // セルデータにアイコンを格納
            McsHandsOnTableCellDataElemEntity cellData = new McsHandsOnTableCellDataElemEntity();
            cellData.row = Integer.valueOf(positions[0]);
            cellData.col = Integer.valueOf(positions[1]);
            cellData.priority = Integer.valueOf(positions[2]);
            cellData.icon = iconEntity;

            cellDataElemList.add(cellData);
        }

        return cellDataElemList;
    }*/
    public List<McsHandsOnTableCellDataElemEntity> getIcon() throws McsException {

        List<McsHandsOnTableCellDataElemEntity> cellDataElemList = new ArrayList<McsHandsOnTableCellDataElemEntity>();

        // アイコンの色情報を取得
        //iconColors = getColors(); //MACSV4用
        /* MACSV2 テスト用
         * String[] colors = new String[1000];
            try {
                colors[0] = ComFunction.rgbToHex((short)100, (short)100, (short)100);//GRAY
                colors[1] = ComFunction.rgbToHex((short)0, (short)255, (short)0);//GREEN
                colors[2] = ComFunction.rgbToHex((short)255, (short)140, (short)0);//ORANGE
                colors[3] = ComFunction.rgbToHex((short)255, (short)255, (short)0);//YELLOW
            } catch (Exception ignored) {
                // 不正なレコードは無視する。
            }
        iconColors =colors;*/
        // STD APL 2020.02.17 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
        // アイコン情報を取得
//        List<IconInfo> iconInfoList = handsOnTableConfigMapper.selectIconInfo();// MACS4#MACSV2 Add
        List<IconInfo> labelList = moduleMapper.selectIconType(); // MACS4#MACSV3 Add  //全て種類を査問する「Shared,Module 1,Module 2」
        // END APL 2020.02.17 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
        
        /*// STD APL 2020.02.17 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 

         * //20200111 Add Song Start
        List<IconInfo> labelList = new ArrayList<IconInfo>() ; // MACS4#MACSV2 Add  //查询出所有的类型
        
 		for (ScreenMonitorMember screenMonitorMember : ScreenMonitorMemberList1) {
 	
 			String memberGroup = screenMonitorMember.getMemberGroup();
 			IconInfo type = new IconInfo();
 			type.setMemberGroup(memberGroup);
			boolean flag = false;
			for (IconInfo iconInfo : labelList) {
				if(iconInfo.getMemberGroup().equals(memberGroup)) {
					flag = true;
				}
			}
			if(flag == false) {
				labelList.add(type);
			}
		}
 		//20200111 Add Song End	
// END APL 2020.02.17 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
*/   	 		
   	 		
   	 		for (IconInfo iconInfo : labelList) {
   	 			int colNum = 0;//列号
//		        ScreenMonitorMemberExample configExample = new ScreenMonitorMemberExample();
//		        String tscType = iconInfo.getMemberGroup();   //tscType里面放的是类型名称
   	 			// STD APL 2020.02.17 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 

		        String moduleName = iconInfo.getModuleName();   //tscType里面放的是类型名称
		        List<IconInfo> llcTypeList = llcMapper.selectLlcType(moduleName); // MACS4#MACSV3 Add  //全てLLCType種類を査問する「CDC,OHBC,OHTC,OHTC2......」
		        for (IconInfo llcInfo : llcTypeList) {
		        	String llcType = llcInfo.getLlcType();   //llcTypeはLLC_TYPE
		        	Llc llcPa = new Llc();
		        	llcPa.setLlcType(llcType);
		        	llcPa.setModuleName(moduleName);
		        	
//		   	 		List<IconInfo> iconListType = llcMapper.selectIconInfoByType(moduleType,llcType);  //llcTypeによって、設備のデータを探す
		   	 		List<IconInfo> iconListType = llcMapper.selectIconInfoByType(llcPa);  //llcTypeによって、設備のデータを探す
		   	 	// END APL 2020.02.17 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
		        
		   	 	Integer iconNum = labelMap.get(moduleName)+1;//Label番号  //labelMap里面放的是所有表头的类型和所在行号 ，再加1是Icon的行号
	   	 		Integer dataNum = typeDataMap.get(moduleName+"Data")+1;  //typeDataMap里面放的是tscType类型的所有Icon需要占的最大行数，加上Data只是区分看labelMap里面的数据
	   	 		
			   	 	for (IconInfo LlclList : iconListType) {
						
	//		   	 		Integer iconNum = labelMap.get(tscType)+1;//Label番号//del
	//		   	 		Integer dataNum = typeDataMap.get(tscType+"Data")+1;//del
			   	 		// アイコンを生成
			   	 		McsHandsOnTableIconEntity iconEntity = new McsHandsOnTableIconEntity();
			   	 		
			   	 		McsHandsOnTableCellDataElemEntity cellData = new McsHandsOnTableCellDataElemEntity();
			   	 		//if(iconNum < dataNum && colNum <8 ) {
			   	 		if(iconNum < dataNum && colNum < dataNumRow ) {  //dataNumRow里面放的是一行最多显示几个Icon
			   	 			iconEntity.llcId = LlclList.getLlcId();
			   	 			iconEntity.llcName = LlclList.getLlcName();
			   	 			iconEntity.iconType    = LlclList.getIconType();
			   	 			iconEntity.iconDomStr  = createIconDomStr(LlclList);
			   	 			
			   	 			cellData.row 	  = Integer.valueOf(iconNum); //row里面放的是Icon的行数
			   	 			cellData.col	  = Integer.valueOf(0);   //col里面根据v4的数据库，应该放的都是0
			   	 			cellData.priority = colNum;    //priority里面放的是Icon的列数
			   	 			cellData.icon	  = iconEntity;
			   	 			cellDataElemList.add(cellData);
			   	 			colNum++;
			   	 		}
			   	 		
			   	 		//if(colNum > 7) {
			   	 		if(colNum > dataNumRow - 1) { 
			   	 			iconNum ++;   //当每行放到最多dataNumRow，就换行
			   	 			colNum = 0;
			   	 		}
					}
			   	// STD APL 2020.02.17 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
		        }
			   	// END APL 2020.02.17 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 

				
			}

        return cellDataElemList;
    }

    //@formatter:off
    /**
     ******************************************************************************
     * @brief     ラベル情報を取得する処理
     * @param
     * @return    セルのデータ要素リスト（ラベル）
     * @retval
     * @attention
     * @note      HandsOnTableの設定テーブルからラベル情報を取得する
     * ----------------------------------------------------------------------------
     * VER.        DESCRIPTION                                               AUTHOR
     * ----------------------------------------------------------------------------
     * MACS4#0225  MACSV2→MACSV4対応                         天津村研　董
     ******************************************************************************
     */
    
   
    
    
    //@formatter:on
    @Transactional
    /*public List<McsHandsOnTableCellDataElemEntity> getLabel() throws McsException {

        List<McsHandsOnTableCellDataElemEntity> cellDataElemList = new ArrayList<McsHandsOnTableCellDataElemEntity>();

        // ラベル情報を取得
        HandsOnTableConfigExample configExample = new HandsOnTableConfigExample();
        configExample.createCriteria().andSectionEqualTo(ComConst.HandsOnTableConfig.LABEL);
        List<HandsOnTableConfig> labelList = handsOnTableConfigMapper.selectByExample(configExample);

        for (HandsOnTableConfig label : labelList) {

            // 行番号,列番号,優先順位の位置情報を配列に格納
            String[] positions = super.commaStrToArray(label.getKey());

            // ラベルの位置情報が不正ならば例外をthrow
            if (positions.length != 3) {
                throw new McsException(
                        messageSource.getMessage("ERR0042", null, "ERR0042", LocaleContextHolder.getLocale()));
            }

            // セルデータにラベルを格納
            McsHandsOnTableCellDataElemEntity cellData = new McsHandsOnTableCellDataElemEntity();
            cellData.row = Integer.valueOf(positions[0]);
            cellData.col = Integer.valueOf(positions[1]);
            cellData.priority = Integer.valueOf(positions[2]);

            // 言語設定によってラベルを切り替える
            cellData.label = (LocaleContextHolder.getLocale() == Locale.JAPANESE) ? label.getValue2()
                    : label.getValue1();

            cellDataElemList.add(cellData);
        }

        return cellDataElemList;
    }*/
    
    
    
    public List<McsHandsOnTableCellDataElemEntity> getLabel() throws McsException {

        List<McsHandsOnTableCellDataElemEntity> cellDataElemList = new ArrayList<McsHandsOnTableCellDataElemEntity>();

        // ラベル情報を取得
//        HandsOnTableConfigExample configExample = new HandsOnTableConfigExample();
//        configExample.createCriteria().andSectionEqualTo(ComConst.HandsOnTableConfig.LABEL);
//        List<HandsOnTableConfig> labelList = handsOnTableConfigMapper.selectByExample(configExample);// MACS4#MACSV2 Del
        
     // STD APL 2020.02.14 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
//        List<IconInfo> labelList = screenMonitorMemberMapper.selectIconType(); // MACS4#MACSV2 Add  //查询出所有的类型
        List<IconInfo> labelList = moduleMapper.selectIconType(); // MACS4#MACSV3 Add  //查询出所有的类型
        // END APL 2020.02.14 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
        int rowNum = 0;
        int dataNum = 0;
        List<Module> iconInfoList = null;
        //int dataNumRow = 20;
        for (IconInfo iconType : labelList) {
//        	iconInfoList.clear();
//        	String tscType = iconType.getMemberGroup();
        	String moduleType = iconType.getModuleName(); // MACS4#MACSV3 Add
        	String moduleData = moduleType+"Data";
        	ModuleExample configExample = new ModuleExample();
        	configExample.createCriteria().andModuleNameEqualTo(moduleType);
        	iconInfoList = moduleMapper.selectByExample(configExample); // MACS4#MACSV2 Add
        	
        	labelMap.put(moduleType, rowNum); // MACS4#MACSV2 Add  //labelMap里面放的是每个类型名字，它对应的行号
        	
        	//データの行巣　  
        	//20191217 DQY ADD START
        	//データは20個毎行
        	if(iconInfoList.size()%dataNumRow >0) {       //如果某个类型的Icon数量比较多，数量大于dataNumRow了，就算出这些Icon需要多少行
        		dataNum = iconInfoList.size() / dataNumRow + 1;									
        	}
        	else
        	{
        		dataNum = iconInfoList.size() / dataNumRow;
        	}
        	//20191217 DQY ADD END
        	
        	//データの最終行番号  
        	typeDataMap.put(moduleData, rowNum + dataNum);		//typeDataMap里面放的是某个类型它的所有Icon需要占用多少行，的最大行号					
        	
//	        for (ScreenMonitorMember label : iconInfoList) {
	            // 行番号,列番号,優先順位の位置情報を配列に格納
	           // String[] positions = super.commaStrToArray(label.getKey());
//	        	Short positions = label.getGroupNumber();
	        	Short positions = 0;
	        	
	            /*// ラベルの位置情報が不正ならば例外をthrow
	            if (positions.length != 3) {
	                throw new McsException(
	                        messageSource.getMessage("ERR0042", null, "ERR0042", LocaleContextHolder.getLocale()));
	            }*/
	
	            // セルデータにラベルを格納
	            McsHandsOnTableCellDataElemEntity cellData = new McsHandsOnTableCellDataElemEntity();
	            cellData.row = Integer.valueOf(rowNum);  //行
	            cellData.col = Integer.valueOf(positions);  //这个值一直为0
	            cellData.priority = Integer.valueOf(positions); //列
	            /*// 言語設定によってラベルを切り替える
	            cellData.label = (LocaleContextHolder.getLocale() == Locale.JAPANESE) ? label.getValue2()
	                    : label.getValue1();*/
//	            cellData.label = iconType.getMemberGroup();
	            cellData.label = iconType.getModuleName();
	
	            cellDataElemList.add(cellData);
	            rowNum++;				   // MACS4#MACSV2 Add
	            rowNum = rowNum + dataNum ;// MACS4#MACSV2 Add
//	        }
        }

        return cellDataElemList;
    }

    //@formatter:off
    /**
     ******************************************************************************
     * @brief     ボーダー情報を取得する処理
     * @param
     * @return    ボーダーリスト
     * @retval
     * @attention
     * @note      HandsOnTableの設定テーブルからボーダー情報を取得する
     * ----------------------------------------------------------------------------
     * VER.        DESCRIPTION                                               AUTHOR
     * ----------------------------------------------------------------------------
     * MACS4#0225  MACSV2→MACSV4対応                         天津村研　董
     ******************************************************************************
     */
    
    //@formatter:on
    @Transactional
    public List<McsHandsOnTableBorderInfoEntity> getBorder() throws McsException {

        List<McsHandsOnTableBorderInfoEntity> borderEntityList = new ArrayList<McsHandsOnTableBorderInfoEntity>();

        // ボーダー情報を取得
        HandsOnTableConfigExample configExample = new HandsOnTableConfigExample();
        configExample.createCriteria().andSectionEqualTo(ComConst.HandsOnTableConfig.BORDER);
        // STD APL 2020.02.17 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
//        List<IconInfo> labelList = screenMonitorMemberMapper.selectIconType(); 	
        List<IconInfo> labelList = moduleMapper.selectIconType(); // MACS4#MACSV3 Add  //查询出所有的类型// MACS4#MACSV2 Add
        // END APL 2020.02.17 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
        int position1 = 0;
        int position2 = 0;
        int width0 = 0;
        int width3 = 3;
        int type0 = 0;
        
        //20191217 dqy add start
        String tscType;
        Integer[] iconNums= new Integer[labelList.size()];
        Integer iconNum = 0 ;
        Integer dataNum = 0 ;//データの行番号
        int lastRow =0 ;
        int LabelNum=0;//行号数组
        Boolean labelFlag=true;
        for (IconInfo iconInfo : labelList) {
        	// STD APL 2020.02.17 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
//        	 tscType = iconInfo.getMemberGroup();
        	 tscType = iconInfo.getModuleName();
        	 // END APL 2020.02.17 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
        	 
	   	 	 iconNum = labelMap.get(tscType);//Label番号
	   	 	 dataNum = typeDataMap.get(tscType+"Data");
	   	 	 iconNums[LabelNum] = iconNum;
	   	 	 LabelNum++;
	   	 	 if(labelList.size()==LabelNum)
	   	 	 {
	   	 		lastRow =typeDataMap.get(tscType+"Data") ; //lastRow这个变量里放的是最后也是最大行号
	   	 	 }
        }
        //20191217 dqy add
        int[] widths = new int[4];
//        for (HandsOnTableConfig border : borderList) { // MACS4#MACSV2 Del
//          for (int num =0 ; num< labelList.size()*2 ;num++) {			 // MACS4#MACSV2 Add //20191217 dqy del
         for (int num =0 ; num< lastRow+1 ;num++) {			 // MACS4#MACSV2 Add //20191217 dqy del
//        for (IconInfo iconInfo : labelList) {
          for(int j=0;j<iconNums.length;j++) {
        	  if(num == iconNums[j] ) {
        		  widths = new int[]{width0,width0,width3,width0};
        		  labelFlag = false;
        		  position1 = num;//BORDER ROW 20191217 DQY ADD
        		  break;
        	  }
           }
          if(labelFlag)
          {
        	  widths = new int[]{width0,width0,width0,width0};
          }
	   	 	//20191217 dqy add end
	   	 	
            // 行番号,列番号の位置情報を配列に格納
//            String[] positions = super.commaStrToArray(border.getKey());
//        	position1 = num;//BORDER ROW 20191217 DQY DEL
            int[] positions = {position1,position2};
            // top,left,bottom,rightの太さ情報を配列に格納
//            String[] widths = super.commaStrToArray(border.getValue1());
            /* 20191217 dqy del
             * if((num%2)!=0 ) {
            	widths = new int[]{width0,width0,width0,width0};
            }
            else if( num==0)
            {
            	widths = new int[]{width0,width0,width3,width0};
            }
            else {
            	widths = new int[]{width0,width0,width3,width0};
            }*/

            // top,left,bottom,rightの線の種類を配列に格納
//            String[] types = super.commaStrToArray(border.getValue2());
              int[] types = {type0,type0,type0,type0};
              
            // それぞれの設定が不正ならば例外をthrow
            if (positions.length != 2 || widths.length != 4 || types.length != 4) {
                throw new McsException(
                        messageSource.getMessage("ERR0042", null, "ERR0042", LocaleContextHolder.getLocale()));
            }

            // ボーダーの位置情報を格納
            McsHandsOnTableBorderInfoEntity borderEntity = new McsHandsOnTableBorderInfoEntity();
            borderEntity.row = Integer.valueOf(positions[0]);
            borderEntity.col = Integer.valueOf(positions[1]);

            // ボーダーの線の太さと種類を格納
            for (int i = 0; i < widths.length; i++) {
//                int width = Integer.parseInt(widths[i]);
//                int type = Integer.parseInt(types[i]);
                int width = widths[i];
                int type = types[i];
                if (0 < width) {
                    McsHandsOnTableLineInfoEntity line = new McsHandsOnTableLineInfoEntity();
                    line.width = width;
                    line.type = type;
                    switch (i) {
                        case 0:
                            borderEntity.top = line;
                            break;
                        case 1:
                            borderEntity.left = line;
                            break;
                        case 2:
                            borderEntity.bottom = line;
                            break;
                        case 3:
                            borderEntity.right = line;
                            break;
                    }
                }
            }
            borderEntityList.add(borderEntity);
        }
        return borderEntityList;
    }

    //@formatter:off
    /**
     ******************************************************************************
     * @brief     マージ情報を取得する処理
     * @param
     * @return    マージ情報リスト
     * @retval
     * @attention
     * @note      HandsOnTableの設定テーブルからマージ情報を取得する
     * ----------------------------------------------------------------------------
     * VER.        DESCRIPTION                                               AUTHOR
     * ----------------------------------------------------------------------------
     ******************************************************************************
     */
    //@formatter:on
    @Transactional
    public List<McsHandsOnTableMergeInfoEntity> getMerge() throws McsException {

        List<McsHandsOnTableMergeInfoEntity> mergeEntityList = new ArrayList<McsHandsOnTableMergeInfoEntity>();

        // マージ情報を取得
        HandsOnTableConfigExample configExample = new HandsOnTableConfigExample();
        configExample.createCriteria().andSectionEqualTo(ComConst.HandsOnTableConfig.MERGE);
        List<HandsOnTableConfig> mergeList = handsOnTableConfigMapper.selectByExample(configExample);

        for (HandsOnTableConfig merge : mergeList) {

            // 行番号,列番号の位置情報を配列に格納
            String[] positions = super.commaStrToArray(merge.getKey());

            // 行範囲、列範囲を配列に格納
            String[] ranges = super.commaStrToArray(merge.getValue1());

            // それぞれの設定が不正ならば例外をthrow
            if (positions.length != 2 || ranges.length != 2) {
                throw new McsException(
                        messageSource.getMessage("ERR0042", null, "ERR0042", LocaleContextHolder.getLocale()));
            }

            // マージ情報を格納
            McsHandsOnTableMergeInfoEntity mergeEntity = new McsHandsOnTableMergeInfoEntity();
            mergeEntity.row = Integer.valueOf(positions[0]);
            mergeEntity.col = Integer.valueOf(positions[1]);
            mergeEntity.rowspan = Integer.valueOf(ranges[0]);
            mergeEntity.colspan = Integer.valueOf(ranges[1]);

            mergeEntityList.add(mergeEntity);
        }

        return mergeEntityList;
    }

    //@formatter:off
    /**
     ******************************************************************************
     * @brief     行列のサイズ情報を取得する処理
     * @param
     * @return    行列のサイズリスト（行のリスト+列のリストのリスト）
     * @retval
     * @attention
     * @note      HandsOnTableの設定テーブルから行列のサイズ情報を取得する
     * ----------------------------------------------------------------------------
     * VER.        DESCRIPTION                                               AUTHOR
     * ----------------------------------------------------------------------------
     * MACS4#MACSV2  MACSV2→MACSV4対応                                  天津村研　董
     ******************************************************************************
     */
    //@formatter:on
    @Transactional
/*    public List<List<Integer>> getRowColSize() throws McsException {

        // 行列のサイズ情報を取得
        HandsOnTableConfigExample configExample = new HandsOnTableConfigExample();
        List<String> condList = new ArrayList<String>();
        condList.add(ComConst.HandsOnTableConfig.WIDTH);
        condList.add(ComConst.HandsOnTableConfig.HEIGHT);
        configExample.createCriteria().andSectionEqualTo(ComConst.HandsOnTableConfig.SIZE).andKeyIn(condList);
        List<HandsOnTableConfig> sizeList = handsOnTableConfigMapper.selectByExample(configExample);

        // 設定が不正ならば例外をthrow
        if (sizeList.size() != 2) {
            throw new McsException(
                    messageSource.getMessage("ERR0042", null, "ERR0042", LocaleContextHolder.getLocale()));
        }

        // 行列のサイズ情報をフォーマット
        String[] widthStrArr = null;
        String[] heightStrArr = null;
        for (int i = 0; i < sizeList.size(); i++) {
            if (sizeList.get(i).getKey().equals(ComConst.HandsOnTableConfig.WIDTH)) {
                widthStrArr = super.commaStrToArray(sizeList.get(i).getValue1());
            } else {
                heightStrArr = super.commaStrToArray(sizeList.get(i).getValue1());
            }
        }
        List<Integer> widthList = new ArrayList<Integer>();
        for (int i = 0; i < widthStrArr.length; i++) {
            widthList.add(Integer.valueOf(widthStrArr[i]));
        }
        List<Integer> heightList = new ArrayList<Integer>();
        for (int i = 0; i < heightStrArr.length; i++) {
            heightList.add(Integer.valueOf(heightStrArr[i]));
        }

        List<List<Integer>> retSizeList = new ArrayList<List<Integer>>();
        retSizeList.add(widthList);
        retSizeList.add(heightList);

        return retSizeList;
    }*/
    public List<List<Integer>> getRowColSize() throws McsException {

        // 行列のサイズ情報を取得
//        HandsOnTableConfigExample configExample = new HandsOnTableConfigExample();
//        List<String> condList = new ArrayList<String>();
//        condList.add(ComConst.HandsOnTableConfig.WIDTH);
//        condList.add(ComConst.HandsOnTableConfig.HEIGHT);
//        configExample.createCriteria().andSectionEqualTo(ComConst.HandsOnTableConfig.SIZE).andKeyIn(condList);
//        List<HandsOnTableConfig> sizeList = handsOnTableConfigMapper.selectByExample(configExample);

        // 設定が不正ならば例外をthrow
        /*if (sizeList.size() != 2) {
            throw new McsException(
                    messageSource.getMessage("ERR0042", null, "ERR0042", LocaleContextHolder.getLocale()));
        }*/

        // 行列のサイズ情報をフォーマット
//        String[] widthStrArr = null;
//        String[] heightStrArr = null;
        /*for (int i = 0; i < sizeList.size(); i++) {
            if (sizeList.get(i).getKey().equals(ComConst.HandsOnTableConfig.WIDTH)) {
                widthStrArr = super.commaStrToArray(sizeList.get(i).getValue1());
            } else {
                heightStrArr = super.commaStrToArray(sizeList.get(i).getValue1());
            }
        }*/
    	
  
//        List<IconInfo> labelList = screenMonitorMemberMapper.selectIconType(); // MACS4#MACSV2 Add
        List<IconInfo> labelList = moduleMapper.selectIconType(); // MACS4#MACSV3 Add  //查询出所有的类型

        int length = labelList.size();
        List<Integer> heightList = new ArrayList<Integer>();
        int labelHeight = 23;
//        int iconHeight = 60;//20191218 DQY DEL 
        int iconHeight = 95;//20191218 DQY ADD  DATA HEIGHT
//        Integer[] width = new Integer[] {};
//        width = new Integer[] {23,60};
//        List<Integer> widthList = new ArrayList<Integer>();
        
        
        //20191218 Song Add Start
        String tscType;
        Integer iconNum = 0 ;
        Integer dataNum = 0 ;//データの行番号
        for (IconInfo iconInfo : labelList) {
//        	 tscType = iconInfo.getMemberGroup();
        	 tscType = iconInfo.getModuleName();
        	 
	   	 	 iconNum = labelMap.get(tscType);   
	   	 	 heightList.add(labelHeight);      //每一个类型的高度是23
	   	 	 
	   	 	 dataNum = typeDataMap.get(tscType+"Data");  //dataNum里面是每个类型下面有多少行Icon的最大行号
	   	 	 for (int i = 0; i < dataNum-iconNum; i++) {
	   	 		heightList.add(iconHeight);     //每一个类型底下有若干行Icon,每行Icon的高度是60
			 }
        }
        //20191218 Song Add End
        
        /*
         *  //20191218 Song Del Start
        for(int i=0; i<length;i++) {  
        	heightList.add(labelHeight);
        	heightList.add(iconHeight);
        }
         //20191218 Song Del Start
        */ 
        
        /*for (int i = 0; i < widthStrArr.length; i++) {
            widthList.add(Integer.valueOf(widthStrArr[i]));
        }*/
        List<Integer> widthList = new ArrayList<Integer>();
        /*for (int i = 0; i < heightStrArr.length; i++) {
            heightList.add(Integer.valueOf(heightStrArr[i]));
        }*/
//        int width =1870;//20191217 DQY DEL
        int width =1300;//20191217 DQY ADD    //最大列宽
        widthList.add(width);

        List<List<Integer>> retSizeList = new ArrayList<List<Integer>>();
        retSizeList.add(widthList);
        retSizeList.add(heightList);

        return retSizeList;
    }
    //@formatter:off
    
    /**
     ******************************************************************************
     * @brief     セルデータ要素のリストをソートする処理
     * @param     セルデータ要素リスト
     * @return
     * @retval
     * @attention
     * @note      優先順位の昇順でソート
     * ----------------------------------------------------------------------------
     * VER.        DESCRIPTION                                               AUTHOR
     * ----------------------------------------------------------------------------
     ******************************************************************************
     */
    //@formatter:on
    public void sortCellData(List<McsHandsOnTableCellDataElemEntity> cellDataList) {

        Collections.sort(cellDataList, new Comparator<McsHandsOnTableCellDataElemEntity>() {

            @Override
            public int compare(McsHandsOnTableCellDataElemEntity a, McsHandsOnTableCellDataElemEntity b) {

                return a.priority - b.priority;
            }
        });
    }
    //@formatter:off
    
    
    //MACS4#MACSV2 Add Start Song 20191211
    /**
     ******************************************************************************
     * @brief     アイコンの色情報を取得する処理
     * @param
     * @return    アイコンの色情報配列
     * @retval
     * @attention
     * @note      色設定テーブルから取得
     * ----------------------------------------------------------------------------
     * VER.        DESCRIPTION                                               AUTHOR
     * ----------------------------------------------------------------------------
     ******************************************************************************
     */
     //@formatter:on
     private String[] getColors(String color) {
    	
		  String[] colors = new String[1000]; 
		  ScreenColorMaster screenColorMaster = screenColorMasterMapper.selectByPrimaryKey(color); //查询某个颜色的3个色素
		  colors[0] =  ComFunction.rgbToHex(screenColorMaster.getRedParam(),screenColorMaster.getGreenParam(), screenColorMaster.getBlueParam()); 
		  return colors;
		 
		/*
		 * String[] colors = new String[1000];
		 * 
		 * ScreenColorMasterExample screenColorMasterExample = new
		 * ScreenColorMasterExample(); List<ScreenColorMaster> screenColorMasterList =
		 * screenColorMasterMapper.selectByExample(screenColorMasterExample);
		 * 
		 * ScreenMonitorExample screenMonitorMapperExample = new ScreenMonitorExample();
		 * List<ScreenMonitor> screenMonitorList =
		 * screenMonitorMapper.selectByExample(screenMonitorMapperExample);
		 * 
		 * int index = 0; for (ScreenMonitor screenMonitor : screenMonitorList) { String
		 * color1 = screenMonitor.getColor(); for (ScreenColorMaster screenColorMaster
		 * :screenColorMasterList) { String color2 = screenColorMaster.getColor(); if
		 * (color2.equals(color1)) { colors[index] =
		 * ComFunction.rgbToHex(screenColorMaster.getRedParam(),
		 * screenColorMaster.getGreenParam(), screenColorMaster.getBlueParam() );
		 * index++; } }
		 * 
		 * } return colors;
		 */
		 
    }
    //@formatter:off
    //MACS4#MACSV2 Add End Song 20191211

     /**
     ******************************************************************************
     * @brief     アイコンの色情報を取得する処理
     * @param
     * @return    アイコンの色情報配列
     * @retval
     * @attention
     * @note      色設定テーブルから取得
     * ----------------------------------------------------------------------------
     * VER.        DESCRIPTION                                               AUTHOR
     * ----------------------------------------------------------------------------
     ******************************************************************************
     */
    
    //@formatter:on
    private String[] getColors() {

        String[] colors = new String[1000];

        GuiColorExample guiColorExample = new GuiColorExample();
        guiColorExample.createCriteria().andSectionEqualTo("SYSTEM_MONITOR");
        List<GuiColor> guiColorList = guiColorMapper.selectByExample(guiColorExample);

        for (GuiColor guiColor : guiColorList) {
            try {
                int index = Integer.parseInt(guiColor.getKey());
                colors[index] = ComFunction.rgbToHex(guiColor.getRgbRed(), guiColor.getRgbGreen(),
                        guiColor.getRgbBlue());
            } catch (Exception ignored) {
                // 不正なレコードは無視する。
            }
        }
        return colors;

    }
   //@formatter:off 
    
    /**
     ******************************************************************************
     * @brief     アイコンのDOM文字列を生成する処理
     * @param     iconInfo    アイコン情報
     * @return    アイコンのDOM文字列
     * @retval
     * @attention
     * @note      アイコンSVGのDOMを生成
     * ----------------------------------------------------------------------------
     * VER.        DESCRIPTION                                               AUTHOR
     * ----------------------------------------------------------------------------
     * 2019/12/06 MACS4#0225  MACSV2→MACSV4対応                         天津村研　董
     ******************************************************************************
     */
    //@formatter:on
    private String createIconDomStr(IconInfo iconInfo) throws McsException {

        String iconDomStr = null;
        DOMImplementation svgDomImpl = SVGDOMImplementation.getDOMImplementation();
        String svgNS = SVGDOMImplementation.SVG_NAMESPACE_URI;
        Document svgDoc = svgDomImpl.createDocument(svgNS, "svg", null);

        try {
            Element div = null;

            // iconTypeによってアイコンの種類を分ける
            if (iconInfo.getIconType() == null) {
                return null;
            } else if (iconInfo.getIconType() == 1) {
                div = createIconSvg1(svgDoc, iconInfo);
            } else if (iconInfo.getIconType() == 2) {
                div = createIconSvg2(svgDoc, iconInfo);
            } else if (iconInfo.getIconType() == 4) {
                div = createIconSvg4(svgDoc, iconInfo);
            } else if (iconInfo.getIconType() == 6) {
                div = createIconSvg6(svgDoc, iconInfo);
            } else if (iconInfo.getIconType() == 7) {
                div = createIconSvg7(svgDoc, iconInfo);
            } else if (iconInfo.getIconType() == 8) {
                div = createIconSvg8(svgDoc, iconInfo);
            } else {
                return null;
            }

            // STD APL 2020.02.18 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
            // アイコンにdisplayIdを埋め込む
            Element inputLlcyId = svgDoc.createElement("input");
            inputLlcyId.setAttribute("type", "hidden");
            inputLlcyId.setAttribute("name", "llcId");
            inputLlcyId.setAttribute("value", iconInfo.getLlcId());
            div.appendChild(inputLlcyId);
            // END APL 2020.02.18 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
            
            // アイコンにamhsIdを埋め込む
            // STD APL 2020.02.18 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
            Element inputLlcName = svgDoc.createElement("input");
            inputLlcName.setAttribute("type", "hidden");
//            inputLlcName.setAttribute("name", "displayName");// MACS4#MACSV2 Add
//            inputAmhsId.setAttribute("value", iconInfo.getDisplayName());// MACS4#MACSV3 Add
            inputLlcName.setAttribute("name", "llcName");// MACS4#MACSV2 Add
            inputLlcName.setAttribute("value", iconInfo.getLlcName());// MACS4#MACSV3 Add
            div.appendChild(inputLlcName);
            // END APL 2020.02.18 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 

            // アイコンにamhsTypeを埋め込む
            // STD APL 2020.02.18 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
            Element inputLlcType = svgDoc.createElement("input");
            inputLlcType.setAttribute("type", "hidden");
//            inputAmhsType.setAttribute("name", "memberGroup");// MACS4#MACSV2 Add
//            inputAmhsType.setAttribute("value", String.valueOf(iconInfo.getMemberGroup()));// MACS4#MACSV2 Add
            inputLlcType.setAttribute("name", "llcType");// MACS4#MACSV3 Add
            inputLlcType.setAttribute("value", String.valueOf(iconInfo.getLlcType()));// MACS4#MACSV3 Add
            div.appendChild(inputLlcType);
            // END APL 2020.02.18 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 

            // 生成したDOMを文字列に変換する
            DOMSource domSource = new DOMSource(div);
            StringWriter writer = new StringWriter();
            StreamResult result = new StreamResult(writer);
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.transform(domSource, result);
            iconDomStr = writer.toString().replaceFirst("<[?]xml.*?[?]>", "");

        } catch (TransformerException e) {
            throw new McsException(
                    messageSource.getMessage("ERR0043", null, "ERR0043", LocaleContextHolder.getLocale()));
        }

        return iconDomStr;
    }

    //@formatter:off
    /**
     ******************************************************************************
     * @brief     アイコン1のDOMを生成する処理
     * @param     svgDoc      ベースとなるドキュメント
     * @param     iconInfo    アイコン情報
     * @return    アイコン1のDOM
     * @retval
     * @attention
     * @note      アイコン1のDOMを生成
     * ----------------------------------------------------------------------------
     * VER.        DESCRIPTION                                               AUTHOR
     * ----------------------------------------------------------------------------
     * 2019/12/06 MACS4#0225  MACSV2→MACSV4対応                         天津村研　董
     ******************************************************************************
     */
    //@formatter:on
    private Element createIconSvg1(Document svgDoc, IconInfo iconInfo) {

        McsHandsOnTableIconColorEntity controllerStateColor = getControllerStateColor(iconInfo);
        //McsHandsOnTableIconColorEntity commStateColor = getCommStateColor(iconInfo);  //20191230 Song Del
        McsHandsOnTableIconColorEntity portStateColor = getPortStateColor(iconInfo);
        McsHandsOnTableIconColorEntity shelfOccupancyColor = getShelfOccupancyColor(iconInfo);
        
        //McsHandsOnTableIconColorEntity issueStateColor = getIssueStateColor(iconInfo); //20191230 Song Del

        Element rootDiv = svgDoc.createElement("div");
//        rootDiv.setAttribute("class", "container");//20191218 dqy del
        rootDiv.setAttribute("class", "container-cdc");//20191218 dqy add

        Element elemI = createIconFrame(svgDoc, iconInfo, controllerStateColor);
        rootDiv.appendChild(elemI);

        Element svg = svgDoc.getDocumentElement();
//        svg.setAttribute("viewBox", "0 0 32 33.02");
        svg.setAttribute("viewBox", "0 0 52 53.02");
        elemI.appendChild(svg);

        Element polygon = createPolygon(svgDoc, iconInfo,
//                "0.5 32.52 0.5 8.21 8.21 0.5 23.79 0.5 31.5 8.21 31.5 32.52 0.5 32.52", controllerStateColor);//20191218 dqy del
        		  "0.5 42.52 0.5 8.21 8.21 0.5 33.81 0.5 41.5 8.21 41.5 42.52 0.5 42.52", controllerStateColor);//20191218 dqy del
        svg.appendChild(polygon);

        Element path = svgDoc.createElement("path");
//        path.setAttribute("d", "M23.59,1,31,8.41V32H1V8.41L8.41,1H23.59M24,0H8L0,8V33H32V8L24,0Z");
        path.setAttribute("d", "M33.59,1,41,8.41V42H1V8.41L8.41,1H33.59M34,0H8L0,8V43H42V8L34,0Z");
        svg.appendChild(path);

//        Element text = createText(svgDoc, "translate(16 8)", iconInfo.getText());//MACS4#MACSV2 Del
        // STD APL 2020.02.18 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
//        Element text = createText(svgDoc, "translate(16 8)", iconInfo.getDisplayName());//MACS4#MACSV2 Add
        Element text = createText(svgDoc, "translate(16 8)", iconInfo.getLlcName());//MACS4#MACSV3 Add
        // END APL 2020.02.18 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
        svg.appendChild(text);

        // STD APL 2020.02.18 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 carrier circle del
/*        //20191230 Song Mod Start
//        Element rect1 = createStatusBoxRect(svgDoc, iconInfo, 1, commStateColor, "1.37", "25.16"); //DQY Del
        //Element rect1 = createStatusBoxRect(svgDoc, iconInfo, 1, commStateColor, "6.37", "30.16"); //Song Del
        //svg.appendChild(rect1);  //Song Del

//        Element rect2 = createStatusBoxRect(svgDoc, iconInfo, 2, portStateColor, "16.2", "25.16"); //DQY Del
        //Element rect2 = createStatusBoxRect(svgDoc, iconInfo, 2, portStateColor, "21.2", "30.16"); //Song Del
        //svg.appendChild(rect2); //Song Del
        
//        Element rect3 = createStatusBoxRect(svgDoc, iconInfo, 3, shelfOccupancyColor, "1.37", "17.01"); //DQY Del
        //Element rect3 = createStatusBoxRect(svgDoc, iconInfo, 3, shelfOccupancyColor, "6.37", "22.01");  //Song Del
        //svg.appendChild(rect3); //Song Del

//        Element rect4 = createStatusBoxRect(svgDoc, iconInfo, 4, issueStateColor, "16.2", "17.01"); //DQY Del
        //Element rect4 = createStatusBoxRect(svgDoc, iconInfo, 4, issueStateColor, "21.2", "22.01"); //Song Del
        //svg.appendChild(rect4); //Song Del
        
        Element rect0 = createStatusBoxRect_0(svgDoc, iconInfo, 0, controllerStateColor, "7.37", "12.01");
        svg.appendChild(rect0);
        
        Element rectOcc = createStatusBoxRect_Occupancy(svgDoc, iconInfo, 2, shelfOccupancyColor, "7.37", "22.01",occupancy); 
        svg.appendChild(rectOcc);
        
        Element rectPort = createStatusBoxRect_Port(svgDoc, iconInfo, 1, portStateColor, "7.37", "32.01");
        svg.appendChild(rectPort);
        
        occupancy = null;
        
        

        String displayId = iconInfo.getDisplayId();

    	List<ScreenMonitor> screenMonitorListForCircle = new ArrayList<ScreenMonitor>();
    	for (ScreenMonitor screenMonitor : screenMonitorList1) {
			if(displayId.equals(screenMonitor.getDisplayId().toString())) {
				screenMonitorListForCircle.add(screenMonitor);
			}
		}
    	
    	String  PortNumber2Color = new String();
    	String  circleNumber1Color = new String();
    	String  circleNumber2Color = new String();
    	String  circleNumber3Color = new String();
    	for (ScreenMonitor screenMonitor : screenMonitorListForCircle) {
    		if("2".equals(screenMonitor.getDisplayNumber().toString())) {
    			PortNumber2Color = screenMonitor.getColor();
    		}
    		else if("-1".equals(screenMonitor.getDisplayNumber().toString())) {
    			circleNumber1Color = screenMonitor.getColor();
    		}
    		else if("-2".equals(screenMonitor.getDisplayNumber().toString())) {
    			circleNumber2Color = screenMonitor.getColor();
    		}
    		else if("-3".equals(screenMonitor.getDisplayNumber().toString())) {
    			circleNumber3Color = screenMonitor.getColor();
    		}
		}
    	screenMonitorListForCircle.clear();
        
    	if(!PortNumber2Color.equals(circleNumber1Color)) {
    		McsHandsOnTableIconColorEntity circleColor = new McsHandsOnTableIconColorEntity();
    		iconColors = getColors(circleNumber1Color);
    		circleColor.color = iconColors[0];
            Element circle1 = createStatusCircle(svgDoc, iconInfo, 21, circleColor, "12", "36");
            svg.appendChild(circle1);
    	}
    	if(!PortNumber2Color.equals(circleNumber2Color)) {
    		McsHandsOnTableIconColorEntity circleColor = new McsHandsOnTableIconColorEntity();
    		iconColors = getColors(circleNumber2Color);
    		circleColor.color = iconColors[0];
    		Element circle2 = createStatusCircle(svgDoc, iconInfo, 22, circleColor, "21.5", "36");
            svg.appendChild(circle2);
    	}
    	if(!PortNumber2Color.equals(circleNumber3Color)) {
    		McsHandsOnTableIconColorEntity circleColor = new McsHandsOnTableIconColorEntity();
    		iconColors = getColors(circleNumber3Color);
    		circleColor.color = iconColors[0];
    		Element circle3 = createStatusCircle(svgDoc, iconInfo, 23, circleColor, "31", "36");
            svg.appendChild(circle3);
    	}
        //20191230 Song Mod End
*/        // END APL 2020.02.18 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000       
        return rootDiv;
    }

    //@formatter:off
    /**
     ******************************************************************************
     * @brief     アイコン2のDOMを生成する処理
     * @param     svgDoc      ベースとなるドキュメント
     * @param     iconInfo    アイコン情報
     * @return    アイコン2のDOM
     * @retval
     * @attention
     * @note      アイコン2のDOMを生成
     * ----------------------------------------------------------------------------
     * VER.        DESCRIPTION                                               AUTHOR
     * ----------------------------------------------------------------------------
     ******************************************************************************
     */
    //@formatter:on
    private Element createIconSvg2(Document svgDoc, IconInfo iconInfo) {

        McsHandsOnTableIconColorEntity controllerStateColor = getControllerStateColor(iconInfo);
        McsHandsOnTableIconColorEntity commStateColor = getCommStateColor(iconInfo);
        McsHandsOnTableIconColorEntity portStateColor = getPortStateColor(iconInfo);
        McsHandsOnTableIconColorEntity shelfOccupancyColor = getShelfOccupancyColor(iconInfo);
        McsHandsOnTableIconColorEntity issueStateColor = getIssueStateColor(iconInfo);

        Element rootDiv = svgDoc.createElement("div");
        rootDiv.setAttribute("class", "container");

        Element elemI = createIconFrame(svgDoc, iconInfo, controllerStateColor);
        rootDiv.appendChild(elemI);

        Element svg = svgDoc.getDocumentElement();
        svg.setAttribute("viewBox", "0 0 32 33.02");
        elemI.appendChild(svg);

        Element polygon = createPolygon(svgDoc, iconInfo,
                "0.5 32.52 0.5 4.5 2.5 4.5 2.5 0.5 29.5 0.5 29.5 4.5 31.5 4.5 31.5 32.52 0.5 32.52",
                controllerStateColor);
        svg.appendChild(polygon);

        Element path = svgDoc.createElement("path");
        path.setAttribute("d", "M29,1V5h2V32H1V5H3V1H29m1-1H2V4H0V33H32V4H30V0Z");
        svg.appendChild(path);

        Element text = createText(svgDoc, "translate(16 7)", iconInfo.getText());
        svg.appendChild(text);

        Element rect1 = createStatusBoxRect(svgDoc, iconInfo, 1, commStateColor, "1.37", "25.16");
        svg.appendChild(rect1);

        Element rect2 = createStatusBoxRect(svgDoc, iconInfo, 2, portStateColor, "16.2", "25.16");
        svg.appendChild(rect2);

        Element rect3 = createStatusBoxRect(svgDoc, iconInfo, 3, shelfOccupancyColor, "1.37", "17.01");
        svg.appendChild(rect3);

        Element rect4 = createStatusBoxRect(svgDoc, iconInfo, 4, issueStateColor, "16.2", "17.01");
        svg.appendChild(rect4);

        return rootDiv;
    }

    //@formatter:off
    /**
     ******************************************************************************
     * @brief     アイコン4のDOMを生成する処理
     * @param     svgDoc      ベースとなるドキュメント
     * @param     iconInfo    アイコン情報
     * @return    アイコン4のDOM
     * @retval
     * @attention
     * @note      アイコン4のDOMを生成
     * ----------------------------------------------------------------------------
     * VER.        DESCRIPTION                                               AUTHOR
     * ----------------------------------------------------------------------------
     ******************************************************************************
     */
    //@formatter:on
    private Element createIconSvg4(Document svgDoc, IconInfo iconInfo) {

        McsHandsOnTableIconColorEntity controllerStateColor = getControllerStateColor(iconInfo);
        McsHandsOnTableIconColorEntity commStateColor = getCommStateColor(iconInfo);
        McsHandsOnTableIconColorEntity portStateColor = getPortStateColor(iconInfo);

        Element rootDiv = svgDoc.createElement("div");
        rootDiv.setAttribute("class", "container");

        Element elemI = createIconFrame(svgDoc, iconInfo, controllerStateColor);
        rootDiv.appendChild(elemI);

        Element svg = svgDoc.getDocumentElement();
        svg.setAttribute("viewBox", "0 0 32 33.02");
        elemI.appendChild(svg);

        Element polygon = createPolygon(svgDoc, iconInfo,
                "0.5 32.52 0.5 8.28 2.09 8.28 2.09 3.87 0.5 3.87 0.5 0.5 31.5 0.5 31.5 3.87 30 3.87 30 8.28 31.5 8.28 31.5 32.52 0.5 32.52",
                controllerStateColor);
        svg.appendChild(polygon);

        Element path = svgDoc.createElement("path");
        path.setAttribute("d",
                "M31,1V3.36H29.5V8.78H31V32H1V8.78H2.59V3.36H1V1H31m1-1H0V4.36H1.59V7.78H0V33H32V7.78H30.5V4.36H32V0Z");
        svg.appendChild(path);

        Element text = createText(svgDoc, "translate(16 11.87)", iconInfo.getText());
        svg.appendChild(text);

        Element rect1 = createStatusBoxRect(svgDoc, iconInfo, 1, commStateColor, "1.37", "25.16");
        svg.appendChild(rect1);

        Element rect2 = createStatusBoxRect(svgDoc, iconInfo, 2, portStateColor, "16.2", "25.16");
        svg.appendChild(rect2);

        return rootDiv;
    }

    //@formatter:off
    /**
     ******************************************************************************
     * @brief     アイコン6のDOMを生成する処理
     * @param     svgDoc      ベースとなるドキュメント
     * @param     iconInfo    アイコン情報
     * @return    アイコン6のDOM
     * @retval
     * @attention
     * @note      アイコン6のDOMを生成
     * ----------------------------------------------------------------------------
     * VER.        DESCRIPTION                                               AUTHOR
     * ----------------------------------------------------------------------------
     ******************************************************************************
     */
    //@formatter:on
    private Element createIconSvg6(Document svgDoc, IconInfo iconInfo) {

        McsHandsOnTableIconColorEntity controllerStateColor = getControllerStateColor(iconInfo);
        McsHandsOnTableIconColorEntity commStateColor = getCommStateColor(iconInfo);
        McsHandsOnTableIconColorEntity portStateColor = getPortStateColor(iconInfo);

        Element rootDiv = svgDoc.createElement("div");
        rootDiv.setAttribute("class", "container container-l");

        Element elemI = createIconFrame(svgDoc, iconInfo, controllerStateColor);
        rootDiv.appendChild(elemI);

        Element svg = svgDoc.getDocumentElement();
        svg.setAttribute("viewBox", "0 0 48 33.19");
        elemI.appendChild(svg);

        Element rectLarge = createLargeRect(svgDoc, iconInfo, "0.5", "0.67", "47", "32.02", controllerStateColor);
        svg.appendChild(rectLarge);

        Element path = svgDoc.createElement("path");
        path.setAttribute("d", "M47,1.17v31H1v-31H47m1-1H0v33H48V.17Z");
        svg.appendChild(path);

        Element text = createText(svgDoc, "translate(24 12.665)", iconInfo.getText());
        svg.appendChild(text);

        Element rect1 = createStatusBoxRect(svgDoc, iconInfo, 1, commStateColor, "9.37", "25.33");
        svg.appendChild(rect1);

        Element rect2 = createStatusBoxRect(svgDoc, iconInfo, 2, portStateColor, "24.2", "25.33");
        svg.appendChild(rect2);

        return rootDiv;
    }

    //@formatter:off
    /**
     ******************************************************************************
     * @brief     アイコン7のDOMを生成する処理
     * @param     svgDoc      ベースとなるドキュメント
     * @param     iconInfo    アイコン情報
     * @return    アイコン7のDOM
     * @retval
     * @attention
     * @note      アイコン7のDOMを生成
     * ----------------------------------------------------------------------------
     * VER.        DESCRIPTION                                               AUTHOR
     * ----------------------------------------------------------------------------
     * MACS4#MACSV2  MACSV2→MACSV4対応                                  天津村研　董
     ******************************************************************************
     */
    //@formatter:on
    private Element createIconSvg7(Document svgDoc, IconInfo iconInfo) {

        McsHandsOnTableIconColorEntity controllerStateColor = getControllerStateColor(iconInfo);
        
        McsHandsOnTableIconColorEntity portStateColor = getPortStateColor(iconInfo);

        Element rootDiv = svgDoc.createElement("div");
        rootDiv.setAttribute("class", "container");

//        iconInfo.setIsDefinedData(true);// MACS4#MACSV2 Add
        Element elemI = createIconFrame(svgDoc, iconInfo, controllerStateColor);
        rootDiv.appendChild(elemI);

        Element svg = svgDoc.getDocumentElement();
//        svg.setAttribute("viewBox", "0 0 32 33.02");// MACS4#MACSV2 Del
        svg.setAttribute("viewBox", "0 0 42 43.02");// MACS4#MACSV2 Add
        elemI.appendChild(svg);

//        Element rectLarge = createLargeRect(svgDoc, iconInfo, "0.5", "0.5", "31", "32.02", controllerStateColor);// MACS4#MACSV2 Del
        Element rectLarge = createLargeRect(svgDoc, iconInfo, "0.5", "0.5", "41", "42.02", controllerStateColor);// MACS4#MACSV2 Add
        svg.appendChild(rectLarge);

        Element path = svgDoc.createElement("path");
        path.setAttribute("d", "M41,1V42H1V1H41m1-1H0V43H42V0Z");
        svg.appendChild(path);

//        Element text = createText(svgDoc, "translate(16 16.51)", iconInfo.getText());// MACS4#MACSV2 Del
//        Element text = createText_svg7(svgDoc, "translate(16 16.51)", iconInfo.getDisplayName());//20200218 DQY Del
        Element text = createText_svg7(svgDoc, "translate(16 16.51)", iconInfo.getLlcName());//20200218 DQY Add
        svg.appendChild(text);
        
        Element rect0 = createStatusBoxRect_0(svgDoc, iconInfo, 0, controllerStateColor, "7.37", "16.01");
        svg.appendChild(rect0);
        
        Element rectPort = createStatusBoxRect_Port(svgDoc, iconInfo, 1, portStateColor, "7.37", "27.01");
        svg.appendChild(rectPort);
        
	     // STD APL 2020.02.18 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 carrier circle
        /*
        String displayId = iconInfo.getDisplayId();
    	List<ScreenMonitor> screenMonitorListForCircle = new ArrayList<ScreenMonitor>();
    	for (ScreenMonitor screenMonitor : screenMonitorList1) {
			if(displayId.equals(screenMonitor.getDisplayId().toString())) {
				screenMonitorListForCircle.add(screenMonitor);
			}
		}

    	String  PortNumber2Color = new String();
    	String  circleNumber1Color = new String();
    	String  circleNumber2Color = new String();
    	String  circleNumber3Color = new String();
    	for (ScreenMonitor screenMonitor : screenMonitorListForCircle) {
    		if("2".equals(screenMonitor.getDisplayNumber().toString())) {
    			PortNumber2Color = screenMonitor.getColor();
    		}
    		else if("-1".equals(screenMonitor.getDisplayNumber().toString())) {
    			circleNumber1Color = screenMonitor.getColor();
    		}
    		else if("-2".equals(screenMonitor.getDisplayNumber().toString())) {
    			circleNumber2Color = screenMonitor.getColor();
    		}
    		else if("-3".equals(screenMonitor.getDisplayNumber().toString())) {
    			circleNumber3Color = screenMonitor.getColor();
    		}
		}
    	
    	screenMonitorListForCircle.clear();
        
    	if(!PortNumber2Color.equals(circleNumber1Color)) {
    		McsHandsOnTableIconColorEntity circleColor = new McsHandsOnTableIconColorEntity();
    		iconColors = getColors(circleNumber1Color);
    		circleColor.color = iconColors[0];
            Element circle1 = createStatusCircle(svgDoc, iconInfo, 21, circleColor, "12", "31");
            svg.appendChild(circle1);
    	}
    	if(!PortNumber2Color.equals(circleNumber2Color)) {
    		McsHandsOnTableIconColorEntity circleColor = new McsHandsOnTableIconColorEntity();
    		iconColors = getColors(circleNumber2Color);
    		circleColor.color = iconColors[0];
    		Element circle2 = createStatusCircle(svgDoc, iconInfo, 22, circleColor, "21.5", "31");
            svg.appendChild(circle2);
    	}
    	if(!PortNumber2Color.equals(circleNumber3Color)) {
    		McsHandsOnTableIconColorEntity circleColor = new McsHandsOnTableIconColorEntity();
    		iconColors = getColors(circleNumber3Color);
    		circleColor.color = iconColors[0];
    		Element circle3 = createStatusCircle(svgDoc, iconInfo, 23, circleColor, "31", "31");
            svg.appendChild(circle3);
    	}*/
        // END APL 2020.02.18 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000
        
        return rootDiv;
    }

    //@formatter:off
    /**
     ******************************************************************************
     * @brief     アイコン8のDOMを生成する処理
     * @param     svgDoc      ベースとなるドキュメント
     * @param     iconInfo    アイコン情報
     * @return    アイコン8のDOM
     * @retval
     * @attention
     * @note      アイコン8のDOMを生成
     * ----------------------------------------------------------------------------
     * VER.        DESCRIPTION                                               AUTHOR
     * ----------------------------------------------------------------------------
     ******************************************************************************
     */
    //@formatter:on
    private Element createIconSvg8(Document svgDoc, IconInfo iconInfo) {

        McsHandsOnTableIconColorEntity controllerStateColor = getControllerStateColor(iconInfo);
        McsHandsOnTableIconColorEntity commStateColor = getCommStateColor(iconInfo);
        McsHandsOnTableIconColorEntity portStateColor = getPortStateColor(iconInfo);

        Element rootDiv = svgDoc.createElement("div");
        rootDiv.setAttribute("class", "container container-l");

        Element elemI = createIconFrame(svgDoc, iconInfo, controllerStateColor);
        rootDiv.appendChild(elemI);

        Element svg = svgDoc.getDocumentElement();
        svg.setAttribute("viewBox", "0 0 48 33");
        elemI.appendChild(svg);

        Element polygon = createPolygon(svgDoc, iconInfo,
                "0.5 32.5 0.5 0.5 3.5 0.5 3.5 1.5 44.5 1.5 44.5 0.5 47.5 0.5 47.5 32.5 0.5 32.5", controllerStateColor);
        svg.appendChild(polygon);

        Element path = svgDoc.createElement("path");
        path.setAttribute("d", "M47,1V32H1V1H3V2H45V1h2m1-1H44V1H4V0H0V33H48V0Z");
        svg.appendChild(path);

        Element text = createText(svgDoc, "translate(24 12.025)", iconInfo.getText());
        svg.appendChild(text);

        Element rect1 = createStatusBoxRect(svgDoc, iconInfo, 1, commStateColor, "9.77", "24.05");
        svg.appendChild(rect1);

        Element rect2 = createStatusBoxRect(svgDoc, iconInfo, 2, portStateColor, "24.6", "24.05");
        svg.appendChild(rect2);

        return rootDiv;
    }

    //@formatter:off
    /**
     ******************************************************************************
     * @brief     アイコン外枠のi要素を生成する処理
     * @param     svgDoc                  ベースとなるドキュメント
     * @param     iconInfo                アイコン情報
     * @param     controllerStateColor    色情報
     * @return    アイコン外枠のi要素
     * @retval
     * @attention
     * @note
     * ----------------------------------------------------------------------------
     * VER.        DESCRIPTION                                               AUTHOR
     * ----------------------------------------------------------------------------
     ******************************************************************************
     */
    //@formatter:on
    private Element createIconFrame(Document svgDoc, IconInfo iconInfo,
            McsHandsOnTableIconColorEntity controllerStateColor) {

        Element elemI = svgDoc.createElement("i");
        String elemIClass = "icon-set status-block";
        if (iconInfo.isSampleIcon()) {
            elemIClass += " sample smp-" + String.format("%02d", iconInfo.getIconState());
        }
        if (iconInfo.getIsDefinedData()) {
            if (controllerStateColor.isFlash) {
                elemIClass += " flash";
            }
            if (controllerStateColor.color != null) {
                elemI.setAttribute("style", "fill:" + controllerStateColor.color);
            }
        } else {
            elemIClass += " undefined";
            elemI.setAttribute("style", "fill:" + iconColors[0]);
        }
        elemI.setAttribute("class", elemIClass);

        return elemI;
    }

    //@formatter:off
    /**
     ******************************************************************************
     * @brief     アイコン全体のpolygon要素を生成する処理
     * @param     svgDoc                  ベースとなるドキュメント
     * @param     iconInfo                アイコン情報
     * @param     points                  points属性の設定値
     * @param     controllerStateColor    色情報
     * @return    アイコン全体のpolygon要素
     * @retval
     * @attention
     * @note
     * ----------------------------------------------------------------------------
     * VER.        DESCRIPTION                                               AUTHOR
     * ----------------------------------------------------------------------------
     ******************************************************************************
     */
    //@formatter:on
    private Element createPolygon(Document svgDoc, IconInfo iconInfo, String points,
            McsHandsOnTableIconColorEntity controllerStateColor) {

        Element polygon = svgDoc.createElement("polygon");
        polygon.setAttribute("points", points);
        if (iconInfo.getIsDefinedData()) {
            if (controllerStateColor.isFlash) {
                polygon.setAttribute("class", "flash");
            }
            if (controllerStateColor.color != null) {
                polygon.setAttribute("style", "fill:" + controllerStateColor.color);
            }
        } else {
            polygon.setAttribute("style", "fill:" + iconColors[0]);
        }

        return polygon;
    }

    //@formatter:off
    /**
     ******************************************************************************
     * @brief     アイコン全体のrect要素を生成する処理
     * @param     svgDoc                  ベースとなるドキュメント
     * @param     iconInfo                アイコン情報
     * @param     x                       x属性の設定値
     * @param     y                       y属性の設定値
     * @param     width                   width属性の設定値
     * @param     height                  height属性の設定値
     * @param     controllerStateColor    色情報
     * @return    アイコン全体のrect要素
     * @retval
     * @attention
     * @note
     * ----------------------------------------------------------------------------
     * VER.        DESCRIPTION                                               AUTHOR
     * ----------------------------------------------------------------------------
     ******************************************************************************
     */
    //@formatter:on
    private Element createLargeRect(Document svgDoc, IconInfo iconInfo, String x, String y, String width, String height,
            McsHandsOnTableIconColorEntity controllerStateColor) {

        Element rectLarge = svgDoc.createElement("rect");
        rectLarge.setAttribute("x", x);
        rectLarge.setAttribute("y", y);
        rectLarge.setAttribute("width", width);
        rectLarge.setAttribute("height", height);
        if (iconInfo.getIsDefinedData()) {
            if (controllerStateColor.isFlash) {
                rectLarge.setAttribute("class", "flash");
            }
            if (controllerStateColor.color != null) {
                rectLarge.setAttribute("style", "fill:" + controllerStateColor.color);
            }
        } else {
            rectLarge.setAttribute("style", "fill:" + iconColors[0]);
        }

        return rectLarge;
    }

    //@formatter:off
    /**
     ******************************************************************************
     * @brief     text要素を生成する処理
     * @param     svgDoc       ベースとなるドキュメント
     * @param     transform    transform属性の設定値
     * @param     text         表示テキスト
     * @return    text要素
     * @retval
     * @attention
     * @note
     * ----------------------------------------------------------------------------
     * VER.        DESCRIPTION                                               AUTHOR
     * ----------------------------------------------------------------------------
     ******************************************************************************
     */
    //@formatter:on
    private Element createText(Document svgDoc, String transform, String text) {

        Element textElm = svgDoc.createElement("text");
        
        //textElm.setAttribute("class", "status-txt");   //20191219 Song Del 
        //20191219 Song Add Start
        if(text.length()<10) {
        	textElm.setAttribute("class", "status-txt");
        }else {
        	textElm.setAttribute("class", "status-txt-small");
        }
        //20191219 Song Add End
        textElm.setAttribute("transform", transform);
        textElm.setAttribute("text-anchor", "middle");
        
        //20191219 Song Del Start
        /*
        if (text != null) {
            // 表示テキストの英字部分はtext要素に格納し、数字部分はtspan要素を生成し、それに格納する
            Pattern p = Pattern.compile("[0-9]+?");
            Matcher m = p.matcher(text);
            if (m.find()) {
                textElm.setTextContent(text.substring(0, m.start()));
                Element tspan = svgDoc.createElement("tspan");
                //tspan.setAttribute("x", "0");
                tspan.setAttribute("x", "6");
                tspan.setAttribute("y", String.valueOf(8));
                tspan.setTextContent(text.substring(m.start()));
                textElm.appendChild(tspan);
            } else {
                textElm.setTextContent(text);
            }
        }
        */
        //20191219 Song Del End
        
        //20191219 Song Add Start
        if (text != null) {
        	
        	// 表示テキストの英字部分はtext要素に格納し、数字部分はtspan要素を生成し、それに格納する
        	/*
            Pattern p = Pattern.compile("[0-9]+?");
            Matcher m = p.matcher(text);
            if (m.find()) {
            	if(text.contains("SRC")) {
            		textElm.setTextContent(text);
            		Element tspan = svgDoc.createElement("tspan");
                    tspan.setAttribute("x", "6");
                    tspan.setAttribute("y", String.valueOf(8));
                    textElm.appendChild(tspan);
            	}else {
                    textElm.setTextContent(text.substring(0, m.start()));
                    Element tspan = svgDoc.createElement("tspan");
                    tspan.setAttribute("x", "6");
                    tspan.setAttribute("y", String.valueOf(8));
                    tspan.setTextContent(text.substring(m.start()));
                    textElm.appendChild(tspan);
            	}
            } else {
                textElm.setTextContent(text);
            }
            */
			
			 
		    Element tspan = svgDoc.createElement("tspan");
		    tspan.setAttribute("x", "6"); 
		    //tspan.setAttribute("y", String.valueOf(8));
		    tspan.setAttribute("y", String.valueOf(2));
		    tspan.setTextContent(text); 
		    textElm.appendChild(tspan);
			 
        }
        //20191219 Song Add End
        return textElm;
    }
    
    //20200104 Song Add Start
    //@formatter:on
    private Element createText_svg7(Document svgDoc, String transform, String text) {

        Element textElm = svgDoc.createElement("text");
        
        if(text.length()<10) {
        	textElm.setAttribute("class", "status-txt");
        }else {
        	textElm.setAttribute("class", "status-txt-small");
        }
        textElm.setAttribute("transform", transform);
        textElm.setAttribute("text-anchor", "middle");

        if (text != null) {
		    Element tspan = svgDoc.createElement("tspan");
		    tspan.setAttribute("x", "5"); 
		    tspan.setAttribute("y", String.valueOf(-5));
		    tspan.setTextContent(text); 
		    textElm.appendChild(tspan);
        }
        return textElm;
    }
    //20200104 Song Add End
    
    //@formatter:off
    /**
     ******************************************************************************
     * @brief     ステータスのrect要素を生成する処理
     * @param     svgDoc        ベースとなるドキュメント
     * @param     iconInfo      アイコン情報
     * @param     stateNum      ステータスのインデックス
     * @param     stateColor    色情報
     * @param     x             x属性の設定値
     * @param     y             y属性の設定値
     * @return    ステータスのrect要素
     * @retval
     * @attention
     * @note
     * ----------------------------------------------------------------------------
     * VER.        DESCRIPTION                                               AUTHOR
     * ----------------------------------------------------------------------------
     ******************************************************************************
     */
    //@formatter:on
    private Element createStatusBoxRect(Document svgDoc, IconInfo iconInfo, int stateNum,
            McsHandsOnTableIconColorEntity stateColor, String x, String y) {

        Element rect = svgDoc.createElement("rect");

        rect.setAttribute("x", x);
        rect.setAttribute("y", y);
//        rect.setAttribute("width", "14");
//        rect.setAttribute("height", "6");
        rect.setAttribute("width", "20");
        rect.setAttribute("height", "10");
        String rectClass = "status-box stat-" + String.format("%02d", stateNum);
        if (iconInfo.getIsDefinedData()) {
            if (stateColor.isFlash) {
                rectClass += " flash";
            }
            if (stateColor.color != null) {
                rect.setAttribute("style", "fill:" + stateColor.color);
            }
        }
        rect.setAttribute("class", rectClass);

        return rect;
    }
    
    //20191231 Song Add Start 
    private Element createStatusBoxRect_0(Document svgDoc, IconInfo iconInfo, int stateNum,
            McsHandsOnTableIconColorEntity controllerStateColor, String x, String y) {
        Element rect = svgDoc.createElement("rect");
        rect.setAttribute("x", x);
        rect.setAttribute("y", y);
        String rectClass = "status-box1 stat-" + String.format("%02d", stateNum);
        if (iconInfo.getIsDefinedData()) {
            if (controllerStateColor.isFlash) {
                rectClass += " flash";
            }
            if (controllerStateColor.color != null) {
                rect.setAttribute("style", "fill:" + controllerStateColor.color);
            }
        }
        rect.setAttribute("class", rectClass);
        return rect; 
    }
    
    private Element createStatusBoxRect_Occupancy(Document svgDoc, IconInfo iconInfo, int stateNum,
            McsHandsOnTableIconColorEntity stateColor, String x, String y ,String occupancy) {
        Element rect = svgDoc.createElement("rect");
        rect.setAttribute("x", x);
        rect.setAttribute("y", y);
        rect.setAttribute("width", "40");
        rect.setAttribute("height", "15");
        String rectClass = "status-box1 stat-" + String.format("%02d", stateNum);
        if (iconInfo.getIsDefinedData()) {
            if (stateColor.isFlash) {
                rectClass += " flash";
            }
            if (stateColor.color != null) {
                rect.setAttribute("style", "fill:" + stateColor.color);
            }
        }
        rect.setAttribute("class", rectClass);
        
        Element g = svgDoc.createElement("g");
        Element t = svgDoc.createElement("text");
        t.setAttribute("class", "status-txt");
        t.setAttribute("text-anchor", "middle");
        Element tspan = svgDoc.createElement("tspan");
        
	    tspan.setAttribute("x", "22"); 
	    tspan.setAttribute("y", String.valueOf(28));
	    if(occupancy != null && occupancy.length() != 0) {
	    	tspan.setTextContent(occupancy); 
	    }
	    t.appendChild(tspan);
        g.appendChild(rect);
        g.appendChild(t);
        return g;
    }
    
    private Element createStatusBoxRect_Port(Document svgDoc, IconInfo iconInfo, int stateNum,
            McsHandsOnTableIconColorEntity stateColor, String x, String y) {
        Element rect = svgDoc.createElement("rect");
        rect.setAttribute("x", x);
        rect.setAttribute("y", y);
        rect.setAttribute("width", "40");
        rect.setAttribute("height", "15");
        String rectClass = "status-box1 stat-" + String.format("%02d", stateNum);
        if (iconInfo.getIsDefinedData()) {
            if (stateColor.isFlash) {
                rectClass += " flash";
            }
            if (stateColor.color != null) {
                rect.setAttribute("style", "fill:" + stateColor.color);
            }
        }
        rect.setAttribute("class", rectClass);
        return rect; 
    }
    
    private Element createStatusCircle(Document svgDoc, IconInfo iconInfo, int stateNum,
            McsHandsOnTableIconColorEntity stateColor, String x, String y) {

    	Element circle = svgDoc.createElement("circle");
        circle.setAttribute("cx", x);
        circle.setAttribute("cy", y);
        circle.setAttribute("r", "3.8");
        //circle.setAttribute("style", "fill:" + "black");
        circle.setAttribute("style", "fill:" + stateColor.color);
        String circleClass = "";
        circleClass += " flash";
//        if (iconInfo.getIsDefinedData()) {
//            if (stateColor.isFlash) {
//            	circleClass += " flash";
//            }
//            if (stateColor.color != null) {
//            	circle.setAttribute("style", "fill:" + stateColor.color);
//            }
//        }
        circle.setAttribute("class", circleClass);
        return circle; 
    }
    //20191231 Song Add End 
    

    //@formatter:off
    /**
     ******************************************************************************
     * @brief     アイコンのコントローラ状態の色を取得する処理
     * @param     iconInfo    アイコン情報
     * @return    色情報
     * @retval
     * @attention
     * @note      16進数形式で返す
     * ----------------------------------------------------------------------------
     * VER.        DESCRIPTION                                               AUTHOR
     * ----------------------------------------------------------------------------
     * MACS4#MACSV2  MACSV2→MACSV4対応                                  天津村研　董
     ******************************************************************************
     */
    //@formatter:on
    /*private McsHandsOnTableIconColorEntity getControllerStateColor(IconInfo iconInfo) {

        McsHandsOnTableIconColorEntity retEntity = new McsHandsOnTableIconColorEntity();

        if (iconInfo.isSampleIcon()) {
            // サンプルアイコン
            return retEntity;
        }

        if (!iconInfo.isDefinedController() || !iconInfo.isDefinedControllerState()) {
            // DB未定義
            iconInfo.setIsDefinedData(false);
            retEntity.color = iconColors[0];
        } else if (iconInfo.getAmhsLState() == 3) {
            if (iconInfo.getControlState() == 1 || iconInfo.getControlState() == 2 || iconInfo.getControlState() == 3) {
                // PM
                retEntity.color = iconColors[1];
            } else if (iconInfo.getControlState() == 4 && iconInfo.getAvailable() == 1
                    && iconInfo.getAlarmState() == 0) {
                // PM
                retEntity.color = iconColors[2];
            } else if (iconInfo.getControlState() == 4 && iconInfo.getAvailable() == 0
                    && iconInfo.getAlarmState() == 1) {
                // Alarm
                retEntity.color = iconColors[3];
                retEntity.isFlash = true;
            } else if (iconInfo.getAvailable() == 1) {
                // PM
                retEntity.color = iconColors[4];
            } else if (iconInfo.getAvailable() == 0) {
                // PM
                retEntity.color = iconColors[5];
            }
        } else {
            if (iconInfo.getCommState() == 0) {
                // Unknown
                retEntity.color = iconColors[6];
            } else if (iconInfo.getCommState() == 1) {
                if (iconInfo.getControlState() == 1 || iconInfo.getControlState() == 2
                        || iconInfo.getControlState() == 3) {
                    // Unknown
                    retEntity.color = iconColors[7];
                } else if (iconInfo.getControlState() == 4) {
                    if (iconInfo.getAvailable() == 1) {
                        // No Alarm
                        retEntity.color = iconColors[8];
                    } else if (iconInfo.getAvailable() == 0) {
                        // Alarm
                        retEntity.color = iconColors[9];
                        retEntity.isFlash = true;
                    }
                    // Step4 2016_08_07：無駄なelse ifをelseに変更
                } else {
                    if (iconInfo.getAvailable() == 1) {
                        if (iconInfo.getSystemState() == 3) {
                            // Auto
                            retEntity.color = iconColors[10];
                        } else {
                            // No Alarm
                            retEntity.color = iconColors[11];
                        }
                    } else if (iconInfo.getAvailable() == 0) {
                        // Alarm
                        retEntity.color = iconColors[12];
                    }
                }
            }
        }
        return retEntity;
    }*/
    
    private McsHandsOnTableIconColorEntity getControllerStateColor(IconInfo iconInfo) {
    	
    	/* //DQY DEL 2020218
    	 //20200107 Song Add Start
    	String smText = iconInfo.getDisplayName();
    	List<ScreenMonitor> screenMonitorList2 = new ArrayList<ScreenMonitor>();
    	for (ScreenMonitor screenMonitor : screenMonitorList1) {
			if(smText.equals(screenMonitor.getText())) {
				screenMonitorList2.add(screenMonitor);
			}
		}
    	//20200107 Song Add End
*/
        McsHandsOnTableIconColorEntity retEntity = new McsHandsOnTableIconColorEntity();
        
        /*//20200110 DQY DEL START FRO DB→CSV
        ScreenMonitorExample configExample = new ScreenMonitorExample();							// MACS4#MACSV2 Add
   	 	String screenMonitorText = iconInfo.getDisplayName();										// MACS4#MACSV2 Add
    	configExample.createCriteria().andTextEqualTo(screenMonitorText);							// MACS4#MACSV2 Add
    	List<ScreenMonitor> screenMonitorList = screenMonitorMapper.selectByExample(configExample); // MACS4#MACSV2 Add
         */  
/*//DQY DEL 2020218
        String screenMonitorColor ;																	// MACS4#MACSV2 Add
    	
        if (iconInfo.isSampleIcon()) {
            // サンプルアイコン
            return retEntity;
        }

        if (!iconInfo.isDefinedController() || !iconInfo.isDefinedControllerState()) {
            // DB未定義
            iconInfo.setIsDefinedData(false);
            retEntity.color = iconColors[0];
        }  else{
        	
//        	for (ScreenMonitor screenMonitorInfo : screenMonitorList) {	// MACS4#MACSV2 Add //20200110 DQY DEL		
        	for (ScreenMonitor screenMonitorInfo : screenMonitorList2) {// MACS4#MACSV2 Add //20200110 DQY ADD FOR DB→CSV	
        		screenMonitorColor = screenMonitorInfo.getColor();		// MACS4#MACSV2 Add
        		iconColors = getColors(screenMonitorColor);
        		retEntity.color = iconColors[0];
        	}
        }*/
        
        return retEntity;
    }
    //@formatter:off
    /**
     ******************************************************************************
     * @brief     アイコンのポート状態の色を取得する処理
     * @param     iconInfo    アイコン情報
     * @return    色情報
     * @retval
     * @attention
     * @note      16進数形式で返す
     * ----------------------------------------------------------------------------
     * VER.        DESCRIPTION                                               AUTHOR
     * ----------------------------------------------------------------------------
     ******************************************************************************
     */
    //@formatter:on
    private McsHandsOnTableIconColorEntity getPortStateColor(IconInfo iconInfo) {

        McsHandsOnTableIconColorEntity retEntity = new McsHandsOnTableIconColorEntity();
        
       /* //DQY DEL 2020218
        //20200110 DQY ADD STRT
        String displayId = iconInfo.getDisplayId();
    	List<ScreenMonitor> screenMonitorIconPortList = new ArrayList<ScreenMonitor>();
    	for (ScreenMonitor screenMonitor : screenMonitorList1) {
			if(displayId.equals(screenMonitor.getDisplayId().toString())) {
				screenMonitorIconPortList.add(screenMonitor);
			}
		}
    	//20200110 DQY ADD END
*/        
        
    	//20200110 DQY DEL STRT
        /*
        //20191230 Song Add End
        ScreenMonitorExample configExample = new ScreenMonitorExample();
        String displayId = iconInfo.getDisplayId();
        configExample.createCriteria().andDisplayIdEqualTo(new Integer(displayId));
    	List<ScreenMonitor> screenMonitorList = screenMonitorMapper.selectByExample(configExample); 
    	*/
    	//20200110 DQY DEL END
    	/*//DQY DEL 2020218
    	String screenMonitorColor ;	
    	
        if (iconInfo.isSampleIcon()) {
            // サンプルアイコン
            return retEntity;
        }

        if (!iconInfo.isDefinedController() || !iconInfo.isDefinedControllerState()) {
            // DB未定義
            iconInfo.setIsDefinedData(false);
            retEntity.color = iconColors[0];
        }  else{
        	for (ScreenMonitor screenMonitorInfo : screenMonitorIconPortList) {	
        		Short displayNumber = screenMonitorInfo.getDisplayNumber();
        		if(displayNumber == 2) {
        			screenMonitorColor = screenMonitorInfo.getColor();										
            		iconColors = getColors(screenMonitorColor);
            		retEntity.color = iconColors[0];
        		}
        	}
        }*/
        return retEntity;
    }

    //@formatter:off
    /**
     ******************************************************************************
     * @brief     アイコンの通信状態の色を取得する処理
     * @param     iconInfo    アイコン情報
     * @return    色情報
     * @retval
     * @attention
     * @note      16進数形式で返す
     * ----------------------------------------------------------------------------
     * VER.        DESCRIPTION                                               AUTHOR
     * ----------------------------------------------------------------------------
     ******************************************************************************
     */
    //@formatter:on
    private McsHandsOnTableIconColorEntity getCommStateColor(IconInfo iconInfo) {

        McsHandsOnTableIconColorEntity retEntity = new McsHandsOnTableIconColorEntity();

        if (iconInfo.isSampleIcon()) {
            // サンプルアイコン
            return retEntity;
        }

        if (!iconInfo.isDefinedController() || !iconInfo.isDefinedCommState()) {
            // DB未定義
            iconInfo.setIsDefinedData(false);
            return retEntity;
        }

        /*if (iconInfo.getAvailable() == 0) {
            // Not Communicating
            retEntity.color = iconColors[200];
            retEntity.isFlash = true;
        } else if (iconInfo.getAvailable() == 1 && (iconInfo.getControlState() == 1 || iconInfo.getControlState() == 2
                || iconInfo.getControlState() == 3)) {
            // Communicating - Offline
            retEntity.color = iconColors[201];
        } else if (iconInfo.getAvailable() == 1 && iconInfo.getControlState() == 4) {
            // Communicating - Local
            retEntity.color = iconColors[202];
        } else if (iconInfo.getAvailable() == 1 && iconInfo.getControlState() == 5) {
            // Communicating - Remote
            retEntity.color = iconColors[203];
        } else {
            // Unknown
            retEntity.color = iconColors[204];
            retEntity.isFlash = true;
        }*/
        return retEntity;
    }

    //@formatter:off
    /**
     ******************************************************************************
     * @brief     棚占有率の色を取得する処理
     * @param     iconInfo    アイコン情報
     * @return    色情報
     * @retval
     * @attention
     * @note      16進数形式で返す
     * ----------------------------------------------------------------------------
     * VER.        DESCRIPTION                                               AUTHOR
     * ----------------------------------------------------------------------------
     ******************************************************************************
     */
    //@formatter:on
    private McsHandsOnTableIconColorEntity getShelfOccupancyColor(IconInfo iconInfo) {

        McsHandsOnTableIconColorEntity retEntity = new McsHandsOnTableIconColorEntity();
        
        /*//DQY DEL 2020218
         //20200110 DQY ADD START
        String displayId = iconInfo.getDisplayId();
    	List<ScreenMonitor> screenMonitorListForOccupancy = new ArrayList<ScreenMonitor>();
    	for (ScreenMonitor screenMonitor : screenMonitorList1) {
			if(displayId.equals(screenMonitor.getDisplayId().toString())) {
				screenMonitorListForOccupancy.add(screenMonitor);
			}
		}*/
    	//20200110 DQY ADD END
    	//20200110 DQY DEL START
    	/*
        //20191230 Song Add Start
        ScreenMonitorExample configExample = new ScreenMonitorExample();
        String displayId = iconInfo.getDisplayId();
        configExample.createCriteria().andDisplayIdEqualTo(new Integer(displayId));
    	List<ScreenMonitor> screenMonitorList = screenMonitorMapper.selectByExample(configExample); 
    	*/
    	//20200110 DQY DEL END
    	
    	/*//DQY DEL 2020218
    	 String screenMonitorColor ;	
    	
        if (iconInfo.isSampleIcon()) {
            // サンプルアイコン
            return retEntity;
        }

        if (!iconInfo.isDefinedController() || !iconInfo.isDefinedControllerState()) {
            // DB未定義
            iconInfo.setIsDefinedData(false);
            retEntity.color = iconColors[0];
        }  else{
        	for (ScreenMonitor screenMonitorInfo : screenMonitorListForOccupancy) {	
        		String text = screenMonitorInfo.getText();
        		if(text != null && text.length() != 0) {
        			occupancy = text;  //把这个Icon的占有率保存到全局变量中
        			if(text.indexOf("%") > 0) {
        				screenMonitorColor = screenMonitorInfo.getColor();										
                		iconColors = getColors(screenMonitorColor);
                		retEntity.color = iconColors[0];
            		}
        		}
        	}
        }*/
        return retEntity;
        //20191230 Song Add End
        
        
        /*  //v4 20191230 Song Del Start
        if (iconInfo.isSampleIcon()) {
            // サンプルアイコン
            return retEntity;
        }

        if (!iconInfo.isDefinedController() || !iconInfo.isDefinedShelfOccupancy()) {
            // DB未定義
            iconInfo.setIsDefinedData(false);
            return retEntity;
        }

        BigDecimal zoneUtility = iconInfo.getZoneUtility();
        BigDecimal occupiedCaution = new BigDecimal(iconInfo.getOccupiedCaution());
        BigDecimal occupiedAlert = new BigDecimal(iconInfo.getOccupiedAlert());

        if (zoneUtility.compareTo(occupiedCaution) <= 0) {
            // 棚占有率 - 低
            retEntity.color = iconColors[300];
        } else if (zoneUtility.compareTo(occupiedAlert) > 0) {
            // 棚占有率 - 高
            retEntity.color = iconColors[301];
            retEntity.isFlash = true;
        } else {
            // 棚占有率 - 中
            retEntity.color = iconColors[302];
        }
        return retEntity;
        //v4 20191230 Song Del End
        */
    }

    //@formatter:off
    /**
     ******************************************************************************
     * @brief     出庫状況の色を取得する処理
     * @param     iconInfo    アイコン情報
     * @return    色情報
     * @retval
     * @attention
     * @note      16進数形式で返す
     * ----------------------------------------------------------------------------
     * VER.        DESCRIPTION                                               AUTHOR
     * ----------------------------------------------------------------------------
     ******************************************************************************
     */
    //@formatter:on
    private McsHandsOnTableIconColorEntity getIssueStateColor(IconInfo iconInfo) {

        // TODO 仕様が決定次第実装
        McsHandsOnTableIconColorEntity retEntity = new McsHandsOnTableIconColorEntity();

        return retEntity;
    }
}
