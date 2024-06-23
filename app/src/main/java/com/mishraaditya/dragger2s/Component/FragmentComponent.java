package com.mishraaditya.dragger2s.Component;


import com.mishraaditya.dragger2s.Model.MediaTek;
import com.mishraaditya.dragger2s.Model.Processor;
import com.mishraaditya.dragger2s.Module.MediaTekModule;
import com.mishraaditya.dragger2s.Scope.FragmentScope;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@FragmentScope
@Component(modules = MediaTekModule.class)
public interface FragmentComponent {
    Processor getProcessor();

    @Component.Builder
    interface Builder{
        @BindsInstance
        Builder setClockSpeed(@Named("clockSpeed") int clockSpeed);
        @BindsInstance
        Builder setCore( @Named("core") int core);
        FragmentComponent build();
    }
}
