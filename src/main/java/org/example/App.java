package org.example;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;


public class App {
    public static void main( String[] args )
    {
        Snap snap = new Snap();
        System.out.println(snap.getDeck().size());
        snap.play();
        System.out.println(snap.getDeck().size());

    }
}


