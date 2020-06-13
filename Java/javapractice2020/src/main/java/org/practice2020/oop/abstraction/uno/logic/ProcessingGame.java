package org.practice2020.oop.abstraction.uno.logic;

import org.practice2020.oop.abstraction.uno.Deck;
import org.practice2020.oop.abstraction.uno.Player;
import org.practice2020.oop.abstraction.uno.UnoCard;
import org.practice2020.oop.abstraction.uno.enums.CardSuit;
import org.practice2020.oop.abstraction.uno.enums.Direction;

import java.util.List;
import java.util.Scanner;

public class ProcessingGame {

    private List<Player> players;

    private Direction direction;

    public ProcessingGame(List<Player> players) {
        this.players = players;
    }


    public void start() {
        // step 2. initialization deck
        Deck deck = new Deck();
        deck.shuffle();
        // step 3. deal cards for all players
        for (Player p : players) {
            new ProcessingDecks(p, deck).initializePlayerDeck();
        }

        // step 4. one card is put on desc excluding active and wild cards
        UnoCard currentCardOnDesc;
        do {
            currentCardOnDesc = deck.getRandomCard();
        } while (CardSuit.isActiveOrWildCard(currentCardOnDesc.getCardSuit()));

        // step 5. set direction
        Direction direction = Direction.FORWARD;

        // step 6. players starts the game
        Scanner scanner = new Scanner(System.in);
        do {
            for (Player p : players) {
                System.out.println(p.getName() + " has the next cards:" + p.getPlayerDeck());
                int card = scanner.nextInt();
                currentCardOnDesc = new UnoCard(p.getPlayerDeck().get(card));
                System.out.println(currentCardOnDesc);
            }
            break;
        } while (true);

    }
}
