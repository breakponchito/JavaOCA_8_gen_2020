/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cert.oca8.course.devdamunguia95.module10.practice2;

import com.cert.oca8.course.devdamunguia95.module10.practice2.utility.GameUtils;

/**
 *
 * @author dmunguias
 */
public class Game {

    private Team homeTeam;
    private Team awayTeam;
    private Goal[] goals;

    public Game() {
    }

    public Game(Team homeTeam, Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    public void playGame(int maxGoals) {
        int numberOfGoals = (int) (Math.random() * (maxGoals + 1));
        Goal[] theGoals = new Goal[numberOfGoals];
        this.setGoals(theGoals);
        GameUtils.addGamesGoals(this);
    }

    public void playGame() {
        playGame(6);
    }

    public String getDescription() {
        int homeTeamGoals = 0;
        int awayTeamGoals = 0;
        StringBuilder returnString = new StringBuilder();

        returnString.append(homeTeam.getTeamName()
                + " vs " + awayTeam.getTeamName() + "\n");
        for (Goal currGame : this.getGoals()) {
            if (currGame.getTheTeam() == homeTeam) {
                homeTeamGoals++;
                homeTeam.incGoalsTotal(1);
                
            } else {
                awayTeamGoals++;
                awayTeam.incGoalsTotal(1);
            }
            returnString.append("Goal scored after "
                    + currGame.getTheTime() + " mins by "
                    + currGame.getThePlayer().getPlayerName() + " of "
                    + currGame.getTheTeam().getTeamName() + "\n");
        }

        if (homeTeamGoals == awayTeamGoals) {
            returnString.append("it's a draw!");
            homeTeam.incPointsTotal(1);
            awayTeam.incPointsTotal(1);
        } else if (homeTeamGoals > awayTeamGoals) {
            returnString.append(homeTeam.getTeamName() + " win");
            homeTeam.incPointsTotal(1);
        } else {
            returnString.append(awayTeam.getTeamName() + " win");
            awayTeam.incPointsTotal(1);
        }
        returnString.append("(" + homeTeamGoals + " - "
                + awayTeamGoals + ") \n");
        return returnString.toString();
    }

    /**
     * @return the homeTeam
     */
    public Team getHomeTeam() {
        return homeTeam;
    }

    /**
     * @param homeTeam the homeTeam to set
     */
    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    /**
     * @return the awayTeam
     */
    public Team getAwayTeam() {
        return awayTeam;
    }

    /**
     * @param awayTeam the awayTeam to set
     */
    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    /**
     * @return the goals
     */
    public Goal[] getGoals() {
        return goals;
    }

    /**
     * @param goals the goals to set
     */
    public void setGoals(Goal[] goals) {
        this.goals = goals;
    }
}
