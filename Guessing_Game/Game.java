package Guessing_Game;

import java.util.Scanner;

public class Game {
    private int targetNumber;
    Player player;
    protected Scanner scanner;

    public Game(Player player) {
        this.player = player;
        this.scanner=new Scanner(System.in);
        generateNumber();
    }

    public void generateNumber(){
        targetNumber=NumberGenerator.generate(1, 100);
    }
    public void startGame(){
        System.out.println("Welcome " + player.getName() + "! Try to guess the number between 1 and 100.");
        boolean guessedCorrectly = false;

        while (!guessedCorrectly){
            System.out.println("Enter your guess: ");
            int guess=scanner.nextInt();
            player.incrementattempts();

            if (checkGuess(guess)) {
                System.out.println("🎉 Correct! You guessed it in " + player.getAttempts() + " attempts.");
                guessedCorrectly = true;
            } else {
                giveHint(guess);
            }
        }
    }
    public boolean checkGuess(int guess) {
        return guess == targetNumber;
    }
    public void giveHint(int guess) {
        if (guess < targetNumber) {
            System.out.println("Too low! Try a higher number.");
        } else {
            System.out.println("Too high! Try a lower number.");
        }
    }

}
