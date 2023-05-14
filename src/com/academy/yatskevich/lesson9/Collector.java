package com.academy.yatskevich.lesson9;

public class Collector<T extends Number> {
    private T[] val;

    public T returnValue(int index) {
        if (index > 0 && index < val.length) {
            return val[index];
        } else {
            System.out.println("Ошибка при попытке вывести index = " + index + ": index out of bound!");
            return null;
        }
    }

    public Collector(T[] val) {
        setVal(val);
    }

    public T[] getVal() {
        return val;
    }

    public void setVal(T[] val) {
        this.val = val;
    }
}
