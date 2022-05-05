package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left >= right ? left : right;
        return result;
    }

    public static int max(int left, int right, int other1) {
        return max(
                left,
                max(right, other1)
        );
    }

    public static int max(int left, int right, int other1, int other2) {
        return max(left, max(right, max(other1, other2)));
    }

    public static void main(String[] args) {
        int rsl = Max.max(1, 2);
        System.out.println(rsl);
    }
}
