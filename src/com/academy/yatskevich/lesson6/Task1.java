package com.academy.yatskevich.lesson6;

public class Task1 {
    public static void main(String[] args) {
        Student student1 = new Student("Павел", 21, "мужчина", 100, 4);
        Man student2 = new Student("Вадим", 22, "мужчина", 90, 5);
        Man man1 = new Man("Андрей", 39, "мужчина", 120);

        System.out.println(student1.getName());

        System.out.println(((Student) student2).getYearOfStudy());

        Man man2 = student1;
        System.out.println(((Student) man2).getYearOfStudy());
    }
}
