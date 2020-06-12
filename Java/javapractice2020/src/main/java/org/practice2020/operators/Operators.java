package org.practice2020.operators;

import java.util.ArrayList;
import java.util.List;

public class Operators {

    public interface Person {
        String getName();
    }

    public class UnknownSex implements Person {
        @Override
        public String getName() {
            return null;
        }
    }

    public class Son implements Person {
        private int age;
        private String name;

        public Son(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String getName() {
            return name;
        }
    }

    public class Daughter implements Person {
        private float weight;
        private String name;

        public Daughter(float weight, String name) {
            this.weight = weight;
            this.name = name;
        }

        public float getWeight() {
            return weight;
        }

        @Override
        public String getName() {
            return name;
        }
    }

    public class Father {
        public static final String ERROR_UNKNOWN_FAMILY_SEX = "Error: Unknown family sex.";
        private List<Person> personList;

        public Father() {
            personList = new ArrayList<>();
        }

        public Father(List<Person> personList) {
            this.personList = personList;
        }

        public String showFamily() {
            StringBuilder family = new StringBuilder();
            personList.stream().forEach((person -> {
                if (person instanceof Son) {
                    family.append(String.format("Name: %s, Age: %d", person.getName(), ((Son) person).getAge()));
                } else if (person instanceof Daughter) {
                    family.append(String.format("Name: %s, Weight: %f", person.getName(), ((Daughter) person).getWeight()));
                } else {
                    throw new RuntimeException(ERROR_UNKNOWN_FAMILY_SEX);
                }
                family.append(System.getProperty("line.separator"));
            }));
            return family.toString();
        }

    }

}
