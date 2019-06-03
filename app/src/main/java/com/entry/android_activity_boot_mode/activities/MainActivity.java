package com.entry.android_activity_boot_mode.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.entry.android_activity_boot_mode.R;
import com.entry.android_activity_boot_mode.singleInstance.ActivitySingleInstance;
import com.entry.android_activity_boot_mode.singletask.ActivitySingleTask;
import com.entry.android_activity_boot_mode.singletop.ActivitySingleTop;
import com.entry.android_activity_boot_mode.standard.ActivityStandard;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mTvStandard, mSingleTop, mSingleTask, mSingleInstance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iniViews();
    }

    private void iniViews(){
        mTvStandard = findViewById(R.id.tv_standard);
        mSingleTop = findViewById(R.id.tv_single_top);
        mSingleTask = findViewById(R.id.tv_single_task);
        mSingleInstance = findViewById(R.id.tv_single_instance);

        mTvStandard.setOnClickListener(this);
        mSingleTop.setOnClickListener(this);
        mSingleTask.setOnClickListener(this);
        mSingleInstance.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_standard:
                ActivityStandard.actionStart(MainActivity.this);
                break;

            case R.id.tv_single_top:
                ActivitySingleTop.actionStart(MainActivity.this);
                break;

            case R.id.tv_single_task:
                ActivitySingleTask.actionStart(MainActivity.this);
                break;

            case R.id.tv_single_instance:
                Intent intent = new Intent();
                intent.setAction("com.castiel.demo.singleinstance");
                startActivity(intent);
                break;
        }
    }
}
