/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cert.oca8.course.devdamunguia95.module13.interfaces.practice3;

import com.cert.oca8.course.devdamunguia95.module13.interfaces.practice3.utility.PlayerDatabase;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author Administrator
 */
public class League {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        League theLeague = new League();
        Team[] theTeams = theLeague.createTeams("The Robins,The Crows,"+ 
                "The Swallows", 3);
        Game[] theGames = theLeague.createGames(theTeams);
        System.out.println(theLeague.getLeagueAnnouncement(theGames));
        for (Game currGame : theGames) {
            currGame.playGame();
            System.out.println(currGame.getDescription());
        }
        theLeague.showBestTeam(theTeams);
        theLeague.showBestPlayers(theTeams);
    }

    public Team[] createTeams(String teamName, int teamSize) {

        PlayerDatabase playerDB = new PlayerDatabase();
        StringTokenizer teamNameTokens = new StringTokenizer(teamName, ",");

        Team[] theTeams = new Team[teamNameTokens.countTokens()];

        for (int i = 0; i < theTeams.length; i++) {
            theTeams[i] = new Team(teamNameTokens.nextToken(), 
                    playerDB.getTeam(teamSize));
        }
        return theTeams;
    }

    public Game[] createGames(Team[] theTeams) {
        int daysBetweenGames = 0;
        ArrayList<Game> theGames = new ArrayList();
        for (Team homeTeam : theTeams) {
            for (Team awayTeam : theTeams) {
                if (homeTeam != awayTeam) {
                    daysBetweenGames += 7;
                    theGames.add(new Game(homeTeam, awayTeam,
                            LocalDateTime.now().plusDays(daysBetweenGames)));
                }
            }
        }
        return (Game[]) theGames.toArray(new Game[1]);
    }

    public void showBestTeam(Team[] theTeams) {
       Arrays.sort(theTeams);
        Team currBestTeam = theTeams[0];
        System.out.println("\n" + "Team Points");

        for (Team currTeam : theTeams) {
            System.out.println(currTeam.getTeamName() + " : "
                    + currTeam.getPointsTotal() + " : "
                    + currTeam.getGoalsTotal());
            currBestTeam = currTeam.getPointsTotal() >
                    currBestTeam.getPointsTotal() ? currTeam : currBestTeam;
            if (currTeam.getPointsTotal() >
                    currBestTeam.getPointsTotal()) {
                currBestTeam = currTeam;
            } else if (currTeam.getPointsTotal() == 
                    currBestTeam.getPointsTotal()) {
                if (currTeam.getGoalsTotal() >
                        currBestTeam.getGoalsTotal()) {
                    currBestTeam = currTeam;
                }
            }
        }
        System.out.println("Winner of the League is " + 
                currBestTeam.getTeamName());
    }

    public String getLeagueAnnouncement(Game[] theGames) {
        Period thePeriod = Period.between(
                theGames[0].getLocalDateTime().toLocalDate(),
                theGames[theGames.length - 1].getLocalDateTime().toLocalDate());
        return "The league is Scheduled to run for " + thePeriod.getMonths()
                + " month(s), and " + thePeriod.getDays() + " day(s)\n";
    }
    
    public void showBestPlayers(Team[] theTeams){
        System.out.println("\n\nBest Players");
        ArrayList <Player> thePlayers= new ArrayList();
        for (Team currTeam : theTeams) {
            thePlayers.addAll(Arrays.asList(currTeam.getPlayerArray()));
        }
        
        Collections.sort(thePlayers, (p1,p2)->
                Double.valueOf(p2.getGoalScored()).compareTo(Double.valueOf(p1.getGoalScored())));
        
        for (Player currPlayer : thePlayers) {
            System.out.println(currPlayer.getPlayerName()+ " : " +
                    currPlayer.getGoalScored());
        }
    }
}
