/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cert.oca8.course.devdamunguia95.module8.practice1;

import com.cert.oca8.course.devdamunguia95.module6.practice1.Game;
import com.cert.oca8.course.devdamunguia95.module6.practice1.Goal;
import com.cert.oca8.course.devdamunguia95.module6.practice1.Player;
import com.cert.oca8.course.devdamunguia95.module6.practice1.Team;

/**
 *
 * @author dmunguias
 */
public class League {

    public static void main(String[] args) {

        Team[] theTeams = createTeam();
        Game[] theGames = createGames(theTeams);

        Game currGame = theGames[0];
        Goal goal1 = new Goal();

        goal1.thePlayer = currGame.homeTeam.playerArray[2];
        goal1.theTeam = currGame.homeTeam;
        goal1.theTime = 55;

        Goal[] theGoals = {goal1};
        currGame.goals = theGoals;

        System.out.println("Goal scored after "
                + currGame.goals[0].theTime + " mins by "
                + currGame.goals[0].thePlayer.playerName + " of "
                + currGame.goals[0].theTeam.teamName);

        for (Player thePlayer : theTeams[1].playerArray) {

            if (thePlayer.playerName.matches(".*Sab.*")) {
                System.out.println("Found " + thePlayer.playerName);
                System.out.println("The last name is " + thePlayer.playerName.split(" ")[1]);

            }

        }

        StringBuilder familyNameFirst = new StringBuilder();
        for (Player thePlayer : theTeams[0].playerArray) {

            String name[] = thePlayer.playerName.split(" ");

            familyNameFirst.append(name[1]);
            familyNameFirst.append(", ");
            familyNameFirst.append(name[0]);
            System.out.println(familyNameFirst);
            familyNameFirst.delete(0, familyNameFirst.length());
        }
    }

    public static Team[] createTeam() {
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

    public static Game[] createGames(Team[] theTeams) {
        Game theGame = new Game();
        theGame.homeTeam = theTeams[0];
        theGame.awayTeam = theTeams[1];

        Game[] theGames = {theGame};
        return theGames;

    }

}
