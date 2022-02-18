package ru.samsung.itschool.dbgame;

import java.util.ArrayList;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class HoFActivity extends Activity {

	private DBManager dbManager;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ho_f);
		dbManager = DBManager.getInstance(this);
		
		ListView listView = (ListView)this.findViewById(R.id.list_view);
		ArrayList<Result> results = dbManager.getCurResult("DESC");
		listView.setAdapter(new ResultAdapter(this, results));

	}
}
