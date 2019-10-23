package org.mp.a1023varunclassdesignpattern.presenter;

public interface RegisterPresentor {

    //register method
    void register(String username, String password);

    //handle success/failure
    void onSuccess();

    void onFailure();
}
