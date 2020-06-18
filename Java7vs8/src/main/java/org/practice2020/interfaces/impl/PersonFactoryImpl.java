package org.practice2020.interfaces.impl;

import org.practice2020.interfaces.PersonFactory;
import org.practice2020.interfaces.model.Person;

public class PersonFactoryImpl {

    public static void main(String[] args) {
        PersonFactory<Person> p = Person::new;
        System.out.println(p.create("Oleg", "oleg@gmail.com"));
    }

}
