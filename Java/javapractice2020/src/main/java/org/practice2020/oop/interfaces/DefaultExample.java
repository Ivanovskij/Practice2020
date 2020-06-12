package org.practice2020.oop.interfaces;

public interface DefaultExample {

    default String sayHello(String hello) {
        return "hello 2020";
    }
}
