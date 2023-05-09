package com.academy.yatskevich.lesson8;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String result;
        if (string.startsWith("abc")) {
            result = string.replace("abc", "www");
        } else {
            result = string.concat("zzz");
        }
        System.out.println(result);
    }
}
