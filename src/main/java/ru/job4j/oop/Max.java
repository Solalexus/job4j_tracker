package ru.job4j.oop;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int first, int second, int third) {
        return first > max(second, third) ? first : max(second, third);
    }

    public static int max(int first, int second, int third, int fourth) {
        return max(first, second) > max(third, fourth) ? max(first, second) : max(third, fourth);
    }
}
