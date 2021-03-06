package com.cert.oca8.course.devdamunguia95.module8.practice3;

import com.cert.oca8.course.devdamunguia95.module6.practice1.Player;
import com.cert.oca8.course.devdamunguia95.module6.practice1.Team;

/**
 *
 * @author dmunguias
 */
public class League {

    public static void main(String[] args) {
        League league = new League();
        Team[] theTeams = league.createTeams();
        Game[] theGames = league.createGames(theTeams);

        Game currGame = theGames[0];
        currGame.playGame(6);
        System.out.println(currGame.getDescription());

    }

    public Team[] createTeams() {
        // TODO code application logic here
        Player player1 = new Player();
        player1.playerName = "George Eliot";
        Player player2 = new Player();
        player2.playerName = "Graham Greene";
        Player player3 = new Player();
        player3.playerName = "Geoffrey Chaucer";

        Player[] thePlayers = {player1, player2, player3};

        Team team1 = new Team();
        team1.teamName = "The Greens";
        team1.playerArray = thePlayers;

        //Second Team
        Team team2 = new Team();
        team2.teamName = "The Reeds";
        team2.playerArray = new Player[3];

        team2.playerArray[0] = new Player();
        team2.playerArray[0].playerName = "Robert Service";
        team2.playerArray[1] = new Player();
        team2.playerArray[1].playerName = "Robbie Burns";
        team2.playerArray[2] = new Player();
        team2.playerArray[2].playerName = "Rafael Sabatini";

        Team[] theTeams = {team1, team2};
        return theTeams;
    }

    public Game[] createGames(Team[] theTeams) {
        Game theGame = new Game();
        theGame.homeTeam = theTeams[0];
        theGame.awayTeam = theTeams[1];

        Game[] theGames = {theGame};
        return theGames;

    }

}
