package com.danaraddi.mvpexample;

/**
 * Created by vinaydanaraddi on 6/10/16.
 */
public interface LoginView {
    void showLoginValidationError();
    void loginSuccess();
    void loginFailure();
}
