package com.example.calculatorexercise.model;

import com.example.calculatorexercise.model.Calculator;

import junit.framework.TestCase;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class CalculatorTest {

    Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        double x = Math.random();
        double y = Math.random();
        calculator = new Calculator(x,y,'+');
        double result = calculator.performOperation();
        Assert.assertEquals(result, calculator.getX() + calculator.getY(), 0);
    }

    @Test
    public void testSubtract() {
        double x = Math.random();
        double y = Math.random();
        calculator = new Calculator(x,y,'-');
        double result = calculator.performOperation();
        Assert.assertEquals(result, calculator.getX() - calculator.getY(), 0);
    }

    @Test
    public void testMultiply() {
        double x = Math.random();
        double y = Math.random();
        calculator = new Calculator(x,y,'X');
        double result = calculator.performOperation();
        Assert.assertEquals(result, calculator.getX() * calculator.getY(), 0);
    }

    @Test
    public void testDivide() {
        double x = Math.random();
        double y = Math.random();
        calculator = new Calculator(x,y,'/');
        double result = calculator.performOperation();
        Assert.assertEquals(result, calculator.getX() / calculator.getY(), 0);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testUnsupportedException() {
        double x = Math.random();
        double y = Math.random();
        calculator = new Calculator(x, y, 'a');
        double result = calculator.performOperation();
    }
}