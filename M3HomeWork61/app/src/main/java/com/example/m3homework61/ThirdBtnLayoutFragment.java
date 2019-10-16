package com.example.m3homework61;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class ThirdBtnLayoutFragment extends Fragment {

//    Button btn4;
//    Button btn5;
//    Button btn6;
//    Button btnP;
//
//    EditText editText;
//
//    float Value1, Value2;
//    boolean PLUS, MINUS, PERCENT, DIVIDE;

    public ThirdBtnLayoutFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third_btn_layout, container, false);
    }

//    @Override
//    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
//        super.onActivityCreated(savedInstanceState);
//
//        btn4 = getView().findViewById(R.id.num4);
//        btn5 = getView().findViewById(R.id.num5);
//        btn6 = getView().findViewById(R.id.num6);
//        btnP = getView().findViewById(R.id.BtnPhr);
//
//        btn4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                editText.setText(editText.getText() + "4");
//            }
//        });
//
//        btn5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                editText.setText(editText.getText() + "5");
//            }
//        });
//
//        btn6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                editText.setText(editText.getText() + "6");
//            }
//        });
//
//        btnP.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Value1 = Float.parseFloat(editText.getText() + "");
//                PERCENT = true;
//                editText.setText(null);
//            }
//        });
//    }
}
