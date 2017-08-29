package com.fanyafeng.accountbook.app;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Author： fanyafeng
 * Data： 17/8/29 上午9:59
 * Email: fanyafeng@live.cn
 */
public class ApplicationConfig extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}
