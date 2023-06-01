package com.academy.yatskevich.lesson13;

public class FoodChecker {
    public boolean isVegetarian (FoodType fT) {
        if (fT == FoodType.FRUIT || fT == FoodType.VEGETABLE || fT == FoodType.MILK) {
            return true;
        } else {
            return false;
        }
    }
}
