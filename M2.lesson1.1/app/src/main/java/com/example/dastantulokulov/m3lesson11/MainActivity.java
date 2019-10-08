package com.example.dastantulokulov.m3lesson11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.main_text);
        button = findViewById(R.id.main_button);
        textView.setText("Try to push button");
    }

    public void onButtonClick(View v){
        button.setText("CLICKED!!!");
    }
}
