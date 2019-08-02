package com.destiny.alatmusiktradisionalindonesia.Activity;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Toast;

import com.destiny.alatmusiktradisionalindonesia.R;

public class AboutActivity extends AppCompatActivity {
    LinearLayout Suara;
    Boolean onClick=true;
    MediaPlayer SuaraMe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Suara=(LinearLayout) findViewById(R.id.Suara);
        SuaraMe = MediaPlayer.create(AboutActivity.this,R.raw.suaranew);
        Suara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AboutActivity.this, "Tekan Untuk Mendengarkan Suara Saya", Toast.LENGTH_SHORT).show();
            }
        });
        Suara.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (onClick){
                    SuaraMe.start();
                    onClick=false;
                }else{
                    SuaraMe.pause();
                    onClick=true;
                }
                return true;
            }
        });
    }

    @Override
    public void onBackPressed() {
        if (onClick){
            SuaraMe.stop();
        }
        super.onBackPressed();
    }
}
