package com.jorge_porras.temporal.models;

public class Datos {
    public  int cod;
    public String nombre;
    public String apellido;
    public String direccion;
    public  int ciudad_cod;

    public Datos(String nombre, String apellido, String direccion, int ciudad_cod) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.ciudad_cod = ciudad_cod;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCiudad_cod() {
        return ciudad_cod;
    }

    public void setCiudad_cod(int ciudad_cod) {
        this.ciudad_cod = ciudad_cod;
    }
}
