package com.academy.yatskevich.lesson5;

public class Task3 {
    public static void main(String[] args) {
        Student student1 = new Student(501, "Глушко Владислав", "Строительный факультет",
                3, 11201516, 1998);
        Student student2 = new Student(502, "Головатый Алексей", "Строительный факультет",
                2, 11201516, 1998);
        Student student3 = new Student(503, "Каландаров Вадим", "Строительный факультет",
                3, 11201516, 1999);
        Student student4 = new Student(504, "Паршуто Виталий", "Строительный факультет",
                2, 11201516, 1998);
        Student student5 = new Student(505, "Козел Владислав", "Строительный факультет",
                4, 11201516, 1998);
        Student student6 = new Student(506, "Латушкин Владимир", "Строительный факультет",
                5, 11201516, 1998);
        Student student7 = new Student(507, "Вышинский Тарас", "Строительный факультет",
                3, 11201516, 1999);
        Student student8 = new Student(508, "Конопацкий Роман", "Строительный факультет",
                5, 11201516, 1998);
        Student student9 = new Student(509, "Сопот Владислав", "Строительный факультет",
                4, 11201516, 1999);
        Student student10 = new Student(510, "Коленда Денис", "Строительный факультет",
                3, 11201516, 1997);
        Student student11 = new Student(511, "Одинаев Даворн", "Строительный факультет",
                3, 11201516, 1997);
        Student student12 = new Student(512, "Яцкевич Павел", "Строительный факультет",
                4, 11201516, 1999);
        Student student13 = new Student(513, "Яцура Владислав", "Строительный факультет",
                4, 11201516, 1998);

        HR head = new HR();
        Student[] students = head.eachStudentToArray(student1,student2,student3,student4,student5,student6,student7,
                student8,student9,student10,student11,student12,student13);

        head.printStudentsAccordingYearInUniversity(students, 4);
        head.printStudentsAccordingYearOfBirth(students, 1999);
    }
}
