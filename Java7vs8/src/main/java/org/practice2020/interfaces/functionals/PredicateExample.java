package org.practice2020.interfaces.functionals;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        Predicate<String> predicate = (text) -> text.length() > 0;
        System.out.println(predicate.test("should be true"));
        System.out.println(predicate.and(String::isEmpty).test("should be false"));
    }

}
