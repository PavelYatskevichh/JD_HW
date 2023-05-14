package com.academy.yatskevich.lesson9;

public class Task2 {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(1, "string");
        System.out.println(pair);

        System.out.println(pair.first());
        System.out.println(pair.last());

        pair.replaceFirst(5);
        pair.replaceLast("new");
        System.out.println(pair);

        Pair.swap(pair);
        System.out.println(pair);
    }
}
