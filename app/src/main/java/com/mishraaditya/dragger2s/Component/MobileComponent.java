package com.mishraaditya.dragger2s.Component;

import com.mishraaditya.dragger2s.MainActivity;
import com.mishraaditya.dragger2s.Model.Mobile;

import dagger.Component;

@Component
public interface MobileComponent {

    Mobile getMobile();
    void Inject(MainActivity activity);
}
