package com.teamflybd.pbatchgithub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class AnimationTest extends AppCompatActivity implements View.OnClickListener{
    private Button bZoomIn, bZoomOut, bBlink, bFadeIn, bFadeOut, bCrossfade;

    private Animation aZoomIn, aZoomOut, aBlink, aFadeIn, aFadeOut, aCrossfadeIn, aCrossfadeOut
            ,aBouncing, aMove, aRotation, aSlideDown, aSlideUp;

    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_test);

        bZoomIn = findViewById(R.id.zoom_in);
        bZoomOut = findViewById(R.id.zoom_out);
        bBlink = findViewById(R.id.blink);
        bFadeIn = findViewById(R.id.fade_in);
        bFadeOut = findViewById(R.id.fade_out);
        bCrossfade = findViewById(R.id.cross_fade);

        textView = findViewById(R.id.test);

        //add listener
        bZoomIn.setOnClickListener(this);
        bZoomOut.setOnClickListener(this);
        bBlink.setOnClickListener(this);
        bFadeIn.setOnClickListener(this);
        bFadeOut.setOnClickListener(this);
        //bCrossfade.setOnClickListener(this);

        aZoomIn = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_in);
        aZoomOut = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
        aBlink = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
        aFadeIn = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
        aFadeOut = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_out);
//        aCrossfadeIn = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
//        aBouncing = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bouncing);
//        aSlideUp = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_up);
//        aSlideDown = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_down);
//        aMove = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
//        aRotation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotation);

    }


















    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.zoom_in :
                textView.setVisibility(View.VISIBLE);
                textView.startAnimation(aZoomIn);
                break;

            case R.id.zoom_out :
                textView.setVisibility(View.VISIBLE);
                textView.startAnimation(aZoomOut);
                break;

            case R.id.blink :
                textView.setVisibility(View.VISIBLE);
                textView.startAnimation(aBlink);
                break;

            case R.id.fade_in :
                textView.setVisibility(View.VISIBLE);
                textView.startAnimation(aFadeIn);
                break;

            case R.id.fade_out :
                textView.setVisibility(View.VISIBLE);
                textView.startAnimation(aFadeOut);
                break;

//            case R.id.cross_fade :
//                textView.setVisibility(View.VISIBLE);
//                textView.startAnimation(aCrossfadeIn);
//                textView.startAnimation(aCrossfadeOut);
//                break;
        }
    }
}
