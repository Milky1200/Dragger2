package com.mishraaditya.dragger2s;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.mishraaditya.dragger2s.Component.ActivityComponent;
import com.mishraaditya.dragger2s.Component.ApplicationComponent;
import com.mishraaditya.dragger2s.Component.DaggerActivityComponent;
import com.mishraaditya.dragger2s.Model.Battery;
import com.mishraaditya.dragger2s.Model.Camera;
import com.mishraaditya.dragger2s.Model.Mobile;

public class MainActivity extends AppCompatActivity {
   // @Inject
    ActivityComponent component;


    Battery battery1,battery2;
    Camera camera1,camera2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        component= DaggerActivityComponent.builder().build();

        battery1=component.getBattery();
        battery2=component.getBattery();

        ApplicationComponent applicationComponent=((MainApplication)getApplication()).getApplicationComponent();
        camera1=applicationComponent.getCamera();
        camera2=applicationComponent.getCamera();

        Log.i("Hashed", "================Activity:============ ");
        Log.i("Hashed", "Activity: "+battery1);
        Log.i("Hashed", "Activity: "+battery2);

        Log.i("Hashed", "Activity: "+camera1);
        Log.i("Hashed", "Activity: "+camera2);
        replace(new MainFragment());

    }


    void replace(Fragment fragment){
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft= fm.beginTransaction();
        ft.replace(R.id.fragmentContainer, fragment);
        ft.commit();
    }

    public ActivityComponent getActivityComponent() {
        return component;
    }

}