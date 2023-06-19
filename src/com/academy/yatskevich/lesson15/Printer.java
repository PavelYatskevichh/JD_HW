package com.academy.yatskevich.lesson15;

public class Printer extends Thread {
    private String text;
    public void print(String text) {
        System.out.println(text);
    }

    public Printer(String text) {
        this.text = text;
    }

    @Override
    public void run() {
        print(Thread.currentThread().getName() + " вывел " + text);
    }
}
