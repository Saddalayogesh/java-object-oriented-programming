package com.java.oop;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Customer customer2 = new Customer();
        Order order=new Order();
        Product product=new Product();
        Payment payment = new Payment();


        customer.id = 101;
        customer.name = "yogesh";
        customer.age = 22;
        customer.gender = 'M';
        customer.mobileNo = 6300075885L;
        customer.address = "Tirupati";
        customer.email = "yogesh@gmail.com";
        customer.password = "yogesh@123";
        customer.isActive = true;

        System.out.println("ID: "+ customer.id);
        System.out.println("Name: "+ customer.name);
        System.out.println("Age: "+ customer.age);
        System.out.println("Gender: "+ customer.gender);
        System.out.println("MobileNO: "+ customer.mobileNo);
        System.out.println("Adress: "+ customer.address);
        System.out.println("Email: "+customer.email);
        System.out.println("Password:" +customer.password);
        System.out.println("Is Active" +customer.isActive);

        customer2.id = 102;
        customer2.name = "mahesh";
        customer2.age = 22;
        customer2.gender = 'M';
        customer2.mobileNo = 6300074884L;
        customer2.address = "Chittor";
        customer2.email = "mahesh@gmail.com";
        customer2.password = "mahesh@123";
        customer2.isActive = true;
        System.out.println("ID: "+ customer2.id);
        System.out.println("Name: "+ customer2.name);
        System.out.println("Age: "+ customer2.age);
        System.out.println("Gender: "+ customer2.gender);
        System.out.println("MobileNO: "+ customer2.mobileNo);
        System.out.println("Adress: "+ customer2.address);
        System.out.println("Email: "+customer2.email);
        System.out.println("Password:" +customer2.password);
        System.out.println("Is Active" +customer2.isActive);


        order.orderId=103;
        order.orderName="Fan";
        order.orderPrice=4089;
        order.orderCatergery="Electronics";
        order.orderQuantity=2;
        System.out.println("orderId" +order.orderId);
        System.out.println("orderName" +order.orderName);
        System.out.println("orderPrice"+order.orderPrice);
        System.out.println("orderCatergery"+order.orderCatergery);
        System.out.println("orderQuantity"+order.orderQuantity);

        product.id = 101;
        product.name = "Mobile";
        product.brand = "Samsung";
        product.price = 25000;
        product.rating = 4.5;

        System.out.println("Id: " + product.id);
        System.out.println("Name: " + product.name);
        System.out.println("Brand: " + product.brand);
        System.out.println("Price: " + product.price);
        System.out.println("Rating: " + product.rating);


        payment.paymentId = 501;
        payment.paymentMethod = "UPI";
        payment.amount = 4089;
        payment.paymentStatus = "Success";
        payment.transactionId = "TXN12345";

        System.out.println("paymentId: " + payment.paymentId);
        System.out.println("paymentMethod: " + payment.paymentMethod);
        System.out.println("amount: " + payment.amount);
        System.out.println("paymentStatus: " + payment.paymentStatus);
        System.out.println("transactionId: " + payment.transactionId);

    }


}
