/*
 * $Header: /home/CVS/CVS_DB/macs-infi2/gui-source/src/macs/tools/GuiUtilities.java,v 1.4 2019/07/01 05:09:06 kuwahara Exp $
 * $Revision: 1.4 $
 * $Date: 2019/07/01 05:09:06 $
 *
 * ====================================================================
 *
 * GuiUtilities.java
 *
 * Copyright 2000-2003 by Murata Machinary,LTD
 *
 * ====================================================================
 *
 * $Log: GuiUtilities.java,v $
 * Revision 1.4  2019/07/01 05:09:06  kuwahara
 * Add STC support.
 *
 * Revision 1.3  2018/02/28 07:46:19  ishigami
 * sort bug fix
 *
 * Revision 1.2  2018/02/06 01:39:36  ishigami
 * support for infinion tsc_type
 *
 * Revision 1.1.1.1  2017/12/28 06:09:48  kuwahara
 * First Release
 *
 * Revision 1.1.1.1  2009/09/11 02:03:18  okumura
 * MACS 10 anniversary model.
 *
 * Revision 1.2  2009/02/14 06:34:49  okumura
 * From WXIC
 *
 * Revision 1.1.1.1  2008/01/07 02:11:50  umc
 * For Search Route List.
 *
 * Revision 1.2  2007/03/05 00:33:41  okumura
 * Fixed LFCode.
 *
 *
 */

package net.muratec.mcs.common.defines;

import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.Vector;
import java.util.Collections;
import java.util.StringTokenizer;
//import macs.common.Common;
import net.muratec.mcs.common.defines.State;
import net.muratec.mcs.common.defines.Subject;
import net.muratec.mcs.common.defines.GuiEnvironment;


/**
 * �e�탆�[�e�B���e�B���\�b�h��񋟂���N���X
 *
 * @version $Revision: 1.4 $
 * @author M.Takashima(NISP)
 */
public class GuiUtilities
{
	/**
	 * int�^�ϐ���Little-Endian�o�C�g�I�[�_�[�ɏ]���o�C�g�z��ɕϊ�����
	 */
	public static byte[] convertIntToByteArrayByLittleEndian( int value )
	{
		byte[] bArray = new byte[4];
		int index = 0;
		int startOffset = 0;

		for( int i=24; i>=0; i-=8 )
		{
			// �ȉ��̕ϊ����{��
			// �Eint�^�ϐ����E�V�t�g����
			// �E0xff�Ƃ̘_���ւ����A��������int�^�ϐ��ɕϊ�����
			// �Ebyte�^�ɃL���X�g����
			bArray[index] = (byte)((value>>>i)&0xff);
			index++;
		}

		return bArray;
	}

	/**
	 * int�^�ϐ���Big-Endian�o�C�g�I�[�_�[�ɏ]���o�C�g�z��ɕϊ�����
	 */
	public static byte[] convertIntToByteArrayByBigEndian( int value )
	{
		byte[] bArray = new byte[4];
		int index = 0;
		int startOffset = 0;

		for( int i=0; i<=24; i+=8 )
		{
			// �ȉ��̕ϊ����{��
			// �Eint�^�ϐ����E�V�t�g����
			// �E0xff�Ƃ̘_���ւ����A��������int�^�ϐ��ɕϊ�����
			// �Ebyte�^�ɃL���X�g����
			bArray[index] = (byte)((value>>>i)&0xff);
			index++;
		}

		return bArray;
	}

	/**
	 * �o�C�g�z���int�^�ϐ��ɕϊ����܂��B
	 * <p>
	 * <strong>��:</strong>
	 * ���̃��\�b�h�̓o�C�g�z����̃o�C�g�I�[�_�[��Big-Endian�ł��邱�Ƃ�z�肵�Ă��܂��
	 */
	public static int convertByteArrayToInt( byte[] bArray )
	{
		BigInteger bIntValue = new BigInteger( bArray );
		return bIntValue.intValue();
	}

	/**
	 * �w�肳�ꂽ�����񂪐��l��\�������񂩔ۂ��𔻒f���܂��
	 *
	 * @param value ���f�ΏۂƂȂ镶����
	 * @return ���l��\��������Ȃ��ture�A����ȊO��false�B
	 */
	public static boolean isNumber( String value )
	{
		try
		{
			Integer.parseInt( value );
			
			// ���̃`�F�b�N�����邱�Ƃɂ���āA"0"�Ŏn�܂�String�̏ꍇ�ł�
			// true�ƂȂ炸��false�ŕԂ����Ƃ��o����
			// 
			// before: 01 -> true after 01 -> false
			if( "0".equals( value.substring( 0, 1 ) ) )
			{
				return false;
			}
			return true;
		}
		catch( NumberFormatException e ) {
			return false;
		}
	}
	
	public static boolean isNumberofTime( String value )
	{
		try
		{
			Integer.parseInt( value );
			return true;
		}
		catch( NumberFormatException e ) {
			return false;
		}
	}
	
	/**
	 * MACS�̃X�e�[�^�X��'ShutDown'����'Down'���ۂ��𔻒f����
	 *
	 * @return �V���b�g�_�E������true�A����ȊO��false�B
	 */
	/*public static boolean isMacsShutdown()
	{
		Vector data = Common.db.getRecords( "SELECT control_state FROM macs" );
		String controlState = (String)((Object[])data.get(0))[0];
		if( State.MACS_STATE_SHUTDOWN.equals( controlState ) || 
			State.MACS_STATE_DOWN.equals( controlState ) )
		{
			// ShutDown����true��Ԃ�
			return true;
		}
		else
		{
			// ����ȊO��false��Ԃ�
			return false;
		}
	}*/

	/**
	 * 
	 */
	/*public static boolean isProcessDown( String subject )
	{
		String[] params = splitByDelim( subject, "." );

		if( Subject.ALL.equals( params[2] ) )
		{
			// ProcessID��"*"(All)�̏ꍇ��false
			return false;
		}
		
		Vector data = Common.db.getRecords( "SELECT proc_state FROM process WHERE sid = " + params[2] );
		
		if( data == null )
		{
			return true;
		}

		if( State.PROC_STATE_RUNNING.equals( ((Object[])data.get(0))[0].toString() ) )
		{
			return false;
		}
		else
		{
			return true;
		}
	}*/

	/**
	 * �w�肳�ꂽTSCID��CDC���ۂ����f���܂��
	 */
	/*public static boolean isTscTypeCdc( String tscId )
	{
		Vector data = Common.db.getSpecificationColum( 
							"SELECT tsc_type " +
							"FROM   tsc " +
							"WHERE  tsc_id = " + tscId
					  );
		if( data == null )
		{
			return false;
		}

//		if( GuiEnvironment.TSC_TYPE_CDC.equals( data.get(0) ) )
		if( GuiEnvironment.TSC_TYPE_CDC.equals( data.get(0) ) ||
 			GuiEnvironment.TSC_TYPE_OCDC.equals( data.get(0) ) ||
 			GuiEnvironment.TSC_TYPE_STC.equals( data.get(0) ) ||
			GuiEnvironment.TSC_TYPE_XCDC.equals( data.get(0) ) )
		{
			return true;
		}
		else
		{
			return false;
		}
	}*/

	/**
	 * �w�肳�ꂽTSC�����݂��邩�ǂ������f���܂��B
	 */
	/*public static boolean isExistTsc( String tscId )
	{
		int count = Common.db.getRecordCount(
							"SELECT count(*) " +
							"FROM   tsc " +
							"WHERE  tsc_id = " + tscId
					);
		if( count > 0 )
		{
			return true;
		}
		else
		{
			return false;
		}
	}*/

	/**
	 * �w��̕�������A�w��̋�؂蕶���ŕ������Đ������ꂽ������z���Ԃ��܂��
	 * 
	 * @param str �����Ώە�����
	 * @param delim ��؂蕶��
	 * @return ���펞�͕�����̕�����z��A�ُ펞��null��Ԃ��
	 */
	public static String[] splitByDelim( String str, String delim )
	{
		try
		{
			StringTokenizer token = new StringTokenizer( str, delim );
			int length = token.countTokens();
			String[] strArray = new String[length];
			for( int i=0; i<length; i++ )
			{
				strArray[i] = token.nextToken();
			}

			return strArray;
		}
		catch( Exception e )
		{
			return null;
		}
	}

	/**
	 * �w�肳�ꂽ�������A������̃��[�g�����݂��邩�ǂ������f���܂��B
	 *
	 * @param srcTscId ������TSCID
	 * @param srcTscId ������TSCID
	 * @return ���[�g�����݂���ꍇ��true,���݂��Ȃ��ꍇ��false�B
	 */
	/*public static boolean isExistRoute( String srcTscId, String dstTscId )
	{
		int count = Common.db.getRecordCount(
							"SELECT count(*) " +
							"FROM   route_list " +
							"WHERE  src_tsc_id = " + srcTscId + " AND " +
								   "dst_tsc_id = " + dstTscId
					);
		if( count == 0 )
		{
			// ���[�g����
			return false;
		}

		return true;
	}*/

	/**
	 * �w�肳�ꂽ�͈�(from�`to)�Ń\�[�g���s���B
	 *
	 * @param data �\�[�g�ΏƂ̃e�[�u���f�[�^
	 * @param from �\�[�g�J�n
	 * @param to �\�[�g�I��
	 * @param index �\�[�g�ΏۃJ�����̃C���f�b�N�X
	 * @param sortType �\�[�g�̎��(�����E�~��)
	 */
	/*public static void sort( Vector data, int from, int to, int index, int sortType )
	{
		// �����\�[�g���s��
		sort( data, from, to, index );

		if( sortType == Grid.DESC )
		{
			// �\�[�g�^�C�v���~���Ȃ�΋t�ɂ���
			Collections.reverse( data );
		}
	}*/

	/**
	 * �w�肳�ꂽ�͈�(from�`to)�ŏ����̃\�[�g���s���B<br>
	 * �\�[�g�A���S���Y���ɂ̓N�C�b�N�\�[�g���g�p�
	 *
	 * @param data �\�[�g�ΏƂ̃e�[�u���f�[�^
	 * @param from �\�[�g�J�n
	 * @param to �\�[�g�I��
	 * @param index �\�[�g�ΏۃJ�����̃C���f�b�N�X
	 */
	public static void sort( Vector data, int from, int to, int index )
	{
		Object center = ((Object[])data.get((from+to)/2))[index];
		Object tmp = null;
		int i = from;
		int j = to;
		int n = 0;

		do
		{
			for( ; i < to; i++ )
			{
				if( center == null ) 
					break;

				tmp = ((Object[])data.get( i ))[index];

				if( tmp instanceof String ) 
				{
//					n = ((String)tmp).compareTo( (String)center );
					if( center instanceof String ){
						n = ((String)tmp).compareTo( (String)center );
					} else if ( center instanceof BigDecimal ){
						n = ((String)tmp).compareTo( ((BigDecimal) center).toString() );
					} else if ( center instanceof Integer ){
						n = ((String)tmp).compareTo( ((Integer) center).toString());
					}
				}
				else if( tmp instanceof BigDecimal ) 
				{
//					n = ((BigDecimal)tmp).compareTo( (BigDecimal)center );
					if( center instanceof String){
						n = ((BigDecimal)tmp).toString().compareTo((String) center);
					} else if ( center instanceof BigDecimal){
						n = ((BigDecimal)tmp).compareTo( (BigDecimal)center );
					} else if ( center instanceof Integer){
						n = ((BigDecimal) tmp).toString().compareTo( ((Integer) center).toString() );
					}
				}
				else if( tmp instanceof Integer ) 
				{
//					n = ((Integer)tmp).compareTo( (Integer)center );
					if( center instanceof String){
						n = ((Integer) tmp).toString().compareTo((String) center );
					} else if (center instanceof BigDecimal){
						n = ((Integer) tmp).toString().compareTo(((BigDecimal)center).toString());
					} else if ( center instanceof Integer){
						n = ((Integer)tmp).compareTo( (Integer)center );
					}
				}
				else 
				{
					n = 1;
				}

				if( !( 0 > n ) ) 
					break;
			}

			for( ; j > from; j-- )
			{
				if( center != null )
				{
					tmp = ((Object[])data.get( j ))[index];

					if( tmp instanceof String ) 
					{
//						n = ((String)tmp).compareTo( (String)center );
						if ( center instanceof String ){
							n = ((String)tmp).compareTo( (String)center );
						} else if ( center instanceof BigDecimal){
							n = ((String)tmp).compareTo( ((BigDecimal) center).toString() );
						} else if ( center instanceof Integer){
							n = ((String)tmp).compareTo( ((Integer) center).toString() );
						} 
					}
					else if( tmp instanceof BigDecimal ) 
					{
//						n = ((BigDecimal)tmp).compareTo( (BigDecimal)center );
						if( center instanceof String ){
							n = ((BigDecimal)tmp).toString().compareTo( (String) center );
						} else if ( center instanceof BigDecimal){
							n = ((BigDecimal)tmp).compareTo( (BigDecimal)center );
						} else if ( center instanceof Integer ){
							n = ((BigDecimal)tmp).toString().compareTo( ((Integer) center).toString() );
						}
					}
					else if( tmp instanceof Integer ) 
					{
//						n = ((Integer)tmp).compareTo( (Integer)center );
						if( center instanceof String ){
							n = ((Integer)tmp).toString().compareTo((String) center );
						} else if ( center instanceof BigDecimal){
							n = ((Integer)tmp).toString().compareTo(((BigDecimal)center).toString());
						} else if ( center instanceof Integer ){
							n = ((Integer)tmp).compareTo( (Integer)center );
						}
					}
					else 
					{
						n = 1;
					}

					if( !( 0 < n ) ) 
						break;
				}
			}

			if( i < j )
			{
				tmp = data.get( i );
				data.set( i, data.get( j ) );
				data.set( j, tmp );
			}

			if( i <= j )
			{
				i++;
				j--;
			}
		}
		while( i <= j );

		if( from < j ) 
		{
			sort( data, from, j, index );
		}
		if( i < to ) 
		{
			sort( data, i, to, index );
		}
	}

	/**
	 * �w��̕�������ɂ���S�Ă�before��replacement�ɒu����������
	 * ���������V�����������Ԃ��܂��
	 *
	 * @param base �u���ΏۂƂȂ镶����
	 * @param before �u��������������
	 * @param replacement �u����̕�����
	 * @return �u����̕�����
	 */
	public static String replaceAll( String base, String before, String replacement )
	{
		StringBuffer regex = new StringBuffer();
		char[] upperChars = before.toUpperCase().toCharArray();
		char[] lowerChars = before.toLowerCase().toCharArray();
		for( int i=0; i<upperChars.length; i++ )
		{
			regex.append( "[" );
			regex.append( upperChars[i] );
			regex.append( lowerChars[i] );
			regex.append( "]" );
		}

		return base.replaceAll( regex.toString(), replacement );
	}
}
