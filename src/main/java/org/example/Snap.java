package org.example;

// Create class for Snap that extends CardGame.
// This class should use the methods defined above, as well as some new ones,
// to enable the user to play the game snap according to the following rules:
// By pressing enter in the command line, the user takes their turn.
// Each turn, a new card is dealt from the deck.
// The game continues until two cards in a row have the same symbol, at which point the “player” wins and the game ends.

import java.util.ArrayList;
import java.util.Scanner;

public class Snap extends CardGame {
    Scanner snapScanner = new Scanner(System.in);

    public Snap(){
        super();
//        this.player1Array = getPlayer1Array();
//        this.player2Array = getPlayer2Array();
        playerDecks();
    }

    public void playerDecks() {
        ArrayList<Card> deckOfCards = getDeck();
        for (int i = 0; i < deckOfCards.size(); i++) {
            if(i % 2 == 0) {
                 player1Array.add(deckOfCards.get(i));
            } else {
                player2Array.add(deckOfCards.get(i));
            }
        }
        System.out.println("player1" + player1Array);
        System.out.println("player2" + player2Array);
    }


//
//    public ArrayList<Card> getPlayer1Array() {
//        return player1Array;
//    }
//
//    public ArrayList<Card> getPlayer2Array() {
//        return player2Array;
//    }

    public void playSnap(){
        boolean gameEnded = false;
        System.out.println("Welcome to Snap! Press enter to deal a card");
        //    ArrayList<Card> player1Array  = new ArrayList<>();
        //    ArrayList<Card> player2Array = new ArrayList<>();
        Card previousCard = null;
        while(!gameEnded && !deckOfCards.isEmpty()) {
            snapScanner.nextLine();
            Card currentCard = dealCard();
            System.out.println(currentCard);
            System.out.println(currentCard.getSymbol());
            if(previousCard != null && currentCard.getSymbol().equals(previousCard.getSymbol())){
                System.out.println("Snap! Both cards have the same symbol " + previousCard.getSymbol());
                gameEnded = true;
            }
            previousCard = currentCard;
        }



    }





}
