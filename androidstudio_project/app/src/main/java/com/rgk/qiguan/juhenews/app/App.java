package com.rgk.qiguan.juhenews.app;

import android.app.Application;
import android.content.Context;

/**
 * Description:
 * Copyright  : Copyright (c) 2016
 * Company    : RGK
 * Author     : qi.guan
 * Date       : 2017/11/6 16:42
 */

public class App extends Application {

    private static Context sApplicationContext;

    @Override
    public void onCreate() {
        super.onCreate();
        sApplicationContext = this;
        setupDatabase();
    }

    private void setupDatabase(){
        
    }
}
