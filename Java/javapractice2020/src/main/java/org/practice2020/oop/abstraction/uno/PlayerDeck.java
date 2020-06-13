package org.practice2020.oop.abstraction.uno;

import java.util.List;

public class PlayerDeck {

    private List<UnoCard> playerDeck;

    public PlayerDeck(List<UnoCard> playerDeck) {
        this.playerDeck = playerDeck;
    }


    public void put() {
        if (playerDeck.isEmpty()) {
            // should process
        }
    }

    public void get(Deck gameDeck) {

    }

    public List<UnoCard> getPlayerDeck() {
        return playerDeck;
    }

    @Override
    public String toString() {
        return "PlayerDeck{" +
                "playerDeck=" + playerDeck +
                '}';
    }
}
