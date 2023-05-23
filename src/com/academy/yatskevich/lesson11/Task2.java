package com.academy.yatskevich.lesson11;

import java.util.Arrays;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        Set<String> set = new MySet<>();
        set.add("Hi, ");
        set.add("World! ");
        set.add("I ");
        set.add("like ");
        set.add("like ");
        set.add("Python ");
        set.add("and ");
        set.add("Java.");

        System.out.println(set);
        System.out.println(set.size());
        set.remove("Python ");
        System.out.println(set.contains("Python "));
        System.out.println(set.isEmpty());
        System.out.println(set.containsAll(Arrays.asList("and ", "or ")));
        set.addAll(Arrays.asList(" Very ", "much!"));
        set.removeAll(Arrays.asList("and ", "or "));
        System.out.println(set);
    }
}
