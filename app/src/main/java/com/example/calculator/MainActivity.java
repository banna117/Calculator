package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button start = (Button) findViewById(R.id.startBtn);

        start.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent= new Intent(getApplicationContext(), Calculator.class);
                intent.putExtra("message", "계산기르 실행합니다.");
                startActivity(intent);
            }
        });
    }
}