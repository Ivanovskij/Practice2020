package org.practice2020.interfaces;

public interface DefaultTrickInterface {

    double calculate(int a);

    default double sqrt(double number) {
        return Math.sqrt(number);
    }

}
