/*
 * Created on 31-Mar-2005
 *
 */
package br.unicamp.ic.sed.mobilemedia.video.spec.dt;

/**
 * Modified in MobileMedia-Cosmos-v7
 *
 * This class contains all constants used by the MobileMedia application.
 * It is the central location to store any static string data.
 */
public class Constants {

	public static final String ALBUMLIST_SCREEN = "AlbumListScreen";
	public static final String IMAGE_SCREEN = "ImageScreen";
	public static final String IMAGELIST_SCREEN = "ImageListScreen";
	
	public static final String NEWALBUM_SCREEN = "NewAlbumScreen";
	public static final String CONFIRMDELETEALBUM_SCREEN = "ConfirmDeleteAlbumScreen";
	public static final String ADDPHOTOTOALBUM_SCREEN = "AddMediaToAlbum";
	
	public static final String NEWLABEL_SCREEN = "NewLabelScreen";

	//#ifdef Album
	public static final String IMAGE_MEDIA = "image";
	public static final String PNG = "png";
	//#endif
	
	//#ifdef includeMusic
	public static final String MUSIC_MEDIA = "audio";
	public static final String X_WAV = "x-wav";
	public static final String MP3 = "mp3";
	public static final String MID = "mid";
	
	//#endif
	
	//#ifdef includeVideo
	public static final String VIDEO_MEDIA = "video";
	public static final String MPEG = "mpeg";
	//#endif
	
	//#ifdef device_screen_176x205
    
    /** Screen Size*/
	public static final int SCREEN_WIDTH  = 176;
	public static final int SCREEN_HEIGHT = 205;
    
	//#elifdef device_screen_128x149
	//#
	//# /** Screen Size*/
	//# public static final int SCREEN_WIDTH  = 128;
	//# public static final int SCREEN_HEIGHT = 149;
	//#
	//#elifdef device_screen_132x176
	//#
	//# /** Screen Size*/
	//# public static final int SCREEN_WIDTH  = 132;
	//# public static final int SCREEN_HEIGHT = 176;
	//#
	//#endif

}
