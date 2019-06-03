package com.entry.android_activity_boot_mode.singletask;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.entry.android_activity_boot_mode.R;
import com.entry.android_activity_boot_mode.activities.BaseActivity;

/**
 * Created by huangshuai on 2016/5/23.
 * Email：huangshuai@wooyun.org
 * SingleTask模式
 */
public class ActivitySingleTask extends BaseActivity {
    private Button jump,jump2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_task);

        jump = (Button) findViewById(R.id.btn_task);
        jump2 = (Button) findViewById(R.id.btn_other);
        jump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivitySingleTask.this, ActivitySingleTask.class);
                startActivity(intent);
            }
        });
        jump2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivitySingleTask.this, OtherTaskActivity.class);
                startActivity(intent);
            }
        });

        Log.d("123123", "onCreate");
    }


    @Override
    protected void onStart() {
        Log.d("123123", "onStart");
        super.onStart();
    }

    @Override
    protected void onPause() {
        Log.d("123123", "onPause");
        super.onPause();
    }

    @Override
    protected void onResume() {
        Log.d("123123", "onResume");
        super.onResume();
    }

    @Override
    protected void onStop() {
        Log.d("123123", "onStop");
        super.onStop();
    }

    public static void actionStart(AppCompatActivity activity){
        Intent intent = new Intent(activity, ActivitySingleTask.class);
        activity.startActivity(intent);
    }
}
