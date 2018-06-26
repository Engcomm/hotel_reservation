package quiz_system.quiz;

import java.util.ArrayList;

import quiz_system.question.Question;

/**
 *
 * @author ahmed
 */
public class Quiz
{
    // Instance Variables
    private String name;
    private static String DrName;
    private ArrayList<Question> questions;
    private int score;
    
    // Constructor
    public Quiz(String name)
    {
        this.name = name;
        this.score = 0;
        questions = new ArrayList<Question>();
    }
    
    /**
     * @return the DrName
     */
    public static String getDrName()
    {
        return DrName;
    }

    /**
     * @param aDrName the DrName to set
     */
    public static void setDrName(String aDrName)
    {
        DrName = aDrName;
    }
    
    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * @return the questions
     */
    public ArrayList<Question> getQuestions()
    {
        return questions;
    }

    /**
     * @return the score
     */
    public int getScore()
    {
        return score;
    }
    
    /**
     * This function will increment the score by 1
     */
    public void incrementScore()
    {
        score++;
    }
    
    /**
     * 
     * @param q is the question to be added to the quiz 
     */
    public void addQuestion(Question q)
    {
        questions.add(q);
    }
}
