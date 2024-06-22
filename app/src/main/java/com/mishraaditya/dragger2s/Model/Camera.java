package com.mishraaditya.dragger2s.Model;

import android.util.Log;

public class Camera {
    int megapixel;
    public Camera(int megapixel) {
        this.megapixel=megapixel;
        Log.d("MyMob", "Camera: Created with megapixel "+megapixel);
    }
}
