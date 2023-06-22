package com.academy.yatskevich.lesson19;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("a1", "a2", "a3", "b1", "b3", "c2", "c1", "c5");

        System.out.println("удалить все содержащие 3 : " + (myList = myList.stream()
                .filter(s -> !s.contains("3"))
                .toList()));
        System.out.println("отсортировано по числу (по возрастанию) : " + myList.stream()
                .sorted());
        System.out.println("отсортировано по букве (по убыванию) : " + myList.stream()
                .sorted(Comparator.reverseOrder())
                .toList());
        System.out.println("отбросить первый и последний элемент : " + (myList = myList.stream()
                .skip(1)
                .limit(6)
                .toList()));
        System.out.println("в верхний регистр : " + myList.stream()
                .map(String::toUpperCase)
                .toList());
        System.out.print("на печать : " + myList.stream()
                .collect(Collectors.joining(" ")));
        System.out.println("\nколичество элементов осталось : " + myList.stream().count());
    }
}
