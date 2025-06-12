package help;

import model.Answer;

public class HelpAnswer {
    private Answer Answer;
    private double probabilitateCorect;

    HelpAnswer(Answer Answer, double probabilitateCorect) {
        this.Answer = Answer;
        this.probabilitateCorect = probabilitateCorect;
    }

    public Answer getAnswer() {
        return Answer;
    }

    public void setAnswer(Answer answer) {
        Answer = answer;
    }

    public double getProbabilitateCorect() {
        return probabilitateCorect;
    }

    public void setProbabilitateCorect(double probabilitateCorect) {
        this.probabilitateCorect = probabilitateCorect;
    }
}
