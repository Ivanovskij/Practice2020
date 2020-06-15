package org.practice2020.oop.abstraction.uno;

import org.practice2020.oop.abstraction.uno.enums.CardSuit;
import org.practice2020.oop.abstraction.uno.enums.Color;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Deck {

    private static final int WILD_COLOR = 1;
    /*
    * 19 blue - 0-9
    * 19 green - 0-9
    * 19 red - 0-9
    * 19 yellow - 0-9
    *
    * sum 76
    *
    * 8 draw two - 2 cards of blue, green, red, yellow
    * 8 skip - 2 cards of blue, green, red, yellow
    * 8 reverse - 2 cards of blue, green, red, yellow
    *
    * sum 100
    *
    * 4 wild
    * 4 wild draw four
    *
    * sum 108
    *
    * but, if we arrange all these cards in order, it will turn out 112
    * */
    private List<UnoCard> cards;

    public Deck() {
        cards = new ArrayList<>();
        initialize();
    }

    private List<UnoCard> initialize() {
        Color[] colors = Color.values();
        CardSuit[] suits = CardSuit.values();
        CardSuit[] activeCards = {CardSuit.REVERSE, CardSuit.DRAW_TWO, CardSuit.SKIP};

        // initialize numbers
        for (int colorIndex = 0; colorIndex < Color.values().length - WILD_COLOR; colorIndex++) {
            for (int digitIndex = 0; digitIndex < CardSuit.NUMBER_OF_DIGITS; digitIndex++) {
                cards.add(new UnoCard(colors[colorIndex], suits[digitIndex]));
                cards.add(new UnoCard(colors[colorIndex], suits[digitIndex]));
            }

            // initialize active cards
            for (CardSuit active : activeCards) {
                cards.add(new UnoCard(colors[colorIndex], active));
                cards.add(new UnoCard(colors[colorIndex], active));
            }
        }

        // initialize wild cards
        for (int wildIndex = 0; wildIndex < CardSuit.NUMBER_OF_WILDS; wildIndex++) {
            cards.add(new UnoCard(Color.WILD, CardSuit.WILD));
            cards.add(new UnoCard(Color.WILD, CardSuit.WILD_DRAW_FOUR));
        }

        return cards;
    }

    public List<UnoCard> shuffle() {
        Collections.shuffle(cards);
        return cards;
    }

    public UnoCard get(int index) {
        return cards.get(index);
    }

    public UnoCard getRandomCard() {
        Supplier<UnoCard> generator = () -> cards.get(new Random().nextInt(cards.size()));
        return generator.get();
    }

    public void remove(int fromIndex, int toIndex) {
        cards.subList(fromIndex, toIndex).clear();
    }

    public List<UnoCard> getCards() {
        return cards;
    }
}
