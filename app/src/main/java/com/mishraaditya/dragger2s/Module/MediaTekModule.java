package com.mishraaditya.dragger2s.Module;

import com.mishraaditya.dragger2s.Model.MediaTek;
import com.mishraaditya.dragger2s.Model.Processor;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class MediaTekModule {
    @Binds
    abstract public Processor getProcessor(MediaTek mediaTek);
}
