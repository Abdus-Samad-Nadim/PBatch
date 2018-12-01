package com.teamflybd.pbatchgithub;

import android.os.Build;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Locale;

public class TextToSpeechTest extends AppCompatActivity implements TextToSpeech.OnInitListener {
    EditText editText;
    Button button;
    TextToSpeech tts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_to_speech);
        initialization();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                voiceOutput();
            }
        });
    }

    private void initialization() {
        tts = new TextToSpeech(this, this);
        editText = findViewById(R.id.input);
        button = findViewById(R.id.click);
    }

    @Override
    public void onInit(int status) {
        if(status == TextToSpeech.SUCCESS)
        {
            int result = tts.setLanguage(Locale.US);
            float i = 50;

            if(result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED)
            {
                Toast.makeText(this, "Lanuage not supported", Toast.LENGTH_SHORT).show();
            }
            else
            {
                button.setEnabled(true);
                voiceOutput();
            }
        }
        else
        {
            Toast.makeText(this, "Initialization failed", Toast.LENGTH_SHORT).show();
        }
    }

    private void voiceOutput() {
        CharSequence text = editText.getText();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            tts.speak(text, TextToSpeech.QUEUE_FLUSH, null, "id1");
        }
    }

    @Override
    protected void onDestroy() {
        if(tts!=null)
        {
            tts.stop();
            tts.shutdown();
        }
        super.onDestroy();
    }
}
