package com.destiny.alatmusiktradisionalindonesia.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.destiny.alatmusiktradisionalindonesia.R;

public class ActivityAlatMusik extends AppCompatActivity {
    Button btnJawa,btnBali,btnNusaTenggara,btnPapua,btnSumatra,btnKalimantan,btnSulawesi,btnMaluku;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alat_musik);
        btnJawa=(Button)findViewById(R.id.btnJawa);
        btnBali=(Button)findViewById(R.id.btnBali);
        btnNusaTenggara=(Button)findViewById(R.id.btnNusaTenggara);
        btnPapua=(Button)findViewById(R.id.btnPapua);
        btnSumatra=(Button)findViewById(R.id.btnSumatra);
        btnKalimantan=(Button)findViewById(R.id.btnKalimantan);
        btnSulawesi=(Button)findViewById(R.id.btnSulawesi);
        btnMaluku=(Button)findViewById(R.id.btnMaluku);

        btnJawa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ActivityAlatMusik.this, DataActivity.class);
                intent.putExtra("DAERAH","JAWA");
                startActivity(intent);
            }
        });
        btnBali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ActivityAlatMusik.this, DataActivity.class);
                intent.putExtra("DAERAH","BALI");
                startActivity(intent);
            }
        });
        btnNusaTenggara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ActivityAlatMusik.this, DataActivity.class);
                intent.putExtra("DAERAH","NUSATENGGARA");
                startActivity(intent);
            }
        });
        btnPapua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ActivityAlatMusik.this, DataActivity.class);
                intent.putExtra("DAERAH","PAPUA");
                startActivity(intent);
            }
        });
        btnSumatra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ActivityAlatMusik.this, DataActivity.class);
                intent.putExtra("DAERAH","SUMATRA");
                startActivity(intent);
            }
        });
        btnKalimantan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ActivityAlatMusik.this, DataActivity.class);
                intent.putExtra("DAERAH","KALIMANTAN");
                startActivity(intent);
            }
        });
        btnSulawesi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ActivityAlatMusik.this, DataActivity.class);
                intent.putExtra("DAERAH","SULAWESI");
                startActivity(intent);
            }
        });
        btnMaluku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ActivityAlatMusik.this, DataActivity.class);
                intent.putExtra("DAERAH","MALUKU");
                startActivity(intent);
            }
        });
    }
}
