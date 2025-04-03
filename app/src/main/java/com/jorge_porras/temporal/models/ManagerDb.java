package com.jorge_porras.temporal.models;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class ManagerDb {
    BdHelper bdHelper;

    SQLiteDatabase db;

    public ManagerDb(Context context){
        bdHelper = new BdHelper(context);
    }

    public  void  openDbWrite(){
        db = bdHelper.getWritableDatabase();
    }
    public  void openDbRd(){
        db = bdHelper.getReadableDatabase();
    }
    public long insertData(Ciudades ciudades){
        openDbWrite();

        ContentValues valores = new ContentValues();

        valores.put("nombre", ciudades.getNombre());

        long result = db.insert("Ciudad", null, valores);
        return  result;
    }

    public ArrayList <Ciudades> verCiudades() {
        openDbRd();
        ArrayList<Ciudades> listaCiudades = new ArrayList<>();
        Ciudades ciudad = null;
        Cursor cursorCiudades = null;
        cursorCiudades = db.rawQuery("SELECT * FROM Ciudad", null);

        if(cursorCiudades.moveToFirst()){
            do{
                ciudad = new Ciudades();
                ciudad.setCod(cursorCiudades.getInt(0));
                ciudad.setNombre(cursorCiudades.getString(1));
                listaCiudades.add(ciudad);
            } while (cursorCiudades.moveToNext());
        }
        cursorCiudades.close();
        return listaCiudades;
    }
    public long insertDatos(Datos dato){
        openDbWrite();

        ContentValues valores = new ContentValues();

        valores.put("nombre", dato.getNombre());
        valores.put("apellido", dato.getApellido());
        valores.put("direccion", dato.getApellido());
        valores.put("ciudad_cod", dato.getCiudad_cod());
        long result = db.insert("Datos", null, valores);
        return  result;
    }


}
