package com.academy.yatskevich.lesson11;

import java.util.*;

public class MyList<T> implements List<T> {

    private T[] elements = (T[]) new Object[]{};
    private int size;

    @Override
    public void clear() {
        elements = (T[]) new Object[elements.length];
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        T[] array = (T[]) c.toArray();
        for (T t : array) {
            if (size == elements.length) {
                elements = Arrays.copyOf(elements, elements.length * 3 / 2 + 1);
            }
            elements[size++] = t;
        }
        return false;
    }

    @Override
    public void add(int index, T element) {
        System.arraycopy(elements, index, elements, index + 1, size - index - 1);
        elements [index] = element;
        size++;
    }

    @Override
    public T set(int index, T element) {
        T oldElement = elements[index];
        elements[index] = element;
        return oldElement;
    }

    @Override
    public T get(int index) {
        if (index > size - 1) {
            throw new IndexOutOfBoundsException();
        }
        return elements[index];
    }

    @Override
    public boolean add(T t) {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 3 / 2 + 1);
        }
        elements[size++] = t;
        return true;
    }

    @Override
    public T remove(int index) {
        T element = elements[index];
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        size--;
        return element;
    }

    @Override
    public int size() {
        return this.size;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        String separator = "";
        for (int i = 0; i < size; i++) {
            sb.append(separator).append(elements[i]);
            separator = ", ";
        }
        sb.append("]");
        return sb.toString();
    }


    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }
}
