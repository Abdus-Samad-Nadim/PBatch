package com.teamflybd.pbatchgithub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewTest extends AppCompatActivity {

    ListView listView;

    String[] items = {"Bitcoin", "Diamond", "Gold", "Silver", "Iconomi", "Lumens", "Neo", "Nano"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_test);

        listView = findViewById(R.id.listView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,
                items);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int pos = position;
                String value = (String) listView.getItemAtPosition(position);

                Toast.makeText(ListViewTest.this, "Position: "+pos+"  Item clicked: "+value, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
