package com.kotlin.note.scopeproject.login.api;

import com.kotlin.note.scopeproject.login.datatype.Account;
import com.kotlin.note.scopeproject.login.datatype.Folder;
import com.kotlin.note.scopeproject.login.datatype.Letter;

import java.util.ArrayList;
import java.util.List;

public class ApiService {

    public Account login(String user, String password) {
        return generateFakeAccount();
    }

    public List<Folder> getFolders(Account account) {
        return generateFakeFolders();
    }

    public List<Letter> getLetters(Folder folder) {
        return generateFakeLetters();
    }

    private Account generateFakeAccount() {
        return new Account();
    }

    private List<Folder> generateFakeFolders() {
        List<Folder> folders = new ArrayList<>();
        folders.add(new Folder("Inbox"));
        folders.add(new Folder("Sent"));
        folders.add(new Folder("Starred"));
        folders.add(new Folder("Drafts"));
        return folders;
    }

    private List<Letter> generateFakeLetters() {
        List<Letter> letters = new ArrayList<>();
        letters.add(new Letter("Subject 1"));
        letters.add(new Letter("Subject 2"));
        letters.add(new Letter("Subject 3"));
        letters.add(new Letter("Subject 4"));
        return letters;
    }
}
