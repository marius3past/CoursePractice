package model;

public class Question {
    private String text;
    private Answer[] answers;
    private int level;
    private int score;

    public Question(String text, Answer[] answers, int level, int score) {
        this.text = text;
        this.answers = answers;
        this.level = level;
        this.score = score;
    }

    public String getText() {
        return text;
    }

    public Answer[] getAnswers() {
        return answers;
    }

    public int getLevel() {
        return level;
    }

    public int getScore() {
        return score;
    }

    public Answer getAnswerBySequence(String sequence) {
        for (Answer a : answers) {
            if (a.getSequence().equalsIgnoreCase(sequence)) {
                return a;
            }
        }
        return null;
    }
}