package com.example.m3lesson41;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainViewHolder> {

    ArrayList<String> date;

    public MainAdapter(){
        date = new ArrayList<>();
    }

    public void addElement(String string){

        string = string + " " + date.size();//это добовляет номер каждому элементу
        date.add(string);

        /*for (int i = 0; i < date.size(); i++) { это тоже добовляет но это замедляет наш процесс это не лучший вариант
            String text = date.get(i);
            if (!text.contains("" + i)){
                text = text + " " + i;
                date.set(i, text);
            }
        }*/
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.view_holder_main, parent, false);
        MainViewHolder viewHolder = new MainViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        String text = date.get(position);
        holder.textView.setText(text);
    }

    @Override
    public int getItemCount() {
        return date.size();
    }
}
