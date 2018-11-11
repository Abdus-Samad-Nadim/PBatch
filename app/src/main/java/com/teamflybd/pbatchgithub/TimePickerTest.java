package com.teamflybd.pbatchgithub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.TimePicker;

public class TimePickerTest extends AppCompatActivity {

    TimePicker timePicker;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker_test);

        textView = findViewById(R.id.text);
        timePicker = findViewById(R.id.timepicker);

        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                textView.setText(hourOfDay+":"+minute);
            }
        });
    }
}
