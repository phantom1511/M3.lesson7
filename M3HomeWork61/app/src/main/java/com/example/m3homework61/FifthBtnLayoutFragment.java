package com.example.m3homework61;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class FifthBtnLayoutFragment extends Fragment {

//    Button btn0;
//    Button btnDot;
//    Button btnEqual;
//
//    EditText editText;
//
//    float Value1, Value2;
//    boolean PLUS, MINUS, PERCENT, DIVIDE;
//
//    String resultText;
//    ArrayList<Calculation> history = new ArrayList<>();

    public FifthBtnLayoutFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fifth_btn_layout, container, false);
    }

//    @Override
//    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
//        super.onActivityCreated(savedInstanceState);
//
//        btn0 = getView().findViewById(R.id.num0);
//        btnDot = getView().findViewById(R.id.BtnDot);
//        btnEqual = getView().findViewById(R.id.BtnEqual);
//
//        btn0.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                editText.setText(editText.getText() + "0");
//            }
//        });
//
//        btnDot.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                editText.setText(editText.getText() + ".");
//            }
//        });
//
//        btnEqual.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Calculation calculation = new Calculation();
//                Value2 = Float.parseFloat(editText.getText() + "");
//                if (PLUS == true) {
//                    editText.setText(Value1 + Value2 + "");
//                    resultText = editText.getText().toString();
//                    calculation.first = String.valueOf(Value1);
//                    calculation.second = String.valueOf(Value2);
//                    calculation.operation = "+";
//                    calculation.result = resultText;
//                    history.add(calculation);
//                    PLUS = false;
//                }
//
//
//                if (MINUS == true) {
//                    editText.setText(Value1 - Value2 + "");
//                    resultText = editText.getText().toString();
//                    calculation.first = String.valueOf(Value1);
//                    calculation.second = String.valueOf(Value2);
//                    calculation.operation = "-";
//                    calculation.result = resultText;
//                    history.add(calculation);
//                    MINUS = false;
//                }
//
//                if (PERCENT == true) {
//                    editText.setText(Value1 * Value2 / 100 + "");
//                    resultText = editText.getText().toString();
//                    calculation.first = String.valueOf(Value1);
//                    calculation.second = String.valueOf(Value2);
//                    calculation.operation = "%";
//                    calculation.result = resultText;
//                    history.add(calculation);
//                    PERCENT = false;
//                }
//
//                if (DIVIDE == true) {
//                    editText.setText(Value1 / Value2 + "");
//                    resultText = editText.getText().toString();
//                    calculation.first = String.valueOf(Value1);
//                    calculation.second = String.valueOf(Value2);
//                    calculation.operation = "/";
//                    calculation.result = resultText;
//                    history.add(calculation);
//                    DIVIDE = false;
//                }
//            }
//        });
//    }
}
