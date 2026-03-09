package com.java.oop;

public class Order {
    int orderId;
    String orderName;
    String orderCatergery;
    double orderPrice;
    int orderQuantity;

    public Order(){
    };

    public Order(int orderId, String orderName, String orderCatergery, double orderPrice, int orderQuantity) {
        this.orderId = orderId;
        this.orderName = orderName;
        this.orderCatergery = orderCatergery;
        this.orderPrice = orderPrice;
        this.orderQuantity = orderQuantity;
    }
}



for(char