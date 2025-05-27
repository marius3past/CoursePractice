import answer.Answer;

public class Question {
    private String question;
    private int level;
    private int score;
    private Answer answer1;
    private Answer answer2;
    private Answer answer3;
    private Answer answer4;

    public Question(String question, int level, int score, Answer a, Answer b, Answer c, Answer d) {
        this.question = question;
        this.level = level;
        this.score = score;
        this.answer1 = a;
        this.answer2 = b;
        this.answer3 = c;
        this.answer4 = d;
    }

    public Answer getAnswer1() {
        return answer1;
    }

    public Answer getAnswer2() {
        return answer2;
    }

    public Answer getAnswer3() {
        return answer3;
    }

    public Answer getAnswer4() {
        return answer4;
    }
}

