package com.academy.yatskevich.lesson8;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        printEmails(text);
    }

    public static void printEmails(String str) {
        Pattern pattern = Pattern.compile("[!$%&+-.=?^_{}a-zA-Z0-9]+@[a-zA-Z0-9-]+[a-zA-Z0-9][.][A-z]+");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            if (matcher.group().length() <= 50) {
                System.out.println(matcher.group());
            }
        }
    }
}
