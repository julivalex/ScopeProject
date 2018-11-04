package com.kotlin.note.scopeproject.login.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.kotlin.note.scopeproject.R;
import com.kotlin.note.scopeproject.login.App;
import com.kotlin.note.scopeproject.login.datatype.Account;
import com.kotlin.note.scopeproject.login.folders.FolderListActivity;

import javax.inject.Inject;

public class LoginActivity extends AppCompatActivity {

    @Inject
    LoginActivityPresenter presenter;

    EditText userEditText;
    EditText passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        LoginActivityComponent loginActivityComponent =
                App.getInstance().getAppComponent().createLoginComponent();
        loginActivityComponent.injectLoginActivity(this);

        userEditText = findViewById(R.id.user);
        passwordEditText = findViewById(R.id.password);

        findViewById(R.id.loginButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.login(userEditText.getText().toString(),
                        passwordEditText.getText().toString());
            }
        });
    }

    void showMailForAccount(Account account) {
        App.getInstance().createMailComponent(account);
        startActivity(new Intent(this, FolderListActivity.class));
    }

    @Inject
    void setActivity() {
        presenter.setActivity(this);
    }
}
