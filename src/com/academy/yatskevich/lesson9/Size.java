package com.academy.yatskevich.lesson9;

public class Size {

    public <U extends Line<T>, T extends Number> Double returnSizeA(U figure) {
        return Double.parseDouble(String.valueOf(figure.getSizeA()));
    }

    public <U extends Rectangle<T>, T extends Number> Double returnSizeB(U figure) {
        return Double.parseDouble(String.valueOf(figure.getSizeB()));
    }

    public <U extends Parallelepiped<T, R>, T extends Number, R extends Number> Double returnSizeH(U figure) {
        return Double.parseDouble(String.valueOf(figure.getSizeH()));
    }

    public <U extends Rectangle<T>, T extends Number> Double getSquare(U figure) {
        return Double.parseDouble(String.valueOf(figure.getSizeA())) * Double.parseDouble(String.valueOf(figure.getSizeB()));
    }

    public <U extends Parallelepiped<T, R>, T extends Number, R extends Number> Double getVolume(U figure) {
        Double h = Double.parseDouble(String.valueOf(figure.getSizeH()));
        Double a = Double.parseDouble(String.valueOf(figure.getSizeA()));
        Double b = Double.parseDouble(String.valueOf(figure.getSizeB()));
        return a * b * h;
    }
}
