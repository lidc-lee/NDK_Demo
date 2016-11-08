package com.opencv_demo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by AA on 2016/11/5.
 */

public class HelloJni{
    static {
        System.loadLibrary("hello-jni");
    }

    public static native String stringFromJNI();

}
