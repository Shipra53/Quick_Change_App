package com.example.quick_change;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.solver.state.State;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    private ConstraintLayout layout;
    private RadioGroup radioGroup;
    private RadioButton btn1,btn2,btn3,btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = findViewById(R.id.layout);
        radioGroup = findViewById(R.id.radio);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checked) {

                switch (checked){
                    case R.id.btnBlue:
                        layout.setBackgroundColor(Color.parseColor("#3944F7"));
                        break;

                    case R.id.btnRed:
                        layout.setBackgroundColor(Color.parseColor("#BF3325"));
                        break;

                    case R.id.btnYellow:
                        layout.setBackgroundColor(Color.parseColor("#D9D55B"));
                        break;

                    case R.id.btnGreen:
                        layout.setBackgroundColor(Color.parseColor("#008000"));
                        break;

                    case R.id.btnOrange:
                        layout.setBackgroundColor(Color.parseColor("#FFA500"));
                        break;

                    case R.id.btnPink:
                        layout.setBackgroundColor(Color.parseColor("#FFC0CB"));
                        break;
                }
            }
        });
    }
}