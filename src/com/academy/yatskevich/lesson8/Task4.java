package com.academy.yatskevich.lesson8;

import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {
        String string = "Listen to the news from today and read the text at the same time, " +
                "listen to the news from today without reading the text.";
        Pattern pattern = Pattern.compile("\\W+");
        String[] split = pattern.split(string);
        String[] uniqueWords = new String[split.length];
        int numberOfWords = 0;
        for (int i = 0; i < split.length; i++) {
            boolean marker = true;
            for (int j = 0; j < split.length; j++) {
                if (split[i].equalsIgnoreCase(uniqueWords[j])) {
                    marker = false;
                    break;
                }
            }
            if (marker) {
                uniqueWords[numberOfWords] = split[i];
                numberOfWords++;
            }
        }
        System.out.println(numberOfWords);
    }
}
