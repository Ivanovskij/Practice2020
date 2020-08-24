package org.practice2020.java0tutor.basics;

public class Task2 {

    public static void main(String[] args) {
        System.out.println((task2(1, 2.0, 3.2)));
    }

    public static double task2(double a, double b, double c) {
        return ((b + (Math.sqrt(b*b + 4*a*c))) / (2 * a)) * (a * a / Math.pow(b, -2));
    }


}
