package com.academy.yatskevich.lesson7;

public class Intern extends Employee{
    public double countArithmeticMean(Document... documents) {
        int sum = 0;
        int number = 0;
        for (int i = 0; i < documents.length; i++) {
            if (documents[i].isRelevance()) {
                sum += documents[i].getNumberOfPages();
                number++;
            }
        }
        return 1.0 * sum / number;
    }

    public void printNumberOfDocuments(Document... documents) {
        int totalNumber = 0;
        int numberOfRelevant = 0;
        int numberOfIrrelevant = 0;
        for (int i = 0; i < documents.length; i++) {
            totalNumber++;
            if (documents[i].isRelevance()) {
                numberOfRelevant++;
            } else {
                numberOfIrrelevant++;
            }
        }
        System.out.println("Общее количество документов: " + totalNumber +
                "\nКоличество действующих документов: " + numberOfRelevant +
                "\nКоличество недействующих документов: " + numberOfIrrelevant);
    }
}
