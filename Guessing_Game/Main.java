package Guessing_Game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name to Start: ");
        String name = scanner.nextLine();

        Player player = new Player(name);
        Game game = new Game(player);
        game.startGame();
    }
}
