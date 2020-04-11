package com.inspur.amsgradle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.SharedPreferences;

public class App  extends Application {

    private static SharedPreferences sp;
    private static SharedPreferences.Editor mEditor;

    @SuppressLint("CommitPrefEdits")
    @Override
    public void onCreate() {
        super.onCreate();
        sp = getSharedPreferences("TIME", MODE_PRIVATE);
        mEditor = sp.edit();
    }

    public static SharedPreferences.Editor getEditor(){
        return mEditor;
    }

    public static  SharedPreferences getSp(){
        return sp;
    }

}
