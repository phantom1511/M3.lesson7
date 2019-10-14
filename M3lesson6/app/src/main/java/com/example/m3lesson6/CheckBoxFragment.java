package com.example.m3lesson6;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;


/**
 * A simple {@link Fragment} subclass.
 */
public class CheckBoxFragment extends Fragment {

    CheckBox checkBox1;
    CheckBox checkBox2;


    public CheckBoxFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_check_box, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        checkBox1 = getView().findViewById(R.id.cbx1);
        checkBox2 = getView().findViewById(R.id.cbx2);
    }
}
