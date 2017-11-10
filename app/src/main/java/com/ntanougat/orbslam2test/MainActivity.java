package com.ntanougat.orbslam2test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener{

    private Button datasetMode,cameraMode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
        requestWindowFeature(Window.FEATURE_NO_TITLE);//隐藏标题
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);//设置全屏
        setContentView(R.layout.activity_main);
        datasetMode=(Button)findViewById(R.id.dataset_mode);
        cameraMode=(Button)findViewById(R.id.camera_mode);
        datasetMode.setOnClickListener(this);
        cameraMode.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.dataset_mode:
                startActivity(new Intent(MainActivity.this,DataSetModeActivity.class));
                break;
            case R.id.camera_mode:
                //Toast.makeText(MainActivity.this, "on the way...", Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this,CameraModeActivity.class));
                break;
        }
    }
}
