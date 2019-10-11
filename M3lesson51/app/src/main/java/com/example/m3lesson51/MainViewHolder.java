package com.example.m3lesson51;

import android.app.AppComponentFactory;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.BreakIterator;

public class MainViewHolder extends RecyclerView.ViewHolder {

    onViewHolderListener listener;
    TextView textView;
    int position;

    public MainViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.vhTextView);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onClick(position);
            }
        });
    }

    public void onBind(String string, int position){
        textView.setText(string);
        this.position = position;
    }

    public void setOnClickListener(onViewHolderListener listener){
        this.listener = listener;
    }
}
