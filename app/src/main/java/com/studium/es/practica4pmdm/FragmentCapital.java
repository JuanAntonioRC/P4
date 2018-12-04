package com.studium.es.practica4pmdm;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class FragmentCapital extends Fragment {

    View myView;
    RadioButton cap1;
    RadioButton cap2;
    RadioButton cap3;
    RadioButton cap4;
    RadioButton cap5;
    RadioButton cap6;
    RadioButton cap7;
    RadioButton cap8;
    RadioButton cap9;
    RadioButton cap10;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        myView = inflater.inflate(R.layout.fragment_fragment_capital, container, false);

        cap1 = myView.findViewById(R.id.radioCapital1);
        cap2 = myView.findViewById(R.id.radioCapital2);
        cap3 = myView.findViewById(R.id.radioCapital3);
        cap4 = myView.findViewById(R.id.radioCapital4);
        cap5 = myView.findViewById(R.id.radioCapital5);
        cap6 = myView.findViewById(R.id.radioCapital6);
        cap7 = myView.findViewById(R.id.radioCapital7);
        cap8 = myView.findViewById(R.id.radioCapital8);
        cap9 = myView.findViewById(R.id.radioCapital9);
        cap10 = myView.findViewById(R.id.radioCapital10);

        RadioGroup RadioGroup = (android.widget.RadioGroup) myView.findViewById(R.id.radioGroupCapital);

        RadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(android.widget.RadioGroup group, int checkedId) {

                if (cap1.isChecked()){

                    ((activity_Pais) getActivity()).setCapitalPulsada(getResources().getString(R.string.capital1));
                }

                if (cap2.isChecked()){

                    ((activity_Pais) getActivity()).setCapitalPulsada(getResources().getString(R.string.capital2));
                }
                if (cap3.isChecked()){

                    ((activity_Pais) getActivity()).setCapitalPulsada(getResources().getString(R.string.capital3));
                }
                if (cap4.isChecked()){

                    ((activity_Pais) getActivity()).setCapitalPulsada(getResources().getString(R.string.capital4));
                }
                if (cap5.isChecked()){

                    ((activity_Pais) getActivity()).setCapitalPulsada(getResources().getString(R.string.capital5));
                }
                if (cap6.isChecked()){

                    ((activity_Pais) getActivity()).setCapitalPulsada(getResources().getString(R.string.capital6));
                }
                if (cap7.isChecked()){

                    ((activity_Pais) getActivity()).setCapitalPulsada(getResources().getString(R.string.capital7));
                }
                if (cap8.isChecked()){

                    ((activity_Pais) getActivity()).setCapitalPulsada(getResources().getString(R.string.capital8));
                }
                if (cap9.isChecked()){

                    ((activity_Pais) getActivity()).setCapitalPulsada(getResources().getString(R.string.capital9));
                }
                if (cap10.isChecked()){

                    ((activity_Pais) getActivity()).setCapitalPulsada(getResources().getString(R.string.capital10));
                }


            }
        });

        return myView;
    }
}
