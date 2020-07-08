/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cert.oca8.course.devdamunguia95.module8.practice3;

/**
 *
 * @author dmunguias
 */


import com.cert.oca8.course.devdamunguia95.module8.practice3.utility.GameUtils;
import com.cert.oca8.course.devdamunguia95.module6.practice1.Goal;
import com.cert.oca8.course.devdamunguia95.module6.practice1.Team;


/**
 *
 * @author dmunguias
 */
public class Game {

    public Team homeTeam;
    public Team awayTeam;
    public Goal[] goals;

    public void playGame(int maxGoals) {
   
        int numberOfGoals = (int) (Math.random() * (maxGoals + 1));
        Goal[] theGoals = new Goal[numberOfGoals];
        this.goals = theGoals;

        GameUtils.addGamesGoals(this);
    }

    public void playGame() {
            playGame(6);
    }

    public String getDescription() {
        StringBuilder returnString = new StringBuilder();
        for (Goal goal : this.goals) {
            returnString.append("Goal scored after "
                    + goal.theTime + " mins by "
                    + goal.thePlayer.playerName + " of "
                    + goal.theTeam.teamName + "\n");
        }
        return returnString.toString();
    }
}