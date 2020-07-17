/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cert.oca8.course.devdamunguia95.module10.practice1;
/**
 *
 * @author dmunguias
 */
public class Player {
    private String playerName;

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public Player() {
    }
    /**
     * @return the playerName
     */
    public String getPlayerName() {
        return playerName;
    }
    /**
     * @param playerName the playerName to set
     */
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
}
