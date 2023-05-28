package com.zfxf.douniu.utils;

import android.util.Log;

/**
 * Created by Song on 2018/11/5.
 */

public class LogUtils {

    private final static int MAX_LENGTH = 4000;

    /**
     * 是否打印 LOG
     */
    public final static boolean FLAG = false;

    public static void e(String tag, String msg) {
        if (FLAG)
            Log.e(tag, msg);
    }

    public static void v(String tag, String msg) {
        if (FLAG)
            Log.v(tag, msg);
    }

    public static void d(String tag, String msg) {
        if (FLAG)
            Log.d(tag, msg);
    }

    public static void i(String tag, String msg) {
        if (FLAG)
            Log.i(tag, msg);
    }

    public static void w(String tag, String msg) {
        if (FLAG)
            Log.w(tag, msg);
    }


    public static void infoLarge(String tag, String content) {

        int lengthStr = content.length();

        if (lengthStr > MAX_LENGTH) {

            String part = content.substring(0, MAX_LENGTH);
            Log.i(tag, part);

            part = content.substring(MAX_LENGTH, lengthStr);
            if ((lengthStr - MAX_LENGTH) > MAX_LENGTH) {
                infoLarge(tag, part);
            } else {
                Log.i(tag, part);
            }
        } else {
            Log.i(tag, content);
        }
    }
}
