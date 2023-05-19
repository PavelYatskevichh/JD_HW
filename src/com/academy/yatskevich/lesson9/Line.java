package com.academy.yatskevich.lesson9;

public class Line<T extends Number> {
    private T sizeA;

    public Line(T sizeA) {
        this.sizeA = sizeA;
    }

    public T getSizeA() {
        return sizeA;
    }

    public void setSizeA(T sizeA) {
        this.sizeA = sizeA;
    }
}
