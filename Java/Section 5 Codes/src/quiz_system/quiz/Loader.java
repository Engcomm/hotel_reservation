/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz_system.quiz;

import quiz_system.question.FillInBlankQuestion;
import quiz_system.question.MultipleChoiceQuestion;
import quiz_system.question.ShortAnswerQuestion;
import quiz_system.question.TrueFalseQuestion;

/**
 *
 * @author ahmed
 */
public class Loader
{
    public static Quiz loadFirstQuiz()
    {
        Quiz.setDrName("Ahmed Hamdy");
        Quiz qz1 = new Quiz("First Quiz");
        qz1.addQuestion(new ShortAnswerQuestion("What is the language Android is written with?", "Java"));
        qz1.addQuestion(new FillInBlankQuestion("Java considered ______ Programming language", "Object Oriented"));
        qz1.addQuestion(new TrueFalseQuestion("C++ is a structure programming language", false));
        MultipleChoiceQuestion m = new MultipleChoiceQuestion("Apple currently is shifting its programs to ");
        m.addChoice("Objective C", false);
        m.addChoice("Java", false);
        m.addChoice("Swift", true);
        m.addChoice("C++", false);
        m.addChoice("Python", false);
        qz1.addQuestion(m);
        return qz1;
    }
}
