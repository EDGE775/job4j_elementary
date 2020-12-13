package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        boolean condition = first >= second;
        int result = condition ? first : second;
        return result;
    }

    public static int max(int first, int second, int third) {
        int temp = max(first, second);
        return temp >= third ? temp : third;
    }

    public static int max(int first, int second, int third, int fourth) {
        int temp = max(first, second, third);
        return temp >= fourth ? temp : fourth;
    }

    public static void main(String[] args) {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        System.out.println("Максимальное из двух чисел: " + result);
    }
}
