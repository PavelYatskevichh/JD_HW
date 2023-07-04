package com.academy.yatskevich.lesson21;

import java.util.Objects;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Drink drink;

        System.out.println("What would you like to drink? (1 - tea, 2 - coffee)\nPlease don't mess around.");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 1) {
            drink = new Tea();
        } else {
            drink = new Coffee();
        }

        System.out.println("What do you want to add to your drink? (1 - Milk, 2 - Sugar, 3 - Syrup) Choose one or more.");
        scanner.nextLine();
        String s = scanner.nextLine();
        String[] arr = s.split("");

        for (String a : arr) {
            switch (a) {
                case "1" -> drink = new MilkDecorator(drink);
                case "2" -> drink = new SugarDecorator(drink);
                case "3" -> drink = new SyrupDecorator(drink);
            }
        }

        drink.drink();
    }
}
