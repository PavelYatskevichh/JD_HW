package com.academy.yatskevich.lesson15;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static Integer value = 0;
    static List<Adder> list = new ArrayList<>();

    public static void main(String[] args) {

        for (int i = 0; i < 1000; i++) {
            Adder adder = new Adder();
            adder.start();
            list.add(adder);
        }
        for (Adder a : list) {
            try {
                a.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Все потоки завершили работу. value = " + value);
    }
}
