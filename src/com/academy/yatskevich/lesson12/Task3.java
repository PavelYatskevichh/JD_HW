package com.academy.yatskevich.lesson12;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) { //Added the loop for faster check.
            String str = scanner.nextLine();
            char[] chars = str.toCharArray();

            System.out.println(checker(chars));
        }
    }

    static boolean checker(char[] chars) {
        Deque<Character> deque = new ArrayDeque<>();
        boolean b;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '{' || chars[i] == '[' || chars[i] == '(') {
                deque.addLast(chars[i]);
            } else if (deque.isEmpty()) {
                return false;
            } else if (chars[i] == '}' && deque.peekLast() == '{'
                    || chars[i] == ']' && deque.peekLast() == '['
                    || chars[i] == ')' && deque.peekLast() == '(') {
                deque.removeLast();
            }
        }
        return deque.isEmpty();
    }
}
