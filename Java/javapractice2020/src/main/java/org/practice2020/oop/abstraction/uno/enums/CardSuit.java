package org.practice2020.oop.abstraction.uno.enums;

public enum CardSuit {

    ZERO,
    ONE,
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    SKIP,
    REVERSE,
    WILD,
    DRAW_TWO,
    WILD_DRAW_FOUR;

    public static final int NUMBER_OF_DIGITS = 10;
    public static final int NUMBER_OF_WILDS = 4;

    public static boolean isActiveOrWildCard(CardSuit suit) {
        return suit == SKIP ||
                suit == WILD ||
                suit == REVERSE ||
                suit == DRAW_TWO ||
                suit == WILD_DRAW_FOUR;
    }

}
