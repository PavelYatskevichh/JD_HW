package com.academy.yatskevich.lesson12;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        HashSet<Integer> ar1 = new HashSet<>(Arrays.asList(37, 4, 1, 13, 31, 10, 61, 64, 16, 40, 43, 46, 58, 58, 58));
        TreeSet<Integer> ar2 = new TreeSet<>(Arrays.asList(16, 43, 55, 52, 70, 19, 22, 25, 49, 7, 67, 28, 58, 58, 58));

        System.out.println("Intersections: " + getCross(ar1, ar2));
        System.out.println("United union: " + getUnion(ar1, ar2));
    }

    static List<Integer> getCross(Collection<Integer> l1, Collection<Integer> l2) {
        Iterator<Integer> iterator = l1.iterator();
        List<Integer> result = new ArrayList<>();
        int a;
        while (iterator.hasNext()) {
            a = iterator.next();
            if (l2.contains(a) && !(result.contains(a))) {
                result.add(a);
            }
        }
        return result;
    }

    static Set<Integer> getUnion(Collection<Integer> l1, Collection<Integer> l2) {
        Set<Integer> result = new TreeSet<>(l1);
        result.addAll(l2);
        return result;
    }
}
