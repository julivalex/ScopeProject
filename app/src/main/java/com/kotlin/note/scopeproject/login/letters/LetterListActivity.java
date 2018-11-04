package com.kotlin.note.scopeproject.login.letters;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.kotlin.note.scopeproject.R;
import com.kotlin.note.scopeproject.login.App;
import com.kotlin.note.scopeproject.login.datatype.Folder;
import com.kotlin.note.scopeproject.login.datatype.Letter;

import java.util.List;

import javax.inject.Inject;

public class LetterListActivity extends AppCompatActivity {

    @Inject
    LetterListActivityPresenter presenter;

    private ListView lettersListView;
    private ArrayAdapter<Letter> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letter_list);

        Folder folder = (Folder) getIntent().getSerializableExtra("folder");
        App.getInstance().getMailComponent()
                .createLetterListActivityComponent(new LetterListActivityModule(folder))
                .injectLettersListActivity(this);

        lettersListView = findViewById(R.id.lettersList);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1);
        lettersListView.setAdapter(adapter);

        presenter.loadLetters();
    }

    @Inject
    void setActivity() {
        presenter.setActivity(this);
    }

    public void showLetters(List<Letter> letters) {
        adapter.clear();
        adapter.addAll(letters);
    }
}
