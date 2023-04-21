package com.academy.yatskevich.lesson4;

public class Task6 {
    public static void main(String[] args) {
//        Данный алгоритм выгодно использовать только, если мы знем облась допустимых значений и она относительно не большая.
//        В моём примере область допустимых значений от 0 до 9.
        int[] array = {2,9,1,7,2,0,8,3,2,4,3,0,3,7,7,7,7,7,7,7,7,7,7,0,4,6,9,1,0,5,9,7,0,1,6,7,3,0,1,3,0,0,5,7,4};

        countSort(array);

        for (int n : array) {
            System.out.print(n + " ");
        }
    }

    public static void countSort(int[] array) {
//        Подсчет количества каждого элемента.
        int[] digits = new int[10];
        for (int x : array) {
            digits[x]++;
        }

//        Непосредственно сортировка.
        for (int i = 0, j = 0; digits[i] >= 0 && j < array.length; j++) {
            if (digits[i] == 0) {
                i++;
            }
            array[j] = i;
            digits[i]--;
        }
    }
}
