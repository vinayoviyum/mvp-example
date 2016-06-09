package com.danaraddi.mvpexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements LoginView,View.OnClickListener {

    private LoginPresenter loginPresenter;
    private   EditText username_et,password_et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         username_et = (EditText)findViewById(R.id.et_username);
         password_et = (EditText)findViewById(R.id.et_password);
        Button loginBtn = (Button)findViewById(R.id.btn_signin);

        loginBtn.setOnClickListener(this);


        loginPresenter = new LoginPresenterIMPL(this);

    }

    @Override
    public void showLoginValidationError() {
        Toast.makeText(getApplicationContext(),"Error",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginSuccess() {
        Toast.makeText(getApplicationContext(),"Success",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginFailure() {
        Toast.makeText(getApplicationContext(),"Failure",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        loginPresenter.login(username_et.getText().toString(),password_et.getText().toString());
    }
}
