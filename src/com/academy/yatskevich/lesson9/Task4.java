package com.academy.yatskevich.lesson9;

public class Task4 {
    public static void main(String[] args) {
        Size<Line<Integer>> one = new Size<>(new Line<>(5));
        SizeManager<Integer> sizeManager = new SizeManager<>();
        System.out.println(sizeManager.getA(one));
    }
}
