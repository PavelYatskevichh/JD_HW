package com.academy.yatskevich.lesson21;

import java.util.Scanner;

public class RectangleFabric extends ShapeFabric {
    @Override
    public Shape createShape() {
        int[] sides = findOutDetails();
        return new Rectangle(sides[0], sides[1]);
    }

    @Override
    public int[] findOutDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер стороны \"а\":");
        int a = scanner.nextInt();
        System.out.println("Введите размер стороны \"b\":");
        int b = scanner.nextInt();
        scanner.close();
        return new int[]{a, b};
    }
}
