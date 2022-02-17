package com.company;

public class App {

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int add2 = calc.add(1,1);
        System.out.println("1 + 1 = "+ add2);

        int subtract2 = calc.subtract(23,52);
        System.out.println("23 + 52 = "+ subtract2);

        int multiply2 = calc.multiply(34,2);
        System.out.println("34 * 2 = "+ multiply2);

        int divide2 = calc.divide(12,3);
        System.out.println("12/3 = " + divide2);

        int divide3 = calc.divide(12,7);
        System.out.println("12/7 = " + divide3);

        double add3 = calc.add(3.4,2.3);
        System.out.println("3.4 + 2.3 = "+ add3);

        double multiply3 = calc.multiply(6.7,4.4);
        System.out.println("6.7 * 4.4 = "+ multiply3);

        float subtract3 = calc.subtract(5.5F, 0.5f);
        System.out.println("5.5 - 0.5 = "+ subtract3);

        double divide4 = calc.divide(10.8, 2.2);
        System.out.println("10.8 / 2.2 = " + divide4);





    }
}
