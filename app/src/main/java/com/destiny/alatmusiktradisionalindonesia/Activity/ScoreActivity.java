package com.destiny.alatmusiktradisionalindonesia.Activity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.destiny.alatmusiktradisionalindonesia.R;

public class ScoreActivity extends AppCompatActivity {
    TextView SCORE;
    Button Kuis,Kembali;
    MediaPlayer Hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        SCORE = (TextView)findViewById(R.id.tvScore);
        Kuis = (Button)findViewById(R.id.btnKuis);
        Kembali = (Button)findViewById(R.id.btnKembali);
        Hasil = MediaPlayer.create(ScoreActivity.this,R.raw.hasilkuis);
        Intent data = getIntent();
        final String Score = data.getStringExtra("SCORE");
        SCORE.setText("Selamat Anda mendapatkan Score : \n"+Score);
        Hasil.start();
        Kuis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goInput = new Intent(ScoreActivity.this, QuizActivity.class);
                goInput.putExtra("NO",String.valueOf(0));
                goInput.putExtra("SCORE",String.valueOf(0));
                ScoreActivity.this.startActivities(new Intent[]{goInput});
            }
        });
        Kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ScoreActivity.this,Activity3.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {

    }
}
