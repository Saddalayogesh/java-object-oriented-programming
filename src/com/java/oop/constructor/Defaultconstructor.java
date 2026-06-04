package com.java.oop.constructor;

public  class Defaultconstructor {
    byte id;
    int age;
    String name;
    long mobileNumber;

    public static void main(String[] args) {

    Defaultconstructor dc=new Defaultconstructor();
    dc.id=1;
    dc.age=22;
    dc.name="Yogesh";
    dc.mobileNumber=6300075885l;

    System.out.println(dc.id);
    System.out.println(dc.age);
    System.out.println(dc.name);
    System.out.println(dc.mobileNumber);
}
}
