package help;

import model.Answer;
import model.Question;

import java.util.Random;

public class FiftyFiftyHelp extends HelpOption{

    @Override
    public HelpAnswer[] getHelpAnswers(Question question) {
        Answer[] wrongAnswers = question.getWrongAnswers();
        Answer correct = question.getCorrectAnswer();
        Random rand = new Random();
        Answer wrong = wrongAnswers[rand.nextInt(wrongAnswers.length)];
        HelpAnswer[] result = new HelpAnswer[2];
        result[0] = new HelpAnswer(correct, 0.5);
        result[1] = new HelpAnswer(wrong, 0.5);
        return result;
    }
}
