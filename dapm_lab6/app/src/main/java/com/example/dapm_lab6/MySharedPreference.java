package com.example.dapm_lab6;

import android.content.Context;
import android.content.SharedPreferences;

public class MySharedPreference {
    SharedPreferences settings;
    SharedPreferences.Editor editor;

    public MySharedPreference (Context context) {
        //TODO
        settings = context.getSharedPreferences("MyPref", 0);
        editor = settings.edit();

    }

    public void save(String text){
        //TODO
        editor.putString("key_name", text);
        editor.commit();
    }

    public String getValue(){
        //TODO
        return settings.getString("key_name",null);
    }

    public void clearSharedPreferences(){
        //TODO
        editor.clear();
        editor.commit();
    }
}