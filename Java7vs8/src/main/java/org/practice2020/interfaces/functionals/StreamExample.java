package org.practice2020.interfaces.functionals;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class StreamExample {

    public static void main(String[] args) {
        List<String> array = Arrays.asList("oleg","mother","jazz","army","it","homeless","it");

        // -------- Single stream
        System.out.println(array.stream().count());                 //7
        System.out.println(array.stream().distinct().count());      //6
        array.stream().filter(s -> s.startsWith("a")).sorted().forEach(System.out::print);
        System.out.println();
        Optional<String> reduced = array.stream().sorted().reduce((a, b)->a+"$"+b);
        reduced.ifPresent(System.out::print);

        // time - single stream
        sortBySingleStream();
        // ------------ Parallel stream
        sortByParallelStream();
    }

    public static void sortBySingleStream() {
        int max = 1000000;
        List<String> values = new ArrayList<>(max);
        for (int i = 0; i < max; i++) {
            UUID uuid = UUID.randomUUID();
            values.add(uuid.toString());
        }

        long t0 = System.nanoTime();
        long count = values.stream().sorted().count();
        System.out.println(count);
        long t1 = System.nanoTime();
        long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
        System.out.println(String.format("sequential sort took: %d ms", millis));
    }

    public static void sortByParallelStream() {
        int max = 1000000;
        List<String> values = new ArrayList<>(max);
        for (int i = 0; i < max; i++) {
            UUID uuid = UUID.randomUUID();
            values.add(uuid.toString());
        }

        long t0 = System.nanoTime();

        long count = values.parallelStream().sorted().count();
        System.out.println(count);

        long t1 = System.nanoTime();

        long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
        System.out.println(String.format("parallel sort took: %d ms", millis));
    }
}
