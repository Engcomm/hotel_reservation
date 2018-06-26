package quiz_system_v2.question;

/**
 *
 * @author ahmed
 */
public class FillInBlankQuestion extends Question<String>
{
    // Instance Variables
    private static final String append = "\nFill in the blank.";
    private String answer;

    // Constructor
    public FillInBlankQuestion(String text, String myanswer)
    {
        super(text);
        answer = myanswer;
    }
    
    /**
     * {@inheritDoc} 
     */
    @Override
    public String getQuestion()
    {
        return getText() + append;
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
