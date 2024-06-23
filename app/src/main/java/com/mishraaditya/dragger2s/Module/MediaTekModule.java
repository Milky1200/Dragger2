package com.mishraaditya.dragger2s.Module;

import com.mishraaditya.dragger2s.Model.MediaTek;
import com.mishraaditya.dragger2s.Model.Processor;
import com.mishraaditya.dragger2s.Scope.FragmentScope;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class MediaTekModule {

    @FragmentScope
    @Binds
    abstract Processor getPrccessor(MediaTek mediaTek);

}
