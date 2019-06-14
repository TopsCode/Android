package com.topscode.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class LifeCycleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
        Log.e("ActivityLifeCycle","onCreate() called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("ActivityLifeCycle","onStart() called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("ActivityLifeCycle","onResume() called");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("ActivityLifeCycle","onPause() called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("ActivityLifeCycle","onStop() called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("ActivityLifeCycle","onRestart() called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("ActivityLifeCycle","onDestroy() called");
    }
}
