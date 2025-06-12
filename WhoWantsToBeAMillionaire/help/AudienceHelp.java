package help;

import model.Answer;
import model.Question;

public class AudienceHelp extends HelpOption{


    @Override
    public HelpAnswer[] getHelpAnswers(Question question) {
        return new HelpAnswer[0];
    }
}
