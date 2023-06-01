package com.academy.yatskevich.lesson13;

public class Task1 {
    public static void main(String[] args) {
        FoodType pork = FoodType.MEAT;
        FoodChecker foodChecker = new FoodChecker();

        System.out.println(foodChecker.isVegetarian(pork));
        System.out.println(foodChecker.isVegetarian(FoodType.FRUIT));
    }
}
