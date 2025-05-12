package org.example;

// Create class for Snap that extends CardGame.
// This class should use the methods defined above, as well as some new ones,
// to enable the user to play the game snap according to the following rules:
// By pressing enter in the command line, the user takes their turn.
// Each turn, a new card is dealt from the deck.
// The game continues until two cards in a row have the same symbol, at which point the “player” wins and the game ends.

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Timer;
import java.util.concurrent.*;

public class Snap extends CardGame {
    Scanner snapScanner = new Scanner(System.in);
    Player player1;
    Player player2;
    Player currentPlayer;
    ExecutorService executor = Executors.newSingleThreadExecutor();


    public Snap() {
        super();
    }

    @Override
    public void play(){
        boolean gameEnded = false;
        Card previousCard = null;
        System.out.println("Player 1, enter your name:");
        player1 = new Player(snapScanner.nextLine());
        System.out.println("Player 2, enter your name:");
        player2 = new Player(snapScanner.nextLine());
        System.out.println(player1.getPlayerName() + " and "+ player2.getPlayerName() +" welcome to Snap! Press enter to deal a card");
        currentPlayer = player1;
//        System.out.println("It's " + currentPlayer.getPlayerName() + "'s turn." + "Press enter to deal a card");
        while(!gameEnded && !deckOfCards.isEmpty()) {
            System.out.println("It's " + currentPlayer.getPlayerName() + "'s turn. " + "Press enter to deal a card");
            snapScanner.nextLine();
            Card currentCard = dealCard();
            System.out.println(currentCard);
            if(previousCard != null && currentCard.getSymbol().equals(previousCard.getSymbol())){
                //System.out.println("Snap! " + currentPlayer.getPlayerName() + " has won! Both cards have the same symbol " + previousCard.getSymbol());
                gameEnded = checkSnapTimer();
            }
            previousCard = currentCard;
            if(!gameEnded){
                currentPlayer = (currentPlayer == player1 ? player2 : player1);
            }
        }
        if(deckOfCards.isEmpty()){
            System.out.println("There are no more cards left. Game over");
        }
    }

    public  boolean checkSnapTimer() {
        System.out.println("Type 'snap' to win! You have 2 seconds. GO, GO, GO!");
        Callable<String> playerInput = () -> snapScanner.nextLine();
        Future<String> snapResult = executor.submit(playerInput);
        try {
            String input = snapResult.get(7, TimeUnit.SECONDS);
            if("snap".equalsIgnoreCase(input)){
                System.out.println(currentPlayer.getPlayerName() + " won!");
                return true;
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            System.out.println("Too slow! Game over");
            snapResult.cancel(true);
            return true;
        }
        return false;
    }
}
