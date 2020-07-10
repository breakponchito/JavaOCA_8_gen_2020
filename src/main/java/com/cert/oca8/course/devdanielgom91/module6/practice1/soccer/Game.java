package com.cert.oca8.course.devdanielgom91.module6.practice1.soccer;

import com.cert.oca8.course.devdanielgom91.module8.practice2.utility.GameUtils;

/**
 *
 * @author daniel77
 */
public class Game {
    public Team homeTeam;
    public Team awayTeam;
    public Goal[] goals;
    
    public void playGame() {  	
    	GameUtils.addGameGoals(this);
    }
    
    public String getDescription(){
    	StringBuilder returnString = new StringBuilder();
    	
    	for (Goal currGoal: this.goals){ 
    		returnString.append("Goal scored after " + currGoal.theTime + " mins by " + 
    				currGoal.thePlayer.playerName + " of " + currGoal.theTeam.teamName+"\n");
    	}
    	
    	return returnString.toString();
    }
    
}
