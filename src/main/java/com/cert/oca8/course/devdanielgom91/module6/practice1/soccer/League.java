/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cert.oca8.course.devdanielgom91.module6.practice1.soccer;

/**
 *
 * @author daniel77
 */
public class League {
    
    public static void main(String ... args){
        //plantilla primer equipo
    Player playerMty1 = new Player();
    playerMty1.playerName = "Dorlan Pabon";
    Player playerMty2 = new Player();
    playerMty2.playerName = "Funes Mori";
    Player playerMty3 = new Player();
    playerMty3.playerName = "Miguel Layun";
        
    Player[] thePlayerMty = {playerMty1,playerMty2,playerMty3};
        
    Team team1 = new Team();
    team1.teamName = "Monterrey";
    team1.playerArray = thePlayerMty;
        
    System.out.println("Alineacion para el equipo de "+ team1.teamName);
    for (Player player : team1.playerArray) {
        System.out.println(player.playerName);
    }
        
    //Platilla del segundo equipo     
    Team team2 = new Team();
    team2.teamName = "Tigres";
    team2.playerArray = new Player[3];
    team2.playerArray[0] =  new Player();
    team2.playerArray[0].playerName = "Andre Giniac";
    team2.playerArray[1] =  new Player();
    team2.playerArray[1].playerName = "Eduardo Vargas";
    team2.playerArray[2] =  new Player();
    team2.playerArray[2].playerName = "Javier Aquino";
        
    System.out.println("Alineacion para el equipo de "+ team2.teamName);
        for (Player player : team2.playerArray) {
            System.out.println(player.playerName);
        }
    }
    
}
