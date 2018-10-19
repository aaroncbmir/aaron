package com.example.oscarblanq.appiot;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 Este archivo permite crear un fragment que contiene una ventana con las opciones
 de preferencias definidas en un recurso XML, en este caso "preferencias.xml"
 */
public class PreferenciasFragment extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferencias);
    }
}