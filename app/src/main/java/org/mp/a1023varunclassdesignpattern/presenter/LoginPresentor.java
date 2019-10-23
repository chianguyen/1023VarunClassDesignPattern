package org.mp.a1023varunclassdesignpattern.presenter;

public interface LoginPresentor {

    //login method
    void login(String username, String password);

    //handle success/failure
    void onSuccess();

    void onFailure();

}
