package com.kotlin.note.scopeproject.login.letters;

import com.kotlin.note.scopeproject.login.annotation.ActivityScope;

import dagger.Subcomponent;

@ActivityScope
@Subcomponent(modules = {LetterListActivityModule.class})
public interface LetterListActivityComponent {
    void injectLettersListActivity(LetterListActivity activity);
}
