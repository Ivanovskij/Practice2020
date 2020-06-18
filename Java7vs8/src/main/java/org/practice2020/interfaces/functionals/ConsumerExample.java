package org.practice2020.interfaces.functionals;

import org.practice2020.interfaces.PersonFactory;
import org.practice2020.interfaces.model.Person;

import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        Consumer<Person> consumer = (p) -> System.out.println("Hello " + p);

        PersonFactory<Person> p = Person::new;
        consumer.accept(p.create("oleg", "login"));
    }

}
