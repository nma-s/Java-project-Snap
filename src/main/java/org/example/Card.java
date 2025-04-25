package org.example;

import java.util.ArrayList;

// Has a String suit. Use the unicode characters of heart, club, diamond and spade.
// Has a String symbol (2,3,4,5,6,7,8,9,10,J,Q,K,A)
// Has an int value (2,3,4,5,6,7,8,9,10,11,12,13,14)
// Has a toString method that describes the class
public class Card {
    private final String SUIT_HEART = 	"&#9829";
    private final String SUIT_SPADE = 	"&#9829";
    private final String SUIT_DIAMOND = 	"&#9829";
    private final String SUIT_CLUB = 	"&#9829";
    private String symbol;
    private int value;

    //constructor
    public Card(String suit, String symbol, int value) {
                this.suit =
                this.symbol = symbol;
                this.value = value;
    }

    public void toString(){
        System.out.printf("This card is a %d of %d ", symbol, suit);
    }
}
