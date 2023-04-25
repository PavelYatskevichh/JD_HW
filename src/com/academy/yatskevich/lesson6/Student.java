package com.academy.yatskevich.lesson6;

public class Student extends Man {

    private int yearOfStudy;

    public Student(String name, int age, String sex, int weight, int yearOfStudy) {
        super(name, age, sex, weight);
        this.setYearOfStudy(yearOfStudy);
    }

    public void increaseYearOfStudy() {
        this.yearOfStudy++;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        if (yearOfStudy > 0 && yearOfStudy <= 6) {
            this.yearOfStudy = yearOfStudy;
        } else {
            System.out.println(super.getName() + ", столько не учатся. Укажите другое значение.");
        }
    }
}
