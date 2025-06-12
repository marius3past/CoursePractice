package help;

import model.Question;

public class PhoneHelp extends HelpOption {

    @Override
    public HelpAnswer[] getHelpAnswers(Question question) {
        return new HelpAnswer[0];
    }
}
