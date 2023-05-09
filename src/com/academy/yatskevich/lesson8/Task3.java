package com.academy.yatskevich.lesson8;

public class Task3 {
    public static void main(String[] args) {
        Document document = new Document();
        String text = document.getText();
        String newText = document.replaceLetters(text);
        System.out.println(newText);
        document.printWords();
    }
}
