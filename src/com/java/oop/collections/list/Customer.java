package com.java.oop.model;

public class Customer {

    private int id;
    private String name;
    private String email;
    private String password;
    private long phoneNo;
    private boolean active;

    public Customer() {
    }

    public Customer(int id, String name, String email, String password, long phoneNo, boolean active) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phoneNo = phoneNo;
        this.active = active;
    }

    public int getId() {
        return id;
    }

    public Customer setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Customer setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Customer setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Customer setPassword(String password) {
        this.password = password;
        return this;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public Customer setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
        return this;
    }

    public boolean isActive() {
        return active;
    }

    public Customer setActive(boolean active) {
        this.active = active;
        return this;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNo=" + phoneNo +
                ", active=" + active +
                '}';
    }
}