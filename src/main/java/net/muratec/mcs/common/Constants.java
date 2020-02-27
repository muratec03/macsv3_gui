/*
 * Created on 2006/02/24
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package net.muratec.mcs.common;

/**
 * @author matsumoto
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public final class Constants
{
	//------------------- variable declared -------------------//
	/**
	 * �f�t�H���g�f�[�^�\�[�X�C���f�b�N�X�B
	 */
	public static final int DATA_SOURCE = 1;
	public static final int DATA_SOURCE2 = 2;

	/**
	 * �f�t�H���g���[�UID�B
	 */
	public static final int DEFAULT_USER_ID = 1;

	/**
	 *
	 */
	public static final String SORT_PROPERTY = "sortProperty";
	public static final String SORT_KEY = "SortUtil";
	public static final String SORT_COLLECTION = "sortCollection";
	public static final String SORT_COLUMN = "SortColumn";
	public static final String SORT_ORDER = "SortOrder";
	public static final String PREVIOUS_SORT = "PreviousSortColumn";
	public static final String PAGE_OFFSET = "offset_";
	public static final String GRID_NAME_KEY = "grid_name";
	public static final String GRID_MAP_KEY = "net.muratec.macs.common.grid.GridMap";
	public static final String DEFAULT_SORT = "defaultSortColumn";

	/**
	 * �������s���_�C�A���O��\������ׂ̒l
	 */
	public static final String IS_EXECUTE_FINISHED = "isExecuteFinished";
	public static final String EXECUTE_CANCEL = "executeCancel";
	public static final String EXECUTE_COUNT = "executeCount";

	/**
	 * Search�_�C�A���O�ɕ\������錟�����̏����l
	 */
	public static final String DEFAULT_MAX_COUNT = "100";

	/**
	 * �Z�b�V�����i�[��( �J�����g�y�[�W�O���b�h��1 )
	 */
	public static final String GRID_NAME_FIRST = "gridFirst";

	/**
	 * �Z�b�V�����i�[��( �J�����g�y�[�W�O���b�h��2 )
	 */
	public static final String GRID_NAME_SECOND = "gridSecond";

	/**
	 * �Z�b�V�����i�[��( �J�����g�y�[�W�O���b�h��3 )
	 */
	public static final String GRID_NAME_THIRD = "gridThird";

	public static final String GRID_NAME_FOURTH = "gridFourth";

	/**
	 * �Z�b�V�����i�[��( �J�����g�O���[�v�����o�[�� )
	 */
	public static final String CURRENT_GROUP_MEMBER_NAME = "current_group_member_name";

	/**
	 * �Z�b�V�����i�[��( ���O�C�����[�U )
	 */
	public static final String LOGIN_USER = "LoginUser";

	/** Screen Resolution */
	public static final String SCREEN_WIDTH = "ScreenWidth";
	public static final String SCREEN_HEIGHT = "ScreenHeight";

	/**
	 * �Z�b�V�����i�[��( �c���[����̃A�N�Z�X�ϐ� )
	 */
	public static final String TREE_ACCESS_ID = "AccessId";
	public static final String TREE_ACCESS_TYPE = "AccessType";
	public static final String TREE_ACCESS_VISIBLE = "AccessVisible";

	/**
	 * �Z�b�V�����i�[��( JMS�L���[�̃��v���C�҂��ϐ� )
	 */
	public static final String JMS_BEAN_STORE = "JMSBeanStore";
	public static final String GUI_MESSAGE = "GUIMessage";

	public static final String REFRESH_FLAG_TRANSFER_INFORMATION = "refresh_flag_transfer_information";
	public static final String REFRESH_TIME_TRANSFER_INFORMATION = "refresh_time_transfer_information";
	public static final String REFRESH_FLAG_ALARM_MONITOR = "refresh_flag_alarm_monitor";
	public static final String REFRESH_TIME_ALARM_MONITOR = "refresh_time_alarm_monitor";
	public static final String REFRESH_FLAG_TRANS_MON = "refresh_flag_transfer_monitor";
	public static final String REFRESH_TIME_TRANS_MON = "refresh_time_transfer_monitor";
	public static final String ALARM_CHECK_TIME = "alarm_check_time";
	public static final String GUI_OK_MESSAGE_FLAG = "GUI_OK_MESSAGE_FLAG";
	public static final String JMS_OK_MESSAGE_FLAG = "JMS_OK_MESSAGE_FLAG";

	/** System Monitor�p */
	public static final String COMM_STATE_COMMUNICATING	= "Communicating";
	public static final String LLC_MODE_UP				= "Up";
	public static final String LLC_AVAILABLE				= "Available";
	public static final String LLC_NO_ALARMS				= "NoAlarms";
	public static final String LLC_CONTROL_ONLINE_REMOTE	= "Online/Remote";
	public static final String LLC_SYSTEM_AUTO			= "Auto";

	/** Transfer�p */
	public static final String WAITING_CONDITION	= "Waiting";
	public static final String JOB_HOLDING	= "JobHolding";
	public static final String MACRO_TRANSFER_TIMEOUT	= "MacroTransferTimeOut";
	public static final String ATOMIC_TRANSFER_TIMEOUT = "AtomicTransferTimeOut";
	public static final String HOLD_TIMEOUT			= "HoldTimeOut";
	public static final String JOB_QUEUED_TIMEOUT		= "JobQueuedTimeOut";
	public static final String BATCH_TIMEOUT		    = "BatchTimeOut";

	/** Carrier�p */
	public static final String CARRIER_STATE_STORED	= "Installed/Stored";
	public static final String CARRIER_STATE_BLOCK	= "CarrierBlockSet";

	/** History�p*/
	public static final String RCV = "Rcv";
	public static final String Snd = "Snd";

	/** ModeSet�p */
	public static final String STATE_UP	= "Up";
	public static final String STATE_DOWN	= "Down";
	public static final String STATE_PM_DOWN	= "PM Down";
	public static final String STATE_OUT_ONLY	= "OUT_ONLY";

	/** Information for Port,OHB **/
	public static final String AVAILABLE = "Available";
	public static final String NOT_AVAILABLE = "NotAvailable";

	//public static final String ALARMS = "Alarms";
	//public static final String NOT_AVAIL = "NotAvailable";

	/** TitlePanel�p*/
	public static final String MACS_STATE_ONLINE	= "Up/Online";

	/**
	 * JMS�L���[
	 */
	//private static final String JMS_PREFIX = "AMD38"; //AMD
	private static final String JMS_PREFIX = "MACS"; //ADC
//	private static final String JMS_PREFIX = "java:comp/env/MACS"; //ADC
	//private static final String JMS_PREFIX = "MACS38"; //Site
	//private static final String JMS_PREFIX = "MACS38_EMU"; //FAB38Emulator

	public static final String JMS_FACTORY = JMS_PREFIX + ".JMS.SACNF";
	public static final String requestQueueName = JMS_PREFIX + ".Queue.GUI_TO_MACS";
	public static final String replyQueueName = JMS_PREFIX + ".Queue.MACS_TO_GUI";

	/** AutoCommit*/
	//public static final boolean setAutoCommit = true;//�f�o�b�O�p
	public static final boolean setAutoCommit = false;

	/**
	 * �ڑ��f�[�^�\�[�X
	 */
	//public static final String DataSource1 = "java:/comp/env/jdbc/oracleDataSource";//�f�o�b�O�p
	//
	//public static final String DataSource1 = "MACS.XAMultiDataSource";//62
	//public static final String DataSource1 = "MACS38.XAMultiDataSource";
	//public static final String DataSource1 = "AMD38.XAMultiDataSource";//63
	//public static final String DataSource1 = "jdbc/oracleDataSourceAMD";
	//public static final String DataSource1 = "jdbc/oracleDataSourceADC";
	public static final String DataSource1 = JMS_PREFIX + ".XAMultiDataSource";//63

	//public static final String DataSource2 = "java:/comp/env/jdbc/oracleDataSource";//�f�o�b�O�p
	//public static final String DataSource2 = "MACS.XAMultiDataSource";//62
	//public static final String DataSource2 = "MACS38.XAMultiDataSource";
	//public static final String DataSource2 = "AMD38.XAMultiDataSource";//63
	//public static final String DataSource2 = "jdbc/oracleDataSourceAMD";
	//public static final String DataSource2 = "jdbc/oracleDataSourceADC";
	//public static final String UserTransaction = "java:/comp/env/UserTransaction";//�f�o�b�O�p
	
	//public static final String DataSource2 = JMS_PREFIX + ".XAMultiDataSourceGUI";//63
	public static final String DataSource2 = "jdbc/oracleDataSourcemy";//63

	public static final String UserTransaction = "javax.transaction.UserTransaction";//site

	//public static final String UserTransaction = "UserTransaction";

	/*
	public static final String DataSource1 = "jdbc/oracleDataSourceAMD";
	public static final String DataSource2 = "jdbc/oracleDataSourceAMD";
	public static final String UserTransaction = "UserTransaction";
	*/
	//------------------- variable declared -------------------//

	//------------------- constructor -------------------//
	/**
	 * constructor
	 */
	private Constants()
	{
	}
	//------------------- constructor -------------------//
}