package org.practice2020.interfaces.impl;

import org.practice2020.interfaces.ExampleOfFunctionalInterface;

public class FunctionalInterfaceImpl {

    public static void main(String[] args) {
        ExampleOfFunctionalInterface<String, Integer> converterToInteger = (from) -> Integer.valueOf(from);
        ExampleOfFunctionalInterface<Integer, String> converterToString = (from) -> String .valueOf(from);

        Integer fromString = converterToInteger.convert("100");
        String fromInteger = converterToString.convert(200);
        System.out.println(fromString);
        System.out.println(fromInteger);
    }
}
