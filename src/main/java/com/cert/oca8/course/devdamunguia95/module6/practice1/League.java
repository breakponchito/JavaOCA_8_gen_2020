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
        player1.setPlayerName("George Eliot");
        Player player2 = new Player();
        player2.setPlayerName("Graham Greene");
        Player player3 = new Player();
        player3.setPlayerName("Geoffrey Chaucer");

        Player[] thePlayers = {player1, player2, player3};

        Team team1 = new Team();
        team1.setTeamName("The Greens");
        team1.setPlayerArray(thePlayers);

        for (Player player : team1.getPlayerArray()) 
        {
            System.out.println(player.getPlayerName());
        }

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

        for (Player thePlayer : team2.getPlayerArray()) 
        {
            System.out.println(thePlayer.getPlayerName());

        }

    }

}
