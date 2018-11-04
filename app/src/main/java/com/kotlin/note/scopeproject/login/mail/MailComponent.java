package com.kotlin.note.scopeproject.login.mail;

import com.kotlin.note.scopeproject.login.folders.FolderListActivityComponent;
import com.kotlin.note.scopeproject.login.letters.LetterListActivityComponent;
import com.kotlin.note.scopeproject.login.letters.LetterListActivityModule;

import dagger.Subcomponent;

@MailScope
@Subcomponent(modules = {MailModule.class})
public interface MailComponent {
    FolderListActivityComponent createFolderListActivityComponent();
    LetterListActivityComponent createLetterListActivityComponent(LetterListActivityModule letterListActivityModule);
}
