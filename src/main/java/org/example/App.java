package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args )
    {

    Card card1 = new Card(Suits.HEART,CardSymbol.ACE);
        System.out.println("Test: " + card1);

CardGame snap = new CardGame();
        System.out.println(snap.getDeck());
        System.out.println(snap.getDeck().size());
        System.out.println(snap.dealCard());
        System.out.println(snap.sortDeckInNumberOrder());
        System.out.println("Sorted By Suits" + snap.sortDeckIntoSuits());
        System.out.println(snap.shuffleDeck());


    }
}
