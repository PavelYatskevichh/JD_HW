package com.academy.yatskevich.lesson9;

public class Rectangle<T extends Number> extends Line<T> {
    private T sizeB;

    public Rectangle(T sizeA, T sizeB) {
        super(sizeA);
        this.sizeB = sizeB;
    }

    public T getSizeB() {
        return sizeB;
    }

    public void setSizeB(T sizeB) {
        this.sizeB = sizeB;
    }
}
