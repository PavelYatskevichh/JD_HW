package com.academy.yatskevich.lesson3;

public class Task6 {
    public static void main(String[] args) {
        int[] array = Task4.creatingArray();
        Task4.printArray(array);
        System.out.print("\n");
        Task4.printWithinMultiplicityOf7(array);
        System.out.print("\n");
        Task5.printMAX(array);
        Task5.printMIN(array);
    }
}
