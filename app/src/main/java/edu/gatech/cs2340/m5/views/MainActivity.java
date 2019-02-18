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

import org.w3c.dom.Text;

import edu.gatech.cs2340.m5.R;
import edu.gatech.cs2340.m5.entity.Player;

public class MainActivity extends AppCompatActivity {

    int difficulty;

    Player player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        difficulty = 2;

        Button doneButton = findViewById(R.id.newPlayerDoneButton);
        final EditText nameField = findViewById(R.id.nameField);
        TextView skillPointsView = findViewById(R.id.skillPointsView);
        final TextView difficultyView = findViewById(R.id.difficultyView);
        Button difficultyDecrementButton = findViewById(R.id.difficultyDecrementButton);
        Button difficultyIncrementButton = findViewById(R.id.difficultyIncrementButton);
        final TextView pilotView = findViewById(R.id.pilotView);
        Button pilotDecrementButton = findViewById(R.id.pilotDecrementButton);
        Button pilotdifficultyIncrementButton = findViewById(R.id.pilotIncrementButton);
        final TextView fighterView = findViewById(R.id.fighterView);
        Button fighterDecrementButton = findViewById(R.id.fighterDecrementButton);
        Button fighterdifficultyIncrementButton = findViewById(R.id.fighterIncrementButton);
        final TextView traderView = findViewById(R.id.traderView);
        Button traderDecrementButton = findViewById(R.id.traderDecrementButton);
        Button traderdifficultyIncrementButton = findViewById(R.id.traderIncrementButton);
        final TextView engineerView = findViewById(R.id.engineerView);
        Button engineerDecrementButton = findViewById(R.id.engineerDecrementButton);
        Button engineerdifficultyIncrementButton = findViewById(R.id.engineerIncrementButton);

        doneButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.i("New Player", "new player");
                player = new Player();
                player.setName(nameField.getText().toString());
                player.setDifficulty(difficulty);
                player.setPilotPoints(Integer.parseInt(pilotView.getText().toString()));
                player.setFighterPoints(Integer.parseInt(fighterView.getText().toString()));
                player.setTraderPoints(Integer.parseInt(traderView.getText().toString()));
                player.setEngineerPoints(Integer.parseInt(engineerView.getText().toString()));
            }
        });

        difficultyDecrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                difficultySet(false, difficultyView);
            }
        });

        difficultyIncrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                difficultySet(true, difficultyView);
            }
        });

    }

    private void difficultySet(boolean isIncrement, TextView attribute) {
        if (isIncrement) {
            if (difficulty < 4) {
                difficulty++;
            }
        } else {
            if (difficulty > 0) {
                difficulty--;
            }
        }
        String text = "";
        if (difficulty == 0) {
            text = "Beginner";
        } else if (difficulty == 1) {
            text = "Easy";
        } else if (difficulty == 2) {
            text = "Normal";
        } else if (difficulty == 3) {
            text = "Hard";
        } else if (difficulty == 4) {
            text = "Impossible";
        }
        attribute.setText(text);
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
