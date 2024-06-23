package com.mishraaditya.dragger2s.Model;

import android.util.Log;

import javax.inject.Inject;

public class Mobile {
    //@Inject
    //Battery battery;//2nd
    private Processor processor;
    private Camera camera;
    private Battery battery;

    @Inject
    public Mobile(Battery battery,Processor processor,Camera camera) {//1st
        this.battery = battery;
        this.processor = processor;
        this.camera=camera;
        Log.d("MyMobs", "Mobile: Created "+processor.toString()+" -- " +battery.toString() + this.toString());
    }

    public void run(){//4th
        processor.Start();
        Log.d("MyMob","run Created");
    }

    //When you have to pass object of same type in same type after creation then you can use method injection
    /*@Inject
    public void createCharger(Charger charger){//3rd
        charger.setCharger(this);
    }
    */
}
