package com.academy.yatskevich.lesson20;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(isDateOdd(s));
    }

    static boolean isDateOdd(String date) {
        String capitalized = date.substring(0, 1).toUpperCase() + date.substring(1).toLowerCase();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d yyyy", Locale.ENGLISH);
        LocalDate ld = LocalDate.parse(capitalized, formatter);

        return ld.getDayOfYear()%2 != 0;
    }
}
