package com.example.calculatorexercise.model;

public class Calculator {
    private double x;
    private double y;
    private final char operator;
    private int index = 0;

    public Calculator(double x, double y, char operator) {
        this.x = x;
        this.y = y;
        this.operator = operator;
    }

    public char getOperator() {
        return operator;
    }

    public void addNumber(double num) {
        if (index == 0) {
            index++;
            x = num;
        } else {
            y = num;
            index--;
        }
    }

    public double performOperation() {
        switch (operator) {
            case '+':
                return performAddition();
            case '-':
                return performSubtraction();
            case 'X':
                return performMultiplication();
            case '/':
                return performDivision();
            default:
                throw new UnsupportedOperationException();
        }

    }

    public double performAddition() {
        return add(x,y);
    }

    private double performSubtraction() {
        return subtract(x,y);
    }

    private double performMultiplication() {
        return multiply(x,y);
    }

    private double performDivision() {
        return divide(x,y);
    }

    public static double add(double x, double y) {
        return x + y;
    }

    public static double subtract(double x, double y) {
        return x - y;
    }

    public static double multiply(double x, double y) {
        return x * y;
    }

    public static double divide(double x, double y) {
        return x / y;
    }


}
