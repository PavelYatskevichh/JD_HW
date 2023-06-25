package com.academy.yatskevich.lesson19;

import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        Map<String, Set<Integer>> initialMap = new HashMap<>() {{
            put("123", Set.of(1, 2, 3, 4));
            put("234", Set.of(2, 3, 4, 5));
            put("345", Set.of(3, 4, 5, 6));
            put("456", Set.of(4, 5, 6, 7));
        }};

        Map<Integer, Set<String>> tempMap = new TreeMap<>();

        initialMap
                .entrySet()
                .stream()
                .forEach(entry -> entry
                        .getValue()
                        .stream()
                        .forEach(value -> {
                                    Set<String> set = new HashSet<>();
                                    if (tempMap.get(value) != null) {
                                        set.addAll(tempMap.get(value));
                                    }
                                    set.add(entry.getKey());
                                    tempMap.put(value, set);
                                }
                        ));

        System.out.println(tempMap);
    }
}
