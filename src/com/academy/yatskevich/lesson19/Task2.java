package com.academy.yatskevich.lesson19;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        Collection<Integer> col = List.of(22, 13, 1, 5, 47, 0, 8, 10);

        System.out.println("минимальное число: " + col.stream()
                .min(Integer::compareTo)
                .get());
        System.out.println("максимальное число: " + col.stream()
                .max(Integer::compareTo)
                .get());
        System.out.println("среднее арифметическое: " + col.stream()
                .reduce(0, Integer::sum) / col.stream().count());
        System.out.println("произведение всех чисел: " + col.stream()
                .reduce((s1, s2) -> s1 * s2).get());
        System.out.println("сумма всех чисел: " + col.stream()
                .reduce(0, Integer::sum));
        System.out.println("сумма всех цифр: " + col.stream()
                .map(Object::toString)
                .flatMap(s -> Arrays.stream(s.split("")))
//                .toList()
//                .stream()
                .map(Integer::parseInt)
                .reduce(0, Integer::sum));
    }
}
