package com.example.dzier.kurs14pracamojakoncowa;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ConfigurationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by dzier on 01.10.2016.
 */

public class Database extends SQLiteOpenHelper {

    public Database(Context context){
        super(context, "MyBook.db" ,null,1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE  user(id integer primary key autoincrement, name text, password text, telephone Integer, rentedBooks text);");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
/*
    public void addUser(User user){
        SQLiteDatabase database = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("name", user.getName());
        values.put("password", user.getPassword());
        values.put("telephone", user.getTelephone());
        values.put("isRented", user.getIsRented());
    }
*/
    public void addUser(String name, String password){
        SQLiteDatabase database = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("name", name);
        values.put("password", password);
database.insertOrThrow("user",null,values);
    }

    public Cursor showUsers(){
        String[] columns={"id","name","password"};
        SQLiteDatabase database = getReadableDatabase();

        Cursor kursor = database.query("user", columns, null,null,null,null,null,null);

        return kursor;
    }

}
