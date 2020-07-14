package com.cert.oca8.course.deveduardodogs.module13.practice3.utility;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.cert.oca8.course.deveduardodogs.module13.practice3.GameEvent;
import com.cert.oca8.course.deveduardodogs.module13.practice3.Goal;
import com.cert.oca8.course.deveduardodogs.module13.practice3.Game;

import java.util.Arrays;


/**
 *
 * @author ksomervi
 */
public class GameUtils {

    public static void addGameGoals(Game currGame) {

        //System.out.println(currGame.awayTeam + " : " + currGame.homeTeam);

        // Or possibly throw an Exception?
        if (currGame.getGoals() == null) {
            currGame.setGoals(new Goal[(int) (Math.random() * 10)]); // If goals not initialized max will be 9
        }

        int i = 0;
        for (GameEvent currGoal : currGame.getGoals()) {
            currGoal = new Goal();
            currGoal.setTheTeam(Math.random() > 0.5 ? currGame.getHomeTeam() : currGame.getAwayTeam());
            currGoal.setThePlayer(currGoal.getTheTeam().getPlayerArray()[(int) (Math.random()
                    * currGoal.getTheTeam().getPlayerArray().length)]);
            currGoal.setTheTime((int) (Math.random() * 90));
            currGame.getGoals()[i] = currGoal;
            i++;
        }
        Arrays.sort(currGame.getGoals(), (g1, g2) ->
                Double.valueOf(g1.getTheTime()).compareTo(Double.valueOf(g2.getTheTime())));

    }


}
