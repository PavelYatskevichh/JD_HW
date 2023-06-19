package com.academy.yatskevich.lesson15;

public class Task1 {
    public static void main(String[] args) {

        Printer printer1 = new Printer("Hi!");
        Printer printer2 = new Printer("Привет!");
        Printer printer3 = new Printer("Cześć!");

        printer1.start();
        printer2.start();
        printer3.start();
    }
}
