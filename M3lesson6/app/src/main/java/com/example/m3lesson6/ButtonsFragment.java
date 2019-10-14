package com.example.m3lesson6;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class ButtonsFragment extends Fragment {

    Button button1;
    Button button2;

    IButtons listener;

    static public ButtonsFragment instance(IButtons listener){
        ButtonsFragment fragment = new ButtonsFragment();
        fragment.listener = listener;
        return fragment;
    }


    public ButtonsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_buttons, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        button1 = getView().findViewById(R.id.btn1);
        button2 = getView().findViewById(R.id.btn2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.button1Pressed();
//                button1.setText("Clicked!");
//                MainActivity activity = (MainActivity) getActivity();
//                activity.checkBoxFragment.checkBox1.setChecked(true);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.button2Pressed();
//                button2.setText("Clicked!");
            }
        });

    }
}
