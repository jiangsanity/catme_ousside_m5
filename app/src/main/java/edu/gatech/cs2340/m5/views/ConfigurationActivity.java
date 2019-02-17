package edu.gatech.cs2340.m5.views;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import edu.gatech.cs2340.m5.R;

public class ConfigurationActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);

        Button doneButton = findViewById(R.id.newPlayerDoneButton);
    }
}
