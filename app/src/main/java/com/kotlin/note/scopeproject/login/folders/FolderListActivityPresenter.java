package com.kotlin.note.scopeproject.login.folders;

import com.kotlin.note.scopeproject.login.datatype.Folder;
import com.kotlin.note.scopeproject.login.mail.MailManager;

import java.util.List;

public class FolderListActivityPresenter {

    private FolderListActivity activity;
    private MailManager mailManager;

    FolderListActivityPresenter(MailManager mailManager) {
        this.mailManager = mailManager;
    }

    public void setActivity(FolderListActivity activity) {
        this.activity = activity;
    }

    public void loadFolders() {
        List<Folder> folders = mailManager.getFolders();
        activity.showFolders(folders);
    }
}
