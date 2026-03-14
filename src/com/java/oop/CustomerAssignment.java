package com.java.oop;

public class CustomerAssignment {

    public static CustomerDetails[] getCustomersFromString(String[] customersData) {
        CustomerDetails[] customers = new CustomerDetails[customersData.length];
        for (int index = 0; index < customersData.length; index++) {
            String[] split = customersData[index].split(",");
            CustomerDetails customer = new CustomerDetails(split[0], split[1], split[2], Long.parseLong(split[3]));
            customers[index] = customer;
        }
        return customers;
    }

    public static void main(String[] args) {

        String[] customersData = {
                "c-101,Arjun Reddy,arjun.reddy101@example.com,9876543210",
                "c-102,Priya Sharma,priya.sharma102@example.com,9123456780",
                "c-103,Rahul Verma,rahul.verma103@example.com,9988776655",
                "c-104,Sneha Patel,sneha.patel104@example.com,9012345678",
                "c-105,Kiran Kumar,kiran.kumar105@example.com,9345678123",
                "c-106,Ananya Gupta,ananya.gupta106@example.com,9871234560",
                "c-107,Rohit Mehta,rohit.mehta107@example.com,9098765432",
                "c-108,Pooja Singh,pooja.singh108@example.com,9182736450",
                "c-109,Vikram Joshi,vikram.joshi109@example.com,9955667788",
                "c-110,Neha Agarwal,neha.agarwal110@example.com,9001122334"
        };

        CustomerDetails[] customers = getCustomersFromString(customersData);

        System.out.println("--------------------------------------------------------------------------------------");
        System.out.printf("%-10s %-20s %-35s %-15s\n", "ID", "NAME", "EMAIL", "PHONE");
        System.out.println("--------------------------------------------------------------------------------------");

        for (CustomerDetails customer : customers) {
            customer.displayCustomerDetails();
        }
    }
}
