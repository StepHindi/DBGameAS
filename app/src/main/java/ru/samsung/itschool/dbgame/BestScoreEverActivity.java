package ru.samsung.itschool.dbgame;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class BestScoreEverActivity extends Activity {

    private DBManager dbManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_best_score_ever);
        dbManager = DBManager.getInstance(this);
        ListView listView = (ListView)this.findViewById(R.id.list_view_1);
        ArrayList<Result> results = dbManager.getSumsByUsers();
        listView.setAdapter(new ResultAdapter(this, results));
    }
}