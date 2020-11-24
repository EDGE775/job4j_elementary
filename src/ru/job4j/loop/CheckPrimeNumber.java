package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = number == 2; // Добавил начальное условие для числа 2, т.к. оно не попадает в цикл
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                prime = false; // Добавил присвоение значения false внутри оператора условия
                break;
            }
            prime = true;
        }
        return prime;
    }
}
