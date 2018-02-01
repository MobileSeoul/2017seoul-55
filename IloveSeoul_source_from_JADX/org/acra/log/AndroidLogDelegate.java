package org.acra.log;

import android.util.Log;

public final class AndroidLogDelegate implements ACRALog {
    public int mo299v(String tag, String msg) {
        return Log.v(tag, msg);
    }

    public int mo300v(String tag, String msg, Throwable tr) {
        return Log.v(tag, msg, tr);
    }

    public int mo292d(String tag, String msg) {
        return Log.d(tag, msg);
    }

    public int mo293d(String tag, String msg, Throwable tr) {
        return Log.d(tag, msg, tr);
    }

    public int mo297i(String tag, String msg) {
        return Log.i(tag, msg);
    }

    public int mo298i(String tag, String msg, Throwable tr) {
        return Log.i(tag, msg, tr);
    }

    public int mo301w(String tag, String msg) {
        return Log.w(tag, msg);
    }

    public int mo302w(String tag, String msg, Throwable tr) {
        return Log.w(tag, msg, tr);
    }

    public int mo303w(String tag, Throwable tr) {
        return Log.w(tag, tr);
    }

    public int mo294e(String tag, String msg) {
        return Log.e(tag, msg);
    }

    public int mo295e(String tag, String msg, Throwable tr) {
        return Log.e(tag, msg, tr);
    }

    public String getStackTraceString(Throwable tr) {
        return Log.getStackTraceString(tr);
    }
}
