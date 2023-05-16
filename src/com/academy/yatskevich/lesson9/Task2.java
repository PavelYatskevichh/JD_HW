package com.academy.yatskevich.lesson9;

public class Task2 {
    public static void main(String[] args) {
        Pair<Integer, Double> pair = new Pair<>(1, 20.5);
        System.out.println(pair);

        pair.replaceFirst(5);
        pair.replaceLast(40.0);
        System.out.println(pair);

        pair.swap();
        System.out.println(pair);
        System.out.println(pair.first());
        System.out.println(pair.last());
    }
}
