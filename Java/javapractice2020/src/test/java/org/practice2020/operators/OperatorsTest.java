package org.practice2020.operators;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OperatorsTest {

    private static final String EMPTY_STRING = "";
    private static final String NAME_OLEG = "Oleg";
    private static final String NAME_SERGEY = "Sergey";
    private static final String SHOW_NAME_AGE_OF_SON = "Name: %s, Age: %d";
    private static final int AGE_OLEG = 23;
    private static final int AGE_SERGEY = 25;
    private static final String NEW_LINE = System.getProperty("line.separator");

    @Test
    public void shouldReturnEmptyFamily() {
        Operators operators = new Operators();
        Operators.Father father = operators.new Father();

        Assert.assertEquals(EMPTY_STRING, father.showFamily());
    }

    @Test
    public void shouldReturnOnlyOneSon() {
        Operators operators = new Operators();
        Operators.Person oleg = operators.new Son(23, "Oleg");
        Operators.Father father = operators.new Father(
                new ArrayList<>(Arrays.asList(oleg))
        );

        Assert.assertEquals(String.format(SHOW_NAME_AGE_OF_SON + NEW_LINE, NAME_OLEG, AGE_OLEG), father.showFamily());
    }

    @Test
    public void shouldReturnTwoSons() {
        List<Operators.Person> persons = new ArrayList<>();
        persons.add(new Operators().new Son(AGE_OLEG, NAME_OLEG));
        persons.add(new Operators().new Son(AGE_SERGEY, NAME_SERGEY));
        Operators operators = new Operators();
        Operators.Father father = operators.new Father(persons);

        String expectedResult = String.format(SHOW_NAME_AGE_OF_SON +
                NEW_LINE +
                SHOW_NAME_AGE_OF_SON +
                NEW_LINE, NAME_OLEG, AGE_OLEG, NAME_SERGEY, AGE_SERGEY);
        String actualResult = father.showFamily();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldReturnOnlyOneDaughter() {
        Operators operators = new Operators();
        Operators.Person kate = operators.new Daughter(50.3f, "Kate");
        Operators.Father father = operators.new Father(
                new ArrayList<>(Arrays.asList(kate))
        );

        Assert.assertEquals(String.format("Name: %s, Weight: %f" + NEW_LINE, "Kate", 50.3f), father.showFamily());
    }

    @Test(expected = RuntimeException.class)
    public void shouldBeUnknownFamilySexRuntimeException() {
        Operators operators = new Operators();
        Operators.UnknownSex unknownSex = operators.new UnknownSex();
        Operators.Father father = operators.new Father(
                new ArrayList<>(Arrays.asList(unknownSex))
        );
        father.showFamily();
    }
}
