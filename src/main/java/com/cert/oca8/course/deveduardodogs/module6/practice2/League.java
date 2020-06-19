package com.cert.oca8.course.deveduardodogs.module6.practice2;

import com.cert.oca8.course.deveduardodogs.module6.practice1.Game;
import com.cert.oca8.course.deveduardodogs.module6.practice1.Goal;
import com.cert.oca8.course.deveduardodogs.module6.practice1.Player;
import com.cert.oca8.course.deveduardodogs.module6.practice1.Team;

public class League {

    public static void main(String[] args) {
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

        /* Practice 6-2. Create a Game here */
        Game currGame = new Game();
        currGame.homeTeam = team1;
        currGame.awayTeam = team2;

        /* Practice 6-2. Create a Goal object here */
        Goal goal = new Goal();
        goal.thePlayer = player2;
        goal.theTeam = team1;
        goal.theTime = 55;

        /* Practice 6-2. Put  Goal object in a Goal array and assign Goal array to goals attribute of Game object */
        currGame.goals = new Goal[] {goal};

        /* Practice 6-2. Print out the score of the Game */
        System.out.println("Goal scored after " +
        currGame.goals[0].theTime + " mins by " +
        currGame.goals[0].thePlayer.playerName + " of " +
        currGame.goals[0].theTeam.teamName);

    }

}
