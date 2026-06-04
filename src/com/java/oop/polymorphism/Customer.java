package com.java.oop.polymorphism;

public class Customer {
        int memberId;
        String memberName;
        String validityMonths;

    public Customer(int memberId, String memberName, String validityMonths) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.validityMonths = validityMonths;
    }

    public Customer() {
    }

    void dispalyDetails(){
        System.out.println(memberId);
        System.out.println(memberName);
        System.out.println(validityMonths);
    }

}

