package com.studium.es.practica4pmdm;

import android.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityFlores extends AppCompatActivity {


    Button flor_1;
    Button flor_2;
    Button flor_3;
    Button flor_4;
    Flor_1 Frag1;
    Flor_2 Frag2;
    Flor_3 Frag3;
    Flor_4 Frag4;
    FragmentTransaction fragmentTransaction;

    TextView flor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flores);

        flor = findViewById(R.id.textViewFlor);

        Frag1= new Flor_1();
        Frag2= new Flor_2();
        Frag3= new Flor_3();
        Frag4= new Flor_4();

        fragmentTransaction =  getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.fragmentFlor  , Frag1).commit();
        flor.setText("Flor cosmos");

        flor_1 = findViewById(R.id.flor_1);
        flor_2 = findViewById(R.id.flor_2);
        flor_3 = findViewById(R.id.flor_3);
        flor_4 = findViewById(R.id.flor_4);



        flor_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


               fragmentTransaction = getSupportFragmentManager().beginTransaction();
               fragmentTransaction.replace(R.id.fragmentFlor, Frag1).commit();
               flor.setText("Flor cosmos");

            }
        });

        flor_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragmentFlor, Frag2).commit();
                flor.setText("Jazmín");
            }
        });

        flor_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragmentFlor, Frag3).commit();
                flor.setText("Orquídeas");
            }
        });

        flor_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragmentFlor, Frag4).commit();
                flor.setText("Rosas");

            }
        });


    }


}
