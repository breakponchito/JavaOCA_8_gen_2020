package com.cert.oca8.course.deveduardodogs.soccer_game_6_1_6_2;

import java.sql.SQLOutput;

public class League {

    public static void main(String[] args) {
        //Team 1
        Player player1 = new Player();
        player1.name = "Nicolas Otamendi";
        player1.number = "12";
        Player player2 = new Player();
        player2.name = "Lionel Messi";
        player2.number = "10";
        Player player3 = new Player();
        player3.name = "Neymar Jr.";
        player3.number = "11";
        Player [] players = {player1, player2, player3};

        Team team1 = new Team();
        team1.teamName = "Java team";
        team1.teamPlayers = players;

        //Team 2
        Team team2 = new Team();
        team2.teamName = "C team";
        team2.teamPlayers = new Player[3];
        team2.teamPlayers[0] = new Player();
        team2.teamPlayers[0].name = "Cristiano Ronaldo";
        team2.teamPlayers[0].number = "7";
        team2.teamPlayers[1] = new Player();
        team2.teamPlayers[1].name = "Paulo Dybala";
        team2.teamPlayers[1].number = "10";
        team2.teamPlayers[2] = new Player();
        team2.teamPlayers[2].name = "Zlatan Ibrahimovic";
        team2.teamPlayers[2].number = "11";

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

        /* Practice 6-2. Print out the score of the Game */
        System.out.println("This was the first match of the season and the score is: ");
        System.out.println(totalGoals[0].theTeam.teamName + ": " + totalGoals.length + " - " + team2.teamName + ": " + 0);
        System.out.println("Goal scored by " + totalGoals[0].thePlayer.name + " '" + totalGoals[0].theTime);

    }

}
