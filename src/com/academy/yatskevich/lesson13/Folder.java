package com.academy.yatskevich.lesson13;

import java.util.Iterator;

public class Folder<T> implements Iterable<T>{
    T[][] array;

    public Folder(T[][] array) {
        this.array = array;
    }

    @Override
    public Iterator<T> iterator() {
        class Iterator<T> implements java.util.Iterator<T> {
            int currentX = 0;
            int currentY = 0;
            @Override
            public boolean hasNext() {
                return currentX < array.length && currentY < array[currentX].length;
            }

            @Override
            public T next() {
                T o = (T) array[currentX][currentY];
                if (currentY != array[currentX].length-1) {
                    currentY++;
                } else {
                    currentX++;
                    currentY = 0;
                }
                return o;
            }
        }
        return new Iterator<T>();
    }
}
