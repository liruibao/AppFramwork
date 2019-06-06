package com.ssoft.module_main;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Created by liruibao on 2019-05-23.
 * email:silentlrb@gmail.com
 */
public class RealApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        if (BuildConfig.DEBUG) {           // These two lines must be written before init, otherwise these configurations will be invalid in the init process
            ARouter.openLog();     // Print log
            ARouter.openDebug();   // Turn on debugging mode (If you are running in InstantRun mode, you must turn on debug mode! Online version needs to be closed, otherwise there is a security risk)
        }
        ARouter.init(this);
    }
}
