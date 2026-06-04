package com.java.oop.constructor;

public class Parameterized {
        int id;
        int age;
        String name;
        long mobileNumber;

    public Parameterized(int id, int age, String name, long mobileNumber) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.mobileNumber = mobileNumber;

    }
    public static void main(String[] args) {
     Parameterized par=new Parameterized(1,22,"yogesh",878668767l);
        System.out.println(par.id);
        System.out.println(par.age);
        System.out.println(par.name);
        System.out.println(par.mobileNumber);
    }
}

