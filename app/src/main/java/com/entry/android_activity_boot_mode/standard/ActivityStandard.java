package com.entry.android_activity_boot_mode.standard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.entry.android_activity_boot_mode.R;
import com.entry.android_activity_boot_mode.activities.BaseActivity;

/**
 * Created by huangshuai on 2016/5/23.
 * Email：huangshuai@wooyun.org
 * Standard模式
 */
public class ActivityStandard extends BaseActivity {

    private Button jump;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standard);

        jump = findViewById(R.id.btn_standard);
        jump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityStandard.this, ActivityStandard.class);
                startActivity(intent);
            }
        });
    }

    public static void actionStart(AppCompatActivity activity){
        Intent intent = new Intent(activity, ActivityStandard.class);
        activity.startActivity(intent);
    }
}
