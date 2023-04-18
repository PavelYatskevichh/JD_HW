package com.academy.yatskevich.lesson2;

import java.math.BigInteger;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        int randomNumber = (int) (Math.random() * 100);
        System.out.println("Рандомное число = " + randomNumber);

        System.out.println("Введите число с порядком более 10^20: ");

        Scanner scanner = new Scanner(System.in);
        BigInteger number1 = scanner.nextBigInteger();
        BigInteger number2 = BigInteger.valueOf(randomNumber);
        BigInteger product = number1.multiply(number2);

        System.out.println("Произведение двух чисел = " + product);
    }
}
