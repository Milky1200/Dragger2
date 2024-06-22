package com.mishraaditya.dragger2s.Model;

import android.util.Log;

import javax.inject.Inject;

public class Battery {
    //@Inject
    //we don't own this class, so cant create constructor.

    private Lithium lithium;
    private Cobalt cobalt;

    public Battery(Lithium lithium, Cobalt cobalt) {
        Log.d("MyMob", "Battery: Created");
        this.lithium = lithium;
        this.cobalt = cobalt;
    }
}
