package ru.samsung.itschool.dbgame;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class ResultAdapter extends BaseAdapter {

    ArrayList<Result> results;
    Context context;

    ResultAdapter(Context context, ArrayList<Result> results) {
        this.context = context;
        this.results = results;
    }

    @Override
    public int getCount() {
        return results.size();
    }

    @Override
    public Object getItem(int position) {
        return results.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.custom_list_item_1, null);
        TextView textView1 = view.findViewById(R.id.name);
        TextView textView2 = view.findViewById(R.id.score);
        textView1.setText(results.get(position).name);
        textView2.setText(results.get(position).score + "");
        if (results.get(position).score >= 500) {
//            android.R.layout.simple_list_item_1

            textView2.setTextColor(Color.GREEN);
        }
        else {
            textView2.setTextColor(Color.RED);
        }
        return view;
    }

}
