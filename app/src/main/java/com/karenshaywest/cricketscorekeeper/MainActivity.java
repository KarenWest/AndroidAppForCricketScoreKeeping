package com.karenshaywest.cricketscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int totalBallsBowledTeamA = 0;
    int numOversOutsTeamA = 0;
    int scoreTeamB = 0;
    int totalBallsBowledTeamB = 0;
    int numOversOutsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* Reset scores for Teams A and B */
    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        totalBallsBowledTeamA = 0;
        totalBallsBowledTeamB = 0;
        numOversOutsTeamA = 0;
        numOversOutsTeamB = 0;
        displayForTeamA(scoreTeamA, totalBallsBowledTeamA, numOversOutsTeamA);
        displayForTeamB(scoreTeamB, totalBallsBowledTeamB, numOversOutsTeamB);
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA(View v) {
        scoreTeamA += 1;
        determineIfPlayerGotHitOrOutInNumBallsBowledTeamA(v);
        displayForTeamA(scoreTeamA, totalBallsBowledTeamA, numOversOutsTeamA);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamA(View v) {
        scoreTeamA += 2;
        determineIfPlayerGotHitOrOutInNumBallsBowledTeamA(v);
        displayForTeamA(scoreTeamA, totalBallsBowledTeamA, numOversOutsTeamA);
    }

    /**
     * Increase the score for Team A by 4 points.
     */
    public void addFourForTeamA(View v) {
        scoreTeamA += 4;
        determineIfPlayerGotHitOrOutInNumBallsBowledTeamA(v);
        displayForTeamA(scoreTeamA, totalBallsBowledTeamA, numOversOutsTeamA);
    }

    /**
     * Increase the score for Team A by 6 points.
     */
    public void addSixForTeamA(View v) {
        scoreTeamA += 6;
        determineIfPlayerGotHitOrOutInNumBallsBowledTeamA(v);
        displayForTeamA(scoreTeamA, totalBallsBowledTeamA, numOversOutsTeamA);
    }

    public void determineIfPlayerGotHitOrOutInNumBallsBowledTeamA(View v) {
        /* Making up a way to determine whether player is out or how many bowls or pitches it took
        for player to get a hit. */
        int addOneOrTwo = 0;

        addOneOrTwo = scoreTeamA % 2;
        if (addOneOrTwo == 1) {
            totalBallsBowledTeamA += 1; /* took one bowl or pitch to get hit */
            numOversOutsTeamA += 1;
        }
        else {
            totalBallsBowledTeamA += 2; /* took two bowls or pitches to get hit */
            /* player not out so do not increment number of overs - he can bat again */
        }
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score, int addToNumBallsBowled, int addToOversOuts) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
        TextView scoreViewBallsBowled = (TextView) findViewById(R.id.team_a_ballsbowled);
        scoreViewBallsBowled.setText(String.valueOf(addToNumBallsBowled));
        TextView scoreViewOversPlayersOut = (TextView) findViewById(R.id.team_a_oversplayersout);
        scoreViewOversPlayersOut.setText(String.valueOf(addToOversOuts));
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    public void addOneForTeamB(View v) {
        scoreTeamB += 1;
        determineIfPlayerGotHitOrOutInNumBallsBowledTeamB(v);
        displayForTeamB(scoreTeamB, totalBallsBowledTeamB, numOversOutsTeamB);
    }

    /**
     * Increase the score for Team B by 2 points.
     */
    public void addTwoForTeamB(View v) {
        scoreTeamB += 2;
        determineIfPlayerGotHitOrOutInNumBallsBowledTeamB(v);
        displayForTeamB(scoreTeamB, totalBallsBowledTeamB, numOversOutsTeamB);
    }

    /**
     * Increase the score for Team A by 4 points.
     */
    public void addFourForTeamB(View v) {
        scoreTeamB += 4;
        determineIfPlayerGotHitOrOutInNumBallsBowledTeamB(v);
        displayForTeamB(scoreTeamB, totalBallsBowledTeamB, numOversOutsTeamB);
    }

    /**
     * Increase the score for Team A by 6 points.
     */
    public void addSixForTeamB(View v) {
        scoreTeamB += 6;
        determineIfPlayerGotHitOrOutInNumBallsBowledTeamB(v);
        displayForTeamB(scoreTeamB, totalBallsBowledTeamB, numOversOutsTeamB);
    }

    public void determineIfPlayerGotHitOrOutInNumBallsBowledTeamB(View v) {
        /* Making up a way to determine whether player is out or how many bowls or pitches it took
        for player to get a hit. */

        int addOneOrTwo = 0;

        addOneOrTwo = scoreTeamB % 2;
        if (addOneOrTwo == 1) {
            totalBallsBowledTeamB += 1; /* took one bowl or pitch to get hit */
            numOversOutsTeamB += 1;
        }
        else {
            totalBallsBowledTeamB += 2; /* took two bowls or pitches to get hit */
            /* player not out so do not increment number of overs - he can bat again */
        }
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score, int addToNumBallsBowled, int addToOversOuts) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
        TextView scoreViewBallsBowled = (TextView) findViewById(R.id.team_b_ballsbowled);
        scoreViewBallsBowled.setText(String.valueOf(addToNumBallsBowled));
        TextView scoreViewOversPlayersOut = (TextView) findViewById(R.id.team_b_oversplayersout);
        scoreViewOversPlayersOut.setText(String.valueOf(addToOversOuts));
    }
}

