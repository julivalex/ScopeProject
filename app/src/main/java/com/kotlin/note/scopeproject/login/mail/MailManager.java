package com.kotlin.note.scopeproject.login.mail;

import com.kotlin.note.scopeproject.login.api.ApiService;
import com.kotlin.note.scopeproject.login.datatype.Account;
import com.kotlin.note.scopeproject.login.datatype.Folder;
import com.kotlin.note.scopeproject.login.datatype.Letter;

import java.util.List;

public class MailManager {

    private Account account;
    private ApiService apiService;

    public MailManager(Account account, ApiService apiService) {
        this.account = account;
        this.apiService = apiService;
    }

    public List<Folder> getFolders() {
        return apiService.getFolders(account);
    }

    public  List<Letter> getLetter(Folder folder) {
        return apiService.getLetters(folder);
    }
}
