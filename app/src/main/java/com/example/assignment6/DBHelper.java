package com.example.assignment6;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

//tehty pohjaa DBHelper luokalla
public class DBHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "db";
    private static final int DATABASE_VERSION = 1;
    // Table Name
    private static final String TABLE_PERSONS = "persons";
    // Person Table Columns
    private static final String KEY_PERSON_NAME = "nimi";
    private static final String KEY_PERSON_DATE = "pvm";
    // constructor
    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }
    // creating table
    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "";

        sql += "CREATE TABLE " + TABLE_PERSONS;
        sql += " ( ";
        sql += KEY_PERSON_NAME + " TEXT, ";
        sql += KEY_PERSON_DATE + " TEXT, ";
        sql += " ) ";

        db.execSQL(sql);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (oldVersion != newVersion) {
            db.execSQL("DROP TABLE IF EXISTS " + TABLE_PERSONS);
            onCreate(db);
        }
    }
    public boolean insertData(String nimi, String pvm){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(KEY_PERSON_NAME, nimi);
        contentValues.put(KEY_PERSON_DATE, pvm);
        long result = db.insert(DATABASE_NAME,null,contentValues);
        return (result != -1);
    }
}



