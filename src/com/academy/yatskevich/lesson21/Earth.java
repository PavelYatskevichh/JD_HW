package com.academy.yatskevich.lesson21;

public class Earth implements Runnable{
    private static Earth instance;
    private Earth() {
    }
    public static Earth getInstance() {
        if (instance == null) {
            synchronized (Earth.class) {
                if (instance == null) {
                    instance = new Earth();
                    System.out.println("Создан объект класса Earth.");
                }
            }
        }
        System.out.println("Вернули объект класса Earth.");
        return instance;
    }

    @Override
    public void run() {
        getInstance();
    }
}
