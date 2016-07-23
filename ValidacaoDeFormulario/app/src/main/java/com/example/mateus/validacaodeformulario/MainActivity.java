package com.example.mateus.validacaodeformulario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText nome, CPF0, idade1;
    EditText email=(EditText) findViewById(R.id.edt_email);
    Button ok;
    // CheckBox generoMasc = (CheckBox) findViewById(R.id.genero_masc);
  //  CheckBox generoFem = (CheckBox) findViewById(R.id.genero_fem);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome= (EditText) findViewById(R.id.edt_nome);
        CPF0 = (EditText) findViewById(R.id.edt_Cpf);
        idade1 = (EditText) findViewById(R.id.edt_idade);
        ok = (Button) findViewById(R.id.bt_Ok);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
        //validar nome
                if(nome.getText().length() == 0){

                    nome.setError("Campo vazio");

                }else if (nome.getText().length() < 5){

                    nome.setError("Minimo 5 letras");

                }
        //validar idade
                String idade = idade1.getText().toString();
                int idade2 = Integer.parseInt(idade);
                if((idade2 <= 0)||(idade1.getText().length() == 0)||(idade2 < 18)) {
                    Toast.makeText(getApplicationContext(), "Idade não aceita", Toast.LENGTH_SHORT).show();

                    }
                }
        //validar genero
              //  if ((generoMasc.isChecked())&& (generoFem.isChecked())) {
             //      generoMasc.getError();
            //    }

         //validar CPF
                ValidarCpf testeCpf = new ValidarCpf();
                String CPF = CPF0.getText().toString();

                boolean cpfValidado = testeCpf.ValidadorCPF(CPF);


             /*   if (cpfValidado != true){
                    Toast.makeText(getApplicationContext(), "CPF INVALIDO", Toast.LENGTH_SHORT).show();
                }*/
        //validar email

            //WTF




        });




    }
}
