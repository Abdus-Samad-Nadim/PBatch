package com.teamflybd.pbatchgithub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IntentOnePageToAnother extends AppCompatActivity {
    Button button;
    EditText name,age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_one_page_to_another);

        button = findViewById(R.id.send);
        name = findViewById(R.id.text);
        age = findViewById(R.id.textAge);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nameText = name.getText().toString();
                String ageText = age.getText().toString();
                Intent intent = new Intent(IntentOnePageToAnother.this,IntentNewPage.class);
                intent.putExtra("Name",nameText);
                intent.putExtra("Age",ageText);
                intent.putExtra("Email","adil@gmail.com");



                startActivity(intent);


            }
        });
    }
}
