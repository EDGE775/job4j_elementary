package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double persent) {
        int year = 0;
        while (amount >= 0) {
            double debt = amount * persent / 100;
            amount = amount + (int) debt - salary;
            year++;
        }
        return year;
    }
}
