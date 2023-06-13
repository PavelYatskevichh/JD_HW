package com.academy.yatskevich.lesson12;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        while (true) {
            String str = scanner.nextLine();
            if ((str.equalsIgnoreCase("end"))) {
                break;
            }
            list.add(str);
        }

        Map map = mapping(list);
        System.out.println(map);
    }

    static <K> Map<K, Integer> mapping(List<K> l) {
        Iterator<K> iterator = l.iterator();
        Map<K, Integer> result = new HashMap<>();
        while (iterator.hasNext()) {
            int n = 1;
            K itr = iterator.next();
            if (result.containsKey(itr)) {
                n += result.get(itr);
            }
            result.put(itr, n);
        }
        return result;
    }
}
