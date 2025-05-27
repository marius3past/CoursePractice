import answer.Answer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Answer answer1 = new Answer("Mercur", true, "a");
        Answer answer2 = new Answer("Marte", false, "b");
        Answer answer3 = new Answer("Venus", false, "c");
        Answer answer4 = new Answer("Saturn", false, "d");
        Question question1 = new Question("Care planetă este cea mai apropiată de Soare?", 1, 100, answer1, answer2, answer3, answer4);

        Answer a1 = new Answer("Dunărea", false, "a");
        Answer a2 = new Answer("Tamisa", false, "b");
        Answer a3 = new Answer("Volga", true, "c");
        Answer a4 = new Answer("Rinul", false, "d");
        Question question2 = new Question("Care este cel mai lung fluviu din Europa?", 2, 200, a1, a2, a3, a4);


    }
}