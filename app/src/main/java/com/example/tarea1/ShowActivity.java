package com.example.tarea1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {

    private Integer r1;
    private String op, n1,n2;

    private TextView txtNum1, txtNum2, oper, txtTotal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        Bundle datos=this.getIntent().getExtras();

        txtNum1 = (TextView) findViewById(R.id.txtNum1);
        txtNum2 = (TextView) findViewById(R.id.txtNum2);
        txtTotal = (TextView) findViewById(R.id.txtTotal);
        oper = (TextView) findViewById(R.id.txtOperacion);


        n1=datos.getString("num1");
        n2=datos.getString("num2");
        op=datos.getString("operation");



        txtNum1.setText(n1);
        txtNum2.setText(n2);

        switch (op){
            case "Suma":{
                r1=Integer.parseInt(n1)+Integer.parseInt(n2);
                break;
            }
            case "Resta":{
                r1=Integer.parseInt(n1)-Integer.parseInt(n2);
                break;
            }
            case "Multiplicacion":{
                r1=Integer.parseInt(n1)*Integer.parseInt(n2);
                break;
            }
            case "Division":{
                r1=Integer.parseInt(n1)/Integer.parseInt(n2);
                break;
            }
        }

        txtTotal.setText(""+r1);
        oper.setText("Operacion: "+op);






    }
}