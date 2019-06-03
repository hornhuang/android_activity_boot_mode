package com.entry.android_activity_boot_mode.singleInstance;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.entry.android_activity_boot_mode.R;
import com.entry.android_activity_boot_mode.activities.BaseActivity;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by huangshuai on 2016/5/24.
 * Email：huangshuai@wooyun.org
 * SingleInstance模式
 */
public class ActivitySingleInstance extends BaseActivity {

    private SimpleDateFormat df;
    private Date date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_instance);

        df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        date = new Date();

        Button button = findViewById(R.id.btn_other);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivitySingleInstance.this,
                        SinglleOtherActivity.class));
            }
        });
    }

    @Override
    protected void onStart() {
        Toast.makeText(this, df.format(date), Toast.LENGTH_SHORT).show();
        super.onStart();
    }
}
