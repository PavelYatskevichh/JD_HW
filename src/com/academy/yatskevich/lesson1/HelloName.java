package com.academy.yatskevich.lesson1;

import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String readFromConsole = scanner.nextLine();
        System.out.println("Hello, " + readFromConsole + "!");
    }
}