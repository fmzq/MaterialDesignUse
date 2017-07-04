package com.joken.materialdesignuse.util;

import android.widget.Toast;

import com.joken.materialdesignuse.MyApp;

/**
 * Created by joken787 on 2017/7/5.
 */

public class ToastUtil {

    private static Toast toast;

    public static void showToast(String msg) {
        if (toast == null) {
            toast = Toast.makeText(MyApp.getContext(), msg, Toast.LENGTH_SHORT);
        }else {
            toast.setText(msg);
        }
        toast.show();
    }
}
