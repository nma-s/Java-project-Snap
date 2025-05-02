package org.example;


public enum CardSymbol {
    TWO("2", 2),
    THREE("3", 3),
    FOUR("4", 4),
    FIVE("5", 5),
    SIX("6", 6),
    SEVEN("7", 7),
    EIGHT("8",8),
    NINE("9",9),
    TEN("10",10),
    JACK("J", 11),
    QUEEN("Q", 12),
    KING("K", 13),
    ACE("A", 14);

    private final String cardSymbol;

    private final int cardValue;

    private CardSymbol(String cardSymbol, int cardValue){
        this.cardSymbol = cardSymbol;
        this.cardValue = cardValue;
    }

    public String getCardSymbol() {
        return cardSymbol;
    }

    public int getCardValue(){
        return cardValue;
    }
}
