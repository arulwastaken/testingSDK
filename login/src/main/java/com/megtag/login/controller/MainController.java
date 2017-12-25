package com.megtag.login.controller;

import android.content.Context;
import android.content.Intent;

import com.megtag.login.activity.LoginActivity;

public class MainController {
Context con;
public static void getLogin(Context context){
    try {
        Intent i = new Intent(context, LoginActivity.class);
        context.startActivity(i);
    }
    catch (Exception e){
        e.printStackTrace();
    }
}
}

