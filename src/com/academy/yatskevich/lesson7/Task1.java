package com.academy.yatskevich.lesson7;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Document doc1 = new Document("Письмо", 2);
        Document doc2 = new Document("Договор", 10);
        Document doc3 = new Document("Акт", 5);

        Document[] array = new Document[3];
        array[0] = doc2;
        array[1] = doc3;
        array[2] = doc1;

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        Document doc1clone = doc1.clone();
        System.out.println(doc1clone == doc1);
        System.out.println(doc1clone.equals(doc1));
        System.out.println(doc1clone.equals(doc2));

        Object object = doc1clone;

        Printable printer = (Printable) object;
        printer.print();
    }
}
