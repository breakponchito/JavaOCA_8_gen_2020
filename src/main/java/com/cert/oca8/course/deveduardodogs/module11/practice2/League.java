package com.cert.oca8.course.deveduardodogs.module11.practice2;

import com.cert.oca8.course.deveduardodogs.module11.practice1.Team;
import com.cert.oca8.course.deveduardodogs.module11.practice2.utility.PlayerDatabase;

import java.time.LocalDateTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class League {

    public static void main(String[] args) {
        League theLeague = new League();

        // Create the teams here
        Team[] theTeams = theLeague.createTeams("The Robins, The Crows, The Swallows", 3 );

        // Create a Game here
        Game[] theGames = theLeague.createGames(theTeams);

        System.out.println(theLeague.getLeagueAnnouncement(theGames));
        for (Game currGame : theGames) {
            currGame.playGame();
            System.out.println(currGame.getDescription());
        }
    }

    public Team[] createTeams(String teamNames, int teamSize) {
        PlayerDatabase playerDB = new PlayerDatabase();

        StringTokenizer teamNameTokens = new StringTokenizer(teamNames, ",");
        Team[] theTeams = new Team[teamNameTokens.countTokens()];

        for (int i=0; i < theTeams.length; i++) {
            theTeams[i] = new Team(teamNameTokens.nextToken(),
                    playerDB.getTeam(teamSize));
        }

        return theTeams;
    }

    public Game[] createGames (Team[] theTeams) {
        int daysBetweenGames = 0;
        ArrayList<Game> theGames = new ArrayList();
        for (Team homeTeam: theTeams) {
            for (Team awayTeam: theTeams) {
                if (homeTeam!=awayTeam) {
                    daysBetweenGames +=7;
                    theGames.add(new Game(homeTeam, awayTeam, LocalDateTime.now().plusDays(daysBetweenGames)));
                }
            }
        }
        return (Game[]) theGames.toArray(new Game[1]);
    }

    public String getLeagueAnnouncement(Game[] theGames) {
        Period thePeriod= Period.between(theGames[0].getTheDateTime().toLocalDate(),
                theGames[theGames.length - 1].getTheDateTime().toLocalDate());

        return "The League is scheduled to run for " +
                thePeriod.getMonths() + " month(s), and " +
                thePeriod.getDays() + " day(s)\n";
    }

}
