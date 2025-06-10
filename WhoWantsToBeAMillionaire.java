package game;

import model.Answer;
import model.Question;

public class WhoWantsToBeAMillionaire {

    public static final Question QUESTION_1_LEVEL_1 = new Question(
            "Care planetă este cea mai apropiată de Soare?",
            new Answer("Mercur", true, "a"),
            new Answer("Marte", false, "b"),
            new Answer("Venus", false, "c"),
            new Answer("Saturn", false, "d"),
            1, 100);

    public static final Question QUESTION_1_LEVEL_2 = new Question(
            "Care este cel mai lung fluviu din Europa?",
            new Answer("Dunărea", false, "a"),
            new Answer("Tamisa", false, "b"),
            new Answer("Volga", true, "c"),
            new Answer("Rinul", false, "d"),
            2, 200);

    public static final Question QUESTION_1_LEVEL_3 = new Question(
            "Ce companie a creat sistemul de operare Android?",
            new Answer("Google", true, "a"),
            new Answer("Samsung", false, "b"),
            new Answer("Apple", false, "c"),
            new Answer("Microsoft", false, "d"),
            3, 500);

    public static final Question QUESTION_1_LEVEL_4 = new Question(
            "În ce an a căzut Zidul Berlinului?",
            new Answer("1985", false, "a"),
            new Answer("1989", true, "b"),
            new Answer("1991", false, "c"),
            new Answer("1975", false, "d"),
            4, 1000);

    public static final Question QUESTION_1_LEVEL_5 = new Question(
            "Care este cel mai greu metal?",
            new Answer("Aur", false, "a"),
            new Answer("Plumb", false, "b"),
            new Answer("Platina", false, "c"),
            new Answer("Osmiu", true, "d"),
            5, 2000);
}