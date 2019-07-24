package com.destiny.alatmusiktradisionalindonesia.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.destiny.alatmusiktradisionalindonesia.Model.Model;
import com.destiny.alatmusiktradisionalindonesia.Model.ModelQuiz;
import com.destiny.alatmusiktradisionalindonesia.R;

import java.util.ArrayList;

public class QuizActivity extends AppCompatActivity {
    Button A,B,C,D;
    TextView Soal,Tittle;
    private ArrayList<Model> pList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quis);

        Intent data = getIntent();
        String No = data.getStringExtra("NO");
        final String Score = data.getStringExtra("SCORE");
        final int no = Integer.parseInt(No);
        A = (Button)findViewById(R.id.btnA);
        B = (Button)findViewById(R.id.btnB);
        C = (Button)findViewById(R.id.btnC);
        D = (Button)findViewById(R.id.btnD);
        Soal = (TextView)findViewById(R.id.tvSoal);
        Tittle = (TextView)findViewById(R.id.tvNo);
        pList.addAll(ModelQuiz.getListData());
        A.setText(pList.get(no).getJawabana());
        B.setText(pList.get(no).getJawabanb());
        C.setText(pList.get(no).getJawabanc());
        D.setText(pList.get(no).getJawaband());
        Soal.setText(pList.get(no).getSoal());
        Tittle.setText("Soal "+pList.get(no).getNo());
        A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pList.get(no).getJawaban().equals("A")){
                    if (no >= pList.size()-1){
                        Intent intent=new Intent(QuizActivity.this, ScoreActivity.class);
                        Toast.makeText(QuizActivity.this,String.valueOf(Integer.parseInt(Score)+1),Toast.LENGTH_SHORT).show();
                        intent.putExtra("SCORE",String.valueOf(Integer.parseInt(Score)+1));
                        startActivity(intent);
                    }else{
                        Intent goInput = new Intent(QuizActivity.this, QuizActivity.class);
                        goInput.putExtra("NO",String.valueOf(no+1));
                        goInput.putExtra("SCORE",String.valueOf(Integer.parseInt(Score)+1));
                        Toast.makeText(QuizActivity.this,String.valueOf(Integer.parseInt(Score)+1),Toast.LENGTH_SHORT).show();
                        QuizActivity.this.startActivities(new Intent[]{goInput});
                    }
                }else{
                    if (no >= pList.size()-1){
                        Intent intent=new Intent(QuizActivity.this, ScoreActivity.class);
                        Toast.makeText(QuizActivity.this,String.valueOf(Integer.parseInt(Score)),Toast.LENGTH_SHORT).show();
                        intent.putExtra("SCORE",String.valueOf(Integer.parseInt(Score)));
                        startActivity(intent);
                    }else{
                        Intent goInput = new Intent(QuizActivity.this, QuizActivity.class);
                        goInput.putExtra("NO",String.valueOf(no+1));
                        goInput.putExtra("SCORE",String.valueOf(Score));
                        Toast.makeText(QuizActivity.this,Score,Toast.LENGTH_SHORT).show();
                        QuizActivity.this.startActivities(new Intent[]{goInput});
                    }
                }
            }
        });
        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pList.get(no).getJawaban().equals("B")){
                    if (no >= pList.size()-1){
                        Intent intent=new Intent(QuizActivity.this, ScoreActivity.class);
                        Toast.makeText(QuizActivity.this,String.valueOf(Integer.parseInt(Score)+1),Toast.LENGTH_SHORT).show();
                        intent.putExtra("SCORE",String.valueOf(Integer.parseInt(Score)+1));
                        startActivity(intent);
                    }else{
                        Intent goInput = new Intent(QuizActivity.this, QuizActivity.class);
                        goInput.putExtra("NO",String.valueOf(no+1));
                        goInput.putExtra("SCORE",String.valueOf(Integer.parseInt(Score)+1));
                        Toast.makeText(QuizActivity.this,String.valueOf(Integer.parseInt(Score)+1),Toast.LENGTH_SHORT).show();
                        QuizActivity.this.startActivities(new Intent[]{goInput});
                    }
                }else{
                    if (no >= pList.size()-1){
                        Intent intent=new Intent(QuizActivity.this, ScoreActivity.class);
                        Toast.makeText(QuizActivity.this,String.valueOf(Integer.parseInt(Score)),Toast.LENGTH_SHORT).show();
                        intent.putExtra("SCORE",String.valueOf(Integer.parseInt(Score)));
                        startActivity(intent);
                    }else{
                        Intent goInput = new Intent(QuizActivity.this, QuizActivity.class);
                        goInput.putExtra("NO",String.valueOf(no+1));
                        goInput.putExtra("SCORE",String.valueOf(Score));
                        Toast.makeText(QuizActivity.this,Score,Toast.LENGTH_SHORT).show();
                        QuizActivity.this.startActivities(new Intent[]{goInput});
                    }
                }
            }
        });
        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pList.get(no).getJawaban().equals("C")){
                    if (no >= pList.size()-1){
                        Intent intent=new Intent(QuizActivity.this, ScoreActivity.class);
                        Toast.makeText(QuizActivity.this,String.valueOf(Integer.parseInt(Score)+1),Toast.LENGTH_SHORT).show();
                        intent.putExtra("SCORE",String.valueOf(Integer.parseInt(Score)+1));
                        startActivity(intent);
                    }else{
                        Intent goInput = new Intent(QuizActivity.this, QuizActivity.class);
                        goInput.putExtra("NO",String.valueOf(no+1));
                        goInput.putExtra("SCORE",String.valueOf(Integer.parseInt(Score)+1));
                        Toast.makeText(QuizActivity.this,String.valueOf(Integer.parseInt(Score)+1),Toast.LENGTH_SHORT).show();
                        QuizActivity.this.startActivities(new Intent[]{goInput});
                    }
                }else{
                    if (no >= pList.size()-1){
                        Intent intent=new Intent(QuizActivity.this, ScoreActivity.class);
                        Toast.makeText(QuizActivity.this,String.valueOf(Integer.parseInt(Score)),Toast.LENGTH_SHORT).show();
                        intent.putExtra("SCORE",String.valueOf(Integer.parseInt(Score)));
                        startActivity(intent);
                    }else{
                        Intent goInput = new Intent(QuizActivity.this, QuizActivity.class);
                        goInput.putExtra("NO",String.valueOf(no+1));
                        goInput.putExtra("SCORE",String.valueOf(Score));
                        Toast.makeText(QuizActivity.this,Score,Toast.LENGTH_SHORT).show();
                        QuizActivity.this.startActivities(new Intent[]{goInput});
                    }
                }
            }
        });
        D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pList.get(no).getJawaban().equals("D")){
                    if (no >= pList.size()-1){
                        Intent intent=new Intent(QuizActivity.this, Activity3.class);
                        Toast.makeText(QuizActivity.this,String.valueOf(Integer.parseInt(Score)+1),Toast.LENGTH_SHORT).show();
                        intent.putExtra("SCORE",String.valueOf(Integer.parseInt(Score)+1));
                        startActivity(intent);
                    }else{
                        Intent goInput = new Intent(QuizActivity.this, QuizActivity.class);
                        goInput.putExtra("NO",String.valueOf(no+1));
                        goInput.putExtra("SCORE",String.valueOf(Integer.parseInt(Score)+1));
                        Toast.makeText(QuizActivity.this,String.valueOf(Integer.parseInt(Score)+1),Toast.LENGTH_SHORT).show();
                        QuizActivity.this.startActivities(new Intent[]{goInput});
                    }
                }else{
                    if (no >= pList.size()-1){
                        Intent intent=new Intent(QuizActivity.this, Activity3.class);
                        Toast.makeText(QuizActivity.this,String.valueOf(Integer.parseInt(Score)),Toast.LENGTH_SHORT).show();
                        intent.putExtra("SCORE",String.valueOf(Integer.parseInt(Score)));
                        startActivity(intent);
                    }else{
                        Intent goInput = new Intent(QuizActivity.this, QuizActivity.class);
                        goInput.putExtra("NO",String.valueOf(no+1));
                        goInput.putExtra("SCORE",String.valueOf(Score));
                        Toast.makeText(QuizActivity.this,Score,Toast.LENGTH_SHORT).show();
                        QuizActivity.this.startActivities(new Intent[]{goInput});
                    }
                }
            }
        });
    }
}
