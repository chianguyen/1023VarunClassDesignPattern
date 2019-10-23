package org.mp.a1023varunclassdesignpattern.model;

import org.mp.a1023varunclassdesignpattern.presenter.RegisterPresentor;
import org.mp.a1023varunclassdesignpattern.view.RegisterView;

public class RegisterPresentorImplementation implements RegisterPresentor {

    private RegisterView registerView;

    //Constructor
    public RegisterPresentorImplementation(RegisterView registerView){
        this.registerView = registerView;
    }

    @Override
    public void register(String username, String password) {
        // add user info in shared preferences
        MySPreferences.registerUser(username, password);
    }

    @Override
    public void onSuccess() {

    }

    @Override
    public void onFailure() {

    }
}
