package com.cert.oca8.course.deveduardodogs.module10.practice2;

import com.cert.oca8.course.deveduardodogs.module10.practice2.utility.GameUtils;

public class Game {
    private Team[] theTeams = new Team[2];
    private Goal[] goals;

    public Game(Team homeTeam, Team awayTeam) {
        this.theTeams[0] = homeTeam;
        this.theTeams[1] = awayTeam;
    }

    public void playGame(int maxGoals) {
        int numberOfGoals = (int) (Math.random() * (maxGoals + 1));
        Goal[] theGoals = new Goal[numberOfGoals];
        this.setGoals(theGoals);
        GameUtils.addGameGoals(this);
    }

    public void playGame(){
        playGame(6);
    }

    public String getDescription() {
        int homeTeamGoals = 0;
        int awayTeamGoals = 0;

        StringBuilder returnString = new StringBuilder();
        returnString.append
                (theTeams[0].getTeamName() +
                        " vs. " + theTeams[1].getTeamName() + "\n");
        for (Goal currGoal: this.getGoals()) {
            if (currGoal.getTheTeam() == theTeams[0]) {
                homeTeamGoals ++;
                theTeams[0].incGoalsTotal(1);
            } else {
                awayTeamGoals ++;
                theTeams[1].incGoalsTotal(1);
            }
            returnString.append("Goal scored after " +
                    currGoal.getTheTime() + " mins by " +
                    currGoal.getThePlayer().getPlayerName() +
                    " of " + currGoal.getTheTeam().getTeamName() +
                    "\n");
        }

        if (homeTeamGoals == awayTeamGoals){
            returnString.append("It's a draw!");
            theTeams[0].incPointsTotal(1);
            theTeams[1].incPointsTotal(1);
        } else if (homeTeamGoals > awayTeamGoals) {
            returnString.append(theTeams[0].getTeamName() + " win");
            theTeams[1].incPointsTotal(2);
        } else {
            returnString.append(theTeams[1].getTeamName() + " win");
            theTeams[0].incPointsTotal(2);
        }

        returnString.append(" (" + homeTeamGoals + " - " +
                awayTeamGoals + ")\n");

        return returnString.toString();
    }

    public Team getHomeTeam() {
        return theTeams[0];
    }

    public void setHomeTeam(Team homeTeam) {
        this.theTeams[0] = homeTeam;
    }

    public Team getAwayTeam() {
        return theTeams[1];
    }

    public void setAwayTeam(Team awayTeam) {
        this.theTeams[1] = awayTeam;
    }

    public Goal[] getGoals() {
        return goals;
    }

    public void setGoals(Goal[] goals) {
        this.goals = goals;
    }
}
