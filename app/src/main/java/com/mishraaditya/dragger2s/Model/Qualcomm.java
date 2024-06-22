package com.mishraaditya.dragger2s.Model;

import android.util.Log;

import javax.inject.Inject;

public class Qualcomm implements Processor{
    @Inject
    public Qualcomm() {
        Log.d("MyMob", "Qualcomm: Created ");
    }

    @Override
    public void Start() {
        Log.d("MyMob", "Start: Qualcomm");
    }
}
