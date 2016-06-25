package com.juanagu.myappportfolio.utils;

import android.content.Context;

/**
 * Created by jagu on 25/6/16.
 */

public abstract class AndroidUtils {

    /**
     * return string
     *
     * @param context
     * @param id
     * @return
     */
    public static String getString(Context context, int id) {
        return context.getString(id);
    }
}
