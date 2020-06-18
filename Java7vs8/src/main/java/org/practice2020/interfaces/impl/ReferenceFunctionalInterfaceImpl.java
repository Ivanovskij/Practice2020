package org.practice2020.interfaces.impl;

import org.practice2020.interfaces.ExampleOfFunctionalInterface;

public class ReferenceFunctionalInterfaceImpl {

    public String toLowerCase(String text) {
        return text.toLowerCase();
    }

    public static void main(String[] args) {
        ReferenceFunctionalInterfaceImpl reference = new ReferenceFunctionalInterfaceImpl();
        ExampleOfFunctionalInterface<String, String> f = reference::toLowerCase;
        System.out.println(f.convert("TEST SHOULD BE LOW"));
    }
}
