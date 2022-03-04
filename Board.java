/*
 * Activity 2.5.2
 *
 * A Board class the PhraseSolverGame
 */
import java.util.Scanner;
import java.io.File;

public class  Board
{
  private String solvedPhrase;
  private String phrase;
  private int currentLetterValue;

  /* your code here - constructor(s) */
  Board() {
    solvedPhrase = "";
    phrase = loadPhrase();
    setLetterValue();
    System.out.println("Phrase: " + phrase); //temp test code
    System.out.println("SolvedPhrase: " + solvedPhrase);
  }

  /* your code here - accessor(s) */
  public int getLetterValue(){
    //incomplete
    return 0;
  }

  public String getSolvedPhrase(){
    //incomplete
    return null;
  }
  /* your code here - mutator(s)  */


  /* ---------- provided code, do not modify ---------- */
  public void setLetterValue()
  {
    int randomInt = (int) ((Math.random() * 10) + 1) * 100;
    currentLetterValue = randomInt;
  }

  public boolean isSolved(String guess)
  {
    if (phrase.equals(guess))
    {
      return true;
    }
    return false;
  }

  private String loadPhrase()
  {
    String tempPhrase = "";

    int numOfLines = 0;
    try
    {
      Scanner sc = new Scanner(new File("phrases.txt"));
      while (sc.hasNextLine())
      {
        tempPhrase = sc.nextLine().trim();
        numOfLines++;
      }
    } catch(Exception e) { System.out.println("Error reading or parsing phrases.txt"); }

		int randomInt = (int) ((Math.random() * numOfLines) + 1);

    try
    {
      int count = 0;
      Scanner sc = new Scanner(new File("phrases.txt"));
      while (sc.hasNextLine())
      {
        count++;
        String temp = sc.nextLine().trim();
        if (count == randomInt)
        {
          tempPhrase = temp;
        }
      }
    } catch (Exception e) { System.out.println("Error reading or parsing phrases.txt"); }

    for (int i = 0; i < tempPhrase.length(); i++)
    {
      if (tempPhrase.substring(i, i + 1).equals(" "))
      {
        solvedPhrase += "  ";
      }
      else
      {
        solvedPhrase += "_ ";
      }
    }

    return tempPhrase;
  }


  /*
    Compares the characters in phrase to the guess characters
      Precondition: phrase and solvedPhrase must be populated, guess must exist
      Postcondition: Returned a boolean to indicated end of turn status, update solvedPhrase
      to indicate guess letters if applicable.

  */
  public boolean guessLetter(String guess)
  {
    boolean foundLetter = false; // initializing foundLetter to false
    String newSolvedPhrase = ""; // instantiating newSolvedPhrase to an empty String

    // loops through each character in the phrase
    for (int i = 0; i < phrase.length(); i++)
    {
      // compares each letter to Guess
      if (phrase.substring(i, i + 1).equals(guess))
      {
        //add the guess character and a space to newSolvedPhrase
        newSolvedPhrase += guess + " ";
        //sets foundLetter to true to indicate end of turn status
        foundLetter = true;
      }
      else
      {
        //add the previous solvedPhrase character and a space to newSolvedPhrase
        newSolvedPhrase += solvedPhrase.substring(i * 2, i * 2 + 1) + " ";
      }
    }
    solvedPhrase = newSolvedPhrase; //update solvedPhrase to new current game status
    return foundLetter; //returning foundLetter boolean to indicate end of turn status
  }
}
