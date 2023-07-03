package com.academy.yatskevich.lesson20;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Locale locale = new Locale("en");
        Locale.setDefault(locale);

        String baseName = "com.academy.yatskevich.lesson20.message";

        Scanner scanner = new Scanner(System.in);
        String data;

        while (!(data = scanner.nextLine()).equalsIgnoreCase("end")) {
            Locale currentLocale = new Locale(data);
            ResourceBundle bundle = ResourceBundle.getBundle(baseName, currentLocale);

            LocalDate now = LocalDate.now();
            DateTimeFormatter formatter;
            if (data.equalsIgnoreCase("ru") || data.equalsIgnoreCase("be")) {
                formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            } else {
                formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
            }
            System.out.println(formatter.format(now));

            System.out.println(bundle.getString("greeting"));
        }
    }
}
