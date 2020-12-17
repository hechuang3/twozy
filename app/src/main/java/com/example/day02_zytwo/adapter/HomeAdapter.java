package com.example.day02_zytwo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.bumptech.glide.Glide;
import com.example.day02_zytwo.R;
import com.example.day02_zytwo.bean.HomeBean;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.HomeHolder> {
private ArrayList<HomeBean.NewsDTO>list;
private Context context;

    public HomeAdapter(ArrayList<HomeBean.NewsDTO> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public HomeHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item, parent, false);
        return new HomeHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeHolder holder, int position) {
        Glide.with(context).load(list.get(position).getImageUrl()).into(holder.iv);
        holder.tv.setText(list.get(position).getTile());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class HomeHolder extends RecyclerView.ViewHolder {
        private ImageView iv;
        private TextView tv;
        public HomeHolder(@NonNull View itemView) {
            super(itemView);
            iv=itemView.findViewById(R.id.item_iv);
            tv=itemView.findViewById(R.id.item_tv);
        }
    }
}
