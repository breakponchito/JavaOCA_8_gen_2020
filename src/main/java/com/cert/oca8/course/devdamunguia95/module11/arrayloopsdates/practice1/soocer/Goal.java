/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cert.oca8.course.devdamunguia95.module11.arrayloopsdates.practice1.soocer;

import java.time.LocalDateTime;

/**
 *
 * @author Administrator
 */
public class Goal {
    private LocalDateTime localDateTime;
    private Team theTeam;
    private Player thePlayer;
    private double theTime;

    /**
     * @return the theTeam
     */
    public Team getTheTeam() {
        return theTeam;
    }

    /**
     * @param theTeam the theTeam to set
     */
    public void setTheTeam(Team theTeam) {
        this.theTeam = theTeam;
    }

    /**
     * @return the thePlayer
     */
    public Player getThePlayer() {
        return thePlayer;
    }

    /**
     * @param thePlayer the thePlayer to set
     */
    public void setThePlayer(Player thePlayer) {
        this.thePlayer = thePlayer;
    }

    /**
     * @return the theTime
     */
    public double getTheTime() {
        return theTime;
    }

    /**
     * @param theTime the theTime to set
     */
    public void setTheTime(double theTime) {
        this.theTime = theTime;
    }
    
}
