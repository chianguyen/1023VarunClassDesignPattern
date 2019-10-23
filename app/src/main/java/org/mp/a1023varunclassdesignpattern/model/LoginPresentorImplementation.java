package org.mp.a1023varunclassdesignpattern.model;

import org.mp.a1023varunclassdesignpattern.presenter.LoginPresentor;
import org.mp.a1023varunclassdesignpattern.view.LoginView;

public class LoginPresentorImplementation implements LoginPresentor {

    //from View
    private LoginView loginView;

    //Constructor
    public LoginPresentorImplementation(LoginView loginView){
        this.loginView = loginView;
    }

    @Override
    public void login(String username, String password) {

        if(username.equals("admin") && password.equals("213")){
            loginView.showMessage("Login Success");
        }
        else{
            loginView.showMessage("Login Failed");
        }



    }

    @Override
    public void onSuccess() {

    }

    @Override
    public void onFailure() {

    }
}
