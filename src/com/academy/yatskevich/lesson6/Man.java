package com.academy.yatskevich.lesson6;

import java.util.Objects;

public class Man {
    private String name;
    private int age;
    private String sex;
    private int weight;

    public Man(String name, int age, String sex, int weight) {
        this.setName(name);
        this.setAge(age);
        this.setSex(sex);
        this.setWeight(weight);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight > 0 && weight < 300) {
            this.weight = weight;
        } else {
            System.out.println(this.name + ", укажите другой вес.");
        }
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if (Objects.equals(sex, "мужчина") || Objects.equals(sex, "женщина") || Objects.equals(sex, "трансгендер")
                || Objects.equals(sex, "интерсекс")) {
            this.sex = sex;
        } else {
            System.out.println(this.name + ", мне такой пол не известен. Укажиет другой пол из перечня:" +
                    " мужчина, женщина, трансгендер, интерсекс");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 150) {
            this.age = age;
        } else {
            System.out.println(this.name + ", укажите другой возраст.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
