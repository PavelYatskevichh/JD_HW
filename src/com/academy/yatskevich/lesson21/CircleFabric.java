package com.academy.yatskevich.lesson21;

import java.util.Scanner;

public class CircleFabric extends ShapeFabric {
    @Override
    public Shape createShape() {
        return new Circle(findOutDetails()[0]);
    }

    @Override
    public int[] findOutDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите рудиус:");
        int r = scanner.nextInt();
        scanner.close();
        return new int[]{r};
    }
}
