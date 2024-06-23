package com.mishraaditya.dragger2s;

import android.app.Application;

import com.mishraaditya.dragger2s.Component.DaggerMobileComponent;
import com.mishraaditya.dragger2s.Component.MobileComponent;

public class MainApplication extends Application {
    private MobileComponent component;

    public MobileComponent getComponent() {
        return component;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        component= DaggerMobileComponent.factory().create(22,9,32);

    }
}
