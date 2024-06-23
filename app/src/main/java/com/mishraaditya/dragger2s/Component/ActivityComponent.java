package com.mishraaditya.dragger2s.Component;

import com.mishraaditya.dragger2s.Model.Battery;
import com.mishraaditya.dragger2s.Module.BatteryModule;
import com.mishraaditya.dragger2s.Scope.ActivityScope;

import dagger.Component;

@ActivityScope
@Component(modules = BatteryModule.class)
public interface ActivityComponent {
    Battery getBattery();
}
