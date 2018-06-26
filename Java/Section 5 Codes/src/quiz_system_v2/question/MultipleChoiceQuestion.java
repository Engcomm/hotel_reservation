package quiz_system_v2.question;

import java.util.LinkedList;

/**
 *
 * @author ahmed
 */
public class MultipleChoiceQuestion extends Question<Integer>
{
    // Instance Variables
    private LinkedList<String> choices;
    private Integer corrent_choice_counter;
    private static final String append = "\n Enter the best choice.";

    // Constructor
    public MultipleChoiceQuestion(String text)
    {
        super(text);
        corrent_choice_counter = new Integer(-1);
        choices = new LinkedList<String>();
        
    }

    /**
     * This function is used to add a choice to the current question
     * @param choice is a string represent the choice
     * @param type true if the current choice is the correct one
     */
    public void addChoice(String choice, boolean type)
    {
        choices.add(choice);
        if (type)
        {
            corrent_choice_counter = choices.size()-1;
        }
    }

    /**
     * {@inheritDoc} 
     */
    @Override
    public String getQuestion()
    {
        String answers = "(";
        for (int i = 0; i < choices.size(); i++)
        {
            answers += (i + 1) + "-" + choices.get(i) + ", ";
        }
        answers = answers.substring(0, answers.length() - 2) + ")";
        return getText() + append + "\n Answers :" + answers;
    }

    /**
     * {@inheritDoc} 
     */
    @Override
    public String getAnswer()
    {
        return choices.get(corrent_choice_counter);
    }

    /**
     * {@inheritDoc} 
     */
    @Override
    public boolean checkAnswer(Integer userAnswer)
    {
        return getAnswer().equalsIgnoreCase(choices.get(userAnswer - 1));
    }
}
