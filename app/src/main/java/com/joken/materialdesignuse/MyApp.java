package com.joken.materialdesignuse;

import android.app.Application;
import android.content.Context;

/**
 * Created by joken787 on 2017/7/5.
 */

public class MyApp extends Application {
    private static Context context;
    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
    }

    public static Context getContext() {
        return context;
    }
}
