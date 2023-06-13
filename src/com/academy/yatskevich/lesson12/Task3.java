package com.academy.yatskevich.lesson12;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println(checker(str));
    }

    static Map<Character, Integer> mapping(String s) {
        List<Character> l = toCharList(s);
        Iterator<Character> iterator = l.iterator();
        Map<Character, Integer> result = new HashMap<>();
        while (iterator.hasNext()) {
            int n = 1;
            Character itr = iterator.next();
            if (result.containsKey(itr)) {
                n += result.get(itr);
            }
            result.put(itr, n);
        }
        return result;
    }

    static List<Character> toCharList(String s) {
        List<Character> characters = new ArrayList<>();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            characters.add(aChar);
        }
        return characters;
    }

    static boolean checker(String s) {
        Map<Character, Integer> map = mapping(s);



        return false;
    }
}
