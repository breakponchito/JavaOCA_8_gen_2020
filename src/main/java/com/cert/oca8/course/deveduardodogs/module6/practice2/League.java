package com.cert.oca8.course.deveduardodogs.module6.practice2;

import com.cert.oca8.course.deveduardodogs.module6.practice1.Game;
import com.cert.oca8.course.deveduardodogs.module6.practice1.Goal;
import com.cert.oca8.course.deveduardodogs.module6.practice1.Player;
import com.cert.oca8.course.deveduardodogs.module6.practice1.Team;

public class League {

    public static void main(String[] args) {
        //Team 1
        Player player1 = new Player();
        player1.playerName = "Nicolas Otamendi";
        Player player2 = new Player();
        player2.playerName = "Lionel Messi";
        Player player3 = new Player();
        player3.playerName = "Neymar Jr.";
        Player [] players = {player1, player2, player3};

        Team team1 = new Team();
        team1.teamName = "Java team";
        team1.playerArray = players;

        //Team 2
        Team team2 = new Team();
        team2.teamName = "C team";
        team2.playerArray = new Player[3];
        team2.playerArray[0] = new Player();
        team2.playerArray[0].playerName = "Cristiano Ronaldo";
        team2.playerArray[1] = new Player();
        team2.playerArray[1].playerName = "Paulo Dybala";
        team2.playerArray[2] = new Player();
        team2.playerArray[2].playerName = "Zlatan Ibrahimovic";

        /* Practice 6-2. Create a Game here */
        Game match1 = new Game();
        match1.homeTeam = team1;
        match1.awayTeam = team2;

        /* Practice 6-2. Create a Goal object here */
        Goal goal = new Goal();

        /* Practice 6-2. Put  Goal object in a Goal array and assign Goal array to goals attribute of Game object */
        Goal [] totalGoals = new Goal[1];
        totalGoals[0] = goal;
        totalGoals[0].thePlayer = player2;
        totalGoals[0].theTeam = team1;
        totalGoals[0].theTime = 91.52;
        match1.goals = totalGoals;

        /* Practice 6-2. Print out the score of the Game */
        System.out.println("This was the first match of the season and the score is: ");
        System.out.println(match1.goals[0].theTeam.teamName + ": " + match1.goals.length + " - " + team2.teamName + ": " + 0);
        System.out.println("Goal scored by " + match1.goals[0].thePlayer.playerName + " '" + match1.goals[0].theTime);

    }

}
