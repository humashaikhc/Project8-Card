package org.example;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Snap extends DeckofCards{
    DeckofCards deck = new DeckofCards();
    private String previousCardSymbol = "";
    private String snapWordStr = "";

    public void play(){
        boolean isGameOver = false;

        Display.displayStartScreen();

        while(!isGameOver){

            Display.promptDealCard();
            String currentCardSymbol = deck.dealCard().getSymbol();

            if(previousCardSymbol.equals(currentCardSymbol)) {
                checkForSnapWord();
                isGameOver = true;
            }

            Player.switchPlayer();
            previousCardSymbol = currentCardSymbol;
            if (deck.getDeck().size() == 0) deck = new DeckofCards();
        }
    }

    public void checkForSnapWord() {

        Scanner scanner = new Scanner(System.in);

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println();
                System.out.println("You didn't enter the \"SNAP\" word.");
                Display.endGameMessage(!snapWordStr.isEmpty());
                System.exit(0);
            }
        };

        Timer timer = new Timer();

        System.out.println("TYPE SNAP");
        timer.schedule(task, 5000);
        snapWordStr = scanner.nextLine();
        timer.cancel();

        Display.endGameMessage(snapWordStr.equalsIgnoreCase("SNAP"));
    }

}
