/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cert.oca8.course.devdamunguia95.module7.practice1;

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

        Game currGame = new Game();
        currGame.setHomeTeam(team1);
        currGame.setAwayTeam(team2);

        Goal goal1 = new Goal();
        goal1.setThePlayer(currGame.getHomeTeam().getPlayerArray()[2]);
        goal1.setTheTeam(currGame.getHomeTeam());
        goal1.setTheTime(55);

        Goal[] theGoals = {goal1};
        currGame.setGoals(theGoals);

        System.out.println("Goal scored after "
                + currGame.getGoals()[0].getTheTime() + " mins by "
                + currGame.getGoals()[0].getThePlayer().getPlayerName() + " of "
                + currGame.getGoals()[0].getTheTeam().getTeamName());

        for (Player thePlayer : team2.getPlayerArray()) {

            if (thePlayer.getPlayerName().matches(".*Sab.*")) {
                System.out.println("Found " + thePlayer.getPlayerName());
                System.out.println("The last name is " + thePlayer.getPlayerName().split(" ")[1]);

            }

        }

        StringBuilder familyNameFirst = new StringBuilder();
        for (Player thePlayer : team1.getPlayerArray()) {

            String name[] = thePlayer.getPlayerName().split(" ");

            familyNameFirst.append(name[1]);
            familyNameFirst.append(", ");
            familyNameFirst.append(name[0]);
            System.out.println(familyNameFirst);
            familyNameFirst.delete(0, familyNameFirst.length());
        }
    }

}
