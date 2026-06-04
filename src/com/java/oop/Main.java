package com.java.oop;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        int x = 0;
        System.out.println(x);

        Customer customer = new Customer(
                101,
                "Yogesh",
                "yogesh@gmail.com",
                "yogesh@123",
                (byte) 22,
                9876543210L,
                'M',
                "Hyderabad",
                true
        );

        System.out.println("Id: " + customer.id);
        System.out.println("Name: " + customer.name);
        System.out.println("Gender: " + customer.gender);

        Customer customer2 = new Customer(
                102,
                "Customer2",
                "customer2@gmail.com",
                "customer2@123",
                (byte) 25,
                63453423L,
                'F',
                "Secunderabad",
                false
        );

        System.out.println("Id: " + customer2.id);
        System.out.println("Name: " + customer2.name);
        System.out.println("Gender: " + customer2.gender);

        Customer customer3 = new Customer();

        Product product = new Product(
                101,
                "Lenovo Laptop",
                2342323,
                5.4F,
                4.5F,
                true
        );

        product.displayProductDetails();

        System.out.println("Discount Amount: " + product.getDiscountAmount());
        System.out.println("Final Price: " + product.getFinalPrice());

        List<Product> productsListPriceAbove =
                product.getProductsPriceAbove(2342323);

        List<Product> productsListPriceBetween =
                product.getProductsPriceBetween(2000000, 3000000);
    }
}