package com.academy.yatskevich.lesson9;

public class Pair<T, U> {
    private T first;
    private U last;

    //это же и есть геттеры, но я их тоже создал
    public T first() {
        return first;
    }

    //и это
    public U last() {
        return last;
    }

    //Создал метод с сырым типом.
    public static void swap(Pair pair) {
        Object tmp = pair.last;
        pair.last = pair.first;
        pair.first = tmp;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", last=" + last +
                '}';
    }

    public void replaceFirst(T val) {
        first = val;
    }

    public void replaceLast(U val) {
        last = val;
    }

    public Pair(T first, U last) {
        this.first = first;
        this.last = last;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public U getLast() {
        return last;
    }

    public void setLast(U last) {
        this.last = last;
    }
}
