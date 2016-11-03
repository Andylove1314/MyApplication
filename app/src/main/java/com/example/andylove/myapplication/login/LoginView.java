package com.example.andylove.myapplication.login;

/**
 * Created by andylove on 2016/11/1.
 */

public interface LoginView {

    void showProgress();

    void hideProgress();

    void setUsernameError();

    void setPasswordError();

    void navigateToHome();

}
