package org.mp.a1023varunclassdesignpattern.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.mp.a1023varunclassdesignpattern.R;
import org.mp.a1023varunclassdesignpattern.model.RegisterPresentorImplementation;
import org.mp.a1023varunclassdesignpattern.presenter.RegisterPresentor;
import org.mp.a1023varunclassdesignpattern.view.RegisterView;

public class RegisterActivity extends AppCompatActivity implements RegisterView {

    private RegisterPresentor registerPresentor;
    Button regBtn;
    EditText regEmail, regPwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        registerPresentor = new RegisterPresentorImplementation(this);

        init();

    }

    private void init() {
        regEmail = findViewById(R.id.edit_reg_email);
        regPwd = findViewById(R.id.edit_reg_password);
        regBtn = findViewById(R.id.btn_reg);

        regBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerPresentor.register(regEmail.getText().toString(), regEmail.getText().toString());

                Intent i = new Intent(RegisterActivity.this, LoginActivity.class);
                RegisterActivity.this.startActivity(i);
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

    }
}
