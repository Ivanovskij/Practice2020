package org.practice2020.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Java7vsJava8 {

    public static class Java7 {

        public String sorting() {
            List<String> names = Arrays.asList("peter","anna","olejka", "z", "w");

            Collections.sort(names, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o1.compareTo(o2);
                }
            });
            return names.toString();
        }
    }

    public static class Java8 {

        public String sorting() {
            List<String> names = Arrays.asList("peter","anna","olejka", "z", "w");
//            Collections.sort(names, (String o1, String o2) -> o1.compareTo(o2));
            Collections.sort(names, (o1,o2) -> o1.compareTo(o2));
            return names.toString();
        }
    }

    public static void main(String[] args) {
        Java7 java7 = new Java7();
        System.out.println(java7.sorting());
        Java8 java8 = new Java8();
        System.out.println(java8.sorting());

    }
}
