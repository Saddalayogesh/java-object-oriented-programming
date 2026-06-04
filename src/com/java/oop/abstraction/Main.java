package com.java.oop.abstraction;

public class Main {

    public static void main(String[] args) {

        Payment payment = new Payment() {
            @Override
            boolean pay(double amount) {
                return false;
            }

            @Override
            boolean pay(double amount, int otp) {
                return false;
            }
        };
        OrderService order = new OrderService(payment);
        order.processOrder(1000.0, 123456);
    }
}