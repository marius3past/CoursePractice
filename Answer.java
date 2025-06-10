package model;

public class Answer {
    private String text;
    private boolean isCorrect;
    private String sequence;

    public Answer(String text, boolean isCorrect, String sequence) {
        this.text = text;
        this.isCorrect = isCorrect;
        this.sequence = sequence;
    }

    public String getText() {
        return text;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public String getSequence() {
        return sequence;
    }

    @Override
    public String toString() {
        return sequence + ") " + text + " (" + (isCorrect ? "corect" : "greșit") + ")";
    }
}