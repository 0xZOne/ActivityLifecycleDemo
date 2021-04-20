package com.activitylifecycledemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView tv = findViewById(R.id.click_me_id);
        tv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), TransparentActivity.class);
                startActivity(intent);
            }
        });
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