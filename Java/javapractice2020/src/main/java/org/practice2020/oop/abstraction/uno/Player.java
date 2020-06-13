package org.practice2020.oop.abstraction.uno;

import org.practice2020.oop.abstraction.uno.enums.Status;

import java.util.List;

public abstract class Player {

    protected String name;
    protected Status status;

    public Player(String name, Status status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public abstract void setPlayerDeck(PlayerDeck playerDeck);

    public abstract List<UnoCard> getPlayerDeck();

}
