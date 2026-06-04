package com.java.oop.polymorphism;

public class PremiumCustomer {
    int memberId;
    String memberName;
    String validityMonths;

    public PremiumCustomer(int memberId, String memberName, String validityMonths) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.validityMonths = validityMonths;
    }

    public PremiumCustomer() {

    }
    void displayDetails(){
        System.out.println(memberId);
        System.out.println(memberName);
        System.out.println(validityMonths);
    }
}
