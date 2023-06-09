package com.example.tarea1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnSuma, btnResta, btnMulti, btnDivi;
    TextView txtNum1, txtNum2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSuma=(Button) findViewById(R.id.btnSuma);
        btnResta=(Button) findViewById(R.id.btnResta);
        btnMulti=(Button) findViewById(R.id.btnMultiplicacion);
        btnDivi=(Button) findViewById(R.id.btnDivision);

        txtNum1=(TextView) findViewById(R.id.editTextNumber);
        txtNum2=(TextView) findViewById(R.id.editTextNumber2);


        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ShowActivity.class);
                intent.putExtra("num1",txtNum1.getText().toString());
                intent.putExtra("num2",txtNum2.getText().toString());
                intent.putExtra("operation", "Suma");

                startActivity(intent);
            }
        });

        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ShowActivity.class);
                intent.putExtra("num1",txtNum1.getText().toString());
                intent.putExtra("num2",txtNum2.getText().toString());
                intent.putExtra("operation", "Resta");

                startActivity(intent);
            }
        });

        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ShowActivity.class);
                intent.putExtra("num1",txtNum1.getText().toString());
                intent.putExtra("num2",txtNum2.getText().toString());
                intent.putExtra("operation", "Multiplicacion");

                startActivity(intent);
            }
        });

        btnDivi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ShowActivity.class);
                intent.putExtra("num1",txtNum1.getText().toString());
                intent.putExtra("num2",txtNum2.getText().toString());
                intent.putExtra("operation", "Division");

                startActivity(intent);
            }
        });
    }
}