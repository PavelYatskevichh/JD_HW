package com.academy.yatskevich.lesson8;

public class Task2 {
    public static void main(String[] args) {
        String string = "   Listen to   the  news from    today. ";
        String newString = string.trim();
        String result = newString.replaceAll("[\\s]+", " ");

        System.out.println(result);
    }
}
