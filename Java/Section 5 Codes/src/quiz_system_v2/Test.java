package quiz_system_v2;

import java.util.Scanner;

import quiz_system_v2.question.MultipleChoiceQuestion;
import quiz_system_v2.question.Question;
import quiz_system_v2.question.TrueFalseQuestion;
import quiz_system_v2.quiz.*;

/**
 *
 * @author ahmed
 */
public class Test
{
	/*
	 * Question<?> q
	 * 	status = ((TrueFalseQuestion)q).checkAnswer(s.nextBoolean());
	 */
    @SuppressWarnings({"rawtypes", "unchecked"})
	public static void main(String[] args)
    {
        Quiz qz1 = Loader.loadFirstQuiz();
        Scanner s = new Scanner(System.in);
        
        System.out.println("Welcome to quiz: " + qz1.getName() + ", supervised by Dr. " + Quiz.getDrName());
        for (Question q: qz1.getQuestions()) 
        {
        	System.out.println(q.getQuestion());
            try {
                boolean status = false;
            	if (q instanceof TrueFalseQuestion)
                	status = q.checkAnswer(s.nextBoolean());
            	else if (q instanceof MultipleChoiceQuestion)
            		status = q.checkAnswer(s.nextInt());
            	else
            		status = q.checkAnswer(s.nextLine());
            	if (status)
            		qz1.incrementScore();
            	else
            		System.out.println("Wrong answer! Correct answer is: " + q.getAnswer());
            } catch (Exception e) {
            	//e.printStackTrace();
            	System.err.println("bad input!");
            }
            
            // handle s.nextLine() problem
            if (q instanceof TrueFalseQuestion)
                s.nextLine();
        }
        
        System.out.println("---------------------------------------");
        System.out.println("Your Score is: " + qz1.getScore() + " out of: " + qz1.getQuestions().size());
        s.close();
    }
}
