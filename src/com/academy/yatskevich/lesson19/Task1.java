package com.academy.yatskevich.lesson19;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        Collection<String> col = List.of("stick", "red bone", "law", "allergic to pollen", "login", "cat", "light weight");

        System.out.println("содержит ли какая-нибудь из строк слово login: " + col.stream().anyMatch("login"::equals));
        System.out.println("самая длинная строка: " + col.stream().max(Comparator.comparingInt(String::length)).get());
        System.out.println("самая короткая строка: " + col.stream().min(Comparator.comparingInt(String::length)).get());
        System.out.println("строки-слова: " + col.stream().filter(s -> !s.contains(" ")).toList());
        System.out.println("все слова: " + col.stream().flatMap(s -> Arrays.stream(s.split(" "))).toList());
    }
}
