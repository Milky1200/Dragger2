package com.mishraaditya.dragger2s.Component;

import com.mishraaditya.dragger2s.MainActivity;
import com.mishraaditya.dragger2s.Model.Mobile;
import com.mishraaditya.dragger2s.Module.BatteryModule;
import com.mishraaditya.dragger2s.Module.CameraModule;
import com.mishraaditya.dragger2s.Module.MediaTekModule;
import com.mishraaditya.dragger2s.Module.QualcommModule;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;

@Component(modules = {BatteryModule.class, MediaTekModule.class, CameraModule.class})
public interface MobileComponent {

    Mobile getMobile();
    void Inject(MainActivity activity);
   /* @Component.Builder
    interface Builder{

        @BindsInstance
        Builder setClockSpeed(@Named("clockSpeed") int clockSpeed);

        @BindsInstance
        Builder setCore(@Named("core") int core);

        MobileComponent build();
    }*/

    @Component.Factory
    interface Factory{

        MobileComponent create(@BindsInstance @Named("clockSpeed") int clockSpeed,
                               @BindsInstance @Named("core") int core,
                               @BindsInstance @Named("megapixel") int megapixel
        );

    }


}
