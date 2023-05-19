package com.academy.yatskevich.lesson9;

public class Task2 {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(1, "hi");
        System.out.println(pair);

        pair.replaceFirst(5);
        pair.replaceLast("VVVV");
        System.out.println(pair);

        Pair<String, Integer> newPair = pair.swap();
        System.out.println(newPair);
        System.out.println(newPair.first());
        System.out.println(newPair.last());
    }
}
