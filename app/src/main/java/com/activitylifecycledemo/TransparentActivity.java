package com.activitylifecycledemo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;

public class TransparentActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transparent);
        android.util.Log.e("xlog", "#onCreate: " + this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        android.util.Log.e("xlog", "#onResume: " + this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        android.util.Log.e("xlog", "#onPause: " + this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        android.util.Log.e("xlog", "#onStop: " + this);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        android.util.Log.e("xlog", "#onRestart: " + this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        android.util.Log.e("xlog", "#onStart: " + this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        android.util.Log.e("xlog", "#onDestroy: " + this);
    }
}