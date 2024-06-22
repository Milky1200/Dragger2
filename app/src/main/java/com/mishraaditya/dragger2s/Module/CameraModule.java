package com.mishraaditya.dragger2s.Module;

import android.util.Log;

import com.mishraaditya.dragger2s.Model.Camera;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class CameraModule {



    @Provides
    public Camera getCamera(@Named("megapixel") int megapixel){
        return new Camera(megapixel);
    }
}
