package org.example;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;


public class App {
    public static void main( String[] args )
    {
        Snap snap2 = new Snap();
        System.out.println(snap2.getDeck().size());
        snap2.play();
        System.out.println(snap2.getDeck().size());

    }
}


