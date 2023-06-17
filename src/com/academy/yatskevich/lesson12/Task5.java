package com.academy.yatskevich.lesson12;

import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> map = new TreeMap<>();
        while (true) {
            String str = scanner.nextLine();
            if ((str.equalsIgnoreCase("end"))) {
                break;
            }
            int newKey = randomKey(map);
            map.put(newKey, str);
        }

        System.out.println(map);
        map = compress(map);
        System.out.println(map);
    }

    static int randomKey(Map<Integer, String> map) {
        long bound = 10L;
        while (bound * 0.9 < map.size()) {
            bound *= 10;
        }
        int a = (int) (Math.random() * bound);
        if (map.containsKey(a)) {
            a = randomKey(map);
        }
        return a;
    }

    static Map<Integer,String> compress(Map<Integer, String> map) {
        Map<Integer, String> newMap = new TreeMap<>();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (!newMap.containsValue(entry.getValue())) {
                newMap.put(entry.getKey(), entry.getValue());
            }
        }
        return newMap;
    }
}
