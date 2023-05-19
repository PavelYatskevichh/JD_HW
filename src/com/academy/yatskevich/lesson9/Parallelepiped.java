package com.academy.yatskevich.lesson9;

public class Parallelepiped<T extends Number, U extends Number> extends Rectangle<T>{
    private U sizeH;

    public Parallelepiped(T sizeA, T sizeB, U sizeH) {
        super(sizeA, sizeB);
        this.sizeH = sizeH;
    }

    public U getSizeH() {
        return sizeH;
    }

    public void setSizeH(U sizeH) {
        this.sizeH = sizeH;
    }
}
