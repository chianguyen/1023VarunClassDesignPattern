package org.mp.a1023varunclassdesignpattern.model;

import android.content.SharedPreferences;
import org.mp.a1023varunclassdesignpattern.app.MyApplication;

public class MySPreferences {

    //method for
    public static void registerUser(String email, String pwd){

        SharedPreferences sp = MyApplication.getAppContext().getSharedPreferences("chamber", 0);
        SharedPreferences.Editor editor = sp.edit();

        editor.putString("1_email", email);
        editor.putString("1_pwd", pwd);

        editor.commit();
    }

    public static void loginUser(String email, String pwd){
        SharedPreferences sp = MyApplication.getAppContext().getSharedPreferences("chamber", 0);

    }

}
