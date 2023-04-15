package com.academy.yatskevich.lesson2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class RealNumber {
    public static void main(String[] args) {

        System.out.println("Введите вещественное число: ");

        Scanner scanner = new Scanner(System.in);
        BigDecimal number = scanner.nextBigDecimal();
        BigDecimal result = number.setScale(3, RoundingMode.HALF_UP);

        System.out.println(result);
    }
}
