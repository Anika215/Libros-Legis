package com.example.divya.libroslegis;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.divya.libroslegis.R;

public class HighestScoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_highest_score);
        Button btn = (Button) findViewById(R.id.button2);
        TextView txtScore = (TextView) findViewById(R.id.textScore);
        TextView txtHighScore = (TextView) findViewById(R.id.textHighScore);
        // receive the score from last activity by Intent
        Intent intent = getIntent();
        int score = intent.getIntExtra("score", 0);
        // display current score
        txtScore.setText("Your score: " + score);

        // use Shared preferences to save the best score
        SharedPreferences mypref = getPreferences(MODE_PRIVATE);
        int highscore = mypref.getInt("highscore",0);
        if(highscore>= score)
            txtHighScore.setText("High score: "+highscore);
        else
        {
            txtHighScore.setText("New highscore: "+score);
            SharedPreferences.Editor editor = mypref.edit();
            editor.putInt("highscore", score);
            editor.commit();
        }

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HighestScoreActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void onClick(View view) {
        Intent intent = new Intent(HighestScoreActivity.this, QuizActivity.class);
        startActivity(intent);
    }


}