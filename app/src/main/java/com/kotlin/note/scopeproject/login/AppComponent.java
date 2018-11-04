package com.kotlin.note.scopeproject.login;

import com.kotlin.note.scopeproject.login.api.ApiModule;
import com.kotlin.note.scopeproject.login.login.LoginActivityComponent;
import com.kotlin.note.scopeproject.login.mail.MailComponent;
import com.kotlin.note.scopeproject.login.mail.MailModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApiModule.class})
public interface AppComponent {
    LoginActivityComponent createLoginComponent();
    MailComponent createMailComponent(MailModule mailModule);
}
