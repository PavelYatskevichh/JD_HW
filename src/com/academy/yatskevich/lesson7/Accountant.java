package com.academy.yatskevich.lesson7;

public class Accountant extends Employee{
    public void makeIrrelevant(Document document) {
        this.work(document);
        document.setRelevance(false);
    }
}
