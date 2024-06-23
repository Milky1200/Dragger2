package com.mishraaditya.dragger2s;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.mishraaditya.dragger2s.Component.DaggerMobileComponent;
import com.mishraaditya.dragger2s.Component.MobileComponent;
import com.mishraaditya.dragger2s.Model.Battery;
import com.mishraaditya.dragger2s.Model.Mobile;
import com.mishraaditya.dragger2s.Model.Mobile_Factory;
import com.mishraaditya.dragger2s.Model.Processor;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
   // @Inject
    Mobile mobile;
    Mobile mobile2;
    Mobile mobile3;
    Mobile mobile4;

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
        MobileComponent component1= DaggerMobileComponent.factory().create(22,9,32);
        MobileComponent component2= DaggerMobileComponent.factory().create(22,9,32);
        mobile=component1.getMobile();
        mobile2=component1.getMobile();
        mobile3=component2.getMobile();
        mobile4=component2.getMobile();
        mobile.run();
        mobile2.run();

    }




}