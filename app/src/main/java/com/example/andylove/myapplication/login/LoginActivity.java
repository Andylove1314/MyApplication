package com.example.andylove.myapplication.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.andylove.myapplication.BaseActivity;
import com.example.andylove.myapplication.KotlinActivity;
import com.example.andylove.myapplication.R;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * Created by andylove on 2016/11/3.
 */

public class LoginActivity extends BaseActivity implements LoginView {

    @Bind(R.id.textView2)
    EditText textView2 = null;
    @Bind(R.id.textView3)
    EditText textView3;
    @Bind(R.id.click_login)
    Button click;
    @Bind(R.id.progress)
    ProgressBar progress;
    LoginPresenter presenter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = new LoginPresenterImpl(this);
    }

    @Override
    public int getContentView() {
        return R.layout.activity_login;
    }

    @Override
    public void showProgress() {
        progress.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        progress.setVisibility(View.GONE);
    }

    @Override
    public void setUsernameError() {
        Toast.makeText(this, "账号不能为空", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setPasswordError() {
        Toast.makeText(this, "密码不能为空", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void navigateToHome() {
        Intent intent = new Intent(this, KotlinActivity.class);
//        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    @OnClick(R.id.click_login)
    public void onClick() {
        presenter.validateCredentials(textView2.getText().toString(), textView3.getText().toString());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onDestroy();
    }
}
