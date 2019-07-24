package com.destiny.alatmusiktradisionalindonesia.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.destiny.alatmusiktradisionalindonesia.R;

public class FullScreenDetailActivity extends AppCompatActivity {
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen_detail);
        image=(ImageView)findViewById(R.id.ivGambar) ;
        Intent data = getIntent();
        final String Gambar = data.getStringExtra("Gambar");
        Glide.with(this)
                .load(Gambar)
                .into(image);
    }
}
