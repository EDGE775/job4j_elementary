package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = number > 1; // Изменил условие
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                prime = false; // Добавил присвоение значения false внутри оператора условия
                break;
            }
        }
        return prime;
    }
}
