package com.jorge_porras.temporal.models;

public class Constantes {
    public static String NAME_BD="pruebadb";
    public static int NAME_VERSION = 3;

    public static  String QUERYCIUDAD = "Create table Ciudad (cod integer primary key autoincrement, nombre text)";
    public static  String QUERYBARRIO = "Create table Barrio (cod integer primary key autoincrement, nombre text, ciudad_cod integer, foreign key(ciudad_cod) references Ciudad(cod))";
    public static String QUERYDATOS = "Create table Datos (cod integer primary key autoincrement, nombre text, apellido text, direccion text, ciudad_cod integer, foreign key(ciudad_cod) references Ciudad(cod))";
}
