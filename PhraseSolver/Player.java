/*
 * Activity 2.5.2
 *
 * A Player class the PhraseSolverGame
 */
import java.util.Scanner;

public class Player
{
  /* your code here - attributes */
  private String name;
  private int score;
  /* your code here - constructor(s) */
  Player() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter player name: ");
    name = sc.nextLine();
    System.out.println("Welcome to the game, " + name);
    score = 0;
  }

  /* your code here - accessor(s) */
  Player(String inputName) {
    name = inputName;
    score = 0;
    System.out.println("Welcome to the game, " + name);
  }

  public String getName() {
    return name;
  }

  public int getScore() {
    return score;
  }
  /* your code here - mutator(s) */
  public void setName(String newName) {
    name = newName;
  }

  public void setScore(String newScore) {
    score = newScore;
  }

}
