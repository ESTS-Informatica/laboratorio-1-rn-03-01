
/**
 * Write a description of class WordGuessingGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WordGuessingGame
{
    // instance variables - replace the example below with your own
    private String hiddenWord;
    private String guessedWord;
    private int numberOfTries;
    
    public WordGuessingGame()
    {
        this.hiddenWord = "abc";
        this.guessedWord = "___";
    }
    
    public String getHiddenWord()
    {
        return hiddenWord;
    }
    public String getGuessedWord()
    {
        return guessedWord;
    }
    public int getNumberOfTries()
    {
        return numberOfTries;
    }
    
    public void showGuessedWord()
    {
        System.out.println(this.guessedWord);
    }
}
