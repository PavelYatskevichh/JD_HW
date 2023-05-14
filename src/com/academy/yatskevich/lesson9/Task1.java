package com.academy.yatskevich.lesson9;

public class Task1 {
    public static void main(String[] args) {
        Collector<Integer> integerCollector = new Collector<>(new Integer[]{1, 31, 37, 14, 88});
        Collector<Double> doubleCollector = new Collector<>(new Double[]{14.88, 20.23, 2.0});

        System.out.println(integerCollector.returnValue(2) + "\n" +
                doubleCollector.returnValue(2) + "\n" +
                doubleCollector.returnValue(5));
    }
}
