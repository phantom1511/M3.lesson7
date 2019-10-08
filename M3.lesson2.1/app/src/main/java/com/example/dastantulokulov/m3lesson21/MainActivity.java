package com.example.dastantulokulov.m3lesson21;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("ron", "onCreate");

        Button onPause = findViewById(R.id.buttonOnPause);

        onPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog();
            }
        });

        Button newActivityBtn = findViewById(R.id.newActivityButton);

        newActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });

    }

    public void showDialog(){
        final Dialog dialog = new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.dialog);
        Button button = dialog.findViewById(R.id.dialogButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ron", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ron", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ron", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ron", "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ron", "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ron", "onDestroy");
    }

}
