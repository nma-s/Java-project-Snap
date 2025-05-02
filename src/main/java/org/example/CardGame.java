package org.example;

import java.util.ArrayList;

// Contains an ArrayList<Card> for the deckOfCards that contains all 52 cards.
// This is created and populated when the game is constructed.
// Has a name which is also defined in the constructor.
// Has a getDeck method that lists out the cards in the deck.
public class CardGame {
    private ArrayList<Card> deckOfCards = new ArrayList<>(52);
    private String name;


    public CardGame() {
      populateDeckOfCards();

    }


    public ArrayList<Card> populateDeckOfCards() {
        for(Suits suit : Suits.values()) {
            for (CardSymbol cardSymbolValue : CardSymbol.values()) {
                Card card = new Card(suit, cardSymbolValue);
                deckOfCards.add(card);
            }
        }
        return deckOfCards;
    }
//Card card2 = new Card(Suits.HEART, CardSymbol.SIX);
//    deckOfCards.add(card2);

//    public CardGame() {
//
//        String[] symbols = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
//        int[] values = {2,3,4,5,6,7,8,9,10,11,12,13,14};
//        for(Suits suit: Suits) {
//
//        }
//    }

    public ArrayList<Card> getDeck(){
        return this.deckOfCards;
    }

}
