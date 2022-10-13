package com.example.evaluaciont3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String espacio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText ingreso = findViewById(R.id.ingreso1);
        EditText ingreso2 = findViewById(R.id.ingreso2);

        Button igual = findViewById(R.id.igual);

        TextView rpt = findViewById(R.id.rpt);
        TextView opr = findViewById(R.id.opr);

        Button sum = findViewById(R.id.sum);
        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a=Integer.parseInt(ingreso.getText().toString());
                double b=Integer.parseInt(ingreso2.getText().toString());
                String rt = String.valueOf(a+b);
                espacio = rt;
                opr.setText("SUMA");
            }
        });

        Button rest = findViewById(R.id.rest);
        rest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a=Integer.parseInt(ingreso.getText().toString());
                double b=Integer.parseInt(ingreso2.getText().toString());
                String rt = String.valueOf(a-b);
                espacio = rt;
                opr.setText("RESTA");
            }
        });

        Button div = findViewById(R.id.div);
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a=Integer.parseInt(ingreso.getText().toString());
                double b=Integer.parseInt(ingreso2.getText().toString());
                String rt = String.valueOf(a/b);
                espacio = rt;
                opr.setText("DIVISIÓN");
            }
        });

        Button mult = findViewById(R.id.mult);
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a=Integer.parseInt(ingreso.getText().toString());
                double b=Integer.parseInt(ingreso2.getText().toString());
                String rt = String.valueOf(a*b);
                espacio = rt;
                opr.setText("MULTIPLICACIÓN");
            }
        });

        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rpt.setText(espacio);
            }
        });

    }
}