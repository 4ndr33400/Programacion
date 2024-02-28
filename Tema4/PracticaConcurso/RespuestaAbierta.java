package PracticaConcurso;

public class RespuestaAbierta extends Preguntas{
    private String correctAnswer;

    public RespuestaAbierta(String questionStatement, String correctAnswer) {
        super(questionStatement, correctAnswer);
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
    @Override
    public boolean correctAnswer(String answer) {
        return correctAnswer.equalsIgnoreCase(answer);
    }
}
