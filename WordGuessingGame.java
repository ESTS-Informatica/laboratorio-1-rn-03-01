
/**
 * Write a description of class WordGuessingGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WordGuessingGame
{
    private String hiddenWord;
    private String guessedWord;
    private int numberOfTries;
    private InputReader reader;
    
    public WordGuessingGame()
    {
        this.hiddenWord = "abc";
        this.guessedWord = "___";
        this.reader = new InputReader();
        this.numberOfTries = 0;
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
    
    private void showGuessedWord()
    {
        System.out.println(this.guessedWord);
    }
    
    public void play()
    {
        boolean found;
        showWelcome();
        do
        {
            showGuessedWord();
            char letter = this.reader.getChar("");
            found = guess(letter);
            numberOfTries++;
        } 
        while(found == false);
        showGuessedWord();
        showResult();
    }
    
    private void showWelcome()
    {
        System.out.println("Bem vindo ao jogo de adivinhe a palavra, escreva uma letra para começar");
    }
    
    private boolean guess(char letter)
    {
        char guessedWordArray[] = guessedWord.toCharArray();
        
        for(int i = 0; i < hiddenWord.length(); i++)
        {
            if(letter == hiddenWord.charAt(i))
            {
                guessedWordArray[i] = letter;
            }
            this.guessedWord = new String(guessedWordArray);
        }
        
        return guessedWord.equals(hiddenWord);
    }
    
    private void showResult()
    {
        System.out.println("numero de tentativas final: " + numberOfTries);
    }
}
