package org.example;

// Has a String suit. Use the unicode characters of heart, club, diamond and spade.
// Has a String symbol (2,3,4,5,6,7,8,9,10,J,Q,K,A)
// Has an int value (2,3,4,5,6,7,8,9,10,11,12,13,14)
// Has a toString method that describes the class

public class Card {
    private final String suits;
    private final String symbol;
    private final int value;

    //constructor
    public Card(Suits suits, CardSymbol symbolValue) {
        this.suits = suits.getSuitSymbol();
        this.symbol = symbolValue.getCardSymbol();
        this.value = symbolValue.getCardValue();
    }

    public String getSuits() {
        return suits;
    }
//
//    public String getSymbol() {
//        return symbol.getCardSymbol();
//    }
//
    public int getValue() {
        return value;
    }

@Override
    public String toString(){
    return "\tCard: " + symbol
                + " of " + suits + " (value: " + value +")";
}
}
