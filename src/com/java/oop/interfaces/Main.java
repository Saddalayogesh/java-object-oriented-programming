package com.java.oop.interfaces;

import com.java.oop.abstraction.OrderService;
import com.java.oop.abstraction.Payment;
import com.java.oop.abstraction.UpiPayment;

public class Main {

    public static void main(String[] args) {

        Payment payment = new UpiPayment();
        OrderService order = new OrderService(payment);
        order.processOrder(1000.0, 123456);
    }
}