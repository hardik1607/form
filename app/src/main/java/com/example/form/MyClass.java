package com.example.form;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MyClass extends SQLiteOpenHelper {
    public MyClass(@Nullable Context context) {
        super(context, "register", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String q="create table student(id integer primary key,name text,contact text,email text,password text)";
        sqLiteDatabase.execSQL(q);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    void insertdata(String name,String contact,String email,String password)
    {
        String q="insert into student values (null,'"+name+"','"+contact+"','"+email+"','"+password+"')";
        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
        sqLiteDatabase.execSQL(q);
    }
}
