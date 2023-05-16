package com.academy.yatskevich.lesson9;

public class Parallelepiped<T extends Number, U extends Number> extends Rectangle<U>{
    private T sizeH;

    public Parallelepiped(U sizeA, U sizeB, T sizeH) {
        super(sizeA, sizeB);
        this.sizeH = sizeH;
    }

    public T getSizeH() {
        return sizeH;
    }

    public void setSizeH(T sizeH) {
        this.sizeH = sizeH;
    }
}
