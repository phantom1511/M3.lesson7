package com.example.m3homework61;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainViewHolder extends RecyclerView.ViewHolder {

    TextView textView;
    int position;
    onViewHolderListener listener;

    public MainViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.resultTextView);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onClick(position);
            }
        });
    }

    public void onBind(String calculation, int position) {
        textView.setText(String.valueOf(calculation));
        this.position = position;
    }

    public void setOnClickListener(onViewHolderListener listener) {
        this.listener = listener;
    }
}
