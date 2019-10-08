package com.example.m3lesson31;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textView = findViewById(R.id.textViewActivity2);
        Intent intent = getIntent();
        String text = intent.getStringExtra("textKey");
        textView.setText(text);
    }

    public void sendResult(View view) {
        Intent intent = new Intent();
        intent.putExtra("resultKey", text + "Feedback");
        setResult(RESULT_OK, intent);
        finish();
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("resultKey", text + "Feedback");
        setResult(RESULT_OK, intent);
        finish();
    }

    public void onBackPressed(View view) {
        Intent intent = new Intent();
        intent.putExtra("resultKey", text + "Feedback");
        setResult(RESULT_OK, intent);
        finish();
    }
}
