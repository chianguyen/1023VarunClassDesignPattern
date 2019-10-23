package org.mp.a1023varunclassdesignpattern.app;

import android.app.Application;
import android.content.Context;

//to extend the application
//gives the context of the activity
public class MyApplication extends Application {

    private static MyApplication mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
    }

    public static synchronized MyApplication getInstance(){
        return mInstance;
    }

    public static Context getAppContext(){
        Context applicationContext = mInstance.getApplicationContext();
        return applicationContext;
    }

}
