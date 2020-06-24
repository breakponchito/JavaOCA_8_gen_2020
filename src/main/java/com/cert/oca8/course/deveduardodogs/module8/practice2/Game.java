package com.cert.oca8.course.deveduardodogs.module8.practice2;

import com.cert.oca8.course.deveduardodogs.module6.practice1.Goal;
import com.cert.oca8.course.deveduardodogs.module6.practice1.Team;
import com.cert.oca8.course.deveduardodogs.module8.practice2.utility.GameUtils;

public class Game {
    public Team homeTeam;
    public Team awayTeam;
    public Goal[] goals;

    public void playGame() {
        int numberOfGoals = (int) (Math.random() * 7);
        Goal[] theGoals = new Goal[numberOfGoals];
        this.goals = theGoals;
        GameUtils.addGameGoals(this);
    }

    public String getDescription() {
        StringBuilder returnString = new StringBuilder();
        for (Goal currGoal: this.goals) {
            returnString.append("Goal scored after " +
                    currGoal.theTime + " mins by " +
                    currGoal.thePlayer.playerName +
                    " of " + currGoal.theTeam.teamName +
                    "\n");
        }
        return returnString.toString();
    }
}
