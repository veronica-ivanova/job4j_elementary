package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("размер массива " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("размер массива " + surnames.length);
        float[] prices = new float[40];
        System.out.println("размер массива " + prices.length);

        String[] names = new String[4];
        names[0] = "Petr Ivanov";
        names[1] = "Ivan Petrov";
        names[2] = "Mary Ivanova";
        names[3] = "Alex Petrov";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
