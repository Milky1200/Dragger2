package com.mishraaditya.dragger2s.Module;

import com.mishraaditya.dragger2s.Model.Processor;
import com.mishraaditya.dragger2s.Model.Qualcomm;

import dagger.Module;
import dagger.Provides;

@Module
public class QualcommModule {
    @Provides
    Processor getProcessor(Qualcomm qualcomm){
        return qualcomm;
    }
}
