package PracticaConcurso;

import java.util.ArrayList;

public class Preguntas {
    private String questionStatement;
    private String correctAnswer;
    private int questionPunctuation;
    private Premios premio;

    public boolean correctAnswer(String answer){
        return correctAnswer.equalsIgnoreCase(answer);
    }
    public Preguntas(String questionStatement, String correctAnswer) {
        this.correctAnswer = correctAnswer;
        this.questionStatement = questionStatement;
    }
    public Preguntas(String questionStatement, boolean correctAnwser){
        this.correctAnswer = String.valueOf(correctAnwser);
        this.questionStatement = questionStatement;

    }
    public void setQuestionPunctuation(int questionPunctuation) {
        this.questionPunctuation = questionPunctuation;
    }
}
