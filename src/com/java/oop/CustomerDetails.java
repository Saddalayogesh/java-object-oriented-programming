package com.java.oop;

public class CustomerDetails {

    String id;
    String name;
    String email;
    long phoneno;

    public CustomerDetails(String id, String name, String email, long phoneno) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneno = phoneno;
    }

    public void displayCustomerDetails() {
        System.out.printf("%-10s %-20s %-35s %-15d\n", id, name, email, phoneno);
    }
}