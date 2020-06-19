package com.cert.oca8.course.devdanielgom91.module6.practice2.soccer;

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

        /*System.out.println("Alineacion para el equipo de "+ team1.teamName);
            for (Player player : team1.playerArray) {
                System.out.println(player.playerName);
            }
        */
        
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
        System.out.println("Alineacion para el equipo de "+ team2.teamName);
            for (Player player : team2.playerArray) {
                System.out.println(player.playerName);
            }
        */    
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

        //array de objetos tipo Goal
        Goal[] theGoals = {goal1};
        currGame.goals = theGoals;
        System.out.println("Goal scored after " + currGame.goals[0].theTime+" "
                + "mins by "+currGame.goals[0].thePlayer.playerName+" "+
                currGame.goals[0].theTeam.teamName);
        
    }

}
