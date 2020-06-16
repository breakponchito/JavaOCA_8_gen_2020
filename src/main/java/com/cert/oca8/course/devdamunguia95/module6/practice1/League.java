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

        //Creacion de un equipo
        Team teamNum1 = new Team();
        teamNum1.color = "Blue";
        teamNum1.nameOfTeam = "Tigres";
        //Creación y asignación de jugadores
        Player player1 = new Player();
        player1.playerName = "Player One";
        Player player2 = new Player();
        player2.playerName = "Player Twoo";
        Player player3 = new Player();
        player3.playerName = "Player Three";
        Player player4 = new Player();
        player4.playerName = "Player Four";

        Player[] players = new Player[4];
        players[0] = player1;
        players[1] = player2;
        players[2] = player3;
        players[3] = player4;

        teamNum1.players = players;

        //Segundo Equipo
        //Creacion de un equipo
        Team teamNum2 = new Team();
        teamNum2.color = "Red";
        teamNum2.nameOfTeam = "Altlas";
        //Creación y asignación de jugadores
        Player playerT1 = new Player();
        playerT1.playerName = "Player One Two";
        Player playerT2 = new Player();
        playerT2.playerName = "Player Twoo Two";
        Player playerT3 = new Player();
        playerT3.playerName = "Player Three Two";
        Player playerT4 = new Player();
        playerT4.playerName = "Player Four Two";

        Player[] playersT = new Player[4];
        playersT[0] = player1;
        playersT[1] = player2;
        playersT[2] = player3;
        playersT[3] = player4;

        teamNum2.players = playersT;
        //Creación de un juego.
        Game match = new Game();

        match.city = "México";
        match.referee = "Default";

        match.teamHome = teamNum1;
        match.teamHome = teamNum2;

        Goal[] goalS = new Goal[2];

        Goal gol = new Goal();
        gol.numOfPlayer = 10;
        gol.playerName = teamNum1.players[0].playerName;
        gol.teamName = teamNum1.nameOfTeam;

        Goal gol2 = new Goal();
        gol2.numOfPlayer = 12;
        gol2.playerName = teamNum1.players[2].playerName;
        gol2.teamName = teamNum1.nameOfTeam;

        goalS[0] = gol;
        goalS[1]=gol2;
        match.goals = goalS;

    }

}
