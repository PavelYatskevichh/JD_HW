package com.academy.yatskevich.lesson9;

public class HeirOfNumber<T extends Number> {
    private T val;

    public <U extends Number> boolean isStringEquals(U number) {
        return val.toString().length() == number.toString().length();
    }

    public HeirOfNumber(T val) {
        this.val = val;
    }

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }
}
