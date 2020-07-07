/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cert.oca8.course.devdamunguia95.module9.practice1;


import com.cert.oca8.course.devdamunguia95.module6.practice1.Game;
import com.cert.oca8.course.devdamunguia95.module6.practice1.Player;
import com.cert.oca8.course.devdamunguia95.module6.practice1.Team;

/**
 *
 * @author dmunguias
 */
public class League {
      public static void main(String[] args) {
            League league=new League();
        Team[] theTeams = league.createTeam();
        Game[] theGames = league.createGames(theTeams);

        Game currGame = theGames[0];
        currGame.playGame();
        System.out.println(currGame.getDescription());

    }

    public  Team[] createTeam() {
        // TODO code application logic here
        Player player1 = new Player();
        player1.setPlayerName("George Eliot");
        Player player2 = new Player();
        player2.setPlayerName("Graham Greene");
        Player player3 = new Player();
        player3.setPlayerName("Geoffrey Chaucer");

        Player[] thePlayers = {player1, player2, player3};

        Team team1 = new Team();
        team1.setTeamName("The Greens");
        team1.setPlayerArray(thePlayers);

        //Second Team
        Team team2 = new Team();
        team2.setTeamName("The Reeds");
        team2.setPlayerArray(new Player[3]);

        team2.getPlayerArray()[0] = new Player();
        team2.getPlayerArray()[0].setPlayerName("Robert Service");
        team2.getPlayerArray()[1] = new Player();
        team2.getPlayerArray()[1].setPlayerName("Robbie Burns");
        team2.getPlayerArray()[2] = new Player();
        team2.getPlayerArray()[2].setPlayerName("Rafael Sabatini");

        Team[] theTeams = {team1, team2};
        return theTeams;
    }

    public  Game[] createGames(Team[] theTeams) {
        Game theGame = new Game();
        theGame.setHomeTeam(theTeams[0]);
        theGame.setAwayTeam(theTeams[1]);

        Game[] theGames = {theGame};
        return theGames;

    }

}
