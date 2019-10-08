package com.example.m3lesson31;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    String savedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText1);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                savedText = editText.getText().toString();
            }
        });
    }

    public void open2Activity(View view) {
        if (savedText == null || savedText == ""){
            Toast toast = Toast.makeText(this, "Empty field", Toast.LENGTH_SHORT);
            toast.show();
            return;
        }

        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("textKey", savedText);
        startActivity(intent);
    }

    public void open2ActivityForResult(View view) {
        if (savedText == null || savedText == ""){
            Toast toast = Toast.makeText(this, "Empty field", Toast.LENGTH_SHORT);
            toast.show();
            return;
        }

        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("textKey", savedText);
        startActivityForResult(intent, 2);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 2){
            //result from 2nd Activity
            if (resultCode == RESULT_OK){
                String text = data.getStringExtra("resultKey");
                Toast toast = Toast.makeText(this, text, Toast.LENGTH_SHORT);
                toast.show();
            }
        }
    }

    public void share(View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, savedText);

        if (intent.resolveActivity(getPackageManager()) != null){
            startActivity(intent);
        }
    }
}
