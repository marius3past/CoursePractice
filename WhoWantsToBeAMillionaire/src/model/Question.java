package model;

public class Question {
    private String text;
    private Answer answerA;
    private Answer answerB;
    private Answer answerC;
    private Answer answerD;
    private int level;
    private int score;

    public Question(String text,
                    Answer answerA, Answer answerB, Answer answerC, Answer answerD,
                    int level, int score) {
        this.text = text;
        this.answerA = answerA;
        this.answerB = answerB;
        this.answerC = answerC;
        this.answerD = answerD;
        this.level = level;
        this.score = score;
    }

    public String getText() {
        return text;
    }

    public Answer getAnswerA() {
        return answerA;
    }

    public Answer getAnswerB() {
        return answerB;
    }

    public Answer getAnswerC() {
        return answerC;
    }

    public Answer getAnswerD() {
        return answerD;
    }

    public int getLevel() {
        return level;
    }

    public int getScore() {
        return score;
    }
}