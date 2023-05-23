package com.academy.yatskevich.lesson11;

import java.util.*;

public class MySet<T> implements Set<T> {
    private T[] elements = (T[]) new Object[]{};
    private int size;

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean add(T t) {
        if (!contains(t)) {
            if (size == elements.length) {
                elements = Arrays.copyOf(elements, elements.length * 3 / 2 + 1);
            }
            elements[size++] = t;
        }
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (contains(o)) {
            int index = -1;
            for (int i = 0; i < size; i++) {
                if (this.elements[i].equals((T) o)) {
                    index = i;
                }
            }
            System.arraycopy(elements, index + 1, elements, index, size - index - 1);
            size--;
        }
        return true;
    }

    @Override
    public boolean contains(Object o) {
        boolean b = false;
        for (int i = 0; i < size; i++) {
            if (this.elements[i].equals((T) o)) {
                b = true;
                break;
            }
        }
        return b;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        Iterator<?> iterator = c.iterator();
        boolean b = true;
        while (iterator.hasNext()) {
            if (!contains(iterator.next())) {
                b = false;
            }
        }
        return b;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        Iterator<?> iterator = c.iterator();
        while (iterator.hasNext()) {
            add((T) iterator.next());
        }
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        Iterator<?> iterator = c.iterator();
        while (iterator.hasNext()) {
            remove(iterator.next());
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        String separator = "";
        for (int i = 0; i < size; i++) {
            sb.append(separator).append(elements[i]);
            separator = " ";
        }
        sb.append("]");
        return sb.toString();
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
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
}
