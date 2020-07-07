/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cert.oca8.course.devdamunguia95.module6.practice1;

/**
 *
 * @author dmunguias
 */
public class Team {

    private String teamName;
    private Player[] playerArray;

    public Team() {

    }

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public Team(String teamName, Player[] playerArray) {
    this(teamName);
        this.playerArray = playerArray;
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

}
