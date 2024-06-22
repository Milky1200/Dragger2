package com.mishraaditya.dragger2s.Model;

import android.util.Log;

import javax.inject.Inject;

public class MediaTek  implements Processor{
    @Inject
    public MediaTek() {
        Log.d("MyMob", "MediaTek: Created");
    }

    @Override
    public void Start() {
        Log.d("MyMob", "Start: MediaTek");
    }
}