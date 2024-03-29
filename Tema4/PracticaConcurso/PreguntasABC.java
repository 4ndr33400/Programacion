package PracticaConcurso;

import java.util.ArrayList;

public class PreguntasABC extends Preguntas{
    ArrayList<String> options;
    private String correctAnswer;
    private final int DEFAULT_QUESTION_PUNCTUATION = 10;

    public PreguntasABC(String questionStatement, String correctAnswer,ArrayList options ) {
        super(questionStatement, correctAnswer);
        this.options = options;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void addOptions(){
        for (int i = 0; i < options.size(); i++){
            System.out.println((i+1) + ". " + options.get(i));
        }
    }
}
