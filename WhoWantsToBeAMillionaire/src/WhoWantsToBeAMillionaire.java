package game;

import model.Answer;
import model.Question;

import java.util.Random;

public class WhoWantsToBeAMillionaire {

    public static final Question[] QUESTIONS_LEVEL_1 = {
            new Question(
                    "Care planetă este cea mai apropiată de Soare?",
                    new Answer[]{
                            new Answer("Mercur", true, "a"),
                            new Answer("Marte", false, "b"),
                            new Answer("Venus", false, "c"),
                            new Answer("Saturn", false, "d")
                    }, 1, 100)
    };


    public static final Question[] QUESTIONS_LEVEL_2 = {
            new Question(
                    "Care este cel mai lung fluviu din Europa?",
                    new Answer[]{
                            new Answer("Dunărea", false, "a"),
                            new Answer("Tamisa", false, "b"),
                            new Answer("Volga", true, "c"),
                            new Answer("Rinul", false, "d")
                    }, 2, 200)
    };

    public static final Question[] QUESTIONS_LEVEL_3 = {
            new Question(
                    "Ce companie a creat sistemul de operare Android?",
                    new Answer[]{
                            new Answer("Google", true, "a"),
                            new Answer("Samsung", false, "b"),
                            new Answer("Apple", false, "c"),
                            new Answer("Microsoft", false, "d")
                    }, 3, 500)

    };

    public static final Question[] QUESTIONS_LEVEL_4 = {
            new Question(
                    "În ce an a căzut Zidul Berlinului?",
                    new Answer[]{
                            new Answer("1985", false, "a"),
                            new Answer("1989", true, "b"),
                            new Answer("1991", false, "c"),
                            new Answer("1975", false, "d")
                    }, 4, 1000)

    };

    public static final Question[] QUESTIONS_LEVEL_5 = {
            new Question(
                    "Care este cel mai greu metal?",
                    new Answer[]{
                            new Answer("Aur", false, "a"),
                            new Answer("Plumb", false, "b"),
                            new Answer("Platina", false, "c"),
                            new Answer("Osmiu", true, "d")
                    }, 5, 2000)

    };

    public static Question getQuestionByLevel(int level) {
        Random rand = new Random();
        Question[] list = switch (level) {
            case 1 -> QUESTIONS_LEVEL_1;
            case 2 -> QUESTIONS_LEVEL_2;
            case 3 -> QUESTIONS_LEVEL_3;
            case 4 -> QUESTIONS_LEVEL_4;
            case 5 -> QUESTIONS_LEVEL_5;
            default -> new Question[0];
        };
        if (list.length == 0) {
            System.out.println("Nu există întrebări pentru acest nivel!");
            return null;
        }
        return list[rand.nextInt(list.length)];
    }
}