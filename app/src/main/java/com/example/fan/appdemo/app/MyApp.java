package com.example.fan.appdemo.app;

import android.support.multidex.MultiDexApplication;

/**
 * Created by Fan on 2016/11/17.
 *
 */

public class MyApp extends MultiDexApplication {

    private final boolean IS_DEBUG = true;  // 是否为上线（上线为false，测试为true）

    private static MyApp instance;  // MyApp全局实例

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }
}
