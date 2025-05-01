package org.example;

// Has a String suit. Use the unicode characters of heart, club, diamond and spade.
// Has a String symbol (2,3,4,5,6,7,8,9,10,J,Q,K,A)
// Has an int value (2,3,4,5,6,7,8,9,10,11,12,13,14)
// Has a toString method that describes the class

public class Card {
    private final Suits suits;
    private final String symbol;
    private final int value;

    //constructor
    public Card(Suits suits, String symbol, int value) {
        this.suits = suits;
        this.symbol = symbol;
        this.value = value;
    }

    public Suits getSuits() {
        return this.suits;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public int getValue() {
        return this.value;
    }

@Override
    public String toString(){
        return "This card is a " + symbol
                + " of " + suits;
}
}
