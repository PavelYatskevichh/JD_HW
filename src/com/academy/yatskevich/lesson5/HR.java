package com.academy.yatskevich.lesson5;

public class HR extends Student { // наследование не нужно. да и не проходили мы его еще к тому времени
    private HR() {

    }

    public static Student[] eachStudentToArray(Student... student) { // метод не должен быть статическим
        Student[] students = new Student[student.length];
        for (int i = 0; i < students.length; i++) {
            students[i] = student[i];
        }
        return students;
    }

    public static void printStudentsAccordingYearInUniversity(Student[] list, int anyYearInUniversity) { // метод не должен быть статическим
        System.out.printf("Список ФИО студентов на %d курсе:\n", anyYearInUniversity);
        for (int i = 0; i < list.length; i++) {
            if (list[i].getYearInUniversity() == anyYearInUniversity) {
                System.out.println(list[i].getFullName());
            }
        }
    }

    public static void printStudentsAccordingYearOfBirth(Student[] list, int anyYearOfBirth) { // метод не должен быть статическим
        System.out.printf("Список ФИО студентов %d года рождения:\n", anyYearOfBirth);
        for (int i = 0; i < list.length; i++) {
            if (list[i].getYearOfBirth() == anyYearOfBirth) {
                System.out.println(list[i].getFullName());
            }
        }
    }
}
