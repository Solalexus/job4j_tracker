package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int z) {
        return z - x;
    }

    public int divide(int c) {
        return c / x;
    }

    public int sumAllOperation() {
        return sum(4) + multiply(8) + minus(14) + divide(9);
    }

    public static void main(String[] args) {
        System.out.println(sum(4));
        Calculator calculator = new Calculator();
        System.out.println(calculator.multiply(8));
        System.out.println(minus(14));
        System.out.println(calculator.divide(9));
        Calculator calculator1 = new Calculator();
        System.out.println(calculator1.sumAllOperation());
    }
}
