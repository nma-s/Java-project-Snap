package org.example;

public enum Suits {
    HEART("♥"), //u2665
    CLUB("clubs"), // u2663
    DIAMOND("diamonds"), // u2666
    SPADE("spades");// u2666

    private final String suitSymbol;

    // constructor

    private Suits(String suitSymbol) {
        this.suitSymbol = suitSymbol;
    }

    public String getSuitSymbol() {
        return this.suitSymbol;
    }
}
