package com.java.oop.model;

public class Main {

    public static void main(String[] args) {

        Product product = new Product();

        product.setProductId(101)
                .setProductName("Laptop")
                .setPrice(65000)
                .setQuantity(5)
                .setCategory("Electronics");

        System.out.println(product);

        System.out.println("ID: " + product.getProductId());
        System.out.println("Name: " + product.getProductName());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Quantity: " + product.getQuantity());
        System.out.println("Category: " + product.getCategory());
    }
}