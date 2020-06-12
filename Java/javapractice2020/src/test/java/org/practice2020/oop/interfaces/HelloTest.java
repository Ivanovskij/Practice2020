package org.practice2020.oop.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class HelloTest {

    @Test
    public void runSayHelloMethod() {
        Hello hello = new Hello();
        String expectedResult = "hello 2020";                   // default result from interface
        String actualResult = hello.sayHello("Test");
        Assert.assertEquals(expectedResult, actualResult);
    }

        @Test
        public void runImplementedSayHelloMethod() {
            HelloImplementation helloImpl = new HelloImplementation();
            String msg = "hi";
            String actualResult = helloImpl.sayHello(msg);
            Assert.assertEquals(msg, actualResult);
        }

}
