package com.example.bmicalc;

import androidx.appcompat.app.AppCompatActivity;
import  java.lang.Math;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.etHeight);
        et2=findViewById(R.id.etWeight);
        b1=findViewById(R.id.btnCovert);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double bmi;
                double height,weight;
                String msg;
                height=Double.parseDouble(et1.getText().toString());
                weight=Double.parseDouble(et2.getText().toString());
                bmi=Math.round(weight/(height*height*1.0));
                if(bmi<=18.5){
                    msg="Your BMI is: " + String.valueOf(bmi)+" which means your underweight";
                    Toast.makeText(getApplicationContext(),msg.toUpperCase(),Toast.LENGTH_LONG).show();
                }
                else if(bmi>18.5 && bmi<25){
                    msg="Your BMI is: " + String.valueOf(bmi)+" which means your normal";
                    Toast.makeText(getApplicationContext(),msg.toUpperCase(),Toast.LENGTH_LONG).show();
                }
                else if(bmi>25 && bmi<30){
                    msg="Your BMI is: " + String.valueOf(bmi)+" which means your overweight";
                    Toast.makeText(getApplicationContext(),msg.toUpperCase(),Toast.LENGTH_LONG).show();
                }
                else if(bmi>30){
                    msg="Your BMI is: " + String.valueOf(bmi)+" which means your obese";
                    Toast.makeText(getApplicationContext(),msg.toUpperCase(),Toast.LENGTH_LONG).show();
                }
                else{
                    msg="Wrong Input";
                    Toast.makeText(getApplicationContext(),msg.toUpperCase(),Toast.LENGTH_LONG).show();

                }
            }
        });
    }
}