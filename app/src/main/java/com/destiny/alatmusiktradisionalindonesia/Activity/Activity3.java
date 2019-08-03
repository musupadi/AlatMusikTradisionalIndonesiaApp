package com.destiny.alatmusiktradisionalindonesia.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.destiny.alatmusiktradisionalindonesia.R;

public class Activity3 extends AppCompatActivity {
    ImageView ivMusic,ivHome,ivAbout,ivQuis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        ivMusic=(ImageView)findViewById(R.id.ivMusic);
        ivHome=(ImageView)findViewById(R.id.ivHome);
        ivAbout=(ImageView)findViewById(R.id.ivAbout);
        ivQuis=(ImageView)findViewById(R.id.ivQuis);

        ivMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Activity3.this, ActivityAlatMusik.class);
                startActivity(intent);
            }
        });
        ivHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Activity3.this, SejarahActivity.class);
                startActivity(intent);
            }
        });
        ivAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Activity3.this, AboutActivity.class);
                startActivity(intent);
            }
        });
        ivQuis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goInput = new Intent(Activity3.this, QuizActivity.class);
                goInput.putExtra("NO","0");
                goInput.putExtra("SCORE","0");
                Activity3.this.startActivities(new Intent[]{goInput});
            }
        });

    }

    @Override
    public void onBackPressed() {
        
    }
}
