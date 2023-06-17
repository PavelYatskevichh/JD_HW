package com.academy.yatskevich.lesson12;

import java.math.BigDecimal;
import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        Set<Integer> ar1 = new HashSet<>(Arrays.asList(1, 2, 3, 7, 5, 12));
        TreeSet<Double> ar2 = new TreeSet<>(Arrays.asList(3.0, 6.0, 4.0, 8.0, 9.0, 12.0));
        HashSet<Long> ar3 = new HashSet<>(Arrays.asList(10L, 11L, 12L, 13L, 14L, 15L));
        HashSet<Byte> ar4 = new HashSet<>(Arrays.asList(new Byte[]{3, 6, 17, 18, 19, 20}));


        System.out.println("Intersections: " + getCross(ar1, ar2, ar3, ar4));
        System.out.println("United union: " + getUnion(ar1, ar2, ar3));
    }

    static Set<BigDecimal> getCross(Collection<? extends Number>... l) {
        Set<BigDecimal> result = new TreeSet<>();

        for (int j = 0; j < l.length; j++) {
            Iterator<? extends Number> itr = l[j].iterator();
            Set<BigDecimal> tmp = new TreeSet<>();
            while (itr.hasNext()) {
                tmp.add(new BigDecimal(String.valueOf(itr.next())));
            }

            for (int i = 0; i < l.length; i++) {
                if (i == j) {
                    continue;
                }
                Iterator<? extends Number> iterator = l[i].iterator();
                while (iterator.hasNext()) {
                    BigDecimal a = new BigDecimal(String.valueOf(iterator.next()));
                    if (tmp.contains(a)) {
                        result.add(a);
                    }
                }
            }
        }
        return result;
    }

    static Set<BigDecimal> getUnion(Collection<? extends Number>... l) {
        Set<BigDecimal> result = new TreeSet<>();
        for (int i = 0; i < l.length; i++) {
            Iterator<? extends Number> iterator = l[i].iterator();
            while (iterator.hasNext()) {
                result.add(new BigDecimal(String.valueOf(iterator.next())));
            }
        }
        return result;
    }
}
