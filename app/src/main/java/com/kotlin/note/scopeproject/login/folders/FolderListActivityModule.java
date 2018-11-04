package com.kotlin.note.scopeproject.login.folders;

import com.kotlin.note.scopeproject.login.annotation.ActivityScope;
import com.kotlin.note.scopeproject.login.mail.MailManager;

import dagger.Module;
import dagger.Provides;

@Module
public class FolderListActivityModule {

    @ActivityScope
    @Provides
    FolderListActivityPresenter provideFolderListActivityPresenter(MailManager mailManager) {
        return new FolderListActivityPresenter(mailManager);
    }
}
