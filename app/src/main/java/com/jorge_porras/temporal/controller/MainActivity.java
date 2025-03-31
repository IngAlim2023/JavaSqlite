package com.jorge_porras.temporal.controller;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import com.jorge_porras.temporal.R;

public class MainActivity extends AppCompatActivity {
    Button btnCiudadM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Intents
        btnCiudadM = findViewById(R.id.btnCiudad);

        btnCiudadM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irCiudad = new Intent(MainActivity.this, CiudadVista.class);
                startActivity(irCiudad);
            }
        });
    }
}