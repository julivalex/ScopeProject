package com.kotlin.note.scopeproject.login.login;

import com.kotlin.note.scopeproject.login.account.AccountManager;
import com.kotlin.note.scopeproject.login.datatype.Account;

public class LoginActivityPresenter {

    private LoginActivity loginActivity;
    private AccountManager accountManager;

    public LoginActivityPresenter(AccountManager accountManager) {
        this.accountManager = accountManager;
    }

    public void setActivity(LoginActivity loginActivity) {
        this.loginActivity = loginActivity;
    }

    void login(String user, String password) {
        Account account = accountManager.login(user, password);
        loginActivity.showMailForAccount(account);
    }
}
