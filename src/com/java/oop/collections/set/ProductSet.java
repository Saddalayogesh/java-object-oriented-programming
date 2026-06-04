package com.java.oop.collections.set;

import java.util.HashSet;
import java.util.Iterator;

public class ProductSet {
    public static void main(String[] args) {

        HashSet<Product> products = new HashSet<>();

        Product product1 = new Product();
        product1.setProductId(101).setProductName("Laptop").setPrice(69999.9).setQuantity(2).setCategory("Electronics");

        Product product2 = new Product();
        product2.setProductId(102).setProductName("Mobile").setPrice(129999.95).setQuantity(1).setCategory("Electronics");

        Product product3 = new Product();
        product3.setProductId(103).setProductName("Tab").setPrice(39999.9).setQuantity(3).setCategory("Electronics");

        products.add(product1);
        products.add(product2);
        products.add(product3);

        System.out.println(products);

        Iterator<Product> iterator = products.iterator();

        while (iterator.hasNext()) {
            Product product = iterator.next();
            System.out.println(product);
        }
    }
}