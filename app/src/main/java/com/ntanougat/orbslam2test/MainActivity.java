package com.ntanougat.orbslam2test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ntanougat.orbslam2test.NdkHelper.OrbNdkHelper;

public class MainActivity extends AppCompatActivity {

    static {
        System.loadLibrary("ORB_SLAM2_EXCUTOR");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        OrbNdkHelper.glesInit();

        // Example of a call to a native method


    }


}
