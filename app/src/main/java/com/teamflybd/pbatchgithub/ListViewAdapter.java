package com.teamflybd.pbatchgithub;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {
    Activity context;
    ArrayList<String> peoples;
    ArrayList<String> countries;
    ListViewAdapter(Activity context, ArrayList<String> peoples, ArrayList<String> countries)
    {
        this.context = context;
        this.peoples = peoples;
        this.countries = countries;
    }
    @Override
    public int getCount() {
        return peoples.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null)
        {
            convertView = context.getLayoutInflater().inflate(R.layout.custom_list_item, parent, false);

        }

        TextView dummyText = convertView.findViewById(R.id.people);
        TextView dummyText2 = convertView.findViewById(R.id.country);
        String peoplesText = peoples.get(position).toString();
        String countryText = countries.get(position).toString();
        dummyText.setText(peoplesText);
        dummyText2.setText(countryText);
        return convertView;
    }
}
