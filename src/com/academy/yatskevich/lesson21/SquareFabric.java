package com.academy.yatskevich.lesson21;

import java.util.Scanner;

public class SquareFabric extends ShapeFabric{
    @Override
    public Shape createShape() {
        return new Square(findOutDetails()[0]);
    }

    @Override
    public int[] findOutDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину сторон:");
        int a = scanner.nextInt();
        scanner.close();
        return new int[]{a};
    }
}
