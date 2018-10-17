package com.teamflybd.pbatchgithub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class ActivityLifeCycle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);

        Log.i("My position","I am on onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("My position","I am on onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("My position","I am on onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("My position","I am on onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("My position","I am on onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("My position","I am on onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("My position","I am on onDestroy");
    }
}
