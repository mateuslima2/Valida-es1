package com.example.mateus.calculadora2;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText n1;
    EditText n2;
    int result;
    Button somar;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = (EditText) findViewById(R.id.n1);
        n2 = (EditText) findViewById(R.id.n2);
        somar = (Button) findViewById(R.id.btSomar);
        resultado = (TextView) findViewById(R.id.textViewResultado);

        somar.setOnClickListener(this);
    }

    public void onClick(View v){
        int Num1 = Integer.parseInt(n1.getText().toString());
        int Num2=Integer.parseInt(n2.getText().toString());
        result = (Num1 + Num2);

        resultado.setText(Num1 + " + "  + Num2 + " = " + result);

    }
}
