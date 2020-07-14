package com.cert.oca8.course.deveduardodogs.module13.practice3;

public class Player {

    private String playerName;

    private int goalsScored;

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public Player() { }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }

    public void incGoalScored() {
        this.goalsScored++;
    }
}
