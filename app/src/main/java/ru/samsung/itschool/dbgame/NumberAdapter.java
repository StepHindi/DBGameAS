package ru.samsung.itschool.dbgame;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class NumberAdapter extends BaseAdapter {

class ViewHolder{
    TextView textView;
    ViewHolder (TextView textView) {
        this.textView = textView;
    }
}

    Context context;

    NumberAdapter(Context context) {
        this.context = context;

    }

    @Override
    public int getCount() {
        return 10000;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            view = LayoutInflater.from(context).inflate(android.R.layout.simple_list_item_1, null);
            view.setTag(new ViewHolder(view.findViewById(android.R.id.text1)));
        }
            TextView textView1 = ((ViewHolder)(view.getTag())).textView;
            textView1.setText(position + "");

            if ((position + "").contains("3")) {
                textView1.setTextColor(Color.RED);
            }
            else {
                textView1.setTextColor(Color.BLACK);
            }


        return view;
    }

}
