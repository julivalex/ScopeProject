package com.kotlin.note.scopeproject.login.letters;

import com.kotlin.note.scopeproject.login.datatype.Folder;
import com.kotlin.note.scopeproject.login.datatype.Letter;
import com.kotlin.note.scopeproject.login.mail.MailManager;

import java.util.List;

public class LetterListActivityPresenter {

    private LetterListActivity activity;
    private Folder folder;
    private MailManager mailManager;

    public LetterListActivityPresenter(Folder folder, MailManager mailManager) {
        this.folder = folder;
        this.mailManager = mailManager;
    }

    public void setActivity(LetterListActivity activity) {
        this.activity = activity;
    }

    public void loadLetters() {
        List<Letter> letters = mailManager.getLetter(folder);
        activity.showLetters(letters);
    }
}
