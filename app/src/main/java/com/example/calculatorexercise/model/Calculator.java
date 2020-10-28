package com.example.calculatorexercise.model;

public class Calculator {
    private double x;
    private double y;
    private char operand;

    public Calculator() {}

    public Calculator(double x, double y, char operand) {
        this.x = x;
        this.y = y;
        this.operand = operand;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double performOperation() {
        switch (operand) {
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

    private double performAddition() {
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
