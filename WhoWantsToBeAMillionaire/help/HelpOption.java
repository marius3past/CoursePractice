package help;

import model.Question;
import model.Answer;

public abstract class HelpOption {
    private boolean isUsed;

    public abstract HelpAnswer[] getHelpAnswers(Question question);
}
