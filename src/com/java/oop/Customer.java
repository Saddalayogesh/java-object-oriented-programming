package com.java.oop;

public class Customer {
    //state
    int id;
    String name;
    String email;
    String password;
    int age;
    long mobileNo;
    char gender;
    String address;
    boolean isActive;
    public  Customer(){

    }
    public Customer(int id, String name, String email, String password, int age, long mobileNo, char gender, String address, boolean isActive) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.age=age;
        this.mobileNo = mobileNo;
        this.gender = gender;
        this.address = address;
        this.isActive = isActive;
    }
}



