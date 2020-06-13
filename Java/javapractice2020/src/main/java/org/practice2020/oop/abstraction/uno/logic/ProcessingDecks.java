package org.practice2020.oop.abstraction.uno.logic;

import org.practice2020.oop.abstraction.uno.Deck;
import org.practice2020.oop.abstraction.uno.Player;
import org.practice2020.oop.abstraction.uno.PlayerDeck;

import java.util.ArrayList;

public class ProcessingDecks {

    private Player player;
    private Deck deck;

    public ProcessingDecks(Player player, Deck deck) {
        this.player = player;
        this.deck = deck;
    }

    public void initializePlayerDeck() {
        player.setPlayerDeck(new PlayerDeck(new ArrayList<>(deck.getCards().subList(0,7))));
        deck.remove(0,7);
    }
}
