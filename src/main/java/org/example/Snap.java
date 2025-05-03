package org.example;

// Create class for Snap that extends CardGame.
// This class should use the methods defined above, as well as some new ones,
// to enable the user to play the game snap according to the following rules:
// By pressing enter in the command line, the user takes their turn.
// Each turn, a new card is dealt from the deck.
// The game continues until two cards in a row have the same symbol, at which point the “player” wins and the game ends.

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Snap extends CardGame {
    Scanner snapScanner = new Scanner(System.in);

    public Card runSnapScanner(){
        System.out.println("Press enter to deal a card");
        snapScanner.nextLine();
        return dealCard();
//        getDeck().remove(dealCard());
    }


    public Snap(){
        super();
    }


}
