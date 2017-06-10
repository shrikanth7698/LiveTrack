package com.shrikanthravi.livetrack;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplachScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splach_screen);
        final ImageView bus_icon = (ImageView) findViewById(R.id.bus_icon);
        final Animation animation = AnimationUtils.loadAnimation(this, R.anim.my_animation);
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                bus_icon.startAnimation(animation);
            }
        }, 200);

        final Handler handler1 = new Handler();
        handler1.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent main =new Intent(SplachScreen.this,MainActivity.class);
                startActivity(main);
                SplachScreen.this.overridePendingTransition(R.anim.fadein, R.anim.fadeout);
            }
        }, 1700);

    }
}
