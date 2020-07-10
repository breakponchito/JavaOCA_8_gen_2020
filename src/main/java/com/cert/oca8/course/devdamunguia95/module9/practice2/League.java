/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cert.oca8.course.devdamunguia95.module9.practice2;

/**
 *
 * @author dmunguias
 */
public class League {

    public static void main(String[] args) {
        League league = new League();
        Team[] theTeams = league.createTeams();
        Game[] theGames = league.createGames(theTeams);

        for (Game theGame : theGames) {
            theGame.playGame();
            System.out.println(theGame.getDescription());
        }

    }

    public Team[] createTeams() {
        // TODO code application logic here
        Player player1 = new Player("George Eliot");
        Player player2 = new Player("Graham Greene");
        Player player3 = new Player("Geoffrey Chaucer");
        Player[] thePlayers = {player1, player2, player3};

        Team team1 = new Team("The Greens", thePlayers);
        //Second Team
        Team team2 = new Team("The Reeds", new Player[3]);
        team2.getPlayerArray()[0] = new Player("Robert Service");
        team2.getPlayerArray()[1] = new Player("Robbie Burns");
        team2.getPlayerArray()[2] = new Player("Rafael Sabatini");

        Team[] theTeams = {team1, team2};
        return theTeams;
    }

    public Game[] createGames(Team[] theTeams) {
        Game theGame = new Game(theTeams[0], theTeams[1]);
        Game theGame2 = new Game(theTeams[1], theTeams[0]);
        Game theGame3 = new Game(theTeams[0], theTeams[1]);
        Game theGame4 = new Game(theTeams[1], theTeams[0]);
        Game[] theGames = {theGame, theGame2, theGame3, theGame4};
        return theGames;

    }

}
