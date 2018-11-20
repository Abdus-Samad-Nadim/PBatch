package com.teamflybd.pbatchgithub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class CustomListView extends AppCompatActivity {
    ArrayList<String> peoples;
    ArrayList<String> countries;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);
        listView = findViewById(R.id.listview);
        peoples = new ArrayList<String>();
        countries = new ArrayList<String>();

        peoples.add("Arif");
        peoples.add("Mahmud");
        peoples.add("Gazi");
        peoples.add("Khan");
        peoples.add("Nabil");
        peoples.add("Azad");


        countries.add("Bangladesh");
        countries.add("Pakistan");
        countries.add("India");
        countries.add("Chaina");
        countries.add("Argentina");
        countries.add("Brazil");


        ListViewAdapter adapter = new ListViewAdapter(this,peoples,countries);

        listView.setAdapter(adapter);


    }
}
