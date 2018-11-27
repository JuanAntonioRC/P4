package com.studium.es.practica4pmdm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity_Primos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__primos);

        Button buttonCalcular = findViewById(R.id.buttonCalcular);
        final TextView inputNumero = findViewById(R.id.inputPrimo);
        final TextView textViewResultado = findViewById(R.id.textViewResultado);

        buttonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (inputNumero.getText().toString().isEmpty()){


                }

                else {
                    inputNumero.getText().toString();
                    int inputConvertido = Integer.parseInt(inputNumero.getText().toString());
                    if (isPrime(inputConvertido) == true){

                        textViewResultado.setText(getResources().getString(R.string.textViewPrimosResultado) + " " + getResources().getString(R.string.textViewPrimosResultadoPositivo));

                    }

                    else{
                        textViewResultado.setText(getResources().getString(R.string.textViewPrimosResultado) + " " + getResources().getString(R.string.textViewPrimosResultadoNegativo));
                    }


                }

            }
        });
    }

    boolean isPrime(int n) {
        for(int i=2;i<n;i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }
}
