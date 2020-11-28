package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int index = array.length / 2;
        for (int i = 0; i < index; i++) {
            int first = array[i];
            int last = array.length - 1 - i;
            array[i] = array[last];
            array[last] = first;
        }
        return array;
    }
}
