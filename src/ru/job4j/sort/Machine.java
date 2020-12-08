package ru.job4j.sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Machine {
    private final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int cash = money - price;
        for (int j = 0; j < coins.length; j++) {
            while (cash - coins[j] >= 0) {
                cash = cash - coins[j];
                rsl[size] = coins[j];
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));
    }
}
