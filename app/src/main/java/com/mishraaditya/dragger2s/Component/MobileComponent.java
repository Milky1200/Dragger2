package com.mishraaditya.dragger2s.Component;

import com.mishraaditya.dragger2s.MainActivity;
import com.mishraaditya.dragger2s.Model.Mobile;
import com.mishraaditya.dragger2s.Module.BatteryModule;
import com.mishraaditya.dragger2s.Module.MediaTekModule;
import com.mishraaditya.dragger2s.Module.QualcommModule;

import dagger.Component;
import dagger.Module;

@Component(modules = {BatteryModule.class, MediaTekModule.class})
public interface MobileComponent {

    Mobile getMobile();
    void Inject(MainActivity activity);
}
