package org.example;

import java.util.Scanner;

public class Display {
    private static final Scanner scanner = new Scanner(System.in);

    public static void displayStartScreen(){
        System.out.println("Welcome to snap game!!");
        System.out.println("- Press enter to deal a card");
        System.out.println("- If the card has the same symbol as the previous one");
        System.out.println("- Quickly type \"SNAP\" and hit enter to win, you have 2 seconds");
        System.out.println("- If you type it in time - you win, but if it's too slow - the other player wins.");
    }

    public static void endGameMessage(boolean isWinner){
        if (!isWinner) Player.switchPlayer();
        System.out.println("-----------------------------------------");
        System.out.println("            Player " + Player.getPlayer() + " won");
        System.out.println("-----------------------------------------");
    }

    public static void promptDealCard(){
        System.out.println("Player " + Player.getPlayer() + " turn");
        System.out.println("Press ENTER to deal a card");
        scanner.nextLine();
    }
}
