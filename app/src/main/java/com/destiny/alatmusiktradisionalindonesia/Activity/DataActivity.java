package com.destiny.alatmusiktradisionalindonesia.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.destiny.alatmusiktradisionalindonesia.Adapter.AdapterDataJawa;
import com.destiny.alatmusiktradisionalindonesia.Model.Model;
import com.destiny.alatmusiktradisionalindonesia.Model.ModelBali;
import com.destiny.alatmusiktradisionalindonesia.Model.ModelJawa;
import com.destiny.alatmusiktradisionalindonesia.Model.ModelKalimantan;
import com.destiny.alatmusiktradisionalindonesia.Model.ModelMaluku;
import com.destiny.alatmusiktradisionalindonesia.Model.ModelNusaTenggara;
import com.destiny.alatmusiktradisionalindonesia.Model.ModelPapua;
import com.destiny.alatmusiktradisionalindonesia.Model.ModelSulawesi;
import com.destiny.alatmusiktradisionalindonesia.Model.ModelSumatra;
import com.destiny.alatmusiktradisionalindonesia.R;

import java.util.ArrayList;

public class DataActivity extends AppCompatActivity {
    private RecyclerView rvCategory;
    private ArrayList<Model> pList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        rvCategory = (RecyclerView)findViewById(R.id.recycler);
        Intent data = getIntent();
        String Daerah = data.getStringExtra("DAERAH");

        if (Daerah.equals("JAWA")){
            pList.addAll(ModelJawa.getListData());
        }else if(Daerah.equals("BALI")){
            pList.addAll(ModelBali.getListData());
        }else if(Daerah.equals("NUSATENGGARA")){
            pList.addAll(ModelNusaTenggara.getListData());
        }else if(Daerah.equals("PAPUA")) {
            pList.addAll(ModelPapua.getListData());
        }else if(Daerah.equals("SUMATRA")) {
            pList.addAll(ModelSumatra.getListData());
        }else if(Daerah.equals("KALIMANTAN")) {
            pList.addAll(ModelKalimantan.getListData());
        }else if(Daerah.equals("SULAWESI")) {
            pList.addAll(ModelSulawesi.getListData());
        }else if(Daerah.equals("MALUKU")) {
            pList.addAll(ModelMaluku.getListData());
        }




        rvCategory.setLayoutManager(new GridLayoutManager(this, 3));
        AdapterDataJawa gridAdapter = new AdapterDataJawa(this);
        gridAdapter.setListModel(pList);
        rvCategory.setAdapter(gridAdapter);
    }
}
