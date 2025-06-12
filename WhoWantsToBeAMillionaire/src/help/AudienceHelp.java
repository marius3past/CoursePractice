package help;

import model.Answer;
import model.Question;
import java.util.Random;

public class AudienceHelp extends HelpOption {

    @Override
    public HelpAnswer[] getHelpAnswers(Question question) {
        Answer[] allAnswers = question.getAnswers();
        int n = allAnswers.length;
        int correctIdx = -1;

        for (int i = 0; i < n; i++) {
            if (allAnswers[i].isCorrect()) {
                correctIdx = i;
                break;
            }
        }

        double[] pct = new double[n];
        Random rand = new Random();
        int maxPct = 50 + rand.nextInt(21); // 50-70
        pct[correctIdx] = maxPct;
        int rest = 100 - maxPct;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (i == correctIdx) continue;
            int value;
            // Dacă e ultimul răspuns greșit, pune tot ce a rămas
            if (i == n - 1 || (i == n - 2 && correctIdx == n - 1)) {
                value = rest - sum;
            } else {
                int maxValue = rest - sum - (n - i - 1);
                if (maxValue > 10) {
                    value = 10 + rand.nextInt(maxValue - 10 + 1);
                } else {
                    value = 1;
                }
            }
            pct[i] = value;
            sum += value;
        }

        HelpAnswer[] result = new HelpAnswer[n];
        for (int i = 0; i < n; i++) {
            result[i] = new HelpAnswer(allAnswers[i], pct[i]);
        }
        return result;
    }
}