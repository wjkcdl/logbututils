package com.wjk.scce;

import android.util.Log;

/**
 * Created by Administrator on 2018/1/22 0022.
 * LOG日志输出类
 */
public class LogUtils {
    /**
     * all Log print on-off
     */
    private static boolean all = true;
    /**
     * info Log print on-off
     */
    private final static boolean i = true;
    /**
     * debug Log print on-off
     */
    private final static boolean d = true;
    /**
     * err Log print on-off
     */
    private final static boolean e = true;
    /**
     * verbose Log print on-off
     */
    private final static boolean v = true;
    /**
     * warn Log print on-off
     */
    private final static boolean w = true;
    /**
     * default print tag
     */
    private final static String defaultTag = "wjk";

    /**
     * default print msg
     */
    private final static String defaultMsg = "错误日志如下:";

    private LogUtils() {

    }

    /**
     * info Log print,default print tag
     *
     * @param msg :print message
     */
    public static void I(String msg) {
        if (all && i) {
            //因为String的length是字符数量不是字节数量所以为了防止中文字符过多，
            //  把4*1024的MAX字节打印长度改为2001字符数
            int max_str_length = 2001 - defaultTag.length();
            //大于4000时
            while (msg.length() > max_str_length) {
                Log.i(defaultTag, msg.substring(0, max_str_length));
                msg = msg.substring(max_str_length);
            }
            //剩余部分
            Log.i(defaultTag, msg);


//            Log.i(defaultTag, msg);
//            Logger.t(defaultTag).i(msg+"");
        }
    }

    /**
     * info Log print
     *
     * @param tag :print tag
     * @param msg :print message
     */
    public static void I(String tag, String msg) {
        if (all && i) {

            //因为String的length是字符数量不是字节数量所以为了防止中文字符过多，
            //  把4*1024的MAX字节打印长度改为2001字符数
            int max_str_length = 2001 - tag.length();
            //大于4000时
            while (msg.length() > max_str_length) {
                Log.i(tag, msg.substring(0, max_str_length));
                msg = msg.substring(max_str_length);
            }
            //剩余部分
            Log.i(tag, msg);

//            Log.i(tag, msg);
//            Logger.t(tag).i(msg+"");
        }
    }

    /**
     * debug Log print,default print tag
     *
     * @param msg :print message
     */
    public static void D(String msg) {
        if (all && d) {
            Log.d(defaultTag, msg);
//            Logger.t(defaultTag).d(msg+"");
        }
    }

    /**
     * debug Log print
     * dd
     *
     * @param tag :print tag
     * @param msg :print message
     */
    public static void D(String tag, String msg) {
        if (all && d) {
            Log.d(tag, msg);
//            Logger.t(tag).d(msg+"");
        }
    }

    /**
     * err Log print,default print tag
     */
    public static void E(Throwable tb) {
        if (all && e) {
            Log.e(defaultTag, defaultMsg, tb);
//                Logger.t(defaultTag).e(msg+"");
        }
    }

    /**
     * err Log print,default print tag
     */
    public static void E(Throwable tb, String msg) {
        if (all && e) {
            Log.e(defaultTag, msg + ":", tb);
        }
    }

    /**
     * err Log print,default print tb
     */
    public static void E(String tag, Throwable tb) {
        if (all && e) {
            Log.e(tag, defaultMsg, tb);

        }

    }

    /**
     * err Log print
     *
     * @param tag :print tag
     * @param msg :print message
     */
    public static void E(String tag, Throwable tb, String msg) {
        if (all && e) {
            Log.e(tag, msg + ":", tb);
//            Logger.t(tag).e(msg+"");
        }
    }

//    public static void E(Throwable throwable, String message, Object... args) {
//        if (all && e) {
//            Logger.t(defaultTag).e(throwable, message, args);
//        }
//    }
//
//    public static void E(String tag, Throwable throwable, String message, Object... args) {
//        if (all && e) {
//            Logger.t(tag).e(throwable, message, args);
//        }
//    }

    /**
     * verbose Log print,default print tag
     *
     * @param msg :print message
     */
    public static void V(String msg) {
        if (all && v) {
            Log.v(defaultTag, msg);
//            Logger.t(defaultTag).v(msg+"");
        }
    }

    /**
     * verbose Log print
     *
     * @param tag :print tag
     * @param msg :print message
     */
    public static void V(String tag, String msg) {
        if (all && v) {
            Log.v(tag, msg);
//            Logger.t(tag).v(msg+"");
        }
    }

    /**
     * warn Log print,default print tag
     *
     * @param msg :print message
     */
    public static void W(String msg) {
        if (all && w) {
            Log.w(defaultTag, msg);
//            Logger.t(defaultTag).w(msg+"");
        }
    }

    /**
     * warn Log print
     *
     * @param tag :print tag
     * @param msg :print message
     */
    public static void W(String tag, String msg) {
        if (all && w) {
            Log.w(tag, msg);
//            Logger.t(tag).w(msg+"");
        }
    }


}
