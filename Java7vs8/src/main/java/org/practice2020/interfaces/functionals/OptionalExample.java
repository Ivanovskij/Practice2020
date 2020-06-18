package org.practice2020.interfaces.functionals;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
        Optional<String> emptyOptional = Optional.of("test");
        System.out.println(emptyOptional.orElse("orElse")) ;    // test
        System.out.println(emptyOptional.isPresent()) ;    // true
        System.out.println(emptyOptional.filter(s -> s.length() > 0)) ;    // Optional[test]
        System.out.println(emptyOptional.map(s -> s + s));    // Optional[testtest]
    }
}
