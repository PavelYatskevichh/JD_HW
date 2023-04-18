package com.academy.yatskevich.lesson2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        System.out.println("Введите число:");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println(checkFizzBuzz(number));
    }

    public static String checkFizzBuzz(int parameter) {
        if (parameter % 3 == 0 && parameter % 5 == 0){
            return "FizzBuzz";
        } else if (parameter % 3 == 0) {
            return "Fizz";
        } else if (parameter % 5 == 0) {
            return "Buzz";
        } else {
            return "";
        }
    }
}
