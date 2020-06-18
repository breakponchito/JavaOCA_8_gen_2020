package com.cert.oca8.course.deveduardodogs.module6.practice1;

public class League {
    public static void main(String[] args) {
        //Creating team 1
        Player player1 = new Player();
        player1.playerName = "Nicolas Otamendi";
        Player player2 = new Player();
        player2.playerName = "Lionel Messi";
        Player player3 = new Player();
        player3.playerName = "Neymar Jr.";
        Player[] players = {player1, player2, player3};

        Team team1 = new Team();
        team1.teamName = "Java team";
        team1.playerArray = players;

        //Creating team 2
        Team team2 = new Team();
        team2.teamName = "C team";
        team2.playerArray = new Player[3];
        team2.playerArray[0] = new Player();
        team2.playerArray[0].playerName = "Cristiano Ronaldo";
        team2.playerArray[1] = new Player();
        team2.playerArray[1].playerName = "Paulo Dybala";
        team2.playerArray[2] = new Player();
        team2.playerArray[2].playerName = "Zlatan Ibrahimovic";

        //Printing team 1 players
        for (Player thePlayer: team1.playerArray){
            System.out.println(thePlayer.playerName);
        }

        //Printing team 2 players
        for (Player thePlayer: team2.playerArray){
            System.out.println(thePlayer.playerName);
        }

    }
}
