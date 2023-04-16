package com.academy.yatskevich.examples;

import java.util.stream.IntStream;

public class Example {
    public static void main(String[] args) {

        IntStream stream = IntStream.range(0, 10);

        stream.forEach((e) -> System.out.printf("%d", e));

    }
}
