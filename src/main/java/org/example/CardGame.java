package org.example;

import java.util.ArrayList;

// Contains an ArrayList<Card> for the deckOfCards that contains all 52 cards.
// This is created and populated when the game is constructed.
// Has a name which is also defined in the constructor.
// Has a getDeck method that lists out the cards in the deck.
public class CardGame {
    private ArrayList<Card> deckOfCards = new ArrayList<>();
    private String name;

    public CardGame() {
        this.name = name;
    }

    public ArrayList<Card> getDeck(){
        return this.deckOfCards;
    }

}
