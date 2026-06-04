package com.java.oop.java8.anonymous;

public final class GreetingImpl implements Greeting {


    public GreetingImpl() {

    }

    @Override
    public void greet() {
        System.out.println("Hello, How are you!");
    }

    @Override
    public void greet(String msg) {
        System.out.println(msg);
    }
}