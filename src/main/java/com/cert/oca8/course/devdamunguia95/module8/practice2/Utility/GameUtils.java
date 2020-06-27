/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cert.oca8.course.devdamunguia95.module8.practice2.Utility;

import com.cert.oca8.course.devdamunguia95.module6.practice1.Game;
import com.cert.oca8.course.devdamunguia95.module6.practice1.Goal;

/**
 *
 * @author dmunguias
 */
public class GameUtils {

    public static Game addGamesGoals(Game currGame) {

        int numberOfGoals = (int) (Math.random() * 7);

        Goal[] theGoals = new Goal[numberOfGoals];

          
        for (int i = 0; i < theGoals.length; i++) {
             Goal goals=new Goal();
            int numberOfTeam = (int) (Math.random() * 2);
            if (numberOfTeam != 0) {

                int arrayPlayerLength = currGame.awayTeam.playerArray.length;
                int numberOfPlayer = (int) (Math.random() * arrayPlayerLength);
            
                goals.thePlayer = currGame.awayTeam.playerArray[numberOfPlayer];
                goals.theTeam = currGame.awayTeam;
                goals.theTime = (int) (Math.random() * 90);
                
            } 
            else{

                int arrayPlayerLength = currGame.homeTeam.playerArray.length;
                int numberOfPlayer = (int) (Math.random() * arrayPlayerLength);
                goals.thePlayer = currGame.homeTeam.playerArray[numberOfPlayer];
                goals.theTeam = currGame.homeTeam;
                goals.theTime = (int) (Math.random() * 90);
            }

            theGoals[i]=goals;
        }
    

    currGame.goals  = theGoals;

    return currGame ;

}
}
