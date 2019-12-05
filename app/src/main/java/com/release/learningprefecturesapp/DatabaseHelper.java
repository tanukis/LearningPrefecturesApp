package com.release.learningprefecturesapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "prefecturesmemo.db";

    private static final int DATABASE_VERSION = 1;

    public DatabaseHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db){

        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TABLE prefecturesmemo (");
        sb.append("pft TEXT,");
        sb.append("pfto TEXT,");
        sb.append("photo INTEGER");
        sb.append(");");
        String sql = sb.toString();

        db.execSQL(sql);

        sb = new StringBuilder();
        sb.append("CREATE TABLE pftsresultmemo (");
        sb.append("_id INTEGER PRIMARY KEY,");
        sb.append("pft TEXT,");
        sb.append("pfto TEXT,");
        sb.append("photo INTEGER,");
        sb.append("isCorrect INTEGER,");
        sb.append("pftWrong TEXT,");
        sb.append("pftoWrong TEXT");
        sb.append(");");
        sql = sb.toString();

        db.execSQL(sql);

        sb = new StringBuilder();
        sb.append("CREATE TABLE countermemo (");
        sb.append("_id INTEGER PRIMARY KEY,");
        sb.append("counter INTEGER,");
        sb.append("correctCounter INTEGER");
        sb.append(");");
        sql = sb.toString();

        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

    }

}
