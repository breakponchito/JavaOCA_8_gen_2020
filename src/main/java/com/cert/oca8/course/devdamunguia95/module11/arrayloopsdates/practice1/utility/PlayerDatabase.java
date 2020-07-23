/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cert.oca8.course.devdamunguia95.module11.arrayloopsdates.practice1.utility;

import com.cert.oca8.course.devdamunguia95.module11.arrayloopsdates.practice1.soocer.Player;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author Administrator
 */
public class PlayerDatabase {

    /* Practice 11-2. Declare an ArrayList here */
    private ArrayList<Player> players;

    /* Practice 11-2. Add Constructor here */
    public PlayerDatabase() {
        StringTokenizer authorToken = new StringTokenizer(authorList, ",");
        players = new ArrayList();
        while (authorToken.hasMoreElements()) {
            players.add(new Player((String) authorToken.nextElement()));

        }
    }
    /* Practice 11-2. Add getTeam() method here */

    public Player[] getTeam(int numberOfPlayers){
    
    Player[] teamsPlayer=new Player[numberOfPlayers]; 
    
        for (int i = 0; i < numberOfPlayers; i++) {
            int playerIndex= (int) (Math.random()*players.size());
            teamsPlayer[i]=players.get(playerIndex);
        }
    
    
    return teamsPlayer;
    }
    String authorList
            = "Agatha Christie,"
            + "Alan Patton,"
            + "Alexander Solzhenitsyn,"
            + "Arthur Conan Doyle,"
            + "Anthony Trollope,"
            + "Baroness Orczy,"
            + "Brendan Behan,"
            + "Brian Moore,"
            + "Boris Pasternik,"
            + "Charles Dickens,"
            + "Charlotte Bronte,"
            + "Dorothy Parker,"
            + "Emile Zola,"
            + "Frank O'Connor,"
            + "Geoffrey Chaucer,"
            + "George Eliot,"
            + "G. K. Chesterton,"
            + "Graham Green,"
            + "Henry James,"
            + "James Joyce,"
            + "J. M. Synge,"
            + "J. R. Tolkien,"
            + "Jane Austin,"
            + "Leo Tolstoy,"
            + "Liam O'Flaherty,"
            + "Marcel Proust,"
            + "Mark Twain,"
            + "Oscar Wilde,"
            + "O. Henry,"
            + "Samuel Beckett,"
            + "Sean O'Casey,"
            + "William Shakespeare,"
            + "William Makepeace Thackeray,"
            + "W. B. Yeats,"
            + "Wilkie Collins";

}
