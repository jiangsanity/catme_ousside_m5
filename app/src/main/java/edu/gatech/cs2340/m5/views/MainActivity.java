package edu.gatech.cs2340.m5.views;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import edu.gatech.cs2340.m5.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button doneButton = findViewById(R.id.newPlayerDoneButton);
        EditText nameField = findViewById(R.id.nameField);
        TextView skillPointsView = findViewById(R.id.skillPointsView);
        TextView difficultyView = findViewById(R.id.difficultyView);
        Button difficultyDecrementButton = findViewById(R.id.difficultyDecrementButton);
        Button difficultyIncrementButton = findViewById(R.id.difficultyIncrementButton);
        TextView pilotView = findViewById(R.id.pilotView);
        Button pilotDecrementButton = findViewById(R.id.pilotDecrementButton);
        Button pilotdifficultyIncrementButton = findViewById(R.id.pilotIncrementButton);
        TextView fighterView = findViewById(R.id.fighterView);
        Button fighterDecrementButton = findViewById(R.id.fighterDecrementButton);
        Button fighterdifficultyIncrementButton = findViewById(R.id.fighterIncrementButton);
        TextView traderView = findViewById(R.id.traderView);
        Button traderDecrementButton = findViewById(R.id.traderDecrementButton);
        Button traderdifficultyIncrementButton = findViewById(R.id.traderIncrementButton);
        TextView engineerView = findViewById(R.id.engineerView);
        Button engineerDecrementButton = findViewById(R.id.engineerDecrementButton);
        Button engineerdifficultyIncrementButton = findViewById(R.id.engineerIncrementButton);

        doneButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.i("New Player", "new player");
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
