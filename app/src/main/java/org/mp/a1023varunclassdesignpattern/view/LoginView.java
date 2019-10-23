package org.mp.a1023varunclassdesignpattern.view;

public interface LoginView {

    void setUserError();    //
    void setPwdError();     //
    void redirect();        //if successfully
    void showMessage(String message);

}
