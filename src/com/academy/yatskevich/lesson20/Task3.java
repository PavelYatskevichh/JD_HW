package com.academy.yatskevich.lesson20;

public class Task3 {
    public static void main(String[] args) {
        Category fruits = new Category("Fruits");
        Category groceries = new Category("Groceries");
        Category meat = new Category("Meat");

        Product beef = new Product("Beef", 19.90, 8);
        Product chicken = new Product("Chicken", 9.70, 9);
        Product pork = new Product("Pork", 13.65, 6);
        meat.addProduct(beef);
        meat.addProduct(chicken);
        meat.addProduct(pork);
        Product pasta = new Product("Pasta", 6.56, 8);
        Product cereal = new Product("Cereal", 3.29, 9);
        Product flour = new Product("Flour", 4.50, 8);
        groceries.addProduct(pasta);
        groceries.addProduct(cereal);
        groceries.addProduct(flour);
        Product apple = new Product("Apple", 1.49, 7);
        Product peach = new Product("Peach", 5.89, 9);
        Product banana = new Product("Banana", 2.79, 9);
        fruits.addProduct(apple);
        fruits.addProduct(peach);
        fruits.addProduct(banana);

        Basket myBasket = new Basket();
        myBasket.addProducts(meat, chicken);
        myBasket.addProducts(groceries, cereal);
        myBasket.addProducts(groceries, flour);
        myBasket.addProducts(fruits, peach);
        myBasket.addProducts(fruits, banana);

        myBasket.printCheck();
    }
}
