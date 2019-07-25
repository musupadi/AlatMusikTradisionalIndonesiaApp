package com.destiny.alatmusiktradisionalindonesia.Activity;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.destiny.alatmusiktradisionalindonesia.R;

public class AboutActivity extends AppCompatActivity {
    LinearLayout list;
    Boolean OnClick = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        list=(LinearLayout)findViewById(R.id.List);
        final MediaPlayer SuaraMe = MediaPlayer.create(AboutActivity.this,R.raw.juna);
        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(AboutActivity.this,"Tahan untuk mendengarkan Biodata Saya",Toast.LENGTH_SHORT).show();
            }
        });
        list.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if (OnClick){
                    SuaraMe.start();
                    OnClick = false;

                }else{
                    SuaraMe.pause();
                    OnClick = true;
                }
                return true;
            }
        });

    }
}
