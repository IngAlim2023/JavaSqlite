package com.jorge_porras.temporal.models;

import android.content.Intent;

public class Ciudades {
    public int cod;
    public String nombre;

    public Ciudades(String nombre) {
        this.nombre = nombre;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
