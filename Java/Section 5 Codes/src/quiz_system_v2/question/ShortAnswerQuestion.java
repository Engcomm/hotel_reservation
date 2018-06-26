package quiz_system_v2.question;

/**
 *
 * @author ahmed
 */
public class ShortAnswerQuestion extends Question<String>
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
    public boolean checkAnswer(String userAnswer)
    {
        return getAnswer().equalsIgnoreCase(userAnswer);
    }
}
