package com.kotlin.note.scopeproject.login.folders;

import android.content.Intent;
import android.os.Bundle;
import com.kotlin.note.scopeproject.R;
import com.kotlin.note.scopeproject.login.App;
import com.kotlin.note.scopeproject.login.datatype.Folder;
import com.kotlin.note.scopeproject.login.letters.LetterListActivity;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

import javax.inject.Inject;

public class FolderListActivity extends AppCompatActivity {

    @Inject
    public FolderListActivityPresenter presenter;

    private ListView foldersListView;
    private ArrayAdapter<Folder> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_folder_list);

        App.getInstance().getMailComponent()
                .createFolderListActivityComponent().injectFolderListActivity(this);

        foldersListView = findViewById(R.id.foldersList);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1);
        foldersListView.setAdapter(adapter);
        foldersListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                openFolder(adapter.getItem(i));
            }
        });
        presenter.loadFolders();
    }

    @Inject
    void setActivity() {
        presenter.setActivity(this);
    }

    void showFolders(List<Folder> folders) {
        adapter.clear();
        adapter.addAll(folders);
    }

    void openFolder(Folder folder) {
        Intent intent = new Intent(this, LetterListActivity.class);
        intent.putExtra("folder", folder);
        startActivity(intent);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        App.getInstance().releaseMailComponent();
    }
}
