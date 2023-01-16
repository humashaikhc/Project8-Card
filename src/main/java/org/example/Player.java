package org.example;

public class Player {
    private static final String YELLOW = "\u001B[33m";
    private static final String PURPLE = "\u001B[35m";
    private static int player = 1;

    public static void switchPlayer(){
        player = player == 1 ? 2 : 1;
    }

    public static int getPlayer() {
        if (player == 1) {
            System.out.print(PURPLE);
        } else {
            System.out.print(YELLOW);
        }
        return player;
    }
}
