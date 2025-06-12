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

    public void setText(String text) {
        this.text = text;
    }

    public void setAnswers(Answer[] answers) {
        this.answers = answers;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Answer getCorrectAnswer() {
        for (Answer a : answers) {
            if (a.isCorrect()) return a;
        }
        return null;
    }

    public Answer[] getWrongAnswers() {
        int count = 0;
        for (Answer a : answers) {
            if (!a.isCorrect()) {
                count++;
            }
        }

        Answer[] wrongAnswers = new Answer[count];
        int i = 0;
        for (Answer a : answers) {
            if (!a.isCorrect()) {
                wrongAnswers[i] = a;
                i++;
            }
        }
        return wrongAnswers;
    }
}