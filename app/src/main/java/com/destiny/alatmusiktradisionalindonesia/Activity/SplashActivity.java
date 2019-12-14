package com.destiny.alatmusiktradisionalindonesia.Activity;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import com.destiny.alatmusiktradisionalindonesia.R;

public class SplashActivity extends Activity {
    MediaPlayer SuaraMe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        SuaraMe = MediaPlayer.create(SplashActivity.this,R.raw.pembuka);
        SuaraMe.start();
        Thread thread = new Thread() {
            public void run() {
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    startActivity(new Intent(SplashActivity.this, Activity3.class));
                    finish();
                }

            }

        };
        thread.start();
    }
}
