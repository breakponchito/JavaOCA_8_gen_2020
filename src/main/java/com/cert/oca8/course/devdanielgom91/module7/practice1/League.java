package com.cert.oca8.course.devdanielgom91.module7.practice1;

import com.cert.oca8.course.devdanielgom91.module6.practice1.soccer.Game;
import com.cert.oca8.course.devdanielgom91.module6.practice1.soccer.Goal;
import com.cert.oca8.course.devdanielgom91.module6.practice1.soccer.Player;
import com.cert.oca8.course.devdanielgom91.module6.practice1.soccer.Team;

/**
 *
 * @author daniel77
 */
public class League {

    public static void main(String... args) {
        //plantilla primer equipo
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

        
        //Platilla del segundo equipo
        Team team2 = new Team();
        team2.teamName = "The Reds";
        team2.playerArray = new Player[3];
        team2.playerArray[0] = new Player();
        team2.playerArray[0].playerName = "Robert Service";
        team2.playerArray[1] = new Player();
        team2.playerArray[1].playerName = "Robbie Burns";
        team2.playerArray[2] = new Player();
        team2.playerArray[2].playerName = "Rafael Sabatini";
  
        /*
        * Creacion del objeto Game
        * compuesto por 3 atributos, los dos equipos del juego y un arreglo 
        * de objetos de tipo Goles
         */
        Game currGame = new Game();
        currGame.homeTeam = team1;
        currGame.awayTeam = team2;
        /*
        *Anotacion del encuentro, se crea el objeto gol y se le añaden valores
        *a sus atributos
        */
        Goal goal1 = new Goal();
        goal1.thePlayer = currGame.homeTeam.playerArray[2];
        goal1.theTeam = currGame.homeTeam;
        goal1.theTime = 55;

        /*
         * se crea un arreglo de tipo Goal, para almacenar el gol creado
         *  
         */
        
        Goal[] theGoals = {goal1};
        currGame.goals = theGoals;
        System.out.println("Goal scored after " + currGame.goals[0].theTime+" "
                + "mins by "+currGame.goals[0].thePlayer.playerName+" "+
                currGame.goals[0].theTeam.teamName);
     
        for (Player thePlayer : team2.playerArray) {
        	if (thePlayer.playerName.matches(".*Sab.*")) {	
        		System.out.println("Found " + thePlayer.playerName);
			}
			
		}
        
        for (Player thePlayer : team2.playerArray) {
        	if (thePlayer.playerName.matches(".*Sab.*")) {
        		//String[] fullName = thePlayer.playerName.split(" ");
        		System.out.println("Last name is " + thePlayer.playerName.split(" ")[1]);
			}
		}
        
        StringBuilder familyNameFirst = new StringBuilder();
        
        for (Player thePlayer : team1.playerArray) {
        	String[] fullName = thePlayer.playerName.split(" ");
        	
        	familyNameFirst.append(fullName[1]);
        	familyNameFirst.append(", ");
        	familyNameFirst.append(fullName[0]);
        	
        	System.out.println(familyNameFirst);
        	
        	familyNameFirst.delete(0, familyNameFirst.length());
        	
		}
        
        
    }

}
