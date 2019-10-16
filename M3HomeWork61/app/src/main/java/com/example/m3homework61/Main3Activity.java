package com.example.m3homework61;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Main3Activity extends AppCompatActivity {
    TextView textView;
    Calculation calculation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        textView = findViewById(R.id.textView3);
        Intent intent = getIntent();
        calculation = (Calculation) intent.getSerializableExtra("textKey");

        TextView textView = findViewById(R.id.textView3);
        textView.setText(calculation.first + " " + calculation.operation + " " + calculation.second + " = " + calculation.result);
        }
}
