package org.practice2020.oop.abstraction.uno;

import org.practice2020.oop.abstraction.uno.enums.CardSuit;
import org.practice2020.oop.abstraction.uno.enums.Color;

public class UnoCard  {

    private CardSuit cardSuit;
    private Color color;

    public UnoCard(UnoCard unoCard) {
        this(unoCard.getColor(), unoCard.getCardSuit());
    }

    public UnoCard(Color color, CardSuit cardSuit) {
        this.color = color;
        this.cardSuit = cardSuit;
    }

    public CardSuit getCardSuit() {
        return cardSuit;
    }

    public void setCardSuit(CardSuit cardSuit) {
        this.cardSuit = cardSuit;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "UnoCard{" +
                "color=" + color +
                ", cardSuit=" + cardSuit +
                '}';
    }
}
