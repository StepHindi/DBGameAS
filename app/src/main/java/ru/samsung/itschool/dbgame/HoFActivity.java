package ru.samsung.itschool.dbgame;

import java.util.ArrayList;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class HoFActivity extends Activity {

	private DBManager dbManager;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ho_f);
		dbManager = DBManager.getInstance(this);
		ListView listView = (ListView)this.findViewById(R.id.list_view_1);
		ArrayList<Result> results = dbManager.getSumsByUsers();
		listView.setAdapter(new ResultAdapter(this, results));

	}
}
