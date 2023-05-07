package com.academy.yatskevich.lesson7;

public class Task2 {
    public static void main(String[] args) {
        Book book = new Book("Азазель", 400);
        Document doc1 = new Document("Письмо", 2);
        Document doc2 = new Document("Договор", 10);
        Document doc3 = new Document("Акт", 5);

        Intern intern = new Intern();
        Accountant accountant = new Accountant();

        intern.work(book);
        accountant.work(doc1);
        accountant.makeIrrelevant(doc2);
        System.out.println(intern.countArithmeticMean(doc1, doc2, doc3));
        intern.printNumberOfDocuments(doc1, doc2, doc3);
    }
}
