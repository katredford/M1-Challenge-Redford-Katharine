package com.company;

public class Calculator {

    public int add(int a, int b) {
        int result = a + b;
        System.out.println(a + " + " + b + " = " + result);
        return result;
    }

    public double add(double a, double b) {
        double result = a + b;
        System.out.println(a + " + " + b + " = " + result);
        return result;

    }

    public int subtract(int a, int b) {
        int result = a - b;
        System.out.println(a + " - " + b + " = " + result);
        return result;

    }

    public float subtract(float a, float b) {
        float result = a - b;
        System.out.println(a + " - " + b + " = " + result);
        return result;
    }

    public int multiply(int a, int b) {
        int result = a * b;
        System.out.println(a + " * " + b + " = " + result);
        return result;
    }

    public double multiply(double a, double b){
        double result = a * b;
        System.out.println(a + " * " + b + " = " + result);
        return result;
    }


    public int divide(int a, int b) {
        int result = a / b;
        System.out.println(a + " / " + b + " = " + result);
        return result;
    }

    public double divide(double a, double b) {
        double result = a / b;
        System.out.println(a + " / " + b + " = " + result);
        return result;
    }

}
