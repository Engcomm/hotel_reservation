package quiz_system.question;

/**
 *
 * @author ahmed
 */
public class ShortAnswerQuestion extends Question
{
    // Instance Variables
    private String answer;

    // Constructor
    public ShortAnswerQuestion(String text, String myAnswer)
    {
        super(text);
        answer = myAnswer;
    }

    /**
     * {@inheritDoc} 
     */
    @Override
    public String getQuestion()
    {
        return getText();
    }

    /**
     * {@inheritDoc} 
     */
    @Override
    public String getAnswer()
    {
        return answer;
    }

    /**
     * {@inheritDoc} 
     */
    @Override
    public boolean checkAnswer(Object userAnswer)
    {
        return getAnswer().equalsIgnoreCase((String) userAnswer);
    }
}
