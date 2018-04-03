package com.example.moleigh.callobjectmethod;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textView = new TextView(this);
        textView.setText("Fantastic!");
        textView.setTextSize(42);
        textView.setTextColor(Color.CYAN);
        textView.setAllCaps(true);

        setContentView(textView);
    }
}
