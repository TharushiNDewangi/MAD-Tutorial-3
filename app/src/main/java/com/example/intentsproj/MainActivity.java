package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //OnclickButtonListner();

        button = (Button) findViewById(R.id.OK);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CreateButtonListner();
            }
        });

    }

    private void CreateButtonListner() {
        num1 = (EditText) findViewById(R.id.userin1);
        num2 = (EditText) findViewById(R.id.userin2);

        //assign to string
        String number1 = num1.getText().toString();
        String number2 = num2.getText().toString();

        //Toast part
        Toast.makeText(getApplicationContext(), "wellcome you", Toast.LENGTH_SHORT).show();

        //call second activity
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        //
        intent.putExtra("input1", number1);
        intent.putExtra("input2", number2);
        startActivity(intent);

    }
}

       // button.setOnClickListener(new View.OnClickListener()
                                 // {
                                      //@Override
                                     // public void onClick(View view)
                                     // {

                                          //Toast part
                                          //Creating the Toast object
//                                          Toast toast ;
//                                          //The context to use. Usually your Application or Activity object
//                                          Context context = getApplicationContext();
//                                          //Display string
//                                          CharSequence text="You just clicked the OK button ";
//                                          //How long the toast message will lasts
//                                          int duration = Toast.LENGTH_LONG;
//                                          toast=Toast.makeText(context,text,duration);
//                                          toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
//                                          toast.show();
//                                          //end toste part
//
//
//                                          //Intent intent = new Intent(".SecondActivity");
//
//                                          Intent intent = new Intent(MainActivity.this,SecondActivity.class);
//                                          intent.putExtra("input1",number1);
//                                          intent.putExtra("input2",number2);
//                                          startActivity(intent);
//                                     // }
//                                  //}
//       // );
//    }
//
//
////    public void OnclickButtonListner()//any name api kmti api hadana ekakne
////    {
////
////
////    }
