package com.academy.yatskevich.lesson20;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите локаль: ");
        String data = scanner.nextLine();

        Locale locale = new Locale("en");
        Locale.setDefault(locale);
        String baseName = "com.academy.yatskevich.lesson20.message";
        ResourceBundle bundle = ResourceBundle.getBundle(baseName, new Locale(data));

        System.out.println(bundle.getString("greeting"));
    }
}
