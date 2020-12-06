package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int count = 0; // Счётчик для результирующего массива
        int l = 0; // Счётчик для первого массива
        int r = 0; // Счётчик для второго массива

        while (count < rsl.length) {
            if (l > left.length - 1) {
                rsl[count++] = right[r++];
            } else if (r > right.length - 1) {
                rsl[count++] = left[l++];
            } else {
                rsl[count++] = left[l] < right[r] ? left[l++] : right[r++];
            }
        }
        return rsl;
    }
}
