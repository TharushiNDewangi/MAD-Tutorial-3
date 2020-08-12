package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    //TextView output1,output2,Total;
    EditText output1,output2;
    TextView tot;
    Button b1,b2,b3,b4;
    String number1,number2,castTotal;
    int total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        b1 = findViewById(R.id.plus);
        b2 =findViewById(R.id.Multify);
        b3 =findViewById(R.id.Devision);
        b4 =findViewById(R.id.Sub);

        output1=(EditText) findViewById(R.id.userinact21);
        output2=(EditText) findViewById(R.id.userinact22);
        tot= findViewById(R.id.output);


        Intent intent=getIntent();


       // Integer castedNum1,castedNum2;

        number1=intent.getStringExtra("input1");
        number2=intent.getStringExtra("input2");

        output1.setText(number1);
        output2.setText(number2);
//
//        int castedNum1=Integer.parseInt(number1);
//        int castedNum2=Integer.parseInt(number2);
//        total=castedNum1+castedNum2;
//        castTotal = String.valueOf(total);
//
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=getIntent();
                number1=intent.getStringExtra("input1");
                number2=intent.getStringExtra("input2");

                int castedNum1=Integer.parseInt(number1);
                int castedNum2=Integer.parseInt(number2);
                total=castedNum1+castedNum2;
                castTotal = String.valueOf(total);
                tot.setText(number1 +"+"+ number2 +"="+castTotal);

            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=getIntent();
                number1=intent.getStringExtra("input1");
                number2=intent.getStringExtra("input2");

                int castedNum1=Integer.parseInt(number1);
                int castedNum2=Integer.parseInt(number2);
                total=castedNum1 * castedNum2;
                castTotal = String.valueOf(total);
                tot.setText(number1 +"*"+ number2 +"="+castTotal);

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=getIntent();
                number1=intent.getStringExtra("input1");
                number2=intent.getStringExtra("input2");

                int castedNum1=Integer.parseInt(number1);
                int castedNum2=Integer.parseInt(number2);
                total=castedNum1 / castedNum2;
                castTotal = String.valueOf(total);
                tot.setText(number1 +"/"+ number2 +"="+castTotal);

            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=getIntent();
                number1=intent.getStringExtra("input1");
                number2=intent.getStringExtra("input2");

                int castedNum1=Integer.parseInt(number1);
                int castedNum2=Integer.parseInt(number2);
                total=castedNum1 - castedNum2;
                castTotal = String.valueOf(total);
                tot.setText(number1 +"-"+ number2 +"="+castTotal);

            }
        });



        //castedNum1 = new Integer(Integer.parseInt(number1));


//        tot.setText(number1 +"+"+ number2 +"="+castTotal);




    }
//    private void total()
//    {
//
//    }
}






//        Integer num1 =intent.getIntExtra("input1",0);
//        output1.setText(num1);
//        Integer num2 =intent.getIntExtra("input2",0);
//        output2.setText(num2);

       // output1.setText(namtry);

//        int num1=Integer.parseInt(getIntent().getExtras().get("input1").toString());
//        int num2=Integer.parseInt(getIntent().getExtras().get("input1").toString());
//        output1.setText(num1);
//        output1.setText(num2);
//        Total.setText(num1+num2);
//        Bundle bundle=intent.getExtras();
//        int num1=bundle.getInt("input1");
//        int num2=bundle.getInt("input2");
        //int num1=output1.setText(getIntent().getExtras("input1"));

