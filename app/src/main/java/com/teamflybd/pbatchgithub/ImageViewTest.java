package com.teamflybd.pbatchgithub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ImageViewTest extends AppCompatActivity {
    Button button;
    ImageView imageView;
    boolean show = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view_test);

        imageView = findViewById(R.id.imageView);
        button = findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(show == false)
                {
                    imageView.setImageResource(R.drawable.bike);
                    show = true;
                }
                else if(show == true)
                {
                    imageView.setImageResource(R.drawable.a);
                    show = false;
                }

            }
        });
    }
}
