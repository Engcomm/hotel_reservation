package quiz_system;

import java.util.Scanner;

import quiz_system.question.TrueFalseQuestion;
import quiz_system.quiz.Loader;
import quiz_system.quiz.Quiz;

/**
 *
 * @author ahmed
 */
public class Test
{
    public static void main(String[] args)
    {
        Quiz qz1 = Loader.loadFirstQuiz();
        Scanner s = new Scanner(System.in);
        
        System.out.println("Welcome to quiz: " + qz1.getName() + ", supervised by Dr. " + Quiz.getDrName());
        for (int i = 0; i < qz1.getQuestions().size(); i++)
        {
            System.out.println(qz1.getQuestions().get(i).getQuestion());
            try {
	            if (qz1.getQuestions().get(i).checkAnswer(
	                    qz1.getQuestions().get(i) instanceof TrueFalseQuestion? 
	                    s.nextBoolean():s.nextLine()))
	                qz1.incrementScore();
	            else
                	System.out.println("Wrong answer! Correct answer is: " + qz1.getQuestions().get(i).getAnswer());
            } catch (NumberFormatException e) {
            	System.err.println("bad input!");
            } catch (Exception e) {
            	//e.printStackTrace();
            	System.err.println("bad input!");
            }
            // handle s.nextLine() problem
            if (qz1.getQuestions().get(i) instanceof TrueFalseQuestion)
                s.nextLine();
        }
        
        System.out.println("---------------------------------------");
        System.out.println("Your Score is: " + qz1.getScore() + " out of: " + qz1.getQuestions().size());
        s.close();
    }
}
