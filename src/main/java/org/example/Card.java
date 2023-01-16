package org.example;
import java.util.HashMap;

public class Card {
    private final String suit;
    private final String symbol;
    private final int value;

    final static HashMap<String, Character> suitUnicodes = new HashMap<>(){{
        put("diamond", '\u2666');
        put("heart", '\u2764');
        put("club", '\u2663');
        put("spade", '\u2660');
    }};

    public Card(String suit, String symbol, int value) {
        this.suit = suit;
        this.symbol = symbol;
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getValue() {
        return value;
    }


    @Override
    public String toString() {
        return "[" + suitUnicodes.get(this.suit) + this.symbol + "]";
    }
}
