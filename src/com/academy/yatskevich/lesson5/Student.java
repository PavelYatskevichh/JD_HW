package com.academy.yatskevich.lesson5;

public class Student {
    private int id;
    private String fullName;
    private String faculty;
    private int yearInUniversity;
    private int group;
    private int yearOfBirth;

    public void introduce() {
        System.out.printf("Привет! Меня зовут %s. Моё ID - %d. Я учусь на %s факультете в группе %d. Сейчас я на %d курсе." +
                " И, кстати, я %d года рождения.\n", fullName, id, faculty, group, yearInUniversity, yearOfBirth);
    }

    public Student(int id, String fullName, String faculty, int yearInUniversity, int group, int yearOfBirth) {
        setId(id);
        setFullName(fullName);
        setFaculty(faculty);
        setYearInUniversity(yearInUniversity);
        setGroup(group);
        setYearOfBirth(yearOfBirth);

    }

    public Student() {

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setYearInUniversity(int yearInUniversity) {
        this.yearInUniversity = yearInUniversity;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getYearInUniversity() {
        return yearInUniversity;
    }

    public int getGroup() {
        return group;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
