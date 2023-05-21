package com.academy.yatskevich.lesson10;

public class Task1 {
    public static void main(String[] args) {
        String s = null;
        try {
            if (Math.random() > 0.5) {
                s.length();
            } else {
                Integer.parseInt(s);
            }

        } catch (NumberFormatException | NullPointerException e) {
            System.out.println(e.getClass());
        }

    }
}
