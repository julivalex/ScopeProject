package com.kotlin.note.scopeproject.login.login;

import com.kotlin.note.scopeproject.login.annotation.ActivityScope;

import dagger.Subcomponent;

@ActivityScope
@Subcomponent(modules = {LoginActivityModule.class})
public interface LoginActivityComponent {
    void injectLoginActivity(LoginActivity loginActivity);
}
