package com.mishraaditya.dragger2s.Component;

import com.mishraaditya.dragger2s.Model.Camera;
import com.mishraaditya.dragger2s.Module.CameraModule;
import com.mishraaditya.dragger2s.Scope.ApplicationScope;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@ApplicationScope
@Component (modules = CameraModule.class)
public interface ApplicationComponent {

    Camera getCamera();


    @Component.Builder
    interface Builder{

        Builder setMP(@BindsInstance @Named("megapixel") int megapixel);

        ApplicationComponent build();

    }
}
