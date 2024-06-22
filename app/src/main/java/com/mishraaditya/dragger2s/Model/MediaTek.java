package com.mishraaditya.dragger2s.Model;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class MediaTek  implements Processor {

    int clockSpeed;
    int core;

    @Inject
    public MediaTek(@Named("clockSpeed") int clockSpeed, @Named("core") int core) {
        this.clockSpeed = clockSpeed;
        this.core = core;
        Log.i("MyMobile", "MediaTek: start with clockspeed : " + clockSpeed + " core : " + core);
    }

    @Override
    public void Start() {
        Log.i("MyMobile", "MediaTek start: ");
    }
}