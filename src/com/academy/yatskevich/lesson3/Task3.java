package com.academy.yatskevich.lesson3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите правильный пароль: ");
        String correctPassword = "12345678";
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        while (password.intern() != correctPassword){
            System.out.println("Неверный пароль. Попробуйте ещё раз: ");
            password = scanner.nextLine();
        }
    }
}
