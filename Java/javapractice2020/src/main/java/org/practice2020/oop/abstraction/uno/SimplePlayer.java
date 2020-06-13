package org.practice2020.oop.abstraction.uno;

import org.practice2020.oop.abstraction.uno.enums.Status;

import java.util.List;

public class SimplePlayer extends Player {

    private PlayerDeck playerDeck;

    public SimplePlayer(String name, Status status) {
        super(name, status);
    }

    @Override
    public void setPlayerDeck(PlayerDeck playerDeck) {
        this.playerDeck = playerDeck;
    }

    @Override
    public List<UnoCard> getPlayerDeck() {
        return playerDeck.getPlayerDeck();
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerDeck=" + playerDeck +
                ", name='" + name +
                '}';
    }
}
