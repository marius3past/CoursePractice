package game;

import model.Question;

public class Main {
    public static void main(String[] args) {
        Question q1 = WhoWantsToBeAMillionaire.QUESTION_1_LEVEL_1;

        System.out.println("Question: " + q1.getText());
        System.out.println("A) " + q1.getAnswerA().getText());
        System.out.println("B) " + q1.getAnswerB().getText());
        System.out.println("C) " + q1.getAnswerC().getText());
        System.out.println("D) " + q1.getAnswerD().getText());

        Question q2 = WhoWantsToBeAMillionaire.QUESTION_1_LEVEL_2;

        System.out.println("Question: "+q2.getText());
        System.out.println("A) "+q2.getAnswerA().getText());
        System.out.println("B) "+q2.getAnswerB().getText());
        System.out.println("C) "+q2.getAnswerC().getText());
        System.out.println("D) "+q2.getAnswerD().getText());

        Question q3 = WhoWantsToBeAMillionaire.QUESTION_1_LEVEL_3;

        System.out.println("Question: "+q3.getText());
        System.out.println("A) "+q3.getAnswerA().getText());
        System.out.println("B) "+q3.getAnswerB().getText());
        System.out.println("C) "+q3.getAnswerC().getText());
        System.out.println("D) "+q3.getAnswerD().getText());

        Question q4 = WhoWantsToBeAMillionaire.QUESTION_1_LEVEL_4;

        System.out.println("Question: "+q4.getText());
        System.out.println("A) "+q4.getAnswerA().getText());
        System.out.println("B) "+q4.getAnswerB().getText());
        System.out.println("C) "+q4.getAnswerC().getText());
        System.out.println("D) "+q4.getAnswerD().getText());

        Question q5 = WhoWantsToBeAMillionaire.QUESTION_1_LEVEL_5;

        System.out.println("Question: "+ q5.getText());
        System.out.println("A) "+ q5.getAnswerA().getText());
        System.out.println("B) "+ q5.getAnswerB().getText());
        System.out.println("C) "+ q5.getAnswerC().getText());
        System.out.println("D) "+ q5.getAnswerD().getText());

    }
}