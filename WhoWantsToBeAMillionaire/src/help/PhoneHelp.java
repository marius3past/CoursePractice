package help;

import model.Answer;
import model.Question;

public class PhoneHelp extends HelpOption {

    @Override
    public HelpAnswer[] getHelpAnswers(Question question) {
        Answer correct = question.getCorrectAnswer();
        HelpAnswer[] result = new HelpAnswer[1];
        result[0] = new HelpAnswer(correct, 100.0);
        return result;
    }
}
