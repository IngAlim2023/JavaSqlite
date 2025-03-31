package com.jorge_porras.temporal.models;

import android.content.ContentValues;
import android.content.Context;
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
    public long insertData( String nombre){
        openDbWrite();

        ContentValues valores = new ContentValues();

        valores.put("nombre", nombre);

        long result = db.insert("Ciudad", null, valores);
        return  result;
    }


}
