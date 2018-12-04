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


public class FragmentPais extends Fragment {

    View myView;

    RadioButton pais1;
    RadioButton pais2;
    RadioButton pais3;
    RadioButton pais4;
    RadioButton pais5;
    RadioButton pais6;
    RadioButton pais7;
    RadioButton pais8;
    RadioButton pais9;
    RadioButton pais10;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        myView =  inflater.inflate(R.layout.fragment_fragment_pais, container, false);

        pais1 = myView.findViewById(R.id.radioPais1);
        pais2 = myView.findViewById(R.id.radioPais2);
        pais3 = myView.findViewById(R.id.radioPais3);
        pais4 = myView.findViewById(R.id.radioPais4);
        pais5 = myView.findViewById(R.id.radioPais5);
        pais6 = myView.findViewById(R.id.radioPais6);
        pais7 = myView.findViewById(R.id.radioPais7);
        pais8 = myView.findViewById(R.id.radioPais8);
        pais9 = myView.findViewById(R.id.radioPais9);
        pais10 = myView.findViewById(R.id.radioPais10);


        RadioGroup RadioGroup = (android.widget.RadioGroup) myView.findViewById(R.id.radioGroupPais);

        RadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(android.widget.RadioGroup group, int checkedId) {

                if (pais1.isChecked()){

                    ((activity_Pais) getActivity()).setPaisPulsado(getResources().getString(R.string.pais1));
                }

                if (pais2.isChecked()){

                    ((activity_Pais) getActivity()).setPaisPulsado(getResources().getString(R.string.pais2));
                }
                if (pais3.isChecked()){

                    ((activity_Pais) getActivity()).setPaisPulsado(getResources().getString(R.string.pais3));
                }
                if (pais4.isChecked()){

                    ((activity_Pais) getActivity()).setPaisPulsado(getResources().getString(R.string.pais4));
                }
                if (pais5.isChecked()){

                    ((activity_Pais) getActivity()).setPaisPulsado(getResources().getString(R.string.pais5));
                }
                if (pais6.isChecked()){

                    ((activity_Pais) getActivity()).setPaisPulsado(getResources().getString(R.string.pais6));
                }
                if (pais7.isChecked()){

                    ((activity_Pais) getActivity()).setPaisPulsado(getResources().getString(R.string.pais7));
                }
                if (pais8.isChecked()){

                    ((activity_Pais) getActivity()).setPaisPulsado(getResources().getString(R.string.pais8));
                }
                if (pais9.isChecked()){

                    ((activity_Pais) getActivity()).setPaisPulsado(getResources().getString(R.string.pais9));
                }
                if (pais10.isChecked()){

                    ((activity_Pais) getActivity()).setPaisPulsado(getResources().getString(R.string.pais10));
                }

            }
        });

        return myView;
    }

}
