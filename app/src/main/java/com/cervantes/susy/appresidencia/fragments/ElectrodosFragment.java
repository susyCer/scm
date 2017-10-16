package com.cervantes.susy.appresidencia.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cervantes.susy.appresidencia.R;


public class ElectrodosFragment extends Fragment {


    public ElectrodosFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_telemetria, container, false);
    }



}
