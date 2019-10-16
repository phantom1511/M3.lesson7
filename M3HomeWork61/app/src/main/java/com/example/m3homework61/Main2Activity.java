package com.example.m3homework61;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    RecyclerView recyclerView;
    MainAdapter adapter;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = findViewById(R.id.resultTextView);
        Intent intent = getIntent();

        ArrayList<Calculation> data = (ArrayList<Calculation>) intent.getSerializableExtra("textKey");

        recyclerView = findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new MainAdapter(data);
        adapter.activity = this;
        recyclerView.setAdapter(adapter);
    }

    public void openCalculator(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
