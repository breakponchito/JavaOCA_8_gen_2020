package com.cert.oca8.course.deveduardodogs.module13.practice2;


import com.cert.oca8.course.deveduardodogs.module11.practice1.Player;

public class Team implements Comparable {
    private String teamName;
    private Player[] playerArray;
    private int pointsTotal;
    private int goalsTotal;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public Team(String teamName, Player[] players) {
        this(teamName);
        this.playerArray = players;
    }

    public Team() {}

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Player[] getPlayerArray() {
        return playerArray;
    }

    public void setPlayerArray(Player[] playerArray) {
        this.playerArray = playerArray;
    }

    public int getPointsTotal() {
        return pointsTotal;
    }

    public void setPointsTotal(int pointsTotal) {
        this.pointsTotal = pointsTotal;
    }

    public void incPointsTotal (int pointsTotal) {
        this.pointsTotal += pointsTotal;
    }

    public void incGoalsTotal (int goals) {
        this.goalsTotal = this.goalsTotal + goals;
    }

    public int getGoalsTotal () {
        return  goalsTotal;
    }

    @Override
    public int compareTo(Object theTeam) {
        int returnValue = -1;

        if (this.getPointsTotal() < ((Team)theTeam).getPointsTotal()) {
            returnValue = 1;
        } else if (this.getPointsTotal() == ((Team)theTeam).getPointsTotal()) {
            if (this.getGoalsTotal() < ((Team)theTeam).getGoalsTotal()) {
                returnValue = 1;
            }

        }
        return returnValue;
    }
}
