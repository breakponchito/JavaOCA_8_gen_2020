/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cert.oca8.course.devdamunguia95.module12.hierarchy.practice1.soccer;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
/**
 *
 * @author Administrator
 */
public class Game {
    private LocalDateTime localDateTime;
    private Team homeTeam;
    private Team awayTeam;
    private Goal[] goals;
    
    public Game(Team homeTeam, Team awayTeam, LocalDateTime localDateTime) {
        this.localDateTime=localDateTime;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }
 
    
    public void playGame() {
        ArrayList <Goal> eventList = new ArrayList();
        Goal currEvent;
        for (int i = 1; i <= 90; i++) {
            
            if (Math.random()>0.95) {
            //         System.out.println(i);
           currEvent=new Goal();
           currEvent.setTheTeam(Math.random()>0.5?homeTeam:awayTeam);
           currEvent.setThePlayer(currEvent.getTheTeam().getPlayerArray()
            [(int) (Math.random()* currEvent.getTheTeam().getPlayerArray().length)]);
           currEvent.setTheTime(i);
          eventList.add(currEvent);
            }
            this.goals=new Goal[eventList.size()];
            eventList.toArray(goals);
       
        }
    }
    
    public String getDescription() {
                       
        int homeTeamGoals = 0;
        int awayTeamGoals = 0;
        StringBuilder returnString = new StringBuilder();
        
        returnString.append(this.getHomeTeam().getTeamName() + " vs. " +
        this.getAwayTeam().getTeamName() + " " +
        this.localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE)+ "\n");
         
        for (Goal currGoal: this.getGoals()) {
             if (currGoal.getTheTeam()== homeTeam) {
                homeTeamGoals++;
                homeTeam.incGoalsTotal(1);
            } else {
                awayTeamGoals++;
                awayTeam.incGoalsTotal(1);
            }
            
            returnString.append("Goal scored after "
            + currGoal.getTheTime() + " mins by "
            + currGoal.getThePlayer().getPlayerName() + " of "
            + currGoal.getTheTeam().getTeamName()+"\n");
        }
        
        if (homeTeamGoals == awayTeamGoals) {
            returnString.append("It's a draw!");
            this.homeTeam.incPointsTotal(1);
            this.awayTeam.incPointsTotal(1);
        } else if (homeTeamGoals > awayTeamGoals) {
            returnString.append(homeTeam.getTeamName() + " win");
            this.homeTeam.incPointsTotal(1);
        } else {
            returnString.append(awayTeam.getTeamName() + " win");
            this.awayTeam.incPointsTotal(1);
        }
        returnString.append("(" + homeTeamGoals + " - " +
                awayTeamGoals + ") \n");
        
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

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
      
}
