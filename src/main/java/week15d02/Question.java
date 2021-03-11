package week15d02;

public class Question {

    private final String problem;
    private final String answer;
    private final int points;
    private final String subject;

    public Question(String text, String answer, int points, String topic) {
        this.problem = text;
        this.answer = answer;
        this.points = points;
        this.subject = topic;
    }

    public String getProblem() {
        return problem;
    }

    public String getAnswer() {
        return answer;
    }

    public int getPoints() {
        return points;
    }

    public String getSubject() {
        return subject;
    }
}
