package com.example.andylove.myapplication.login;

/**
 * Created by andylove on 2016/11/2.
 */

public interface LoginPresenter {
    void validateCredentials(String username, String password);
    void onDestroy();
}
