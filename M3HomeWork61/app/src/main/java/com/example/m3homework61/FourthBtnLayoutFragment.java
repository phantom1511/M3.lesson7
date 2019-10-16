package com.example.m3homework61;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class FourthBtnLayoutFragment extends Fragment {

//    Button btn1;
//    Button btn2;
//    Button btn3;
//    Button btnDiv;
//
//    EditText editText;
//
//    float Value1, Value2;
//    boolean PLUS, MINUS, PERCENT, DIVIDE;

    public FourthBtnLayoutFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fourth_btn_layout, container, false);
    }

//    @Override
//    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
//        super.onActivityCreated(savedInstanceState);
//
//        btn1 = getView().findViewById(R.id.num1);
//        btn2 = getView().findViewById(R.id.num2);
//        btn3 = getView().findViewById(R.id.num3);
//        btnDiv = getView().findViewById(R.id.BtnDiv);
//
//        btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                editText.setText(editText.getText() + "1");
//            }
//        });
//
//        btn2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                editText.setText(editText.getText() + "2");
//            }
//        });
//
//        btn3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                editText.setText(editText.getText() + "3");
//            }
//        });
//
//        btnDiv.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Value1 = Float.parseFloat(editText.getText() + "");
//                DIVIDE = true;
//                editText.setText(null);
//            }
//        });
//    }
}
