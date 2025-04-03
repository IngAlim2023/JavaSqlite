package com.jorge_porras.temporal.controller;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.jorge_porras.temporal.R;
import com.jorge_porras.temporal.adapters.ListaCiudadesAdapter;
import com.jorge_porras.temporal.models.Ciudades;
import com.jorge_porras.temporal.models.ManagerDb;

import java.util.ArrayList;
import java.util.List;

public class CiudadesDatos extends AppCompatActivity {
    RecyclerView listaCiudadesRe;
    ArrayList<Ciudades> listaArrayCiudades;
    ArrayAdapter<Ciudades> nAdapter;
    ManagerDb managerDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ciudades_datos);

        listaCiudadesRe = findViewById(R.id.listaCiudadesRecycle);
        listaCiudadesRe.setLayoutManager(new LinearLayoutManager(CiudadesDatos.this));
        managerDb = new ManagerDb(CiudadesDatos.this);
        listaArrayCiudades = new ArrayList<>();

        ListaCiudadesAdapter adapter = new ListaCiudadesAdapter(managerDb.verCiudades());
        listaCiudadesRe.setAdapter(adapter);


    }
}