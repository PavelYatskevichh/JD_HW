package com.academy.yatskevich.lesson7;

public abstract class Employee {
    public void work(Document doc) {
        System.out.println("Работаю с документом " + doc.getName());
    }
}
