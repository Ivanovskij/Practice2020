package org.practice2020.interfaces.functionals;

import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {
        Function<String, Integer> converter = (a) -> Integer.valueOf(a) * 100;
        System.out.println(converter.andThen((a) -> a * a).apply("5"));
        System.out.println(converter.apply("10"));

    }
}
