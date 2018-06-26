package quiz_system_v2.question;

/**
 *
 * @author ahmed
 */
public abstract class Question<T>
{
    // Instance Variables
    private String question;

    // Constructor ... will be used only in the child, can't be used in the Test, as the class is abstract
    public Question(String text)
    {
        question = text;
    }

    /**
     * 
     * @return the current question text
     */
    public String getText()
    {
        return question;
    }

    /**
     * 
     * @return the question in the appropriate format according to the child type
     */
    public abstract String getQuestion();

    /**
     * 
     * @return the answer to the current question in the appropriate format according to the child type
     */
    public abstract String getAnswer();

    /**
     * 
     * This function should be called to check the user answer (read from user) with the correct answer
     * @param user_answer is the answer the used should input to the program
     * @return true if the two answers are matched
     */
    public abstract boolean checkAnswer(T userAnswer);
}
