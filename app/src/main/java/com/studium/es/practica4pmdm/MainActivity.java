package com.studium.es.practica4pmdm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonPrimos = findViewById(R.id.buttonPrimos);
        Button buttonPaises = findViewById(R.id.buttonBeer);
        Button buttonAnimales = findViewById(R.id.buttonAnimales);
        Button buttonFlores = findViewById(R.id.buttonFlores);

        buttonPrimos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, Activity_Primos.class);
                MainActivity.this.startActivity(myIntent);
            }
        });

        buttonPaises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, activity_Pais.class);
                MainActivity.this.startActivity(myIntent);

            }
        });

        buttonAnimales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, ActivityFlow.class);
                MainActivity.this.startActivity(myIntent);
            }
        });

        buttonFlores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, ActivityFlores.class);
                MainActivity.this.startActivity(myIntent);

            }
        });

    }
}
