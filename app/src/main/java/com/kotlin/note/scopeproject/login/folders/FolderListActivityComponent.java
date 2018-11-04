package com.kotlin.note.scopeproject.login.folders;

import com.kotlin.note.scopeproject.login.annotation.ActivityScope;

import dagger.Subcomponent;

@ActivityScope
@Subcomponent(modules = {FolderListActivityModule.class})
public interface FolderListActivityComponent {
    void injectFolderListActivity(FolderListActivity activity);
}
