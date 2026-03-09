package com.java.oop;

public class Product {

    int id;
    String name;
    String brand;
    double price;
    double rating;

    // No-argument constructor
    public Product() {
    }

    // Parameterized constructor
    public Product(int id, String name, String brand, double price, double rating) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.rating = rating;
    }
}
