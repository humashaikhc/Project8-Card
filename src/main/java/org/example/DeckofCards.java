package org.example;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class DeckofCards {
    private final List<Card> cards = new ArrayList<>();
    public DeckofCards(){
        createDeck();
        shuffleDeck();
    }

    public void createDeck(){
        final String[] SUITS = { "diamond", "heart", "club", "spade" };
        final int[] VALUES = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
        final String[] SYMBOLS = {"A","2","3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        for (String suit : SUITS) {
            for (int i = 0; i < VALUES.length; i++) {
                cards.add(new Card(suit, SYMBOLS[i], VALUES[i]));
            }
        }
    }

    public List<Card> getDeck(){
        return this.cards;
    }

    public Card dealCard(){
        System.out.println(this.cards.get(0));
        return this.cards.remove(0);
    }

    public void sortDeckInNumberOrder(){
        this.cards.sort(Comparator.comparingInt(Card::getValue));
    }

    public void sortDeckIntoSuits(){
        this.cards.sort(Comparator.comparing(Card::getSuit));
    }

    public void shuffleDeck(){
        Collections.shuffle(this.cards);
    }


}
