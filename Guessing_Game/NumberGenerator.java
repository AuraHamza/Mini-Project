package Guessing_Game;

import java.util.Random;

public class NumberGenerator {
  public static int generate(int min,int max) {
      Random random = new Random();
      return random.nextInt(max - min + 1) + min;
  }
}
