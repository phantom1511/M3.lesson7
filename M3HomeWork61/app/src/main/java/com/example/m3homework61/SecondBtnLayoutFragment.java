package com.example.m3homework61;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondBtnLayoutFragment extends Fragment {

//    Button btn7;
//    Button btn8;
//    Button btn9;
//    Button btnMinus;
//
//    EditText editText;
//
//    float Value1, Value2;
//    boolean PLUS, MINUS, PERCENT, DIVIDE;


    public SecondBtnLayoutFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second_btn_layout, container, false);
    }

//    @Override
//    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
//        super.onActivityCreated(savedInstanceState);
//
//        btn7 = getView().findViewById(R.id.num7);
//        btn8 = getView().findViewById(R.id.num8);
//        btn9 = getView().findViewById(R.id.num9);
//        btnMinus = getView().findViewById(R.id.BtnMinus);
//
//        btn7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                editText.setText(editText.getText() + "7");
//            }
//        });
//
//        btn8.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                editText.setText(editText.getText() + "8");
//            }
//        });
//
//        btn9.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                editText.setText(editText.getText() + "9");
//            }
//        });
//
//        btnMinus.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Value1 = Float.parseFloat(editText.getText() + "");
//                MINUS = true;
//                editText.setText(null);
//            }
//        });
//    }
}
