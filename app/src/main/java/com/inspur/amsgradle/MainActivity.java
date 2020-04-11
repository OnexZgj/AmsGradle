package com.inspur.amsgradle;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    @SuppressLint("CommitPrefEdits")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        String[] split = this.getClass().getName().split("\\.");
//        String tag = split[split.length - 1];
//        App.getEditor().putLong(tag + "start", System.currentTimeMillis());
//        App.getEditor().commit();
//        Toast.makeText(this, App.getSp().getLong("tag", 0) + "", Toast.LENGTH_SHORT).show();


        TextView tv = findViewById(R.id.tv_second);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });
    }


//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        String[] split = this.getClass().getName().split("\\.");
//        String tag = split[split.length - 1];
//        long allTime = System.currentTimeMillis() - App.getSp().getLong(tag + "start", 0);
//        App.getEditor().putLong(tag, allTime / 1000);
//        App.getEditor().commit();
//        Log.d("TAG", "onDestroy: " + allTime / 1000);
//    }
}
