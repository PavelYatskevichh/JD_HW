package com.academy.yatskevich.lesson20;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Category {
    private String name;
    private Map<String, Product> products = new HashMap<>();

    public void addProduct(Product product) {
        products.put(product.getName(), product);
    }

    public Product getProduct(Product product) {
        return products.get(product.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<Product> getProducts() {
        return products.values();
    }

    public Category(String name) {
        this.name = name;
    }
}
