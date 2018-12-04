package com.studium.es.practica4pmdm;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class activity_Pais extends AppCompatActivity {

    String capitalPulsada;
    String paisPulsado;
    Button comparar;
    TextView resultado;

    public String getCapitalPulsada() {
        return capitalPulsada;
    }

    public void setCapitalPulsada(String capitalPulsada) {
        this.capitalPulsada = capitalPulsada;
    }

    public String getPaisPulsado() {
        return paisPulsado;
    }

    public void setPaisPulsado(String paisPulsado) {
        this.paisPulsado = paisPulsado;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__pais);

        comparar = findViewById(R.id.buttonComparar);
        resultado = findViewById(R.id.textResultadoComparacion);

        comparar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (capitalPulsada.equals(getResources().getString(R.string.capital1)) && paisPulsado.equals(getResources().getString(R.string.pais1))){

                    resultado.setText(getResources().getString(R.string.resultadoPositivo));

                } else {

                    resultado.setText(getResources().getString(R.string.resultadoNegativo));

                }

                if (capitalPulsada.equals(getResources().getString(R.string.capital2)) && paisPulsado.equals(getResources().getString(R.string.pais2))){

                    resultado.setText(getResources().getString(R.string.resultadoPositivo));

                } else {

                    resultado.setText(getResources().getString(R.string.resultadoNegativo));

                }

                if (capitalPulsada.equals(getResources().getString(R.string.capital3)) && paisPulsado.equals(getResources().getString(R.string.pais3))){

                    resultado.setText(getResources().getString(R.string.resultadoPositivo));

                } else {

                    resultado.setText(getResources().getString(R.string.resultadoNegativo));

                }

                if (capitalPulsada.equals(getResources().getString(R.string.capital4)) && paisPulsado.equals(getResources().getString(R.string.pais4))){

                    resultado.setText(getResources().getString(R.string.resultadoPositivo));

                } else {

                    resultado.setText(getResources().getString(R.string.resultadoNegativo));

                }

                if (capitalPulsada.equals(getResources().getString(R.string.capital5)) && paisPulsado.equals(getResources().getString(R.string.pais5))){

                    resultado.setText(getResources().getString(R.string.resultadoPositivo));

                } else {

                    resultado.setText(getResources().getString(R.string.resultadoNegativo));

                }

                if (capitalPulsada.equals(getResources().getString(R.string.capital6)) && paisPulsado.equals(getResources().getString(R.string.pais6))){

                    resultado.setText(getResources().getString(R.string.resultadoPositivo));

                } else {

                    resultado.setText(getResources().getString(R.string.resultadoNegativo));

                }

                if (capitalPulsada.equals(getResources().getString(R.string.capital7)) && paisPulsado.equals(getResources().getString(R.string.pais7))){

                    resultado.setText(getResources().getString(R.string.resultadoPositivo));

                } else {

                    resultado.setText(getResources().getString(R.string.resultadoNegativo));

                }

                if (capitalPulsada.equals(getResources().getString(R.string.capital8)) && paisPulsado.equals(getResources().getString(R.string.pais8))){

                    resultado.setText(getResources().getString(R.string.resultadoPositivo));

                } else {

                    resultado.setText(getResources().getString(R.string.resultadoNegativo));

                }

                if (capitalPulsada.equals(getResources().getString(R.string.capital9)) && paisPulsado.equals(getResources().getString(R.string.pais9))){

                    resultado.setText(getResources().getString(R.string.resultadoPositivo));

                } else {

                    resultado.setText(getResources().getString(R.string.resultadoNegativo));

                }

                if (capitalPulsada.equals(getResources().getString(R.string.capital1)) && paisPulsado.equals(getResources().getString(R.string.pais10))){

                    resultado.setText(getResources().getString(R.string.resultadoPositivo));

                } else {

                    resultado.setText(getResources().getString(R.string.resultadoNegativo));

                }


            }
        });

    }
}
