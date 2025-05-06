package org.example;

public class Player {
    private String player1;
    private String player2;
    
    public Player(String player1, String player2){
        this.player1 = player1;
        this.player2 = player2;
    }
    
    public String switchPlayer(){
        String turn = "";
        if(turn.equals(player1)){
            return player2;
        } else {
            return player1;
        }
    }
}

