package com.java.oop.polymorphism;

public class RegularCustomer {
    int memberId;
    String memberName;
    String validityMonths;

    public RegularCustomer(int memberId, String memberName, String validityMonths) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.validityMonths = validityMonths;
    }

    public RegularCustomer() {

    }
    void dispalyDetails(){
        System.out.println(memberId);
        System.out.println(memberName);
        System.out.println(validityMonths);
    }
}
