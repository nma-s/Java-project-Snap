package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// STAGE 1
// Contains an ArrayList<Card> for the deckOfCards that contains all 52 cards.
// This is created and populated when the game is constructed.
// Has a name which is also defined in the constructor.
// Has a getDeck method that lists out the cards in the deck.

public class CardGame {
    private ArrayList<Card> deckOfCards = new ArrayList<>();
    private String name;

//  Constructor
    public CardGame() {
      populateDeckOfCards();

    }

    public void populateDeckOfCards() {
        for(Suits suit : Suits.values()) {
            for (CardSymbol cardSymbolValue : CardSymbol.values()) {
                Card card = new Card(suit, cardSymbolValue);
                deckOfCards.add(card);
            }
        }
    }
//  Getter
    public ArrayList<Card> getDeck(){
        return this.deckOfCards;
    }

//    Card dealCard()
//    Takes the card from the top of the deck and returns it.

    public Card dealCard() {
        Card topCard = deckOfCards.getFirst();
        deckOfCards.remove(topCard);
        return topCard;
    }

//    ArrayList<Card> sortDeckInNumberOrder()
//    Sorts the deck in number order (e.g. 2222333344445555 etc)
//    and stores the new shuffled deck back into the deckOfCards attribute.

    public ArrayList<Card> sortDeckInNumberOrder() {
        deckOfCards.sort(Comparator.comparingInt(c -> c.getValue() ));
        return deckOfCards;
    }
//    ArrayList<Card> sortDeckIntoSuits()
//    Sorts the deck into suits (2,3,4,5,6,7,8,9,10,J,Q,K,A of hearts, then 2,3,4,5,6,7,8,9,10,J,Q,K,A of clubs etc.)
//    and stores the new shuffled deck back into the deckOfCards attribute.

    public ArrayList<Card> sortDeckIntoSuits() {
        deckOfCards.sort(Comparator.comparing(c -> c.getSuits() ));
        return deckOfCards;
    }


//    ArrayList<Card> shuffleDeck()
//    Shuffles the deck into a random order and stores the new shuffled deck back into the deckOfCards attribute.

    public ArrayList<Card> shuffleDeck() {
        Collections.shuffle(deckOfCards);
        return deckOfCards;
    }



}
