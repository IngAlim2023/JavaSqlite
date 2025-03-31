package com.jorge_porras.temporal.models;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class BdHelper extends SQLiteOpenHelper {


    public BdHelper(@Nullable Context context) {
        super(context, Constantes.NAME_BD, null, Constantes.NAME_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Constantes.QUERYCIUDAD);
        db.execSQL(Constantes.QUERYBARRIO);
        db.execSQL(Constantes.QUERYDATOS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS Ciudad");
        db.execSQL("DROP TABLE IF EXISTS Barrio");
        db.execSQL("DROP TABLE IF EXISTS Datos");
        onCreate(db);
    }
}
