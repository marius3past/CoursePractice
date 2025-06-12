package help;

import model.Question;
import model.Answer;

public abstract class HelpOption {
    private boolean isUsed;

    public abstract HelpAnswer[] getHelpAnswers(Question question);

    public boolean isUsed() {
        return isUsed;
    }

    public void setUsed(boolean used) {
        isUsed = used;
    }
}