package com.example.andylove.myapplication.login;

import android.os.Handler;
import android.text.TextUtils;

/**
 * Created by andylove on 2016/11/2.
 */

public class LoginInteractorImpl implements LoginInteractor{

    @Override
    public void login(final String username, final String password, final OnLoginFinishedListener listener) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (TextUtils.isEmpty(username)){
                    listener.onUsernameError();
                }else if (TextUtils.isEmpty(password)){
                    listener.onPasswordError();
                }else {
                    listener.onSuccess();
                }
            }
        }, 1000);

    }
}
