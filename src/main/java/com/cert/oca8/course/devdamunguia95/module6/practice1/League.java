/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cert.oca8.course.devdamunguia95.module6.practice1;

/**
 *
 * @author dmunguias
 */
public class League {

    public static void main(String[] args) {

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

        for (Player player : team1.playerArray) {
            System.out.println(player.playerName);
        }

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

        for (Player thePlayer : team2.playerArray) {
            System.out.println(thePlayer.playerName);
        }
    }
}
