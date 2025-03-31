package com.jorge_porras.temporal.controller;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.jorge_porras.temporal.R;
import com.jorge_porras.temporal.models.Ciudades;
import com.jorge_porras.temporal.models.ManagerDb;

public class CiudadVista extends AppCompatActivity {
    SQLiteDatabase db;

    //Agregar:
    EditText  txtNomCiudad;
    Button addCiu, irDatos;
    ManagerDb managerDb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ciudad_vista);
        //Botones
        addCiu = findViewById(R.id.addCiudad);
        irDatos = findViewById(R.id.irDatos);

        //TextInputs
        txtNomCiudad = findViewById(R.id.textNombreCiudad);

        //Base datos conexión
        managerDb = new ManagerDb(CiudadVista.this);
        addCiu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ciudades nciudad = new Ciudades(txtNomCiudad.getText().toString());
                long result = managerDb.insertData(nciudad);

                if(result>0){
                    Toast.makeText(CiudadVista.this, "Datos insertados" + result, Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(CiudadVista.this, "Datos no insertados" + result, Toast.LENGTH_SHORT).show();

                }
            }
        });
        irDatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irDatos = new Intent(CiudadVista.this, CiudadesDatos.class);
                startActivity(irDatos);
            }
        });
    }
}