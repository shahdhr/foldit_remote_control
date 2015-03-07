package it.fold.remotecontrolandroid;

public class Constants {
    public static int CUR_IMG_WIDTH = 1184; // defaults only...
    public static int CUR_IMG_HEIGHT = 768;
    public static int REAL_IMG_WIDTH = 1184;
    public static int REAL_IMG_HEIGHT = 768;

    public static final int  TILE_SIZE          = 16;
    public static final char MAGIC              = 'X';
    public static final char VERSION            =  2;
    public static final int KEY_LENGTH          =  5;
    public static final int PORT                = 1230;

    public static final int CL_FIRST_MSG_SIZE   = 13;
    public static final int  CL_MSG_SIZE        =  6;
    public static final char CLEV_REFRESH       =  1;
    public static final char CLEV_MOUSE_DOWN    =  2;
    public static final char CLEV_MOUSE_UP      =  3;
    public static final char CLEV_MOUSE_MOVE    =  4;
    public static final char CLEV_MODKEY_DOWN   =  5;
    public static final char CLEV_MODKEY_UP     =  6;
    public static final char CLEV_CHAR          =  7;
    public static final char CLEV_SCROLL_UP     =  11;
    public static final char CLEV_SCROLL_DOWN   =  12;
    public static final char CLEV_TRANSLATE     =  13;
    public static final char CLEV_VERSION       =  14;
    public static final char CLEV_TERMINATE     =  15;

    public static final int  SE_MSG_HDR         =  4;
    public static final char SEEV_FLUSH         =  1;
    public static final char SEEV_TILE          =  2;
    public static final char SEEV_SOLID_TILE    =  3;
    public static final char SEEV_RLE24_TILE    =  4;
    public static final char SEEV_RLE16_TILE    =  5;
    public static final char SEEV_RLE8_TILE     =  6;
    public static final char SEEV_TERMINATE     =  7;

    public static final int KEYCODE_BACKSPACE  = 31;
}
