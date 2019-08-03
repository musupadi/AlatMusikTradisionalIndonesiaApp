package com.destiny.alatmusiktradisionalindonesia.Activity;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Toast;

import com.destiny.alatmusiktradisionalindonesia.R;

public class AboutActivity extends AppCompatActivity {
    ImageView Suara;
    Boolean onClick=true;
    MediaPlayer SuaraMe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Suara=(ImageView)findViewById(R.id.Suara);
        SuaraMe = MediaPlayer.create(AboutActivity.this,R.raw.suaranew);
        Suara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onClick){
                    SuaraMe.start();
                    Suara.setImageResource(R.drawable.iconpause);
                    onClick=false;
                }else{
                    SuaraMe.pause();
                    Suara.setImageResource(R.drawable.iconplay);
                    onClick=true;
                }
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
