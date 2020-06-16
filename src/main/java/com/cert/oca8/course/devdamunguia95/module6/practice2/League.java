/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cert.oca8.course.devdamunguia95.module6.practice2;

import com.cert.oca8.course.devdamunguia95.module6.practice2.Player;
import com.cert.oca8.course.devdamunguia95.module6.practice2.Team;

/**
 *
 * @author dmunguias
 */
public class League {

    public static void main(String[] args) {
        // Create team1      
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

        // Create team2
        Team team2 = new Team();
        team2.teamName = "The Reds";
        team2.playerArray = new Player[3];
        team2.playerArray[0] = new Player();
        team2.playerArray[0].playerName = "Robert Service";
        team2.playerArray[1] = new Player();
        team2.playerArray[1].playerName = "Robbie Burns";
        team2.playerArray[2] = new Player();
        team2.playerArray[2].playerName = "Rafael Sabatini";

        /* Practice 6-2. Remove the two for loops below */
//        for (Player thePlayer : team1.playerArray) {
//            System.out.println(thePlayer.playerName);
//        }
//        for (Player thePlayer : team2.playerArray) {
//            System.out.println(thePlayer.playerName);
//        }

        /* Practice 6-2. Create a Game here */
        Game game1 = new Game();
        game1.homeTeam = team1;
        game1.awayTeam = team2;

        /* Practice 6-2. Create a Goal object here */
        Goal[] goalsOfGame = new Goal[3];

        /* Practice 6-2. Put  Goal object in a Goal array and assign Goal array to goals attribute of Game object */
        goalsOfGame[0] = new Goal();
        goalsOfGame[0].thePlayer = team1.playerArray[1];
        goalsOfGame[0].theTeam = team1;
        goalsOfGame[0].theTime = 15.15;

        goalsOfGame[1] = new Goal();
        goalsOfGame[1].thePlayer = team2.playerArray[2];
        goalsOfGame[1].theTeam = team2;
        goalsOfGame[1].theTime = 15.20;

        goalsOfGame[2] = new Goal();
        goalsOfGame[2].thePlayer = team2.playerArray[0];
        goalsOfGame[2].theTeam = team2;
        goalsOfGame[1].theTime = 15.20;

        game1.goals = goalsOfGame;

        /* Practice 6-2. Print out the score of the Game */
        System.out.println("SCORE");
        System.out.println(game1.homeTeam.teamName + "  VS " + game1.awayTeam.teamName);

//        for (int i = 0; i <= game1.goals.length - 1; i++) {
//            System.out.println(game1.goals[i].thePlayer.playerName);
//       
//        }
        int goalHome = 0;
        int goalVisit = 0;
        for (Goal goal : game1.goals) {
            if (goal.theTeam.teamName.equals(game1.homeTeam.teamName)) {
                goalHome++;
            } else {
                goalVisit++;
            }

        }

        System.out.println(game1.homeTeam.teamName + ": " + goalHome);
        System.out.println(game1.awayTeam.teamName + ": " + goalVisit);

    }

}
