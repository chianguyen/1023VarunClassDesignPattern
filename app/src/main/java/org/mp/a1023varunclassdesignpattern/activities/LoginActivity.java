package org.mp.a1023varunclassdesignpattern.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.mp.a1023varunclassdesignpattern.R;
import org.mp.a1023varunclassdesignpattern.model.LoginPresentorImplementation;
import org.mp.a1023varunclassdesignpattern.presenter.LoginPresentor;
import org.mp.a1023varunclassdesignpattern.view.LoginView;

public class LoginActivity extends AppCompatActivity implements LoginView {

    private LoginPresentor loginPresentor;
    Button buttoon, btn2Reg;
    EditText editEmail, editPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Implement the interface
        loginPresentor = new LoginPresentorImplementation(this);

        init();
    }

    public void init(){
        editEmail = findViewById(R.id.edit_login_email);
        editPassword = findViewById(R.id.edit_login_password);
        buttoon = findViewById(R.id.btn_login);
        btn2Reg = findViewById(R.id.btn_moveTo_reg);

        SharedPreferences sp = getApplicationContext().getSharedPreferences("chamber", 0);
        String corrEmail = sp.getString("1_email", "");
        String corrPwd = sp.getString("1_pwd", " ");

        buttoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginPresentor.login(editEmail.getText().toString(), editPassword.getText().toString());
            }
        });

        btn2Reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, RegisterActivity.class);
                LoginActivity.this.startActivity(i);
            }
        });

    }

    @Override
    public void setUserError() {

    }

    @Override
    public void setPwdError() {

    }

    @Override
    public void redirect() {
    }

    @Override
    public void showMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

}
