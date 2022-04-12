package ru.job4j.calculator;

public class CalculatorMethod {
    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }

    public static void main(String[] args) {
        CalculatorMethod.plus(100, 500);
        CalculatorMethod.plus(4, 2);
        CalculatorMethod.plus(3, 5);

    }
}
