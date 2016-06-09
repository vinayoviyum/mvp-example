package com.danaraddi.mvpexample;

import android.support.v7.widget.PopupMenu;
import android.text.TextUtils;

/**
 * Created by vinaydanaraddi on 6/10/16.
 */
public class LoginPresenterIMPL implements LoginPresenter {
    private LoginView loginView;

    public LoginPresenterIMPL(LoginView loginView){
        this.loginView = loginView;

    }

    @Override
    public void login(String username, String password) {

        if(username.isEmpty() || username.isEmpty()) {
            loginView.showLoginValidationError();
        }else if(username.equals("abc") && password.equals("xyz")){
            loginView.loginSuccess();
        }else {
            loginView.loginFailure();
        }

    }
}
