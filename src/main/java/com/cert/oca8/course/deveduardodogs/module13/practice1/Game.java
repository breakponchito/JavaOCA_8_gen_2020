package com.cert.oca8.course.deveduardodogs.module13.practice1;

import com.cert.oca8.course.deveduardodogs.module11.practice1.Team;
import com.cert.oca8.course.deveduardodogs.module12.practice2.GameEvent;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Game {
    private Team homeTeam;
    private Team awayTeam;
    private GameEvent[] goals;
    private LocalDateTime theDateTime;

    public Game(Team homeTeam, Team awayTeam,
                LocalDateTime theDateTime) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.theDateTime = theDateTime;
    }

    public void playGame() {
        ArrayList<GameEvent> eventList = new ArrayList();
        GameEvent currEvent;
        for (int i = 1; i <= 90; i++) {
            if (Math.random() > 0.8) {
                currEvent = Math.random() > 0.8 ? new Goal() : new Possesion();
                currEvent.setTheTeam(Math.random() > 0.5 ? homeTeam : awayTeam);
                currEvent.setThePlayer( currEvent.getTheTeam().
                        getPlayerArray()[(int) (Math.random() *
                        currEvent.getTheTeam().getPlayerArray().length)]);
                currEvent.setTheTime(i);
                eventList.add(currEvent);
            }
        }
        this.goals = new GameEvent[eventList.size()];
        eventList.toArray(goals);
    }

    public String getDescription() {
        int homeTeamGoals = 0;
        int awayTeamGoals = 0;

        StringBuilder returnString = new StringBuilder();
        returnString.append
                (this.getHomeTeam().getTeamName() +
                        " vs. " + this.getAwayTeam().getTeamName() + "\n" +
                        "Date " +
                        this.theDateTime.format
                                (DateTimeFormatter.ISO_LOCAL_DATE) + "\n");
        for (GameEvent currEvent: this.getGoals()) {
            if (currEvent instanceof Goal) {
                if (currEvent.getTheTeam() == homeTeam) {
                    homeTeamGoals ++;
                    homeTeam.incGoalsTotal(1);
                } else {
                    awayTeamGoals ++;
                    awayTeam.incGoalsTotal(1);
                }
            }

            returnString.append(currEvent + " after " +
                    currEvent.getTheTime() + " mins by " +
                    currEvent.getThePlayer().getPlayerName() +
                    " of " + currEvent.getTheTeam().getTeamName() +
                    "\n");
        }

        if (homeTeamGoals == awayTeamGoals){
            returnString.append("It's a draw!");
            homeTeam.incPointsTotal(1);
            awayTeam.incPointsTotal(1);
        } else if (homeTeamGoals > awayTeamGoals) {
            returnString.append(homeTeam.getTeamName() + " win");
            homeTeam.incPointsTotal(2);
        } else {
            returnString.append(awayTeam.getTeamName() + " win");
            awayTeam.incPointsTotal(2);
        }

        returnString.append(" (" + homeTeamGoals + " - " +
                awayTeamGoals + ")\n");

        return returnString.toString();
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    public GameEvent[] getGoals() {
        return goals;
    }

    public void setGoals(GameEvent[] goals) {
        this.goals = goals;
    }

    public LocalDateTime getTheDateTime() {
        return theDateTime;
    }

    public void setTheDateTime(LocalDateTime theDateTime) {
        this.theDateTime = theDateTime;
    }

}
