/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cert.oca8.course.devdamunguia95.module10.practice2;

/**
 *
 * @author dmunguias
 */
public class Team {

    private String teamName;
    private Player[] playerArray;
    private int pointsTotal;
    private int goalsTotal;

    public Team() {
    }

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public Team(String teamName, Player[] playerArray) {
        this(teamName);
        this.playerArray = playerArray;
    }

    public void incPointsTotal(int pointsTotal) {

        this.pointsTotal += pointsTotal;
    }

    public void incGoalsTotal(int goal) {

        this.goalsTotal = this.goalsTotal + goal;
    }

    /**
     * @return the teamName
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * @param teamName the teamName to set
     */
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    /**
     * @return the playerArray
     */
    public Player[] getPlayerArray() {
        return playerArray;
    }

    /**
     * @param playerArray the playerArray to set
     */
    public void setPlayerArray(Player[] playerArray) {
        this.playerArray = playerArray;
    }

    /**
     * @return the pointsTotal
     */
    public int getPointsTotal() {
        return pointsTotal;
    }

    /**
     * @param pointsTotal the pointsTotal to set
     */
    public void setPointsTotal(int pointsTotal) {
        this.pointsTotal = pointsTotal;
    }

    /**
     * @return the golasTotal
     */
    public int getGoalsTotal() {
        return goalsTotal;
    }

    /**
     * @param golasTotal the golasTotal to set
     */
    public void setGoalsTotal(int golasTotal) {
        this.goalsTotal = golasTotal;
    }
}
