package com.kotlin.note.scopeproject.login.login;

import com.kotlin.note.scopeproject.login.account.AccountManager;
import com.kotlin.note.scopeproject.login.annotation.ActivityScope;
import com.kotlin.note.scopeproject.login.api.ApiService;

import dagger.Module;
import dagger.Provides;

@Module
public class LoginActivityModule {

    @Provides
    @ActivityScope
    AccountManager provideAccountManager(ApiService apiService) {
        return new AccountManager(apiService);
    }

    @Provides
    @ActivityScope
    LoginActivityPresenter provideLoginActivityPresenter(AccountManager accountManager) {
        return new LoginActivityPresenter(accountManager);
    }
}
