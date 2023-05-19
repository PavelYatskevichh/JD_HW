package com.academy.yatskevich.lesson9;

public class Task4 {
    public static void main(String[] args) {
        Line<Integer> line = new Line<>(20);
        Rectangle<Double> rec = new Rectangle<>(7.7, 11.1);
        Parallelepiped<Integer, Double> par = new Parallelepiped<>(2, 4, 6.0);
        Size size = new Size();

        System.out.println("Линейные размеры:");
        System.out.println(size.returnSizeA(line));
        System.out.println(size.returnSizeA(rec) + "  " + size.returnSizeB(rec));
        System.out.println(size.returnSizeA(par) + "  " + size.returnSizeB(par) + "  " + size.returnSizeH(par));

        System.out.println("Площади:");
        System.out.println(size.getSquare(rec));
        System.out.println(size.getSquare(par));

        System.out.println("Объём:");
        System.out.println(size.getVolume(par));

        System.out.println("Куб:");
        Cube<Integer, Double> cube = new Cube<>(4, 4, 4.0);
        cube.setSizeA(5);
        System.out.println(size.returnSizeA(cube) + "  " + size.returnSizeB(cube) + "  " + size.returnSizeH(cube));
    }
}
