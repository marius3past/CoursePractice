package game;

import model.Question;
import model.Answer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int level = 1;
        Scanner scanner = new Scanner(System.in);

        while (level <= 5) {
            Question question = WhoWantsToBeAMillionaire.getQuestionByLevel(level);
            if (question == null) break;

            System.out.println("Nivelul " + level);
            System.out.println("Întrebare: " + question.getText());

            for (Answer answer : question.getAnswers()) {
                System.out.println(answer.getSequence().toUpperCase() + ") " + answer.getText());
            }

            System.out.print("Alege răspunsul (a/b/c/d): ");
            String choice = scanner.nextLine().toLowerCase();

            boolean correct = false;
            switch (choice) {
                case "a":
                case "b":
                case "c":
                case "d":
                    Answer selected = question.getAnswerBySequence(choice);
                    if (selected != null && selected.isCorrect()) {
                        correct = true;
                    }
                    break;
                default:
                    System.out.println("Opțiune invalidă!");
                    continue;
            }

            if (correct) {
                System.out.println("Corect! Treci la nivelul următor.");
                level++;
            } else {
                System.out.println("Răspuns greșit! Jocul s-a terminat.");
                break;
            }
        }

        if (level > 5) {
            System.out.println("Felicitări! Ai câștigat jocul!");
        }

        scanner.close();
    }
}