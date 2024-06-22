package com.mishraaditya.dragger2s.Module;

import com.mishraaditya.dragger2s.Model.Battery;
import com.mishraaditya.dragger2s.Model.Cobalt;
import com.mishraaditya.dragger2s.Model.Lithium;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class BatteryModule {
    @Provides
    static Cobalt getCobalt(){
        return new Cobalt();
    }

    @Provides
    static Lithium getLithium(){
        Lithium lithium=new Lithium();
        lithium.done();
        return lithium;
    }

    @Singleton
    @Provides
    static Battery getBattery(Lithium lithium,Cobalt cobalt){
        return new Battery(lithium,cobalt);
    }
}
