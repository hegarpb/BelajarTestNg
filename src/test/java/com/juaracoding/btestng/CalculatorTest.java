package com.juaracoding.btestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
@Test
public void addTest() {
    int a = 10;
    int b = 2;
    int expected = 12;

    int actual = Calculator.add(a, b);
    Assert.assertEquals(actual, expected);
}

@Test
public void substractTest() {
    int a = 10;
    int b = 2;
    int expected = 8;
    int actual = Calculator.substract(a, b);

    Assert.assertEquals(expected, actual);
}
}
