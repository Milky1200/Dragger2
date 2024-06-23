package com.mishraaditya.dragger2s;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mishraaditya.dragger2s.Component.ActivityComponent;
import com.mishraaditya.dragger2s.Component.ApplicationComponent;
import com.mishraaditya.dragger2s.Component.DaggerFragmentComponent;
import com.mishraaditya.dragger2s.Component.FragmentComponent;
import com.mishraaditya.dragger2s.Model.Battery;
import com.mishraaditya.dragger2s.Model.Camera;
import com.mishraaditya.dragger2s.Model.Processor;


public class MainFragment extends Fragment {


    FragmentComponent component;
    private View view;
    Processor processor1,processor2;
    Battery battery1,battery2;
    Camera camera1,camera2;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view=inflater.inflate(R.layout.fragment_main, container, false);

        component= DaggerFragmentComponent.builder().setClockSpeed(2).setCore(8).build();
        processor1=component.getProcessor();
        processor2=component.getProcessor();

        ActivityComponent activityComponent=((MainActivity)getActivity()).getActivityComponent();
        battery1=activityComponent.getBattery();
        battery2=activityComponent.getBattery();

        ApplicationComponent applicationComponent=((MainApplication)getActivity().getApplicationContext()).getApplicationComponent();

        camera1=applicationComponent.getCamera();
        camera2=applicationComponent.getCamera();

        
        Log.i("Hashed", "===========Fragment:======== ");
        Log.i("Hashed", "Fragment: "+processor1);
        Log.i("Hashed", "Fragment: "+processor2);

        Log.i("Hashed", "Fragment: "+battery1);
        Log.i("Hashed", "Fragment: "+battery2);

        Log.i("Hashed", "Fragment: "+camera1);
        Log.i("Hashed", "Fragment: "+camera2);

        return view;
    }


}