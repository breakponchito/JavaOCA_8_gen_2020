package com.cert.oca8.course.deveduardodogs.module8.practice2;

import com.cert.oca8.course.deveduardodogs.module6.practice1.Player;
import com.cert.oca8.course.deveduardodogs.module6.practice1.Team;

public class League {

    public static void main(String[] args) {

        //Create the teams here
        Team[] theTeams = createTeams();

        //Create a Game here
        Game[] theGames = createGames(theTeams);
        Game currGame = theGames[0];

        currGame.playGame();
        System.out.println(currGame.getDescription());

    }

    public static Team[] createTeams() {
        //Team 1
        Player player1 = new Player();
        player1.playerName = "George Eliot";
        Player player2 = new Player();
        player2.playerName = "Graham Greene";
        Player player3 = new Player();
        player3.playerName = "Geoffrey Chaucer";
        Player[] players = {player1, player2, player3};

        Team team1 = new Team();
        team1.teamName = "The Greens";
        team1.playerArray = players;

        //Creating team 2
        Team team2 = new Team();
        team2.teamName = "The Reds";
        team2.playerArray = new Player[3];
        team2.playerArray[0] = new Player();
        team2.playerArray[0].playerName = "Robert Service";
        team2.playerArray[1] = new Player();
        team2.playerArray[1].playerName = "Robbie Burns";
        team2.playerArray[2] = new Player();
        team2.playerArray[2].playerName = "Rafael Sabatini";

        Team theTeams[] = {team1, team2};

        return theTeams;
    }

    public static Game[] createGames (Team[] theTeams) {
        Game theGame = new Game();
        theGame.homeTeam = theTeams[0];
        theGame.awayTeam = theTeams[1];

        Game[] theGames = {theGame};

        return theGames;
    }

}
