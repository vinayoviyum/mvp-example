package com.danaraddi.mvpexample;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void ThisLoginTestShouldPass() throws Exception {
        LoginPresenter loginPresenter = new LoginPresenterIMPL(new LoginView() {
            @Override
            public void showLoginValidationError() {
                System.out.print("error");
            }

            @Override
            public void loginSuccess() {
                System.out.print("Success");
            }

            @Override
            public void loginFailure() {
                System.out.print("Failure");
            }
        });
        loginPresenter.login("abc","xyz");
    }
}