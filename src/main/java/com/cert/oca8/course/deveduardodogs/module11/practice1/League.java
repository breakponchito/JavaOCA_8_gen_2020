package com.cert.oca8.course.deveduardodogs.module11.practice1;

import com.cert.oca8.course.deveduardodogs.module11.practice1.utility.PlayerDatabase;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class League {

    public static void main(String[] args) {
        League theLeague = new League();

        // Create the teams here
        Team[] theTeams = theLeague.createTeams("The Robins, The Crows, The Swallows", 3 );

        // Create a Game here
        Game[] theGames = theLeague.createGames(theTeams);

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
        ArrayList<Game> theGames = new ArrayList();

        for (Team homeTeam: theTeams) {
            for (Team awayTeam: theTeams) {
                if (homeTeam!=awayTeam){
                    theGames.add(new Game(homeTeam, awayTeam));
                }
            }
        }

        return (Game[]) theGames.toArray(new Game[1]);
    }

}
