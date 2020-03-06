/*
 * Created on 2006/02/27  2020/03/02
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package net.muratec.mcs.common.style;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author matsumoto
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ColorUtilities
{
	//------------------- variable declared -------------------//
	/**
	 * ���ʃf�t�H���g�t�H���g�^�C�v�B
	 */
	private static final String DEFAULT_FONT_TYPE = "italic";

	/**
	 * ���ʃf�t�H���g�t�H���g�T�C�Y�B
	 */
	private static final String DEFAULT_FONT_SIZE = "12px";

	/**
	 * ���ʃf�t�H���g�t�H���g�J���[�B
	 */
	private static final String DEFAULT_FONT_COLOR = "#000000";

	/**
	 * ���ʃo�b�N�O���E���h�J���[�B
	 */
	private static final String DEFAULT_BACKGROUND = "#FFFFFF";

	/**
	 * �J���[�R�[�h�i�[�}�b�v�B
	 */
	private static Map mColorMap = new ConcurrentHashMap();
	//------------------- variable declared -------------------//

	//------------------- constructor -------------------//
	/**
	 * constructor
	 */
	private ColorUtilities()
	{
	}
	/**
	 * static ���\�b�h
	 */
	static
	{
		init();
	}
	//------------------- constructor -------------------//

	//------------------- private method -------------------//
	/**
	 * �������������s���܂��B
	 */
	private static void init()
	{
		mColorMap.put( "black", "#000000" );
		mColorMap.put( "navy", "#000080" );
		mColorMap.put( "darkblue", "#00008B" );
		mColorMap.put( "mediumblue", "#0000CD" );
		mColorMap.put( "blue", "#0000FF" );
		mColorMap.put( "green", "#008000" );
		mColorMap.put( "teal", "#008080" );
		mColorMap.put( "deepskyblue", "#00BFFF" );
		mColorMap.put( "lime", "#00FF00" );
		mColorMap.put( "aqua", "#000080" );
		mColorMap.put( "indigo", "#4B0082" );
		mColorMap.put( "maroon", "#800000" );
		mColorMap.put( "olive", "#808000" );
		mColorMap.put( "gray", "#808080" );
		mColorMap.put( "skyblue", "#87CEEB" );
		mColorMap.put( "lightskyblue", "#87CEFA" );
		mColorMap.put( "lightgreen", "#90EE90" );
		mColorMap.put( "brown", "#A52A2A" );
		mColorMap.put( "silver", "#C0C0C0" );
		mColorMap.put( "chocolate", "#D2691E" );
		mColorMap.put( "khaki", "#F0E68C" );
		mColorMap.put( "beige", "#F5F5DC" );
		mColorMap.put( "whitesmoke", "#F5F5F5" );
		mColorMap.put( "salmon", "#FA8072" );
		mColorMap.put( "red", "#FF0000" );
		mColorMap.put( "fuchsia", "#FF00FF" );
		mColorMap.put( "tomato", "#FF6347" );
		mColorMap.put( "hotpink", "#FF69B4" );
		mColorMap.put( "orange", "#FFA500" );
		mColorMap.put( "pink", "#FFC0CB" );
		mColorMap.put( "gold", "#FFD700" );
		mColorMap.put( "yellow", "#FFFF00" );
		mColorMap.put( "white", "#FFFFFF" );
// 2006.03.10 ADD YAMANA
		mColorMap.put( "mikan", "#FF7536" );
		mColorMap.put( "purple","#7500FF" );
		mColorMap.put( "lightblue","#75FFFF" );
		mColorMap.put( "lightpurple","#7575FF" );
		mColorMap.put( "lightred","#FF5555" );
		mColorMap.put( "darkpurple","#A349A4" );
	}
	//------------------- private method -------------------//

	//------------------- public method -------------------//
	/**
	 * �J���[�R�[�h���擾���܂��B
	 * @param colorName - �J���[���B
	 * @return - �J���[�R�[�h(16�i��)
	 * black        #000000
	 * navy         #000080
	 * darkblue     #00008B
	 * mediumblue   #0000CD
	 * blue         #0000FF
	 * green        #008000
	 * teal         #008080
	 * deepskyblue  #00BFFF
	 * lime         #00FF00
	 * aqua         #00FFFF
	 * indigo       #4B0082
	 * maroon       #800000
	 * olive        #808000
	 * gray         #808080
	 * skyblue      #87CEEB
	 * lightskyblue #87CEFA
	 * lightgreen   #90EE90
	 * brown        #A52A2A
	 * silver       #C0C0C0
	 * chocolate    #D2691E
	 * khaki        #F0E68C
	 * beige        #F5F5DC
	 * whitesmoke   #F5F5F5
	 * salmon       #FA8072
	 * red          #FF0000
	 * fuchsia      #FF00FF
	 * tomato       #FF6347
	 * hotpink      #FF69B4
	 * orange       #FFA500
	 * pink         #FFC0CB
	 * gold         #FFD700
	 * yellow       #FFFF00
	 * white        #FFFFFF
	 * mikan        #FF7536 2006.03.10 ADD YAMANA
	 * purple       #7500FF 2006.03.10 ADD YAMANA
	 * lightblue    #75FFFF 2006.03.10 ADD YAMANA
	 */
	public static String getColorCode(String colorName)
	{
		synchronized(mColorMap)
		{
			return (String)mColorMap.get( colorName );
		}
	}

	/**
	 * �f�t�H���g�t�H���g�^�C�v���擾���܂��B
	 * @return - �t�H���g�^�C�v italic;
	 */
	public static String getDefaultFontType()
	{
		return DEFAULT_FONT_TYPE;
	}

	/**
	 * �f�t�H���g�t�H���g�T�C�Y���擾���܂��B
	 * @return - �t�H���g�T�C�Y 12px;
	 */
	public static String getDefaultFontSize()
	{
		return DEFAULT_FONT_SIZE;
	}

	/**
	 * �f�t�H���g�t�H���g�J���[���擾���܂��B
	 * @return - �f�t�H���g�t�H���g�J���[ #000000;
	 */
	public static String getDefaultFontColor()
	{
		return DEFAULT_FONT_COLOR;
	}

	/**
	 * �f�t�H���g�o�b�N�O���E���h�J���[���擾���܂��B
	 * @return - �o�b�N�O���E���h�J���[ #FFFFFF;
	 */
	public static String getDefaultBackground()
	{
		return DEFAULT_BACKGROUND;
	}
	//------------------- public method -------------------//
}