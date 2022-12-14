package com.example.recycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.InnerHolder> {
    private ArrayList<Group>dataone;
    public Adapter(ArrayList<Group>dataone){
        this.dataone=dataone;
    }
    @NonNull
    @Override
    public InnerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new InnerHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull InnerHolder holder, int position) {
        holder.tvGroupName.setText(dataone.get(position).getGroupName());
        holder.tvGroupNews.setText(dataone.get(position).getGroupNews());
        holder.tvTime.setText(dataone.get(position).getTime());
        holder.ivGroupPicture.setImageResource(dataone.get(position).getGroupPicture());
    }

    @Override
    public int getItemCount() {
        return dataone.size();
    }

    public static class InnerHolder extends RecyclerView.ViewHolder{
        TextView tvTime;
        TextView tvGroupName;
        TextView tvGroupNews;
        ImageView ivGroupPicture;
        public InnerHolder(@NonNull View itemView){
            super(itemView);
            tvGroupName=(TextView) itemView.findViewById(R.id.tv_group_name);
            tvTime=(TextView) itemView.findViewById(R.id.tv_time);
            tvGroupNews=(TextView) itemView.findViewById(R.id.tv_group_news);
            ivGroupPicture=(ImageView)itemView.findViewById(R.id.img_main_first);
        }
    }

}

