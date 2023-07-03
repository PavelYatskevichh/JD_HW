package com.academy.yatskevich.lesson20;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.*;

public class Basket {
    private Map<Product, Category> products = new HashMap<>();

    public void addProducts(Category category ,Product product) {
        products.put(category.getProduct(product), category);
    }

    public Set<Product> getProducts() {
        return products.keySet();
    }

    public void printCheck() {
        LocalDate now = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.printf("%-20s%s\n", "Date:", formatter.format(now));
        System.out.printf("\n%-10s%-12s%-5s\n", "Products", "Category", "Price");
        System.out.println("------------------------------");
        products.forEach((key, value) -> System.out.printf("%-10s%-12s%-5.2f%s\n", key.getName(), value.getName(), key.getPrice(), "BYN"));
        System.out.println("------------------------------");
        System.out.printf("%-20s%.2f\n", "Total:", products.keySet().stream().mapToDouble(Product::getPrice).sum());
    }
}
