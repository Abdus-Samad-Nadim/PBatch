package com.teamflybd.pbatchgithub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class IntentNewPage extends AppCompatActivity {
    TextView nameText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_new_page);

        nameText = findViewById(R.id.text);
        Intent intent =  getIntent();

        //String receivedName = getIntent().getExtras().getString("Name");
        String receivedName = intent.getStringExtra("Name");
        String receivedAge = intent.getStringExtra("Age");
        String receivedEmail = intent.getStringExtra("Email");

        nameText.setText("Hello, Welcome "+receivedName+" \nYour age is "+receivedAge+"\nAnd your email is "+receivedEmail);



    }
}
