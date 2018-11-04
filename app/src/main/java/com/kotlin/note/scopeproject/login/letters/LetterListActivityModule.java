package com.kotlin.note.scopeproject.login.letters;

import com.kotlin.note.scopeproject.login.annotation.ActivityScope;
import com.kotlin.note.scopeproject.login.datatype.Folder;
import com.kotlin.note.scopeproject.login.mail.MailManager;

import dagger.Module;
import dagger.Provides;

@Module
public class LetterListActivityModule {

    private Folder folder;

    public LetterListActivityModule(Folder folder) {
        this.folder = folder;
    }

    @ActivityScope
    @Provides
    public Folder provideFolder() {
        return folder;
    }

    @ActivityScope
    @Provides
    public LetterListActivityPresenter provideLetterListActivityPresenter(Folder folder,
                                                                          MailManager mailManager) {
        return new LetterListActivityPresenter(folder, mailManager);
    }
}
