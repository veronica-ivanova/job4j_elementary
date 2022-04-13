package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double divAndDif(double first, double second) {
        return div(first, second) + dif(first, second);
    }

    public static double sumMultiplyDivDif(double first, double second) {
       return sum(first, second) + multiply(first, second)
               + div(first, second) + dif(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета суммы и умножения: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета разности и деления: " + divAndDif(10, 20));
        System.out.println("Результат расчета суммы всех операций: " + sumMultiplyDivDif(10, 20));

    }

}
