package PracticaConcurso;

public class RespuestaAbierta extends Preguntas{
    private String correctAnswer;
    private  int DEFAULT_QUESTION_PUNCTUATION = 15;

    public RespuestaAbierta(String questionStatement, String correctAnswer) {
        super(questionStatement, correctAnswer);
    }
    public int getDEFAULT_QUESTION_PUNCTUATION() {
        return DEFAULT_QUESTION_PUNCTUATION;
    }
    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
    @Override
    public boolean correctAnswer(String answer) {
        return correctAnswer.equalsIgnoreCase(answer);
    }
}
