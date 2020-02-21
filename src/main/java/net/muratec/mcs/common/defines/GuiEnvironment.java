/*
 * $Header: /home/CVS/CVS_DB/macs-infi2/gui-source/src/macs/common/GuiEnvironment.java,v 1.3 2018/02/08 09:24:49 kuwahara Exp $
 * $Revision: 1.3 $
 * $Date: 2018/02/08 09:24:49 $
 *
 * ====================================================================
 *
 * GuiEnvironment.java
 *
 * Copyright 2000-2003 by Murata Machinary,LTD
 *
 * ====================================================================
 *
 * $Log: GuiEnvironment.java,v $
 * Revision 1.3  2018/02/08 09:24:49  kuwahara
 * Support GUI download HTTP.
 *
 * Revision 1.2  2018/02/06 01:39:36  ishigami
 * support for infinion tsc_type
 *
 * Revision 1.1.1.1  2017/12/28 06:09:48  kuwahara
 * First Release
 *
 * Revision 1.2  2010/10/20 03:11:41  okumura
 * Fixed for AutoLogOut trouble.
 *
 * Revision 1.1.1.1  2009/09/11 02:03:18  okumura
 * MACS 10 anniversary model.
 *
 * Revision 1.3  2009/02/14 06:34:02  okumura
 * From WXIC
 *
 *
 */


package net.muratec.mcs.common.defines;

import net.muratec.mcs.common.defines.*;
import net.muratec.mcs.common.defines.GuiUtilities;

/**
 * MACS-GUI���ʑ����N���X
 *
 * @version $Revision: 1.3 $
 * @author M.Takashima(NISP)
 */
public class GuiEnvironment
{
	/** ���t�`�F�b�N�G���[ */
	public static final int ERROR_DATE_CHECK = 0;

	/** ���������[�N�G���[ */
	public static final int ERROR_OUT_OF_MEMORY = 1;

	/** GUI��Idle��Ԃł��邱�Ƃ�\�� */
	public static final int GUI_STATE_IDLE = 0;

	/** GUI���������ł��邱�Ƃ�\�� */
	public static final int GUI_STATE_BUSY = 1;

	/** 
	 * GUI���ʂ�ID�B�X�̉�ʂ�ID�͂��̒l��URL�̃p�����[�^�œn���ꂽ�l�����������̂ƂȂ� 
	 */
	public static final int GUI_COMMON_ID = 50000;


//	/** TSC�̃^�C�v��ICT�ł��邱�Ƃ�\�� */
//	public static final String TSC_TYPE_ICT = "ICT";

//	/** TSC�̃^�C�v��ICS�ł��邱�Ƃ�\�� */
//	public static final String TSC_TYPE_ICS = "ICS";

	/** TSC�̃^�C�v��ICC�ł��邱�Ƃ�\�� */
	public static final String TSC_TYPE_ICC = "ICC";

	/** TSC�̃^�C�v��AGVC�ł��邱�Ƃ�\�� */
	public static final String TSC_TYPE_AGVC = "AGVC";

	/** TSC�̃^�C�v��LIMC�ł��邱�Ƃ�\�� */
	public static final String TSC_TYPE_LIMC = "LIMC";

	/** TSC�̃^�C�v��CDC�ł��邱�Ƃ�\�� */
	public static final String TSC_TYPE_CDC = "CDC";
	public static final String TSC_TYPE_OHTC = "OHTC";
	public static final String TSC_TYPE_OHS = "OHS";
	public static final String TSC_TYPE_STC = "STC";
	public static final String TSC_TYPE_SRC320 = "SRC320";
	public static final String TSC_TYPE_SRC350 = "SRC350";
	
	/** TSC�̃^�C�v��RGCV�ł��邱�Ƃ�\�� */
	public static final String TSC_TYPE_RGVC = "RGVC";

	/** TSC�̃^�C�v��LIFTERC�ł��邱�Ƃ�\�� */
//	public static final String TSC_TYPE_LIFTERC = "LIFTERC";
	public static final String TSC_TYPE_LIFTERC = "LFTC";
	public static final String TSC_TYPE_LFC = "LFC";
	public static final String TSC_TYPE_XLFT = "XLFT";

	/** TSC�̃^�C�v��PORTC�ł��邱�Ƃ�\�� */
	public static final String TSC_TYPE_PORTC = "PORTC";

	/** TSC�̃^�C�v��SORTC�ł��邱�Ƃ�\�� */
	public static final String TSC_TYPE_SORTC = "SORTC";

	/** TSC�̃^�C�v��SORTC�ł��邱�Ƃ�\�� */
	public static final String TSC_TYPE_OHBC = "OHBC";

	public static final String TSC_TYPE_OCDC = "OCDC";
	public static final String TSC_TYPE_XCDC = "XCDC";
	// STD APL 2020.02.21 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 
	public static final String TSC_TYPE_OHBC2 = "OHBC2";
	public static final String TSC_TYPE_DWCC = "DWCC";
	public static final String TSC_TYPE_TWU = "TWU";
	// END APL 2020.02.21 董 天津村研  MCSV4　GUI開発  Ver3.0 Rev.000 

	/** �z�X�g�|�[�g�^�C�v */
	public static final String STC_PORT = "STC_PORT";
	public static final String EQP_PORT = "EQP_PORT";
	public static final String AGV_PORT = "AGV_PORT";
	public static final String OHS_PORT = "OHS_PORT";
	public static final String CON_PORT = "CON_PORT";
	public static final String LFT_PORT = "LFT_PORT";
	public static final String RGV_PORT = "RGV_PORT";
	public static final String PRT_PORT = "PRT_PORT";
	public static final String OTHER = "OTHER";

	/** TSC Model��STKSEM�ł��邱�Ƃ�\�� */
	public static final String TSC_MODEL_STKSEM = "STKSEM";

	/** TSC Model��IBSEM�ł��邱�Ƃ�\�� */
	public static final String TSC_MODEL_IBSEM = "IBSEM";

	/** TSC Model��OHBSEM�ł��邱�Ƃ�\�� */
	public static final String TSC_MODEL_OHBSEM = "OHBSEM";

	/** �z�b�g���b�g */
	private static int hotLot = Integer.MIN_VALUE;

	/** MACS-GUI�ŗL��ID */
	private static int guiId = Integer.MIN_VALUE;

	/** �I�[�g���O�A�E�g����܂ł̃C���^�[�o�� */
	private static int logOutInterval = Integer.MIN_VALUE;

	/** MACS-GUI�ɍŌ�ɃA�N�Z�X�������� */
	private static long lastAccessedTime = Long.MIN_VALUE;

	/** GUI����̓��͕�����啶���ɕϊ����邩�ۂ��̏���ێ� */
	private static boolean isToUpper;

	/** 
	 * ����Ƃ̒ʐM�Ɏg�p����T�u�W�F�N�g�̃v���W�F�N�g���B<br>
	 * (�T�u�W�F�N�g�̃t�H�[�}�b�g(*.*.*.*.*)�̈�ԍ��̃A�X�^���X�N�����ɑ���)
	 */
	private static String projectName;

	/** ���t�`�F�b�N�����̃G���[���b�Z�[�W */
	private static String dateChkErrMsg;

	/** ���������[�N���̃G���[���b�Z�[�W */
	private static String[] outOfMemErrMsg;

	/** �ڑ��G���[(Oracle)���ɕ\������G���[���b�Z�[�W */
	private static String dbConnErrMsg;

	/** �ʐM�G���[(Oracle)���ɕ\������G���[���b�Z�[�W */
	private static String dbCommErrMsg;

	/** �ʐM�G���[(TIB)���ɕ\������G���[���b�Z�[�W */
	private static String tibCommErrMsg;

	/** �����f�[�^�Ȃ����ɕ\�����郁�b�Z�[�W */
	private static String noSearchDataMsg;

	/** �_�E�����[�h�G���[���b�Z�[�W */
	private static String downloadErrMsg;

	/** MACS�V���b�g�_�E�������b�Z�[�W */
	private static String macsStateDownMsg;

	/** PROCESS�_�E�������b�Z�[�W */
	private static String processStateDownMsg;

	/** �ݒ�t�@�C���� */
	private static String cfgFileName;

	/** �ڑ���z�X�g�� */
	private static String hostName;
	
	private static int port;

	/** SystemMonitor�p�̐ݒ�t�@�C��������f�B���N�g���� */
	private static String directoryName;

	/** Tomcat�̎g�p����|�[�g 2005.09.26 */
	private static String tomcatPort;

	/**  */
	private static int dbCount;

	/**  */
	private static String dbDriver;
	
	/**  */
	private static String[] dbURL;

	/**  */
	private static String dbUser;

	/**  */
	private static String dbPassword;

	/** */
	private static String myMacsName;

	/** 
	 * ���݂�GUI�̏�Ԃ�ێ�����B<br>
	 * true�Ȃ珈�����Afalse�Ȃ�ҋ@���ł��邱�Ƃ�\���
	 */
	private static boolean isGuiStateBusy;
	public static final String CDC_FROM = "300";
	public static final String CDC_TO   = "400";
	/** TSC�̃^�C�v��CDCC��AlarmID �͈� */
	public static final int CDC_ALARM_FROM = 400000;
	public static final int CDC_ALARM_TO   = 409999;

	/** TSC�̃^�C�v��OHTC�͈̔� */
	public static final String OHT_FROM = "200";
	public static final String OHT_TO   = "210";
	/** TSC�̃^�C�v��OHTC TSC��AlarmID �͈� */
	public static final int OHT_ALARM_FROM1 = 851000;
	public static final int OHT_ALARM_TO1   = 852999;
	/** TSC�̃^�C�v��OHTC VEHICLE��AlarmID �͈� */
	public static final int OHT_ALARM_FROM2 = 853000;
	public static final int OHT_ALARM_TO2   = 859999;

	/** TSC�̃^�C�v��RGVC�͈̔� */
	public static final String RGV_FROM = "400";
	public static final String RGV_TO   = "500";
	/** TSC�̃^�C�v��RGVC TSC��AlarmID �͈� */
	public static final int RGV_ALARM_FROM1 = 502000;
	public static final int RGV_ALARM_TO1   = 502999;
	/** TSC�̃^�C�v��RGVC VEHICLE��AlarmID �͈� */
	public static final int RGV_ALARM_FROM2 = 501000;
	public static final int RGV_ALARM_TO2   = 501999;
	public static final int RGV_ALARM_FROM3 = 503000;
	public static final int RGV_ALARM_TO3   = 509999;
	/** ALARM_LOG�̌ŗL�G���[�R�[�h */
	//2004.03.05 MOD YAMANA
	public static final int    ALARM_LOG_KEY = 999999;

	public static final String SETALL = "SetAll";

	private static int dayOfWeek = 2;
	/** ALARM_LEVEL�����u�̂ݎg�p */
	//2004.03.05 MOD HIRAYAMA
	public static final int ALARM_LEVEL_MIN = 1;
	public static final int ALARM_LEVEL_MAX = 5;

	/**
	 * ����Ƃ̒ʐM�^�C���A�E�g�̃f�t�H���g���Ԃ�ێ�����B<br>
	 * �^�C���A�E�g�C���^�[�o����ύX��������ʂ͌X�őΉ��\�
	 */
	private static int commTimeOutInterval = Integer.MIN_VALUE;

	/** �T�[�u���b�g�ɃA�N�Z�X����URL��ێ�����B */
	private static String servletAccessUrl;

	/** �啶���ϊ��t���O */
	private static final String UPPER_CASE = "1";

	/** Tomcat�̃f�t�H���g�|�[�g2005.09.26 */
	private static final String DEFAULT_TOMCAT_PORT = "8080";
	private static String gui_jar_dir = "cr2-gui";

	/** �u���E�U���� */
	private static String browserType;

//********************************************************************************
// Public Methods
//********************************************************************************

	public static String getBrowserType() {
		return browserType;
	}

	public static void setBrowserType(String browserType) {
		GuiEnvironment.browserType = browserType;
	}

	/**
	 * �z�b�g���b�g��Ԃ��܂��B
	 */
	public static final int getHotLot()
	{
		return hotLot;
	}

	/**
	 * �z�b�g���b�g��ݒ肵�܂��
	 */
	public static final void setHotLot( int hotLot )
	{
		if( GuiEnvironment.hotLot == Integer.MIN_VALUE )
			GuiEnvironment.hotLot = hotLot;
	}

	/**
	 * MACS-GUI�ŗL��ID��Ԃ��܂��B
	 */
	public static final int getGuiId()
	{
		return guiId;
	}

	/**
	 * MACS-GUI�ŗL��ID��ݒ肵�܂��
	 */
	public static final void setGuiId( int guiId )
	{
		if( GuiEnvironment.guiId == Integer.MIN_VALUE )
			GuiEnvironment.guiId = guiId;
	}

	/**
	 * �I�[�g���O�A�E�g�̃C���^�[�o����Ԃ��܂��B
	 */
	public static final int getLogOutInterval()
	{
		return logOutInterval;
	}

	/**
	 * �I�[�g���O�A�E�g�̃C���^�[�o����ݒ肵�܂��
	 */
	public static final void setLogOutInterval( int logOutInterval )
	{
// For Duncan Request 20101012 ---------------------------------
//System.out.println("GuiEnvironment.logOutInterval : ["+GuiEnvironment.logOutInterval+"]");
//		if( GuiEnvironment.logOutInterval == Integer.MIN_VALUE )
			GuiEnvironment.logOutInterval = logOutInterval;
//System.out.println("Seted GuiEnvironment.logOutInterval : ["+GuiEnvironment.logOutInterval+"]");
// -------------------------------------
//		// if( GuiEnvironment.logOutInterval == Integer.MIN_VALUE )
//			GuiEnvironment.logOutInterval = logOutInterval;
// --------------------------------------------------------------
	}

	/**
	 * ���[�U�����͂����p����啶���ɕϊ����邩�ۂ���Ԃ��܂��
	 */
	public static final boolean isToUpper()
	{
		return isToUpper;
	}

	/**
	 * ���[�U�����͂����p����啶���ɕϊ����邩�ۂ���ݒ肵�܂��
	 */
	public static final void setToUpper( boolean isToUpper )
	{
		GuiEnvironment.isToUpper = isToUpper;
	}

	/**
	 * ���[�U�����͂����p����啶���ɕϊ����邩�ۂ���ݒ肵�܂��
	 */
	public static final void setToUpper( String isToUpper )
	{
		if( UPPER_CASE.equals( isToUpper ) )
		{
			GuiEnvironment.isToUpper = true;
		}
		else
		{
			GuiEnvironment.isToUpper = false;
		}
	}

	/**
	 * GUI�ɍŌ�ɃA�N�Z�X�������Ԃ�Ԃ��܂��B
	 */
	public synchronized static final long getLastAccessedTime()
	{
//System.out.println("getLastAccessedTime : ["+lastAccessedTime+"]");
		return lastAccessedTime;
	}

	/**
	 * GUI�ɍŌ�ɃA�N�Z�X�������Ԃ�ݒ肵�܂��
	 */
	public synchronized static final void setLastAccessedTime()
	{
//System.out.println("setLastAccessedTime : Set Last Accessed Time["+System.currentTimeMillis()+"]");
		GuiEnvironment.lastAccessedTime = System.currentTimeMillis();
	}

	/**
	 * �v���W�F�N�g����Ԃ��܂��B
	 */
	public static final String getProjectName()
	{
		return projectName;
	}

	/**
	 * �v���W�F�N�g����ݒ肵�܂��
	 */
	public static final void setProjectName( String projectName )
	{
		if( GuiEnvironment.projectName == null )
			GuiEnvironment.projectName = projectName;
	}

	/**
	 * GUI�̐ݒ�t�@�C������Ԃ��܂��B
	 */
	public static final String getCfgFileName()
	{
		return cfgFileName;
	}

	/**
	 * GUI�̐ݒ�t�@�C������ݒ肵�܂��
	 */
	public static final void setCfgFileName( String cfgFileName )
	{
		if( GuiEnvironment.cfgFileName == null )
			GuiEnvironment.cfgFileName = cfgFileName;
	}

	/**
	 * �ڑ���z�X�g����Ԃ��܂��B
	 */
	public static final String getHostName()
	{
		return hostName;
	}

	/**
	 * �ڑ���z�X�g����ݒ肵�܂��
	 */
	public static final void setHostName( String hostName )
	{
		if( GuiEnvironment.hostName == null )
			GuiEnvironment.hostName = hostName;
	}
	


	public static int getPort() {
		return port;
	}

	public static void setPort(int port) {
		if( port == -1 ) port=80;
		
		GuiEnvironment.port = port;
	}

	public static final String getHostPath()
	{

		StringBuffer buffer = new StringBuffer();
		buffer.append(getHostName());
		if (port > 0) {
			buffer.append(":");
			buffer.append(getPort());
		}

		return buffer.toString();
	}

	/**
	 * SystemMonitor�p�̐ݒ�t�@�C��������f�B���N�g����Ԃ��܂��B
	 */
	public static final String getCSVFileDirectory()
	{
		return directoryName;
	}

	/**
	 * SystemMonitor�p�̐ݒ�t�@�C��������f�B���N�g����ݒ肵�܂��B
	 */
	public static final void setCSVFileDirectory( String directoryName )
	{
		GuiEnvironment.directoryName = directoryName;
	}

	/**
	 * JDBC�h���C�o����Ԃ��܂��B
	 */
	public static final String getDbDriver()
	{
		return dbDriver;
	}

	/**
	 * JDBC�h���C�o����ݒ肵�܂��B
	 */
	public static final void setDbDriver( String driverName )
	{
		GuiEnvironment.dbDriver = driverName;
	}

	/**
	 * DB��URL��Ԃ��܂��B
	 */
	public static final String[] getDbURL()
	{
		return dbURL;
	}

	/**
	 * DB��URL��ݒ肵�܂��B
	 */
	public static final void setDbURL( String[] dbURL )
	{
		GuiEnvironment.dbURL = dbURL;
	}

	/**
	 * DB��UserID��Ԃ��܂��B
	 */
	public static final String getDbUser()
	{
		return dbUser;
	}

	/**
	 * DB��UserID��ݒ肵�܂��B
	 */
	public static final void setDbUser( String dbUser )
	{
		GuiEnvironment.dbUser = dbUser;
	}

	/**
	 * DB��Password��Ԃ��܂��B
	 */
	public static final String getDbPassword()
	{
		return dbPassword;
	}

	/**
	 * DB��Password��ݒ肵�܂��B
	 */
	public static final void setDbPassword( String dbPassword )
	{
		GuiEnvironment.dbPassword = dbPassword;
	}

	/**
	 * MyMacsName��Ԃ��܂��B
	 */
	public static final String getMyMacsName()
	{
		return myMacsName;
	}

	/**
	 * MyMacsName��ݒ肵�܂��B
	 */
	public static final void setMyMacsName( String myMacsName )
	{
		GuiEnvironment.myMacsName = myMacsName;
	}

	/**
	 * ���t�`�F�b�N�����̃G���[���b�Z�[�W��Ԃ��܂��B
	 */
	public static final String getDateChkErrMsg()
	{
		return dateChkErrMsg;
	}

	/**
	 * ���t�`�F�b�N�����̃G���[���b�Z�[�W��ݒ肵�܂��
	 */
	public static final void setDateChkErrMsg( String dateChkErrMsg )
	{
		if( GuiEnvironment.dateChkErrMsg == null )
			GuiEnvironment.dateChkErrMsg = dateChkErrMsg;
	}

	/**
	 * ���t�`�F�b�N�����̃G���[���b�Z�[�W��Ԃ��܂��B
	 */
	public static final String[] getOutOfMemErrMsg()
	{
		return outOfMemErrMsg;
	}

	/**
	 * ���t�`�F�b�N�����̃G���[���b�Z�[�W��ݒ肵�܂��
	 */
	public static final void setOutOfMemErrMsg( String[] outOfMemErrMsg )
	{
		if( GuiEnvironment.outOfMemErrMsg == null )
			GuiEnvironment.outOfMemErrMsg = outOfMemErrMsg;
	}

	/**
	 * ���t�`�F�b�N�����̃G���[���b�Z�[�W��Ԃ��܂��B
	 */
	public static final boolean isGuiStateBusy()
	{
		return isGuiStateBusy;
	}

	/**
	 * ���t�`�F�b�N�����̃G���[���b�Z�[�W��ݒ肵�܂��
	 */
	public static final void setGuiStateBusy( boolean isGuiStateBusy )
	{
		GuiEnvironment.isGuiStateBusy = isGuiStateBusy;
	}

	/**
	 * �ʐM�^�C���A�E�g�̃f�t�H���g�C���^�[�o����Ԃ��܂��B
	 */
	public static final int getCommTimeOutInterval()
	{
		return commTimeOutInterval;
	}

	/**
	 * �ʐM�^�C���A�E�g�̃f�t�H���g�C���^�[�o����ݒ肵�܂��
	 */
	public static final void setCommTimeOutInterval( int commTimeOutInterval )
	{
		if( GuiEnvironment.commTimeOutInterval == Integer.MIN_VALUE )
			GuiEnvironment.commTimeOutInterval = commTimeOutInterval;
	}

	/**
	 * DB�̐ڑ��G���[���ɕ\�����郁�b�Z�[�W��Ԃ��܂��B
	 */
	public static final String getDbConnErrMsg()
	{
		return dbConnErrMsg;
	}

	/**
	 * DB�̐ڑ��G���[���ɕ\�����郁�b�Z�[�W��ݒ肵�܂��B
	 */
	public static final void setDbConnErrMsg( String dbConnErrMsg )
	{
		GuiEnvironment.dbConnErrMsg = dbConnErrMsg;
	}

	/**
	 * DB�Ƃ̒ʐM�G���[���ɕ\�����郁�b�Z�[�W��Ԃ��܂��
	 */
	public static final String getDbCommErrMsg()
	{
		return dbCommErrMsg;
	}

	/**
	 * DB�Ƃ̒ʐM�G���[���ɕ\�����郁�b�Z�[�W��ݒ肵�܂��
	 */
	public static void setDbCommErrMsg( String dbCommErrMsg )
	{
		GuiEnvironment.dbCommErrMsg = dbCommErrMsg;
	}

	/**
	 * TIB�Ƃ̒ʐM�G���[���ɕ\�����郁�b�Z�[�W��Ԃ��܂��
	 */
	public static final String getTibCommErrMsg()
	{
		return tibCommErrMsg;
	}

	/**
	 * TIB�Ƃ̒ʐM�G���[���ɕ\�����郁�b�Z�[�W��ݒ肵�܂��
	 */
	public static void setTibCommErrMsg( String tibCommErrMsg )
	{
		GuiEnvironment.tibCommErrMsg = tibCommErrMsg;
	}

	/**
	 * �����f�[�^�Ȃ����ɕ\�����郁�b�Z�[�W��Ԃ��܂��
	 */
	public static final String getNoSearchDataMsg()
	{
		return noSearchDataMsg;
	}

	/**
	 * �����f�[�^�Ȃ����ɕ\�����郁�b�Z�[�W��ݒ肵�܂��
	 */
	public static void setNoSearchDataMsg( String noSearchDataMsg )
	{
		GuiEnvironment.noSearchDataMsg = noSearchDataMsg;
	}

	/**
	 * �_�E�����[�h�G���[���b�Z�[�W��Ԃ��܂��
	 */
	public static final String getDownloadErrMsg()
	{
		return downloadErrMsg;
	}

	/**
	 * �_�E�����[�h�G���[���b�Z�[�W��ݒ肵�܂��
	 */
	public static void setDownloadErrMsg( String downloadErrMsg )
	{
		GuiEnvironment.downloadErrMsg = downloadErrMsg;
	}

	/**
	 * MACS�V���b�g�_�E�����ɕ\�����郁�b�Z�[�W��Ԃ��܂��
	 */
	public static final String getMacsStateDownMsg()
	{
		return macsStateDownMsg;
	}

	/**
	 * MACS�V���b�g�_�E�����ɕ\�����郁�b�Z�[�W��ݒ肵�܂��
	 */
	public static void setMacsStateDownMsg( String macsStateDownMsg )
	{
		GuiEnvironment.macsStateDownMsg = macsStateDownMsg;
	}

	/**
	 * PROCESS�_�E�����ɕ\�����郁�b�Z�[�W��Ԃ��܂��
	 */
	public static final String getProcessStateDownMsg( String tibmsg )
	{
		String[] params = GuiUtilities.splitByDelim( tibmsg, "." );
		
		return processStateDownMsg.replaceAll( "%1", ( params[1] + " ( SID : " + params[2] + " )" ) );
	}

	/**
	 * PROCESS�_�E�����ɕ\�����郁�b�Z�[�W��ݒ肵�܂��
	 */
	public static void setProcessStateDownMsg( String processStateDownMsg )
	{
		GuiEnvironment.processStateDownMsg = processStateDownMsg;
	}

	/**
	 * DebugLog�p�T�u�W�F�N�g��Ԃ��܂��
	 */
	public static final String getDebugLogSubject()
	{
//		return getProjectName() + "." + Subject.DEBUGLOG_WRITER_NAME + ".7." + Subject.EVT_DEBUGINFO + ".ON";
		return getProjectName() + ".Gui.*." + Subject.EVT_DEBUGINFO + ".ON";
	}

	/**
	 * Tomcat�̎g�p����|�[�g��ݒ肵�܂�� 2005.09.26
	 */
	public static void setTomcatPort( String tomcatPort )
	{
		if( tomcatPort == null || "".equals( tomcatPort ) )
		{
			tomcatPort = DEFAULT_TOMCAT_PORT;
		}
//System.out.println("tomcatPort [" + tomcatPort + "] ");

		GuiEnvironment.tomcatPort = tomcatPort;
	}

	/**
	 * �_�E�����[�h�T�[�u���b�g�ɃA�N�Z�X����URL��ݒ肵�܂��
	 */
	public static void setServletAccessUrl( String url )
	{
//		servletAccessUrl = "http://" + Common.macs.getCodeBase().getHost() + url;
//		servletAccessUrl = "http://" + Common.macs.getCodeBase().getHost() + ":8081" + url;
//		servletAccessUrl = "http://" + Common.macs.getCodeBase().getHost() + ":" + tomcatPort + url;
		servletAccessUrl = "http://" + GuiEnvironment.getHostName() + ":" + tomcatPort + url;
	}

	/**
	 * �_�E�����[�h�T�[�u���b�g�ɃA�N�Z�X����URL��Ԃ��܂��
	 */
	public static final String getServletAccessUrl()
	{
//System.out.println("GuiEnvironment#getServletAccessUrl : URL["+servletAccessUrl+"]");
		return servletAccessUrl;
	}
	public static final int getDayOfWeek() {
		return dayOfWeek;
	}
		// 2008.07.11 BONN: Added for GUI macs.jar version update notification
	public static void setGuiJarDir( String dir_name )
	{
		if (dir_name != null)
		{
			gui_jar_dir = dir_name;
		}
	}

	// 2008.07.11 BONN: Added for GUI macs.jar version update notification
	public static final String getGuiJarDir()
	{
		return gui_jar_dir;
	}
}
