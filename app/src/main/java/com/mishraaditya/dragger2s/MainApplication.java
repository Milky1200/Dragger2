package com.mishraaditya.dragger2s;

import android.app.Application;
import android.util.Log;

import com.mishraaditya.dragger2s.Component.ApplicationComponent;
import com.mishraaditya.dragger2s.Component.DaggerApplicationComponent;
import com.mishraaditya.dragger2s.Model.Camera;

public class MainApplication extends Application {


    Camera camera1;
    Camera camera2;
    ApplicationComponent component;
    @Override
    public void onCreate() {
        super.onCreate();
        component= DaggerApplicationComponent.builder().setMP(64).build();
        camera1=component.getCamera();
        camera2=component.getCamera();

        Log.i("Hashed", "================Application:============ ");
        Log.i("Hashed", "Application: "+camera1);
        Log.i("Hashed", "Application: "+camera2);
    }

    public ApplicationComponent getApplicationComponent() {
        return component;
    }
}
