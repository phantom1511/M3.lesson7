package com.example.m3lesson51;

import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collection;

public class MainAdapter extends RecyclerView.Adapter<MainViewHolder> implements onViewHolderListener{

    ArrayList<String> data = new ArrayList<>();
    TextView textView;
    MainActivity activity;

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.view_holder_main, parent, false);
        MainViewHolder mainViewHolder = new MainViewHolder(view);
        mainViewHolder.setOnClickListener(this);
        return mainViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.onBind(data.get(position), position);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public void addString(String string){
        Log.d("ron", "addString" + string);
        string = string + " : " + data.size();
        data.add(string);
        notifyDataSetChanged();
    }

    @Override
    public void onClick(int position) {
        Log.d("ron", data.get(position));
        String string = data.get(position);
        Intent intent = new Intent(activity, Main2Activity.class);

        String



        intent.putExtra("key", string);
        activity.startActivity(intent);

    }
}
