package com.java.oop.java8.functional;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        Greeting greeting = (name, msg) -> {
            System.out.println("Hello, " + name);
            System.out.println(msg);
        };

        greeting.greet("Yogesh", "Hello, How are you!");

        Predicate<Integer> isEven = number -> number % 2 == 0;
        System.out.println(isEven.test(5));

        Consumer<Integer> consumer = number -> System.out.println(number);
        consumer.accept(5);

        Supplier<Double> supplier = () -> Math.random();
        System.out.println(supplier.get());

        Function<String, Integer> strLength = str -> str.length();
        System.out.println(strLength.apply("Yogesh"));
    }
}