package com.teamflybd.pbatchgithub;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;

public class BackPress extends AppCompatActivity {
    TextView textView;
  //  Button press;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back_press);

        textView = findViewById(R.id.text);
       // press = findViewById(R.id.press);


        //For inserting back arrow
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    public void changedFont(View view)
    {
        PopupMenu popupMenu = new PopupMenu(BackPress.this,textView);

        popupMenu.getMenuInflater().inflate(R.menu.main_menu, popupMenu.getMenu());

        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                int id = item.getItemId();

                if(id == R.id.yellow)
                {
                    textView.setTextColor(Color.YELLOW);
                }
                if(id == R.id.red)
                {
                    textView.setTextColor(Color.RED);
                }
                if(id == R.id.black)
                {
                    textView.setTextColor(Color.BLACK);
                }
                return true;

            }
        });
        popupMenu.show();
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);

//        Intent intent = new Intent(BackPress.this,OptionMenuIntegrate.class);
//        startActivity(intent);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if(id == android.R.id.home)
        {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}




