package game;

import model.Question;
import model.Answer;
import help.HelpOption;
import help.FiftyFiftyHelp;
import help.AudienceHelp;
import help.PhoneHelp;
import help.HelpAnswer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int level = 1;
        int score = 0;
        Scanner scanner = new Scanner(System.in);

        HelpOption fiftyFifty = new FiftyFiftyHelp();
        HelpOption audience = new AudienceHelp();
        HelpOption phone = new PhoneHelp();

        while (level <= 5) {
            Question question = WhoWantsToBeAMillionaire.getQuestionByLevel(level);
            if (question == null) break;

            System.out.println("Nivelul " + level);
            System.out.println("Întrebare: " + question.getText());

            for (Answer answer : question.getAnswers()) {
                System.out.println(answer.getSequence().toUpperCase() + ") " + answer.getText());
            }

            boolean answered = false;
            boolean correct = false;

            while (!answered) {
                System.out.println("Ajutoare disponibile:");
                if (!fiftyFifty.isUsed()) System.out.println("F) Fifty-Fifty");
                if (!audience.isUsed()) System.out.println("H) Audience");
                if (!phone.isUsed()) System.out.println("P) Phone");

                System.out.print("Alege răspunsul (a/b/c/d) sau f/h/p pentru ajutor: ");
                String choice = scanner.nextLine().toLowerCase();

                switch (choice) {
                    case "a":
                    case "b":
                    case "c":
                    case "d":
                        Answer selected = question.getAnswerBySequence(choice);
                        if (selected != null && selected.isCorrect()) {
                            correct = true;
                        }
                        answered = true;
                        break;

                    case "f":
                        if (!fiftyFifty.isUsed()) {
                            fiftyFifty.setUsed(true);
                            HelpAnswer[] helpAnswers = fiftyFifty.getHelpAnswers(question);
                            System.out.println("\nAjutor Fifty-Fifty:");
                            System.out.println("Poți alege acum doar dintre următoarele două variante:");
                            for (HelpAnswer ha : helpAnswers) {
                                System.out.println(" - " + ha.getAnswer().getSequence().toUpperCase() + ") " + ha.getAnswer().getText());
                            }
                            String helpChoice = "";
                            boolean validHelpChoice = false;
                            while (!validHelpChoice) {
                                System.out.print("Alege răspunsul dintre opțiunile afișate: ");
                                helpChoice = scanner.nextLine().toLowerCase();
                                for (HelpAnswer ha : helpAnswers) {
                                    if (ha.getAnswer().getSequence().equalsIgnoreCase(helpChoice)) {
                                        validHelpChoice = true;
                                        if (ha.getAnswer().isCorrect()) correct = true;
                                        answered = true;
                                        break;
                                    }
                                }
                                if (!validHelpChoice) {
                                    System.out.println("Opțiune invalidă! Alege doar dintre variantele afișate de ajutor.");
                                }
                            }
                        } else {
                            System.out.println("Ajutorul Fifty-Fifty a fost deja folosit!");
                        }
                        break;

                    case "h":
                        if (!audience.isUsed()) {
                            audience.setUsed(true);
                            HelpAnswer[] helpAnswers = audience.getHelpAnswers(question);
                            System.out.println("\nAjutor Audience (Public):");
                            System.out.println("Publicul a votat astfel pentru variantele de răspuns:");
                            for (HelpAnswer ha : helpAnswers) {
                                System.out.println(" - " + ha.getAnswer().getSequence().toUpperCase()
                                        + ") " + ha.getAnswer().getText()
                                        + ": " + ha.getProbabilitateCorect() + "% dintre respondenți");
                            }
                            String helpChoice = "";
                            boolean validHelpChoice = false;
                            while (!validHelpChoice) {
                                System.out.print("Alege răspunsul dintre opțiunile afișate: ");
                                helpChoice = scanner.nextLine().toLowerCase();
                                for (HelpAnswer ha : helpAnswers) {
                                    if (ha.getAnswer().getSequence().equalsIgnoreCase(helpChoice)) {
                                        validHelpChoice = true;
                                        if (ha.getAnswer().isCorrect()) correct = true;
                                        answered = true;
                                        break;
                                    }
                                }
                                if (!validHelpChoice) {
                                    System.out.println("Opțiune invalidă! Alege doar dintre variantele afișate de ajutor.");
                                }
                            }
                        } else {
                            System.out.println("Ajutorul Audience a fost deja folosit!");
                        }
                        break;

                    case "p":
                        if (!phone.isUsed()) {
                            phone.setUsed(true);
                            HelpAnswer[] helpAnswers = phone.getHelpAnswers(question);
                            System.out.println("\nAjutor Phone:");
                            for (HelpAnswer ha : helpAnswers) {
                                System.out.println("Telefonul recomandă: "
                                        + ha.getAnswer().getSequence().toUpperCase() + ") " + ha.getAnswer().getText());
                            }
                            String helpChoice = "";
                            boolean validHelpChoice = false;
                            while (!validHelpChoice) {
                                System.out.print("Alege răspunsul dintre opțiunile afișate: ");
                                helpChoice = scanner.nextLine().trim().toLowerCase();
                                for (HelpAnswer ha : helpAnswers) {
                                    if (ha.getAnswer().getSequence().equalsIgnoreCase(helpChoice)) {
                                        validHelpChoice = true;
                                        if (ha.getAnswer().isCorrect()) correct = true;
                                        answered = true;
                                        break;
                                    }
                                }
                                if (!validHelpChoice) {
                                    System.out.println("Opțiune invalidă! Alege doar dintre variantele afișate de ajutor.");
                                }
                            }
                        } else {
                            System.out.println("Ajutorul Phone a fost deja folosit!");
                        }
                        break;

                    default:
                        System.out.println("Opțiune invalidă!");
                        break;
                }
            }

            if (correct) {
                int points = 0;
                switch (level) {
                    case 1: points = 100; break;
                    case 2: points = 200; break;
                    case 3: points = 500; break;
                    case 4: points = 1000; break;
                    case 5: points = 2000; break;
                }
                score += points;
                System.out.println("Corect! Treci la nivelul următor.");
                System.out.println("Scorul curent: " + score);
                level++;
            } else {
                System.out.println("Răspuns greșit! Jocul s-a terminat.");
                System.out.println("Scorul acumulat: " + score);
                break;
            }
        }

        if (level > 5) {
            System.out.println("Felicitări! Ai câștigat jocul!");
            System.out.println("Scorul final: " + score);
        }

        scanner.close();
    }
    // test git status
}