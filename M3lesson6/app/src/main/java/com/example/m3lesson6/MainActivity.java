package com.example.m3lesson6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements IButtons{

    ButtonsFragment buttonsFragment;
    CheckBoxFragment checkBoxFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonsFragment = (ButtonsFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_buttons);
        checkBoxFragment = (CheckBoxFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_checkbox);

        buttonsFragment.listener = this;


    }


    @Override
    public void button1Pressed() {
//        checkBoxFragment.checkBox1.setChecked(true);
        checkBoxFragment.checkBox1.setChecked(!checkBoxFragment.checkBox1.isChecked());
        showFragment(ButtonsFragment.instance(this));
    }

    @Override
    public void button2Pressed() {
//        checkBoxFragment.checkBox2.setChecked(true);
        checkBoxFragment.checkBox2.setChecked(!checkBoxFragment.checkBox2.isChecked());
        showFragment(new CheckBoxFragment());
    }

    public void showFragment(Fragment fragment){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.container, fragment);
        transaction.commit();
    }
}
