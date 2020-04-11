package com.inspur.amsgradle;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        SharedPreferences sp = this.getSharedPreferences("TIME", MODE_PRIVATE);
        long time = sp.getLong("TIME", 0);


        TextView tvTime = findViewById(R.id.tv_second);

        tvTime.setText(""+time);
    }
}
