package com.academy.yatskevich.lesson21;

public class Sun implements Runnable {
    private static Sun instance;

    private Sun() {
    }

    public static Sun getInstance() {
        if (instance == null) {
            synchronized (Sun.class) {
                if (instance == null) {
                    instance = new Sun();
                    System.out.println("Создан объект класса Sun.");
                }
            }
        }
        System.out.println("Вернули объект класса Sun.");
        return instance;
    }

    @Override
    public void run() {
        getInstance();
    }
}
