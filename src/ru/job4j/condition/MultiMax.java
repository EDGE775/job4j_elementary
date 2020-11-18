package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int max = 0;
        if (first > second) {
            max = first;
            if (third > max) {
                max = third;
            }
        } else {
            max = second;
            if (third > max) {
                max = third;
            }
        }
        return max;
    }
}
