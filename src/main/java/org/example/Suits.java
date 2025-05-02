package org.example;

public enum Suits {
    HEART("♥"), //u2665
    CLUB("♣"), //
    DIAMOND("♦"), // u2666
    SPADE("♠");// u2660

    private final String suitSymbol;

    // constructor

    private Suits(String suitSymbol) {
        this.suitSymbol = suitSymbol;
    }

    public String getSuitSymbol() {
        return this.suitSymbol;
    }
}
