package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    EditText first_name,last_name;
    Button add,sub,mul,div,mod,sq,cube;
    int ans=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        add=findViewById(R.id.add);
        sub=findViewById(R.id.sub);
        mul=findViewById(R.id.mul);
        div=findViewById(R.id.div);
        mod=findViewById(R.id.modul);
        sq=findViewById(R.id.square);
        cube=findViewById(R.id.cube);

        first_name=(EditText)findViewById(R.id.fn);
       last_name=(EditText) findViewById(R.id.sn);


        add.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                // num1 or num2 double type
                // get data which is in edittext, convert it to string
                // using parse Double convert it to Double type
                double d1 = Double.parseDouble(first_name.getText().toString());
                double d2 = Double.parseDouble(last_name.getText().toString());
                // add both number and store it to sum
                double sum = d1 + d2;

                Toast.makeText(getApplicationContext(), "Addition is " + sum,  Toast.LENGTH_SHORT).show();
            }

        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double d1 = Double.parseDouble(first_name.getText().toString());
                double d2 = Double.parseDouble(last_name.getText().toString());
                double sub = ( d1-d2);
                Toast.makeText(getApplicationContext(), "Subtraction is " + sub,  Toast.LENGTH_SHORT).show();
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double d1 = Double.parseDouble(first_name.getText().toString());
                double d2 = Double.parseDouble(last_name.getText().toString());
                double mul = d1*d2;
                Toast.makeText(getApplicationContext(), "Multiplication is " +mul, Toast.LENGTH_SHORT).show();
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double d1 = Double.parseDouble(first_name.getText().toString());
                double d2 = Double.parseDouble(last_name.getText().toString());
                double div = (d1/d2);
                Toast.makeText(getApplicationContext(), "Division is " +div, Toast.LENGTH_SHORT).show();

            }
        });

        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double d1 = Double.parseDouble(first_name.getText().toString());
                double d2 = Double.parseDouble(last_name.getText().toString());
                double mod = (d1%d2);
                Toast.makeText(getApplicationContext(), "Modular is " +mod, Toast.LENGTH_SHORT).show();

            }
        });

        sq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double d1 = Double.parseDouble(first_name.getText().toString());
                double d2 = Double.parseDouble(last_name.getText().toString());
                double sq = (d1*d1);
                double sq1 = (d2*d2);
                Toast.makeText(getApplicationContext(), "first number square root is " +sq, Toast.LENGTH_SHORT).show();

                Toast.makeText(getApplicationContext(), "Second number square root is " +sq1, Toast.LENGTH_SHORT).show();

            }
        });

        cube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double d1 = Double.parseDouble(first_name.getText().toString());
                double d2 = Double.parseDouble(last_name.getText().toString());
                double cu = (d1*d1*d1);
                double cu1 = (d2*d2*d2);
                Toast.makeText(getApplicationContext(), "first number square root is " +cu, Toast.LENGTH_SHORT).show();

                Toast.makeText(getApplicationContext(), "Second number square root is " +cu1, Toast.LENGTH_SHORT).show();


            }
        });
    }

}