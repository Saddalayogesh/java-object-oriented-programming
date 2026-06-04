package com.java.oop.constructor;

public class NoArgument {
    byte id;
    int age;
    String name;
    long mobileNumber;

    // No-argument constructor
    public NoArgument() {
    }

    public static void main(String[] args) {
        NoArgument obj = new NoArgument();

        obj.id = 1;
        obj.age = 22;
        obj.name = "Yogesh";
        obj.mobileNumber = 6300075885L;

        System.out.println(obj.id);
        System.out.println(obj.age);
        System.out.println(obj.name);
        System.out.println(obj.mobileNumber);
    }
}
