package org.practice2020.interfaces.impl;

import org.practice2020.interfaces.DefaultTrickInterface;

public class DefaultTrickInterfaceImpl implements DefaultTrickInterface {
    @Override
    public double calculate(int a) {
        return sqrt(a * 100);
    }

    public static void main(String[] args) {
        DefaultTrickInterfaceImpl defaultTrickInterface = new DefaultTrickInterfaceImpl();
        System.out.println(defaultTrickInterface.calculate(100)); // 100
        System.out.println(defaultTrickInterface.sqrt(16)); // 4
    }
}
