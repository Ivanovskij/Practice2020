package org.practice2020.oop.abstraction.uno;

import org.practice2020.oop.abstraction.uno.enums.Status;
import org.practice2020.oop.abstraction.uno.logic.ProcessingGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameLauncher {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Player> players = new ArrayList<>();

       do {
            do {
                // step 1. players enter their names
//                System.out.println("Input name:");
//                String name = scanner.nextLine();
                players.add(new SimplePlayer("test", Status.SIMPLE));
                players.add(new SimplePlayer("test1", Status.SIMPLE));
            } while (players.size() < 2);

            // delegation processing to processingGame layer
            new ProcessingGame(players).start();

            System.out.println(players);
            break;
        } while (true);
    }

}
