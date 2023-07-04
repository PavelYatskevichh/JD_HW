package com.academy.yatskevich.lesson21;

public class Task1 {
    public static void main(String[] args) {
        Moon moon = Moon.getInstance();
        Thread thread1 = new Thread(moon);
        Thread thread2 = new Thread(moon);
        thread1.start();
        thread2.start();

        Earth.getInstance();

        Sun sunFirst = Sun.getInstance();
        Sun sunSecond = Sun.getInstance();
    }
}
