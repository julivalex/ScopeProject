package com.kotlin.note.scopeproject.login.account;

import com.kotlin.note.scopeproject.login.api.ApiService;
import com.kotlin.note.scopeproject.login.datatype.Account;

public class AccountManager {

    public ApiService apiService;

    public AccountManager(ApiService apiService) {
        this.apiService = apiService;
    }

    public Account login(String user, String password) {
        return apiService.login(user, password);
    }
}
