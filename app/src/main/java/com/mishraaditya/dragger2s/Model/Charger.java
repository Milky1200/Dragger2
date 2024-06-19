package com.mishraaditya.dragger2s.Model;

import android.util.Log;

import javax.inject.Inject;

public class Charger {
    @Inject
    public Charger() {
        Log.d("MyMob","Charger Created");
    }
    void setCharger(Mobile mobile){
        Log.d("MyMob","Mobile Charging Created");
    }
}
