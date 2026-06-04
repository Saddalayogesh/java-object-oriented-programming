package com.java.oop.polymorphism;

public class CustomerService {
    public CustomerService(){

    }
    void displayDetails(Customer customer){
        customer.dispalyDetails();

    }
    void displayDetails(RegularCustomer regularCustomer){
        regularCustomer.dispalyDetails();

    }
    void displayDetails(PremiumCustomer premiumCustomer){

    }
}
