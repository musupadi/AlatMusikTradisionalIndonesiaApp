package com.destiny.alatmusiktradisionalindonesia.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.destiny.alatmusiktradisionalindonesia.Activity.DetailActivity;
import com.destiny.alatmusiktradisionalindonesia.Model.Model;
import com.destiny.alatmusiktradisionalindonesia.R;

import java.util.ArrayList;

public class AdapterDataJawa extends RecyclerView.Adapter<AdapterDataJawa.GridViewHolder> {
    private Context context;
    private ArrayList<Model> listModel;

    private ArrayList<Model> getListModel() {
        return listModel;
    }

    public void setListModel(ArrayList<Model> listModel) {
        this.listModel = listModel;
    }

    public AdapterDataJawa(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_data, parent, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GridViewHolder holder, final int position) {

        Glide.with(context)
                .load(getListModel().get(position).getGambar())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPhoto);
        holder.AlatMusik.setText(getListModel().get(position).getAlatMusik());
        holder.imgPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goInput = new Intent(context, DetailActivity.class);
                goInput.putExtra("AlatMusik",getListModel().get(position).getAlatMusik());
                goInput.putExtra("Gambar",getListModel().get(position).getGambar());
                goInput.putExtra("Detail",getListModel().get(position).getDetail());
                context.startActivities(new Intent[]{goInput});
            }
        });
    }

    @Override
    public int getItemCount() {
        return getListModel().size();
    }

    class GridViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView AlatMusik;
        GridViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            AlatMusik = itemView.findViewById(R.id.alatMusik);
        }
    }
}
