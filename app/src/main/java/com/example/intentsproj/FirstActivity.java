package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {
    Button btn;
    TextView txtnum1;
    TextView txtnum2;
    TextView inputnum1;
    TextView inputnum2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        btn = findViewById(R.id.buttonOKact1);
        txtnum1=findViewById(R.id.txtact1num1);
        txtnum2=findViewById(R.id.txtact1num2);
        inputnum1=findViewById(R.id.act1inputnum1);
        inputnum2=findViewById(R.id.act1inputnum2);
    }

    @Override
    protected void onResume() {
        super.onResume();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //txtmsg.setText("Hi I'm Dew");//text eka witarak chane krnna
                Intent intent =new Intent(FirstActivity.this,SecondActivity.class);//activity maru krnna
                startActivity(intent);

            }
        });
    }
}