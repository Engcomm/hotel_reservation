package quiz_system_v2.question;

/**
 *
 * @author ahmed
 */
public class TrueFalseQuestion extends Question<Boolean>
{
    // Instance Variables
    private static final String append = "\nIs this statement true or false?";
    private boolean answer;

    // Constructor
    public TrueFalseQuestion(String text, boolean myanswer)
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
        return Boolean.toString(answer);
    }

    /**
     * <b>Child comment:</b> <br/>
     * This function should take boolean input to check with the current boolean answer. <br/><br/>
     * {@inheritDoc} 
     */
    @Override
    public boolean checkAnswer(Boolean userAnswer)
    {
        return !(userAnswer ^ answer);
    }
}
