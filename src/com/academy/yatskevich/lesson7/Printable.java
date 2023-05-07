package com.academy.yatskevich.lesson7;

public interface Printable {
    default void print() {
        System.out.println("Документ отправлен на печать.");
    }
}
