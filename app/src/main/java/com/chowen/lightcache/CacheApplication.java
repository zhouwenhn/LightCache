package com.chowen.lightcache;

import android.app.Application;
import android.content.Context;

/**
 * Created by uc on 2016/4/30.
 */
public class CacheApplication extends Application{

    private static CacheApplication mApp;
    public static Application getInstance(){
        return mApp;
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        mApp = this;
    }
}
