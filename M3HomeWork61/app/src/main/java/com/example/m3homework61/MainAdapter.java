package com.example.m3homework61;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainViewHolder> implements onViewHolderListener{

    ArrayList<Calculation> data;
    Main2Activity activity;

    public MainAdapter(ArrayList<Calculation> data) {
        this.data = data;
    }

    public void addElement(Calculation calculation) {
        data.add(calculation);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.view_holder_main, parent, false);
        MainViewHolder viewHolder = new MainViewHolder(view);
        viewHolder.setOnClickListener(this);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.onBind(data.get(position).result, (position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    @Override
    public void onClick(int position) {
        Calculation calculation = data.get(position);
        Intent intent = new Intent(activity, Main3Activity.class );

        intent.putExtra("textKey", calculation);
        activity.startActivity(intent);
    }
}
