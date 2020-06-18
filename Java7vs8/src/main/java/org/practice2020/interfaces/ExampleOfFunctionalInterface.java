package org.practice2020.interfaces;

@FunctionalInterface
public interface ExampleOfFunctionalInterface<F, T> {
    T convert(F from);
}
