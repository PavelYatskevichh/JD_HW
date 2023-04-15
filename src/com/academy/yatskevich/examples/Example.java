package com.academy.yatskevich.examples;

public class Example {
    public static void main(String[] args) {
        int a = -1;
        int b = a >> 26;
        System.out.println(b);
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
    }
}
