package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Calculator extends AppCompatActivity {

    Double res=0.0;
    Button plusBtn = null;
    Button minusBtn = null;
    Button multBtn = null;
    Button clearBtn = null;

    EditText firstNum = null;
    EditText secNum = null;

    TextView result = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        plusBtn = (Button) findViewById(R.id.plusBtn);
        minusBtn = (Button) findViewById(R.id.minusBtn);
        multBtn = (Button) findViewById(R.id.multBtn);
        clearBtn = (Button) findViewById(R.id.clearBtn);

        firstNum = (EditText) findViewById(R.id.firstNum);
        secNum = (EditText) findViewById(R.id.secNum);

        result = (TextView) findViewById(R.id.result);
        Intent intent = getIntent();
        Log.d("계산기", intent.getStringExtra("message"));

    }

    public void onClick(View v){
        double a = Double.parseDouble(firstNum.getText().toString());
        double b = Double.parseDouble(secNum.getText().toString());

        switch(v.getId()){
            case R.id.plusBtn : {
                try {
                    res=a+b;
                    Toast.makeText(getApplicationContext(), String.valueOf(a) + " + " + String.valueOf(b) + " = " + String.valueOf(res), Toast.LENGTH_SHORT).show();
                    break;
                }
                catch(Exception e){
                    e.printStackTrace();
                }

            }
            case R.id.minusBtn : {
                try {
                    res=a-b;
                    Toast.makeText(getApplicationContext(), String.valueOf(a) + " - " + String.valueOf(b) + " = " + String.valueOf(res), Toast.LENGTH_SHORT).show();
                    break;
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
            case R.id.multBtn : {
                try {
                    res=a*b;
                    Toast.makeText(getApplicationContext(), String.valueOf(a) + " * " + String.valueOf(b) + " = " + String.valueOf(res), Toast.LENGTH_SHORT).show();
                    break;
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
            case R.id.clearBtn : {
                try{
                    //Toast.makeText(this, "clear", Toast.LENGTH_SHORT).show();
                    firstNum.setText(null);
                    secNum.setText(null);
                    result.setText("답");
                    Toast.makeText(this, "clear", Toast.LENGTH_SHORT).show();
                    return;
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
            default : {
                break;
            }
        }
        result.setText(String.valueOf(res));
    }

}