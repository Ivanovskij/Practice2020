package org.practice2020.interfaces.functionals;

import org.practice2020.interfaces.model.Person;

import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<Person> supplier = Person::new;
        System.out.println(supplier.get());
    }
}
