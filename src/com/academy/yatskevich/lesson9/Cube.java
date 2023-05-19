package com.academy.yatskevich.lesson9;

import java.util.Objects;

public class Cube<T extends Number, U extends Number> extends Parallelepiped<T, U> {

    public Cube(T sizeA, T sizeB, U sizeH) {
        super(sizeA, sizeB, sizeH);
        if (!Objects.equals(sizeA, sizeB) && !Objects.equals(sizeB, sizeH) && !Objects.equals(sizeH, sizeA)) {
            System.out.println("Предупреждение!");
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public void setSizeA(T sizeA) {
        super.setSizeA(sizeA);
        super.setSizeB(sizeA);
        super.setSizeH((U) sizeA);
    }

    @Override
    @SuppressWarnings("unchecked")
    public void setSizeH(U sizeH) {
        super.setSizeA((T) sizeH);
        super.setSizeB((T) sizeH);
        super.setSizeH(sizeH);
    }

    @Override
    @SuppressWarnings("unchecked")
    public void setSizeB(T sizeB) {
        super.setSizeA(sizeB);
        super.setSizeB(sizeB);
        super.setSizeH((U) sizeB);
    }
}
