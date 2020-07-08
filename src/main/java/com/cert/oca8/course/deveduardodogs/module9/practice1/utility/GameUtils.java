package com.cert.oca8.course.deveduardodogs.module9.practice1.utility;

import com.cert.oca8.course.deveduardodogs.module9.practice1.Goal;
import com.cert.oca8.course.deveduardodogs.module9.practice1.Team;
import com.cert.oca8.course.deveduardodogs.module9.practice1.Game;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class GameUtils {

    public static void addGameGoals(Game currGame) {

        Team team;

        if (currGame.getGoals() == null) {
            currGame.setGoals(new Goal[(int) (Math.random() * 9)]);
        }

        int i = 0;
        for (Goal currGoal: currGame.getGoals()) {
            currGoal = new Goal();
            currGoal.setTheTeam(Math.random() > 0.5 ? getHomeTeam(currGame, "home") : getHomeTeam(currGame, "away"));
            currGoal.setThePlayer(currGoal.getTheTeam().getPlayerArray()[(int) (Math.random() *
                    currGoal.getTheTeam().getPlayerArray().length)]);
            currGoal.setTheTime((int) (Math.random() * 90));
            currGame.getGoals()[i] = currGoal;
            i++;
        }
        Arrays.sort(currGame.getGoals(),
                (g1, g2) -> Double.valueOf(g1.getTheTime()).compareTo(Double.valueOf(g2.getTheTime())));
    }

    // Uses reflection so works with getter method or public field
    private static Team getHomeTeam(Game currGame, String homeOrAway) {
        Team theTeam = null;
        Method m;
        Field f;
        try {
            m = Game.class.getMethod("get" + Character.toUpperCase(homeOrAway.charAt(0)) +
                    homeOrAway.substring(1) + "Team");
            theTeam = (Team)m.invoke(currGame);
        } catch (NoSuchMethodException|IllegalAccessException|InvocationTargetException em) {
            try {
                f = Game.class.getField(homeOrAway + "Team");
                theTeam = (Team)f.get(currGame);
            } catch (NoSuchFieldException|IllegalAccessException ef) {
                System.out.println("The addGoals() utility requires the Goal class to contain either:\n" +
                        "public String fields called homeTeam and awayTeam, OR,\n" +
                        "public accessor methods called getHomeTeam() and getAwayTeam().");
            }
        }
        return theTeam;
    }
}
