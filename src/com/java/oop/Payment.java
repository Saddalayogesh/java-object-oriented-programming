package com.java.oop;

public class Payment {

    int paymentId;
    String paymentMethod;
    double amount;
    String paymentStatus;
    String transactionId;

    // No-argument constructor
    public Payment() {
    }

    // Parameterized constructor
    public Payment(int paymentId, String paymentMethod, double amount, String paymentStatus, String transactionId) {
        this.paymentId = paymentId;
        this.paymentMethod = paymentMethod;
        this.amount = amount;
        this.paymentStatus = paymentStatus;
        this.transactionId = transactionId;
    }
}
