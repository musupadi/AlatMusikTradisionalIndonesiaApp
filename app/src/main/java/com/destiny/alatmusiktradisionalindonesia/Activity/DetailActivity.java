package com.destiny.alatmusiktradisionalindonesia.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.destiny.alatmusiktradisionalindonesia.R;

import org.w3c.dom.Text;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailActivity extends AppCompatActivity {
    CircleImageView image;
    TextView detail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        image = (CircleImageView)findViewById(R.id.ivGambar);
        detail = (TextView)findViewById(R.id.tvDetail);
        Intent data = getIntent();
        String AlatMusik = data.getStringExtra("AlatMusik");
        final String Gambar = data.getStringExtra("Gambar");
        String Detail = data.getStringExtra("Detail");
        detail.setText(Detail);
        Glide.with(this)
                .load(Gambar)
                .into(image);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goInput = new Intent(DetailActivity.this,FullScreenDetailActivity.class);
                goInput.putExtra("Gambar",Gambar);
                DetailActivity.this.startActivities(new Intent[]{goInput});
            }
        });
    }
}
