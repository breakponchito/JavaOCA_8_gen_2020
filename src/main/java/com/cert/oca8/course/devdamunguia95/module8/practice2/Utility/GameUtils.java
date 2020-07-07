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

      
        for (int i = 0; i < currGame.getGoals().length; i++) {
             Goal goals=new Goal();
            int numberOfTeam = (int) (Math.random() * 2);
            if (numberOfTeam != 0) {

                int arrayPlayerLength = currGame.getAwayTeam().getPlayerArray().length;
                int numberOfPlayer = (int) (Math.random() * arrayPlayerLength);
            
                goals.setThePlayer(currGame.getAwayTeam().getPlayerArray()[numberOfPlayer]);
                goals.setTheTeam(currGame.getAwayTeam());
                goals.setTheTime((int) (Math.random() * 90));
                
            } 
            else{

                int arrayPlayerLength = currGame.getHomeTeam().getPlayerArray().length;
                int numberOfPlayer = (int) (Math.random() * arrayPlayerLength);
                goals.setThePlayer(currGame.getHomeTeam().getPlayerArray()[numberOfPlayer]);
                goals.setTheTeam(currGame.getHomeTeam());
                goals.setTheTime((int) (Math.random() * 90));
            }

            currGame.getGoals()[i]=goals;
        }
    



    return currGame ;

}
}
