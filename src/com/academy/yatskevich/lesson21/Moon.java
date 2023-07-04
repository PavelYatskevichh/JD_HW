package com.academy.yatskevich.lesson21;

public class Moon implements Runnable{
    private static Moon instance;
    private Moon() {
    }
    public static Moon getInstance() {
        if (instance == null) {
            synchronized (Moon.class) {
                if (instance == null) {
                    instance = new Moon();
                    System.out.println("Создан объект класса Moon.");
                }
            }
        }
        System.out.println("Вернули объект класса Moon.");
        return instance;
    }

    @Override
    public void run() {
        getInstance();
    }
}
