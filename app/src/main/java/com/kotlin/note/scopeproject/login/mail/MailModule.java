package com.kotlin.note.scopeproject.login.mail;

import com.kotlin.note.scopeproject.login.api.ApiService;
import com.kotlin.note.scopeproject.login.datatype.Account;

import dagger.Module;
import dagger.Provides;

@Module
public class MailModule {

    private Account account;

    public MailModule(Account account) {
        this.account = account;
    }

    @Provides
    Account provideAccount() {
        return account;
    }

    @MailScope
    @Provides
    MailManager provideMailManager(Account account, ApiService apiService) {
        return new MailManager(account, apiService);
    }
}
